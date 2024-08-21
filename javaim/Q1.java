package javaim;

/**
 * Q1
 */
public class Q1 {

    public static void main(String[] args) {
        String string = "Big black big lsdlskdhsuio kdsi black ";
        int count;

        string = string.toLowerCase();

        String [] words = string.split(" ");

        for (int i = 0; i < words.length; i++) {
            count=1;
            for(int j = i+1; j<words.length; j++){
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "0";

                    
                }
            }
          if (count> 1&& words[i] != "0") {
            System.out.println(words[i]);
          }  
        }

    }
}