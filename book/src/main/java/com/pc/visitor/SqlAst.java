package com.pc.visitor;

import com.alibaba.druid.sql.SQLUtils;
import com.alibaba.druid.sql.ast.SQLLimit;
import com.alibaba.druid.sql.ast.SQLStatement;
import com.alibaba.druid.sql.ast.expr.SQLIntegerExpr;
import com.alibaba.druid.sql.dialect.mysql.parser.MySqlStatementParser;
import com.alibaba.druid.sql.dialect.mysql.visitor.MySqlOutputVisitor;
import com.alibaba.druid.sql.parser.Token;
import com.alibaba.druid.util.JdbcConstants;
import lombok.Getter;

/**
 *
 * @author pengchao
 * @since 2023/1/16 18:18
 */
public class SqlAst {

    public static void main(String[] args) {

        String sql = "select * from table_1 where id = 233 and name = 'pc' limit a";

        MySqlStatementParser parser = new MySqlStatementParser(sql);

        while (!parser.getLexer().isEOF()) {
            Token token = parser.getLexer().token();
            switch (token) {
                case SEMI:
                case EXPLAIN:
                case DESC:
                case SHOW:
                    break;
                case SELECT:
                case INSERT:
                case UPDATE:
                case DELETE:
                    SQLStatement ast = parser.parseStatement();
                    StringBuilder appender = new StringBuilder();
                    DmlVisitor visitor = new DmlVisitor(appender);
                    visitor.setPrettyFormat(false);
                    visitor.setUppCase(true);
                    ast.accept(visitor);

                    String newSql = SQLUtils.toSQLString(ast, JdbcConstants.MYSQL);
                    System.out.println(visitor.getLimitSize());
                    System.out.println(newSql);

                    break;
                case HINT:
                    parser.getLexer().nextToken();
                    break;
                case IDENTIFIER:
                    parser.parseStatement();
                default:
            }
        }
    }


    static class DmlVisitor extends MySqlOutputVisitor {

        @Getter
        private Integer limitSize;


        public DmlVisitor(Appendable appender) {
            super(appender);
        }

        @Override
        public boolean visit(SQLLimit x) {
            /*
             * 如果设置了正确的limit值, 不做操作, 只记录limitSize; 如果没有设置, 则设置默认值。
             */
            boolean ret = super.visit(x);
            if (x.getRowCount() instanceof SQLIntegerExpr) {
                limitSize = ((SQLIntegerExpr) x.getRowCount()).getNumber().intValue();
            } else {
                x.setRowCount(1);
            }
            return ret;
        }
    }

}
