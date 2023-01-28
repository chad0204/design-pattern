package com.pc.visitor.visitor;

import com.pc.visitor.computer.Cpu;

/**
 *
 * @author pengchao
 * @since 2023/1/28 10:34
 */
public class CpuVisitor extends DefaultVisitor {

    private String introduce;

    public String getIntroduce() {
        return introduce;
    }

    @Override
    public void visit(Cpu cpu) {
        introduce = "Cpu{" +
                "cores=" + cpu.getCores() +
                ", hertz=" + cpu.getHertz() +
                ", " + cpu.baseIntroduce() +
                '}';
    }
}
