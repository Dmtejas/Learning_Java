import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) throws IOException {
//        System.out.println("Output the values");
//        try {
//            int val = System.in.read();
//            System.out.println(val);
//        } catch(IOException e) {
//            System.out.println("Cannot read from the input");
//        }

        //Older way of taking input from the user
//        System.out.println("Enter the value");
//        InputStreamReader in = new InputStreamReader(System.in);
//        BufferedReader bf = new BufferedReader(in);
//        int num = Integer.parseInt(bf.readLine());
//        System.out.println(num);
//        bf.close();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num1 = scanner.nextInt();
        System.out.println(num1);

        //Example of finally using BufferReader
        int num = 0;

        BufferedReader bf = null;
        try {
            InputStreamReader in = new InputStreamReader(System.in);
            bf = new BufferedReader(in);
            num = Integer.parseInt(bf.readLine());
        } catch (Exception e) {
            System.out.println("Exception happened");
        } finally {
            bf.close();
        }

        //Try with resources
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            //Do something
        }
        //The br is automatically closed

    }
}
