import java.util.*;

public class alarmcodes
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int dig=0;
    

    System.out.print("enter no of alram codes");
    int n=sc.nextInt();
    int [] alarmcode =new int[n];
    
    System.out.println("enter values of alarm code ");
    for(int i=0 ; i<n ;i++)
    {
      alarmcode[i]=sc.nextInt();
    }

    for(int i=0 ; i<n-1 ;i++)
    {
      if(alarmcode[i]==alarmcode[i+1])
      {
        System.out.println("invalid "+(i+1));
        return;
      }
    }

    System.out.println("valid");

  }

  
}