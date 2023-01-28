package com.pc.visitor.visitor;

import com.pc.visitor.computer.Cpu;
import com.pc.visitor.computer.Gpu;
import com.pc.visitor.computer.Mem;
import com.pc.visitor.computer.SSD;

/**
 * 默认实现
 *
 * @author pengchao
 * @since 2023/1/28 10:33
 */
public abstract class DefaultVisitor implements Visitor {

    @Override
    public void visit(Cpu cpu) {

    }

    @Override
    public void visit(Gpu gpu) {

    }

    @Override
    public void visit(Mem mem) {

    }

    @Override
    public void visit(SSD ssd) {

    }
}
