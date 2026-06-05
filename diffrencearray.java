import java.util.Scanner;

class diffrencejava 
{
  public static void main(String[] args) 
  {
    int n1,n2;

    Scanner sc = new Scanner(System.in);


    ///// first array input ///
    
    System.out.println("enter no of elment in array 1 ");
    n1=sc.nextInt();
    int arr1[] = new int[n1];

    System.out.println("enter "+n1+" element in array ");
    for(int i=0 ; i<arr1.length ; i++)
      {
        arr1[i]=sc.nextInt();
        
      }
    //////-----------------------------/////////
    

    ///// input array in 2nd array /////
    
    System.out.println("enter no of elment in array 2 ");
    n2=sc.nextInt();
    int arr2[] = new int[n2];

    System.out.println("enter "+n2+" element in array ");
    for(int i=0 ; i<arr2.length ; i++)
      {
        arr2[i]=sc.nextInt();
        
      }

      int max=n1>n2?n1:n2;

      int ardiff[] = new int [max];
      
      int a=arr1.length-1;  //arr1 last index
      int b=arr2.length-1;  // arr2 last index

  }

  
}