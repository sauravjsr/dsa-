public class Selectionsort 
{
    static int min;
    static int temp;
    static void sort(int ar[])
    {
        for (int i = 0; i < ar.length; i++) 
        {
             min =i;

            for (int j = 1+i; j < ar.length; j++) 
            {
                if(ar[min]>ar[j])
                {
                    min=j;
                } 
            }

             temp=ar[min];
             ar[min]=ar[i];
             ar[i]=temp;
        }
        

    }
    public static void main(String[] args) 
    {
        int arr[]={9,14,15,12,6,8,5};
        sort(arr);

        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i]+" ");
            
        }

    }
    
}
