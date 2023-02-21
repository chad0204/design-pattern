package com.pc.chainofresponsibility.demo1;

import lombok.Data;

import java.util.List;

/**
 *
 * @author pengchao
 * @since 2022/8/9 16:35
 */
@Data
public class User {

    private Type type;

    private List<String> doneStep;
}
