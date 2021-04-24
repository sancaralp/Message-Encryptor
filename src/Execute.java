import java.util.Scanner;
public class Execute {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        Encryption code =new Encryption();

        boolean exit;
        String yourString;

        do{exit=false;
            System.out.println("1-Encrypt my message.\n2-Decrypt my message.\n0-Exit \n--------------------------------");
            String op=scan.nextLine();

            switch(op){
                case "1":
                    System.out.println("Enter your message: ");
                    yourString=scan.nextLine();
                    System.out.println("Your encrypted message:\n"+code.toCode(yourString)+"\n--------------------------------");

                    break;
                case "2":
                    System.out.println("Enter your message: ");
                    yourString=scan.nextLine();
                    System.out.println("Your decrypted message:\n"+code.unCode(yourString)+"\n--------------------------------");

                    break;
                case "0":exit=true;
                    break;
                default: System.out.println("Invalid operation.\n\n");

                    break;
            }
            } while(!exit);
    }
}
