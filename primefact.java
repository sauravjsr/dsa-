import java.util.Scanner;

public class primefact
{
 public static void main(String[] args)
 {
    int num,div=2;
    Scanner sc = new Scanner(System.in);

    System.out.println("enter number:- ");
    num=sc.nextInt();

    while (num>1) 
    {

        if(num%div==0)
        { 
            System.out.println(div+", ");
             
        }  
        else
        {
            div++;
        }

         num=num/div;
      
    }

 }
}
