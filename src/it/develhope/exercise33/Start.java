package it.develhope.exercise33;

public class Start {
    public static void main(String[] args) {

        String s1 = "I Like to code near the Lake with my friend Luke";

        String s2 = s1.toLowerCase().replaceAll("l[^u]ke","BLA");

        System.out.println(s2);
    }
}
