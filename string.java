import java.util.Scanner;

public class string 
{
    public static void main(String[] args) 
    {
       
      String name="arnav";
      char [] namech =name.toCharArray();

      int n=name.length();
      int start=0;
      int end=n-1;

     while (start<end) 
    {
        char temp=namech[start];
        namech[start]=namech[end];
        namech[end]=temp;

        start++;
        end--;

    }

    System.out.println(name);
     System.out.println(namech);




    }
    
}
