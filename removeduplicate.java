public class removeduplicate 
{
    public static void main(String[] args) 
    {
        int ar[]={1,1,2,2,3,4,4,5};
        int ind=0;

        for (int i = 0; i < ar.length-1 ; i++) 
        {
            if(ar[i]!=ar[i+1])
            {
                ar[ind]=ar[i];
                ind++;
            }
            
        }

        ar[ind]=ar[ar.length-1];
        ind++;

        for (int i = 0; i <ind; i++) 
        {
            System.out.print(ar[i]);
            
        }
        
    }
    
}
