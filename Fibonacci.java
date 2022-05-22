import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms you want:");
        int n = input.nextInt();
        int firstNumber=0,secondNumber=1;
        System.out.println("Fibonacci Series till "+ n+ " terms:");
        System.out.print(firstNumber+","+secondNumber);
        for(int i=0;i<n-2;i++)
        {
            int nextNumber;
            nextNumber=firstNumber+secondNumber;
            System.out.print(","+nextNumber);
            firstNumber=secondNumber;
            secondNumber=nextNumber;
        }
        input.close();
    }
}
