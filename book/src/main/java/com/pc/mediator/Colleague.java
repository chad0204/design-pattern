package com.pc.mediator;

import lombok.Data;

/**
 *
 * @author pengchao
 * @date 11:07 2022/8/13
 */
@Data
public abstract class Colleague {

    protected AbstractMediator mediator;

    public Colleague(AbstractMediator mediator) {
        this.mediator = mediator;
    }

    public Colleague() {
    }
}
