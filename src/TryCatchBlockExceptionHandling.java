// import java.util.Scanner;

public class TryCatchBlockExceptionHandling {

    public static void main(String[] args) {

        String welcome = "Welcome!";
        char[] chars = welcome.toCharArray();

//        for (int i = 0; i < chars.length; i++) {
//        System.out.println(chars[i]);
//        }

        /* char displayChar = chars[chars.length - 1];
           System.out.println(displayChar);
           length = 8
           length - 1 = 7 [index 7 which is !]
           length - 2 = 6 [index 6 which is 2]
           length - 8 = 0 [index 0 which is W] */
        try {

            /*
             create my own custom exception to throw
             if the code encounters the throw statement, that path of execution
             will shift to the catch blocks, and Java will look for the catch block
             that catches this exception. If it doesn't find one, then the exception will be fatal (error that
             causes a program to abort/application encountered a condition it cannot resolve.)
            */
            if (chars.length < 10) {
                throw (new Exception("Custom exception message")); // pass in literal string
            }

            char displayChar = chars[chars.length - 1];
            System.out.println(displayChar);

            String subString = welcome.substring(10);

        } catch (ArrayIndexOutOfBoundsException e) {
            //e.printStackTrace();
            System.out.println("Array problem - test printStackTrace message");
        } catch (StringIndexOutOfBoundsException e) {
            // e.printStackTrace();
            System.out.println("String index problem");
        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
}
