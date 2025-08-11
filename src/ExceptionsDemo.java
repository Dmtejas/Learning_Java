


public class ExceptionsDemo {
    /*
    Types of error
    1) Compile time error - Such as Typos, semicolon, syntax
    2) Run time error - Code is working well, The execution stops for some reason
    3) Logical error - Where everything working, But it is giving wrong output
     */

    //Run time errors - These are the exceptions which are needed to be handled

    public static void main(String[] args) {
        //Division
        int num = 20;
        int den = 2;
        String str = null;
        int[] arr = new int[5];

        try {
//            System.out.println(num/den);
//            System.out.println(arr[5]);
            System.out.println(str.length());
        } catch (ArithmeticException e) {
            System.out.println("Exception captured cannot divide by zero " + e);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("You are trying to access the data that does not exist");
        } catch(Exception e) {
            System.out.println(e);  //Null pointer exception
        }

//        try {
//            System.out.println(arr[1]);
//            System.out.println(arr[5]);
//        } catch(Exception e) {
//            System.out.println("Array index out of bounds");
//        }
    }
}
