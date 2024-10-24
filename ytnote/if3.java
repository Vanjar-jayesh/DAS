

public class if3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 19;

        if (a>=b) {
            System.out.println("a is getr then b ");            
        }
        else{
            System.out.println("b sole makn ");
        }


        // month couning of april....

        int month = 12;
        String seacson;

        if (month == 12 || month == 1 || month == 2) {
            seacson = "winter";
        }
        else if(month == 3 || month == 4 || month == 5){
            seacson = "spring";

        }
        else if (month == 6 || month == 7 || month == 8) {
            seacson = "summer";

        }
        else if (month == 9 || month == 10 || month == 11) {
            seacson = "Autumn";
        }
        else{
            seacson = "bogus month";
        }
        System.out.println("April is in the "+seacson+".");
    }
}
