// Write a Java program to count the letters, spaces, numbers and other characters of an input string


public class countLetterSpace {

    public static void main(String[] args) {
        String test = "@Amanullah.org 12345";
        count(test);

    }

    public static void count(String x) {
        char[] ch = x.toCharArray();
        int letter = 0;
        int space = 0;
        int num = 0;
        int otherchat = 0;
        for (int i = 0; i < x.length(); i++) {
            if (Character.isLetter(ch[i])) {
                letter++;
            } else if (Character.isDigit(ch[i])) {
                num++;
            } else if (Character.isSpaceChar(ch[i])) {
                space++;
            } else {
                otherchat++;
            }
        }
        System.out.println("The string is : @Amanullah.org 12345");
        System.out.println("letter: " + letter);
        System.out.println("space: " + space);
        System.out.println("number: " + num);
        System.out.println("other: " + otherchat);
    }
}
