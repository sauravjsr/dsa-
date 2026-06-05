public class frequency 
{
    public static void main(String[] args) 
    {
        int arr[]={1,2,3,3,4,5,6,5,1};
        int largest=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) 
        {
            if(largest<arr[i])
            {
                largest=arr[i];
            }
            
        }

        int freq [] = new int[largest+1];


        for (int i = 0; i < arr.length ; i++) 
        {
            freq[arr[i]]++;    
        }

        for (int i = 0; i <freq.length; i++) 
        {
            if(freq[i]>=2)
            {
                System.out.println(i+" :- "+freq[i]);

            }
            
        }


    }

    
}

