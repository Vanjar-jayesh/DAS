package javacodingQuestions.Questions;

/**
 * Ques_01


 
 * write a function to find out duplicate words int a given string?
 */
public class Ques_01 {

    public static void main(String[] args) {
        String str = "big black bug bit a bit black dog on his big black nose";
        int count;
     // converts the String into Lowercase;
        str = str.toLowerCase();
   //Split the String into words using built-in function
        String words[] = str.split(" ");

        System.out.println("duplicate words in a given string");
        for(int i =0; i< words.length; i++){
            count =1;
            for(int j = i+1; j<words.length; j++){
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] ="0";
                    
                }
            }
            if (count> 1 && words[i] !="0") {
                System.out.println(words[i]);
                
            }
        }
    }
}
