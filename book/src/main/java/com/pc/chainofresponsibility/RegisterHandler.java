package com.pc.chainofresponsibility;


/**
 * @author pengchao
 * @since 2022/8/9 16:22
 */
public abstract class RegisterHandler {

    private RegisterHandler next;

    public void next(RegisterHandler next) {
        this.next = next;
    }

    /**
     * final
     * @param user
     */
    public final void register(User user) {
        if (isMatch(user.getType())) {
            this.doRegister(user);
        }

        if (next != null) {
            next.register(user);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private RegisterHandler head;
        private RegisterHandler tail;

        public Builder addHandler(RegisterHandler handler) {
            if (this.head == null) {
                this.head = this.tail = handler;
                return this;
            }
            //追加到尾部
            this.tail.next(handler);
            this.tail = handler;
            return this;
        }

        public RegisterHandler build() {
            return this.head;
        }
    }

    protected abstract boolean isMatch(Type type);

    protected abstract void doRegister(User user);

}
