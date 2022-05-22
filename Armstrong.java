import java.lang.Math;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to check whether it is an Armstrong number or not : ");
        int number=input.nextInt();
        int orignalNumber=number;
        int sum=0,digits=0;
        while(orignalNumber!=0){
            orignalNumber/=10;
            digits++;
        }
        orignalNumber=number;
        while (orignalNumber!=0) {
            int temp;
            temp=orignalNumber%10;
            sum+=Math.pow(temp, digits);
            orignalNumber/=10;
        }
        if (number==sum) {
            System.out.print(number + " is an Armstrong Number.");
        }
        else{            
            System.out.print(number + " is not an Armstrong Number.");
        }
        input.close();
    }
    
}
