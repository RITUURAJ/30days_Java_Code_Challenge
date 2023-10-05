import java.util.*;

public class string {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String name = sc.nextLine(); // If you use sc.next then compiler will give you single word so we nextline then compiler will give you string.
        System.out.println("Your name is :" + name);
    }
 }

// write a code add two name first name and last name.
// import java.util.*;

public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstname = "Ritu";
        String lastname = "Raj";
        String fullname = firstname + " " + lastname;
        System.out.println(firstname + " " + lastname);
        // print length of full name
        System.out.println(fullname.length());

        // print character of fullname

        for (int i = 0; i < fullname.length(); i++) {
            System.out.println(fullname.charAt(i));
        }
    }
}

// Write a code Compare two string

// import java.util.*;

public class string {
    public static void main(String[] args) {
        String s1 = "Piyush";
        String s2 = "RituRaj";
        if (s1.compareTo(s2) == 0) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}

// write a code for find substring

import java.util.*;

public class string {
    public static void main(String[] args) {

        String sentence = "My name is Ritu Raj";
        String name = sentence.substring(0, 11);
        System.out.println(name);
    }
}