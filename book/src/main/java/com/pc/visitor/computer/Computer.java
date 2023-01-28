package com.pc.visitor.computer;

import com.pc.visitor.visitor.CpuVisitor;
import com.pc.visitor.visitor.GpuVisitor;
import lombok.Data;

/**
 *
 * @author pengchao
 * @since 2023/1/18 16:49
 */
@Data
public class Computer {
    private ComputerElement cpu;
    private ComputerElement gpu;
    private ComputerElement ssd;
    private ComputerElement mem;

    public Computer() {
        this.cpu = new Cpu(1500d, 200, "数据计算", 4, 2.5d);
        this.gpu = new Gpu(4000d, 200, "图形计算", 4, 450d);
        this.ssd = new SSD(500d, 100, "持久化存储", 1024, 100);
        this.mem = new Mem(200d, 50, "数据缓存", 16, 10000);
    }

    public double sumPrice() {
        return this.cpu.price + this.gpu.price + this.ssd.price + this.mem.price;
    }

//    public void introduceThisComputer() {
//        System.out.println(cpu.introduce());
//        System.out.println(gpu.introduce());
//        System.out.println(ssd.introduce());
//        System.out.println(mem.introduce());
//    }

    public void introduceThisComputerV2() {
        CpuVisitor cpuVisitor = new CpuVisitor();
        cpu.accept(cpuVisitor);
        GpuVisitor gpuVisitor = new GpuVisitor();
        gpu.accept(gpuVisitor);

        System.out.println(cpuVisitor.getIntroduce() + "\n" + gpuVisitor.getIntroduce());

    }

}
