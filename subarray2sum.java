public class subarray2sum 
{
    public static void main(String[] args) 
    {
        int ar[]={1,2,1,3,3,2};
        int key=3;


       for (int i = 0; i < ar.length; i++) 
       {
            int sum=0,count=0;

            for (int j = i; j < ar.length; j++) 
            {
                 sum +=ar[j];
                 count++;

                 if(sum==key)
                  {
                    System.out.println("length "+count +" range :- "+i+" "+j);
                  }                        
            }
        
       }
    }
    
}
