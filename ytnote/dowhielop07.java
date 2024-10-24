
public class dowhielop07 {
    public static void main(String[] args) throws java.io.IOException  {

        char choice;

        do{
            System.out.println("Help on: ");
            System.out.println("1 .if");
            System.out.println("2.switch");
            System.out.println("3.while");
            System.out.println("4.do-while");
            System.out.println("5. for\n");
            System.out.println("choose one : ");

            choice = (char) System.in.read();

        }while( choice < '1' || choice > '5');

        System.out.println("\n");

        switch (choice) {
            case '1':
                System.out.println("This if:\n");
                System.out.println("if(condition) statement;");
                System.out.println("else statement;");
                break;

            case '2':
                System.out.println("This switch\n");
                System.out.println("switch(exression) {");
                System.out.println("case constant:");
                System.out.println("break;");
                System.out.println("  //....");
                System.out.println("}");
                break;

            case '3':
                System.out.println("The while:\n");
                System.out.println("while(condition) statement;");
                break;

            case '4':
                System.out.println("the do-while:\n");
                System.out.println("do{");
                System.out.println("statement;");
                System.out.println("}while(condition);");
                break;

            case '5':
            System.out.println("the for:\n");
            System.out.println("for(int t ; condition; iteration)");
            System.out.println(" statement;");
            break;

            default :
            System.out.println("invelid choice ");
            break;
        }
    }
}
