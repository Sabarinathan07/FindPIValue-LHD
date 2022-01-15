import java.util.Scanner;


public class PI {


    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.print("Enter the number of decimal places to print:");
        int num = object.nextInt();
        double pi = Math.PI;
        String y = String.format("The pi value is %."+num+"f", pi);
        System.out.println(y);
        object.close();

    }
    
}
