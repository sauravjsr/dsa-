
import java.util.Scanner;

public class pattern6 
{
   public static void main(String[] args) 
   {
      int num,sp=1,star;
      Scanner sc = new Scanner(System.in);
   
      System.out.print("Enter number:- ");
      System.out.println();

      num=sc.nextInt();
      star=num/2+1;

      for (int i = 1; i <=num ; i++) 
      {


      for(int j=1 ; j<=star ; j++ )
      {
         System.out.print("*");         ///// star
      }

      for(int j=1 ; j<=sp ; j++)
      {
         System.out.print(" ");         ///// space      
      }

       for(int j=1 ; j<=star ; j++ )
      {                                   ///// star 
         System.out.print("*");
      }

      System.out.println();


        if (i<num/2+1) 
        {
            star--;
            sp+=2;        
        }
        else
        {
        star++;
        sp-=2;
        }

      }

   }
}

 



