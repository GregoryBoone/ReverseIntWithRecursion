import java.util.Scanner;

public class Exercise18_08 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer to reverse.");
        int value = scanner.nextInt();

        reverseDisplay(value);
    }

    public static void reverseDisplay(int value){
        //base case
        if(value < 10){
            System.out.println(value);
        }
        //recursive step
        else{
            System.out.print(value % 10);
            reverseDisplay(value / 10); // Recursive call
        }
    }
}
