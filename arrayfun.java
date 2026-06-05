import java.util.Scanner;

class arrayfunctoin
{
    static Scanner sc = new Scanner(System.in);

    static void inputarray(int arr[])
    {
      int j;
      System.out.println("enter no in array ");
      for ( j = 0; j < arr.length; j++) 
      {
        arr[j]=sc.nextInt();
        
      }
    }

    static void outputarray(int arr[])
    {
       for (int i = 0; i < arr.length; i++) 
       {
          System.out.print(arr[i]+" ");
       }
    }
  
  public static void main(String[] args) 
  {
    
    Scanner sc = new Scanner(System.in);
    test obj= new test();

    System.out.println("enter size of array ");
    int n=sc.nextInt();

    int arr[] = new int [n];

  

    

    
  }
   
}
