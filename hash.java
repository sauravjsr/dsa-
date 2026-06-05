public class hash 
{
    public static void main(String[] args) 
    {
        int ar[]={1,2,3,4,5,5,6,7,2,1};
        int n=ar.length;

        int[] hash= new int[n];

        for (int i = 0; i < hash.length; i++) 
        {
            hash[ar[i]] +=1;
        }

        for (int i = 0; i < hash.length; i++) 
        {
            System.out.println(i+" "+hash[i]+" times ");
            
        }
        
    }
    
}
