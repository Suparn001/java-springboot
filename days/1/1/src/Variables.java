public class Variables {
    /**
     * this is java doc comment
     *
     * @param args
     */


    public static void main(String[] args) {
         //variables
        // java is case-sensitive language

        //declaration
        int a;
        String b;

        // initialization
        a=10;
        b="java";

        int c=  20;
        String d= "javac";
        System.out.println(a+" "+b);
        System.out.println(c+" "+d);
        System.out.println("Hello, " + b + ". You are " + c + " old.");

        // do not want to override, so you should use constants

        final int  CONSTANT_VALUE = 3; //final is used for creating constant variable
        //CONSTANT_VALUE=10;
    }
}
