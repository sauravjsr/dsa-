public class repeated1 
{
    public static void main(String []args)
    {
        int ar[]={1,1,3,4,4,5,5};
        int xor=0;

        for (int i = 0; i < ar.length; i++) 
        {
            xor=ar[i]^xor;
        }

        System.out.println("once repeated elements are "+xor);
    }
    
}
