package com.DSA.sidhant.String;

public class StringBuilderConcept {

    public static void main(String[] args) {
        stringBuilderIntro();
    }

    public static void stringBuilderIntro() {
        // creation
        StringBuilder sb = new StringBuilder("123");

        // print
        System.out.println("data: " + sb);
        //appending
        sb.append("hello ");

        System.out.println(sb);
        // converting string builder to normal string
        System.out.println(sb.toString());

        System.out.println(sb.length());
        // getting length of the string
        System.out.println(sb.reverse());
        //reverse the string with string builder
        for (int i = 0; i < sb.length(); i++) {
            System.out.println(sb.charAt(i));
        }
    // deleting a char in a string using string builder
    sb.deleteCharAt(2);

    System.out.println(sb);
    // inserting a string or a char at a specific index without replacing the char using stringbuilder.
    // This moves all the char's index to the next one.
    sb.insert(0, "world");

    System.out.println(sb);
    //replace a character at a specific index
    sb.setCharAt(0, 'z');

    System.out.println(sb);

    }
}
