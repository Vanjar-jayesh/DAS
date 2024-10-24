/**
 * rev
 */
public class rev {

    public static void main(String[] args) {
        int n = 123;
        int rev=0;
        int rdm;

        while (n !=0) {
            n = n %10;
            rev = (rev*10) +n;
            n = n/10;


            
        }
        System.out.println(rev);

    }
}