package org.example;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StringList stringList = new StringListImpl();
        stringList.add("test1");
        stringList.add("test2");
        stringList.add("test3");
        stringList.add("test4");

        stringList.add(3, "test 6");

        stringList.remove(1);

        System.out.println(Arrays.toString(stringList.toArray()));

        stringList.clear();
        System.out.println(stringList.size());
    }
}