package com.pc.responsibilitychain;

/**
 * @author dongxie
 * @date 17:09 2019-11-29
 */
public class Task2 implements Task {

    Task task;

    public Task2() {}

    public Task2(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        System.out.println("task2 is run");
        if(task != null){
            task.run();
        }
    }
}
