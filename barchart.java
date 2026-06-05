import java.util.Scanner;

public class barchart 
{
   public static void main(String[] args) 
   {
    
     int arr[] = {3,1,0,7,5};

      int max=arr[0];
     for(int i=0 ; i<5 ; i++)
     {
      if(max<arr[i])
      {
        max=arr[i];
      }

     }

     System.out.println("max :- "+max);

     for (int level = max; level >0; level--) 
     {

        for(int j=0 ; j<5 ;j++ )
        {
   
          if(arr[j]>=level)
          {
            System.out.print("*");
          }
          else
          {
            System.out.print("-");
          }
          
        }

       
        System.out.println();
     
       
     }
    


   }
   
}
