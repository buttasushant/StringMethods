package org.buttas;
public class Main {
    public static void main(String[] args) {
        String name = "Sushant";

        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.concat(" Butta"));
        System.out.println(name.getClass());
        System.out.println(name.charAt(5));
        System.out.println(name.subSequence(1,5));
        System.out.println(name.replace(" ","_"));

        String text = "Dear <name>, Hope you are having a good time.";
        System.out.println(text.replace("<name>",name));
    }
}