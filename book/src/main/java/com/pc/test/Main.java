package com.pc.test;

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @author dx
 * @className Main
 * @description TODO
 * @date 2019-07-29 11:25
 */
public class Main {

    public static void main(String[] args) {

        String[] strings = new String[10];
        strings[0] = "aaa";
        strings[9] = "bbb";





        Map<String,String> map = new HashMap<>();
        map.put("aa","bb");
        System.out.println(map.toString());



        List<String> list = new ArrayList<>();


        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");

        list.forEach(e -> {
            if(e.equals("bb")) {
                return;
            }
            System.out.println(e);
        });





    }
}
