import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Problem42 {

    private static char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static int[] seq = new int[100];

    private static int letterToNum(char ch) {
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] == ch) {
                return i+1;
            }
        }

        return -1;
    }

    private static boolean isTriangleWord(int sum) {
        for (int i = 0; i < 100; i++) {
            if (seq[i] == sum) {
                return true;
            }
        }

        return false;
    }

    // https://projecteuler.net/problem=42
    public static void main(String[] args) {


        //tn = ½n(n+1)
        double tn = 0;
        for (int n = 1; n <= 100; n++) {
            tn = 0.5 * n * (n + 1);
            seq[n-1] = (int)tn;
    //        System.out.println(seq[n-1]);
        }

        try {
            // File path is passed as parameter
            File file = new File("/Users/user/IdeaProjects/CodeTestPreparation/ProjectEuler/Problem42/src/p042_words.txt");

            // Note:  Double backquote is to avoid compiler
            // interpret words
            // like \test as \t (ie. as a escape sequence)

            // Creating an object of BufferedReader class
            BufferedReader br = null;

            br = new BufferedReader(new FileReader(file));

            int maxLen = 0;
            ArrayList<String> wordsList = null;
            // Declaring a string variable
            String st;
            // Condition holds true till
            // there is character in a string
            while ((st = br.readLine()) != null) {
                // Print the string
                //System.out.println(st);
                st = st.toLowerCase();
                st = st.replace("\"","");
                wordsList = new ArrayList<String>(Arrays.asList(st.split(",")));
            }

            int count = 0;
            for (String s: wordsList) {
 //               System.out.println(s);
                /*if (s.length() > maxLen) {
                    maxLen = s.length();
                }*/
                int sum = 0;
                for (char ch: s.toCharArray()) {
                    sum += letterToNum(ch);
                }
                if (isTriangleWord(sum)) {
                    System.out.println("Triangle word: " + s);
                    count++;
                }
            }

            System.out.println("Num of triangle words: " + count);
            //System.out.println("New max length:" + maxLen);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
