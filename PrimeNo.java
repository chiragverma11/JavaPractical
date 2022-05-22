import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); 
            boolean check=true;
            System.out.print("Enter a Number to check whether it is prime or not:");
            int n=input.nextInt();
            if (n==0 || n==1){
                System.out.println(n+" is not a Prime Number.");
            }
            else{
                for (int i=2;i<=n/2;i++){
                    if (n%i==0){
                        check=false;
                        break;
                    }
                }
                if (!check){
                    System.out.println(n+" is not a Prime Number.");
                }
                else {
                    System.out.println(n+" is a Prime Number.");
                }
            }
            input.close();
        }
}
