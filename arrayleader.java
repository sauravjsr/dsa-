public class arrayleader
{
    public static void main(String[] args) 
    {
        int[] arr={66,64,45,32};
        int n=arr.length;
        int leader=arr[n-1];

        for(int i=0 ; i<n ;i++)
        {
            if(leader<arr[n-1-i+1])
            {
                leader=arr[n-1-i+1];
                int sum=0;
                 sum += leader;
            }
        }
        System.out.println(leader);
        
    }

    
}