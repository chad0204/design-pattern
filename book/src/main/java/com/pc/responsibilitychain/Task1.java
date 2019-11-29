package com.pc.responsibilitychain;

/**
 *
 * @author dongxie
 * @date 17:09 2019-11-29
 */
public class Task1 implements Task {

    Task task;

    public Task1() {}

    public Task1(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        System.out.println("task1 is run");
        if(task != null){
            task.run();
        }
    }
}
