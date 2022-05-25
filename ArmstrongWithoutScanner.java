import java.lang.Math;

public class ArmstrongWithoutScanner {
    public static void main(String[] args) {
        int number=153; //Just change the value of number to check different numbers
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
    }
    
}
