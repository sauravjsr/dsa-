public class move0 
{
    static int ind;
     static void  movezero (int arr[])   /// two pointer
    {
        int ind=1;
        for (int i=1; i < arr.length; i++) 
        {
            if(arr[i]!=0)
            {
              arr[ind]=arr[i];
              ind++;
            }
        }

        while(ind<arr.length)
        {
            arr[ind]=0;
            ind++;
        }

    } 
    public static void main(String[] args) 
    {
        int arr[]={1,0,2,3,2,0,0,2};    

        movezero(arr);

        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i]+" ");  
        }  
    }
    
}
