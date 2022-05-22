import java.util.Scanner;

//A palindrome number is same is it is reversed (eg. 16461)
public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to check whether it is a palindrome number or not : ");
        int n = input.nextInt();
        int reversed = 0;
        int temp = n;
        while (temp != 0) {
            reversed = (reversed * 10) + (temp % 10);
            temp /= 10;
        }
        if (n == reversed) {
            System.out.print(n + " is a Palindrome Number.");
        } else {
            System.out.print(n + " is not a Palindrome Number.");
        }
        input.close();
    }

}
