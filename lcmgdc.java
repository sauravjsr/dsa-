import java.util.Scanner;

public class lcmgdc 
{
    public static void main (String args[])
    {
        int a,b,divd,divs,r,gcd=0,lcm;
        Scanner  sc = new Scanner(System.in);

        System.out.println("enter a and b:- ");
        a=sc.nextInt();
        b=sc.nextInt();


        if (a>b) 
        {
            divd=a;
            divs=b;
        }
         else
        {
            divd=b;
            divs=a;
        }

        while (divs>0) 
        {

            r=divd%divs; 
            divd=divs;
            divs=r;  
        }

        gcd=divd;
        lcm=a*b/gcd;

        System.out.println("GCD is "+gcd);
        System.out.println("LCM is "+lcm);

    }
}

        


    
