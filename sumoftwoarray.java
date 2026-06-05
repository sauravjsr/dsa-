import java.util.Scanner;

class sumoftwoaaray 
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

      int arsum[] = new int [max];
      
      int a=arr1.length-1;  //arr1 last index
      int b=arr2.length-1;  // arr2 last index
      int k=arsum.length-1; // arsum last index

      int sum=0;
      int carry=0;
    
      while (k>=0) 
      {
        
        sum = carry;      // alwys assign new new by assinging new carry
          if(a>=0)
          {
            sum +=arr1[a];
          }
          if(b>=0)
          {
            sum +=arr2[b];
          }
        
          arsum[k]=sum%10;
          carry=sum/10;
          a--;
          b--;
          k--;  
     }


    System.out.println("---------------------------");
    System.out.println("sum of two array are ");

     if(carry!=0)
     {
      System.out.print(carry);
     }
    
     for (int i = 0; i < arsum.length; i++) 
      {
        System.out.print(arsum[i]+" ");
      }
      


    
  }

  
}