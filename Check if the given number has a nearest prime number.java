import java.util.*;
public class main
{
    public static boolean isPrime(int n)//Function to check if a number is Prime.
    {
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                c++;
        }
        if(c==2)//Prime no.has 2 factors-1 and number itself.
            return true;
        else
            return false;
    }

    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter number whose nearest prime is to be found.");
        int num=ob.nextInt();
        int diff1=0,diff2=0;
        int num1=0,num2=0;
        for(int i=num;;i++)//No end limit as when prime will be found we will break the loop.
        {
            if(isPrime(i))
            {
                diff1=i-num;
                num1=i;
                break;
            }
        }
        for(int i=num;;i--)//No end limit as when prime will be found we will break the loop.
        {
            if(isPrime(i))
            {
                diff2=num-i;
                num2=i;
                break;
            }
        }
        if(diff1<diff2)//Nearest Prime number will have least difference from given number.
            System.out.println("Nearest Prime Number from "+num+" is "+num1);
        else if(diff2<diff1)
            System.out.println("Nearest Prime Number from "+num+" is "+num2);
        else//There can be more than 1 nearest prime like for 6 we have 5 and 7 as nearest prime.
            System.out.println("Nearest Prime Number from "+num+" is "+num2+" and "+num1);
    }
}