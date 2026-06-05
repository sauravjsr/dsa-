public class sorted 
{
    static Boolean issorted(int ar[])
    {
        
        for (int i = 1; i < ar.length; i++) 
        {
            if(ar[i]<ar[i-1])
            {
               return false;
            }
        }  
        return true; 
    }

    public static void main(String[] args) 
    {
        int ar[]={1,2,6,7};

        System.out.println(issorted(ar));

    }
    
}
