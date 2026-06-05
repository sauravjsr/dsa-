public class test 
{
    public static void main(String[] arg) 
    {
        int[] arr = {1,2,3,4,6,8};
        int start=0,end=arr.length-1,sum=0,target=12;

        while(start<end) 
        {
            sum=arr[start]+arr[end];

            if(sum==target)
            {
                System.out.println(arr[start]+" + "+arr[end]+" = "+target);
                break;
            }
            else   if(sum>target)
            {
                end--;
            }
            else
            {
                start++;
            }


            
        }
       
       
    }

    
}