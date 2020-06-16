package com;

import com.thread.Dao.Hero;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("adc", "物理英雄");
        map.put("apc", "魔法英雄");
        map.put("t", "坦克");
        System.out.println(map);
        HashMap<String, String> res = new HashMap<>();
        map.forEach((s, v) -> res.put(v, s));
        System.out.println(res);
        System.out.println(3*0.1==3*0.1);
        System.out.println("666");
    }
}