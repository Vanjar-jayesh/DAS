public class switch3 {
    public static void main(String[] args) {
        // for (int i = 0; i <= 6; i++) {
        //     switch (i) {

        //         case 0:
        //             System.out.println("i is zero.");
        //             break;
        //         case  1:
        //         System.out.println("i is one");
        //         break;

        //         case 2:
        //         System.out.println("i is two ");
        //         break;

        //         case 3:
        //         System.out.println("i is three.");
        //         break;

        //         default:
        //         System.out.println("i is greater than 3.");
        //             break;
        //     }
        // }
            int count;
            int target = 4;
            for(count = 0; count<=target; count++){
        switch(count){
            case 1:
            switch(target){
                case 0:
                System.out.println("tareget is zero");
                break;

                case 1:
                System.out.println("tareget is one");
                break;

            }
            break;

            default:
            System.out.println("invelid tareget of count");
            break;
        }
      }
    }
}
