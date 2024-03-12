package com.esertopcu.exercises;

import java.util.*;

public class TestCase {

    public static void main(String[] args) {

        float t,x;
        t = 25+15;
        x = t/4;

        System.out.println(x);

        System.out.println("-------------------------");

        Map<String, String> hashMap = new HashMap<>();
        hashMap.put(new String("a"), "audi");
        hashMap.put(new String("a"), "ferrari");
        System.out.println(hashMap);

        System.out.println("-------------------------");

        Map<String, String> identityHashMap = new IdentityHashMap<>();
        identityHashMap.put(new String("a"), "audi");
        identityHashMap.put(new String("a"), "ferrari");
        System.out.println(identityHashMap);

        System.out.println("-------------------------");

        Set set = new TreeSet();

        set.add(1);
        //set.add("2");
        set.add(3);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
