package com.pc.chainofresponsibility.dubbo;

import java.util.ArrayList;
import java.util.List;

/**
 * 内部模式
 * @author pengchao
 * @since 2023/2/21 15:20
 */
public class Client {

    public static void main(String[] args) {

        RpcInvoker rpcInvoker = new RpcInvoker();
        String res = buildInvokerChain(rpcInvoker).invoke("params");
        System.out.println(res);
    }

    private static Invoker buildInvokerChain(Invoker invoker) {
        List<Filter> filters = new ArrayList<>();
        filters.add(new LimitFilter());
        filters.add(new MonitorFilter());
        filters.add(new TimeoutFilter());

        Invoker last = invoker;
        for (int i = filters.size() - 1; i >= 0; --i) {
            final Filter filter = filters.get(i);
            //复制引用，构建filter调用链
            final Invoker next = last;
            //构建最简单的匿名invoker, 作为filter的载体invoker(这些匿名invoker其实持有filter和next)
            last = new Invoker() {
                @Override
                public String invoke(String invocation) {
                    return filter.invoke(next, invocation);
                }
            };
            //和上面匿名内部类代码一样
//            last = new FilterInvoker(filter, next);
        }
        return last;
    }

    static class  FilterInvoker implements Invoker {
        private final Filter filter;
        private final Invoker next;

        public FilterInvoker(Filter filter, Invoker next) {
            this.filter = filter;
            this.next = next;
        }

        @Override
        public String invoke(String invocation) {
            return filter.invoke(next, invocation);
        }
    }
}


