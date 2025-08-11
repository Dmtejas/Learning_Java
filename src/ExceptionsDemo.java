class TejasException extends Exception {
    String str;
    public TejasException(String s) {
        super(s);
    }
}


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
//        int num = 20;
//        int den = 2;
//        String str = null;
//        int[] arr = new int[5];
//
//        //A single try block can have multiple catch blocks
//        try {
////            System.out.println(num/den);
////            System.out.println(arr[5]);
//            System.out.println(str.length());
//        } catch (ArithmeticException e) {
//            System.out.println("Exception captured cannot divide by zero " + e);
//        } catch(ArrayIndexOutOfBoundsException e) {
//            System.out.println("You are trying to access the data that does not exist, So stay in your limit");
//        } catch(Exception e) {
//            System.out.println(e);  //Null pointer exception
//        }

//        try {
//            System.out.println(arr[1]);
//            System.out.println(arr[5]);
//        } catch(Exception e) {
//            System.out.println("Array index out of bounds");
//        }

        //NullPointerException example
//        String s = null;
//        try {
//            System.out.println(s.length());
//        } catch(NullPointerException exception) {
//            System.out.println("Exception occurred : " + exception);
//        }

        //Some general Exception classes
        //1) RunTimeException 2) SQL Exception / IOException
        //----> Arithmetic Exception ----> NullPointerException ----> ArrayIndexOutOfBoundException

         //Throw and Throws
        //Throw is to call catch block whenever we want
        int num = 10;
        int den = 20;

        try {
            int res = num/den;
            if(res == 0)
                throw new TejasException("We cannot print zero");
            System.out.println(res);
        } catch(TejasException e) {
            System.out.println(e);
        }


        //throws demo
        try {
            ExceptionsDemo obj = new ExceptionsDemo();
            //System.out.println(obj.addition(-1, -2));
            System.out.println(obj.division(2, 0));
        } catch(ArithmeticException e) {
            System.out.println(e);
        }

        //Finally keyword
        try {
            System.out.println(2/0);
        } catch(Exception e) {
            System.out.println("Exception occurred");
        }
        //very helpful to close the resources
        finally {
            System.out.println("Bye");
        }
    }

    public int division(int a, int b) throws ArithmeticException {
        return a/b;
    }

    public int addition(int a, int b) {
        int r = a+b;
        if(r < 0) {
            throw new ArithmeticException("Sum should not be negative");
        }
        return r;
    }
}
