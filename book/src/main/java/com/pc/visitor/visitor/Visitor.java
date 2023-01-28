package com.pc.visitor.visitor;

import com.pc.visitor.computer.Cpu;
import com.pc.visitor.computer.Gpu;
import com.pc.visitor.computer.Mem;
import com.pc.visitor.computer.SSD;

/**
 * 访问者
 *
 * @author pengchao
 * @since 2023/1/28 10:31
 */
public interface Visitor {

    /**
     * visit方法持有元素, 可以通过元素的保留信息, 完成不同的行为, 并且可以暂存操作数据, 累积行为。
     * @param cpu
     */
    void visit(Cpu cpu);


    void visit(Gpu gpu);
    void visit(Mem mem);
    void visit(SSD ssd);
}
