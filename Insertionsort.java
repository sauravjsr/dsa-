public class Insertionsort 
{
    static void insertsort(int ar[])
    {
        for (int i = 1; i < ar.length; i++) 
        {
            int j=i;

            while (j>0 && ar[j]<ar[j-1]) 
            {
                int temp = ar[j-1];
                ar[j-1]=ar[j];
                ar[j]=temp;
                j--;
            }
            
        }
        
    }
    public static void main(String[] args) 
    {
        int ar[]={14,9,15,12,6,8,5};
        
        insertsort(ar);

        for (int i = 0; i < ar.length; i++) 
        {
            System.out.print(ar[i]+" ");
            
        }
    }
    
}
