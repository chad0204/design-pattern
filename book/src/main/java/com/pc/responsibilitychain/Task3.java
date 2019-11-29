package com.pc.responsibilitychain;

/**
 *
 * @author dongxie
 * @date 17:10 2019-11-29
 */
public class Task3 implements Task {

    Task task;

    public Task3() {}

    public Task3(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        System.out.println("task3 is run");
        if(task != null){
            task.run();
        }
    }
}
