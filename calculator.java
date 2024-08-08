import java.io.*;
import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        String c=sc.next();
        switch(c)
        {
            case "+":
                System.out.println("addition-"+(a+b));
                break;
             case "-":
                System.out.println("subtraction-"+(a-b));
                break; 
            case "*":
                System.out.println("multiplication-"+(a*b));
                break;
            case "/":
                System.out.println("multiplication-"+(a/b));
                 break;
            case "%":
                System.out.println("multiplication-"+(a%b));
                 break;
             default:
                System.out.println("Error: Invalid operator");
                break;
        }
        
