public class Rotatearray 
{
    static void rotate(int ar[],int dig)
    {
        int temp[] = new int[ar.length-dig];
        int key=ar[0];

        for (int i = 1; i < ar.length; i++) 
        {
            ar[i-1]=ar[i];
        }

        
        ar[ar.length-1]=key;
    }

    public static void main(String[] args) 
    {
        int arr[]={1,2,3,4,5};

        rotate(arr,2);
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i]+" ");
            
        }

        
    }

    
}
