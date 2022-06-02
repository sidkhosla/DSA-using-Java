package com.DSA.sidhant.ArrayList;

import java.util.ArrayList;

public class arrayListIntroConcept {

    public static void main(String[] args) {
        arrayListIntro();
    }

    public static void arrayListIntro() {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list + " 1st print");
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list + " " + list.size() + " 2nd print");

        for (int i = 0; i < list.size() ; i++){
            System.out.println(list.get(i) + " " + i + "nd print");
        }

    }
}
