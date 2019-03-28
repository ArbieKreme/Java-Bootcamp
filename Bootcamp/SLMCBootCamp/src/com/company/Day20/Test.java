package com.company.Day20;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        Map<String,Employees> map1 = new HashMap<>();
        Employees arbie = new Employees();
        map1.put("Rb",arbie);

        if(map1.get("Arbie")==null){
            System.out.println("Arbie not found");
        }else{
            System.out.println("Arbie found");
        }
    }
}
