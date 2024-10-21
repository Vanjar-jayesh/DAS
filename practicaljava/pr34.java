package practicaljava;

public class pr34 {
    static int countOccurences(String str, String word) {
        String a[] = str.split(" ");

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (word.equals(a[i])) {
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        String str = "The INSB a computer science INSB protal for the INSB idar college";
        String word = "INSB";
        System.out.println("count of Occurrences words : " + countOccurences(str, word));
    }
}

/*
 * OUTPUT:
 * count of Occurrences words : 3
 */