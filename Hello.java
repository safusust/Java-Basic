import java.util.Scanner;

// File name and Class name should be same 
public class Hello{

    public  static void main(String [] args){
       //-> for comment 
        //printf() c programming 
        System.out.println("Hello World");

        //We are learning Java programming 
        //And We will be the best java programmer 
        System.out.print("We are learning Java programming\nAnd We will be the best java programmer\n");
        
        //---------------------------------------------------------------------------------------
        //Math calcullation 
        //10+20
        //50-25
        //5*50
        //10/3
        System.out.println(10+20);
        System.out.println(50-25);
        System.out.println(5*50/10);
        System.out.println(10.0/3);

        //-------------------------------------------------------------------------------------
        //Variable 
        /*
         * Needs of Variable 
         * If we want to use any number multiple place and it should be changed in many place than we can use variable 
         * Variable is like an container which we can use of different perpouses 
         * Variable naming should be meaningful 
         * avoid first use number and dond use space in vairable name 
         */
        int n=120;
        //int -> data type n -> variable name 120->value

        System.out.println(n);
        System.out.println(n);
        System.out.println(n);
        System.out.println(n);

        /*
         * 1 bit 0 1
         * 2 bit 00 01 10 11
         * n bit 2^n
         */
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        
        int a,b;

        Scanner sc= new Scanner(System.in);
         a=sc.nextInt();
         b= sc.nextInt();

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a*b);

        
        /*
         * boolean  1 bits
         * byte  8 bits
         * char single ' '
         * String double ""
         * short 16 bits
         * int 32 bits
         * long 64 bits
         * float 32 bits  .00
         * double 64 bits .00
         */
       
    }
}