package com.pc.visitor.visitor;

import com.pc.visitor.computer.Gpu;

/**
 *
 * @author pengchao
 * @since 2023/1/28 10:34
 */
public class GpuVisitor extends DefaultVisitor {

    private String introduce;

    public String getIntroduce() {
        return introduce;
    }

    @Override
    public void visit(Gpu gpu) {
        introduce = "Gpu{" +
                "pixel=" + gpu.getPixel() +
                ", hertz=" + gpu.getHertz() +
                ", " + gpu.baseIntroduce() +
                '}';
    }
}
