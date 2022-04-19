package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        System.out.println(names);
        names.add("Айбек");
        names.add("Нурбек");
        names.add("Азамат");
        System.out.println(names);
        names.remove("Нурбек");
        System.out.println(names);
        names.add("Айбек");
        System.out.println();
    }
}
