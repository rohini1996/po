import java.io.*;
import java.util.Scanner;
class power
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        double n=s.nextDouble();
        double n1=s.nextDouble();
        double  result;
        result=Math.pow(n,n1);
        System.out.println(result);
    }
}
