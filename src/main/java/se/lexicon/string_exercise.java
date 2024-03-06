package se.lexicon;

import java.util.Locale;

public class string_exercise {

    public static void main( String[] args )
    {
        String myString = "java";
        System.out.println(myString);

        int length;
        length = myString.length();
        System.out.println(length);

        myString = "Long example sentence";
        char letter;
        letter = myString.charAt(6);
        System.out.println(letter);

        myString = "Even longer example sentence";
        int pos;
        pos = myString.indexOf('o');
        System.out.println(pos);

        myString = "Ok this is not as long!";
        String sub;
        pos = myString.indexOf('n');
        length = myString.length() - 1;
        sub = myString.substring(pos, length);
        System.out.println(sub);

        myString = "CAPS EQUALS SCREAMING";
        myString = myString.toLowerCase();
        System.out.println(myString);
        myString = myString.toUpperCase();
        System.out.println(myString);

        myString = "Java is the worst programming language!";
        myString = myString.replace("worst", "best");
        System.out.println(myString);

        myString = "\tJ\ta\tv\ta\t";
        myString = myString.trim();
        System.out.println(myString);

        int num = 20;
        myString = String.valueOf(num);
        myString = myString + "20";
        System.out.println(myString);

        myString = "Oil and Water";
        String[] myStringArray = myString.split("and");
        length = myStringArray.length;                      // Why no parenthesis for this method?
        for (int i = 0; i < length; i++) {
            myStringArray[i] = myStringArray[i].trim();
            System.out.println(myStringArray[i]);
        }

        myString = "Carl,Susie,Fredrick,Bob,Erik";
        myStringArray = myString.split(",");
        length = myStringArray.length;
        for (int i = 0; i < length; i++) {
            myStringArray[i] = myStringArray[i].trim();
            System.out.println(myStringArray[i]);
        }

        myString = "ThisShouldBeConverted";
        char[] myCharArray = myString.toCharArray();
        length = myCharArray.length;
        for (int i = 0; i < length; i++) {
            System.out.println(myCharArray[i]);
        }

        char[] myCharArray2 = {'J','a','v','a'};    // Here I had to make a second charArray. I assume because
        myString = String.valueOf(myCharArray2);    // something about Immutability.
        System.out.println(myString);

    }




}
