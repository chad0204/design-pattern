package com.pc.command.demo;

/**
 * 命令模式的一个简单例子
 *
 *      接收者：具体任务的执行业务
 *      命令：定义一系列命令方法，execute,undo,redo等，其实现通过组合接收者，通过命令方法如execute调用接收者方法，委托接收者执行具体业务。
 *      调用者：持有一个命令对象，通过命令对象完成具体的业务逻辑。
 *
 * @author dongxie
 * @date 17:17 2020-02-07
 */
public class Client {

    public static void main(String[] args) {
        Command command = new ConcreteCommand(new Receiver());
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.action();

    }
}

//接收者，相当于风扇、电灯这些有实际功能的工具
class Receiver {
    public void action() {
        //真正的业务逻辑
    }
}

//抽象命令
interface Command {
    void execute();
}

//具体的命令实现
class ConcreteCommand implements Command {
    Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}

//客户端的调用者，相当于遥控器
class Invoker {
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action() {
        command.execute();
    }
}
