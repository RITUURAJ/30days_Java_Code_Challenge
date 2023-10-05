import java.util.*;

public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("Ritu");
System.out.println(name);
char at index 0
        System.out.println(name.charAt(0));

        // set char at index 0
        name.setCharAt(0, 'K');
        System.out.println(name);
    }

}

// use insert function to insert your character i at 2 place

import java.util.*;

public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("Ritu");
        System.out.println(name);
        name.insert(2, 'i');
        System.out.println(name);
    }
}

// use delete function to delete your character

import java.util.*;

public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("Ritu");
        name.insert(2, 'i');
        System.out.println(name);
        name.delete(2, 3);
        System.out.println(name);
    }
}

// use new string and add character at the end of string by using append function
//(append) means add some new after the string

import java.util.*;

public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("H");
        name.append("e");
        name.append("l");
        name.append("l");
        name.append("o");
        System.out.println(name);
    }
}

// write a program to reverse your string

import java.util.*;

public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("Ritu Raj");
        for (int i = 0; i < name.length() / 2; i++) {
            int front = i;
            int back = name.length() - 1 - i;
            char frontChar = name.charAt(front);
            char backChar = name.charAt(back);
            name.setCharAt(front, backChar);
            name.setCharAt(back, frontChar);
        }
        System.out.println(name);
    }
}

Date - 05/10/2023
