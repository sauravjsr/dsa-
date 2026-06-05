public class appearsonce
{
    static void solution(int ar[])
    {
        int hash[] = new int[10+1];
        int n=ar.length;
        int max=ar[0];
         
        

        for (int i = 0; i < n; i++) 
        {
            hash[ar[i]]+=1;
        }

        for (int i = 0; i < hash.length; i++) 
        {
            if(hash[i]==1)
            {
                System.out.println(i+" is "+hash[i]);
            }
            
        }

    }
    public static void main(String[] args) 
    {
        int ar[]={1,2,2,3,3,10};
        solution(ar);

        
        
    }
    
}
