public class Hello {

    public static void main(String[] args) {
        // chapter1_1();
    }

    public static void chapter1_1(){
        System.out.println("Chapter 1 rudimentary Java\n");

        /* 
        byte a, b = 1 , c = 2;
        a = (byte) (b + c);  // You need to cast this because the + operator returns a integer not a byte
        System.out.println(a);  // This will now return 3

        // char ch = '\u13ab';  // Will return a question mark as not all systems support this system of unicode characters
        char ch = '\123';  // ASCII for capital S , using the \ followed by the ASCII code will return the ASCII value too
        System.out.println(ch); 

        // int i = 0123; // Prefizing with a 0 will provide the octal 0-7 of the code
        int j = 0x12a3; // Prefixing with 0x is the same but for the hexidecimal values 0-9 A-E
        System.out.println(j);

        // float f = 123.00100;  // This will give an error as you cannot interchange double and float

        float f = 123.0034f; // You need to add the f as a suffix modifier this can also be F
        System.out.println(f);
        */

        // Decision statements

        // if statement , can use operamnds like < , > , <= , >= , == , != , OR statements work with || and and statements with &&
        /*        int x = 3;

        if (x == 2) {
            System.out.println("x was equal to 2");
        }else if (x == 3){
            System.out.println("x was equal to 3");
        } else {
            System.out.println("x was not equal to 2 or 3");
        }

        // Shorthand for an if statement, this is useful for quick and easy stuff, like null checks also called the ternary operator

        String n = x == 2 ? "x was equal to 2" : "x was not equal to 2"; // this returns a value so it must be assigned to a variable to be used
        System.out.println(n);


        // Switch statements

        int i = 3;
        switch (i) {
            case 1 : System.out.println("i was 1"); break; // the break will stop the code from executing so the rest wont run, in the case you need the rest to run you can leave the "break" out
            case 2 : System.out.println("i was 2"); break;
            case 3 : System.out.println("i was 3"); break;
        }

        // Loops 

        while (x < 5) {
            System.out.println(x); // evaluates first 3,4
            x++;
        }

        x = 2;

        do {
            System.out.println(x); // this will prin once first then it will evaluate 2,3,4
            x++;
        } while(x<5);

        for (int y = 0 ; y < 23 ; y++){
            System.out.println(y);  // Prints 0 - 22 , the top bound is excluded as it is < not = 
        }

        // for-each loop

        int arr[] = {1,2,3,4,5,6,7};

        for (int j : arr) {
            System.out.println(j);  // prints one to 7 , this is going to be super useful later for looping through arrays
        }

        !! all loops can be exited with a break statement inside the loop if a condition is met along the way

        */

        // Exception handling
        
        /*
         * try {
         * something that can result in an error
         * } catch (exception-type exception-name) {
         * System.out.println("Error Massage");
         * throw e; this handles the exception instead of ignoring it
         * }
         * 
         */

    }



}