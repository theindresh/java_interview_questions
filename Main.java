import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        for(int i = 1; i<=n; i++){
//            for(int j = 1; j<= i; j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

        /* for pattern print
         *****
         ****
         ***
         **
         *
          */
        for(int i= 1; i<=n; i++){
            for(int j=n; j>=i; j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}