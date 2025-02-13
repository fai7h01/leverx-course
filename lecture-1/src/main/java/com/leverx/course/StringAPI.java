package com.leverx.course;

public class StringAPI {

    public static void main(String[] args) {

        //indent(int)
        String multilineStr = "This is\na multiline\nstring.";
        multilineStr = multilineStr.indent(5);
        System.out.println(multilineStr);

        //transform(Function)
        String word = "Hello";
        word = word.transform(w -> w.concat(" World!"));
        System.out.println(word);

        String str = "24";
        int age = str.transform(Integer::parseInt);
        System.out.println(age);

        //repeat(int)
        System.out.println(str.repeat(3));

        //strip()
        String s = "\n\t  hello   \u2005";
        System.out.println(s);
        System.out.println(s.strip());
        System.out.println(s.trim());

        //lines()
        long count = multilineStr.lines()
                .peek(System.out::println)
                .filter(String::isBlank)
                .count();
        System.out.println(count);
    }

}
