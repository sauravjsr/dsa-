public class  twosum
{
    static int [] solutin(int[]nums ,int target)
    {
        int out[]=new int[2];
        int start=0;
        int end=nums.length-1;
        
        while(start<end)
        {
            int sum=nums[start]+nums[end];
            if(sum==target)
            {
                out[0]=start;
                out[1]=end;
                return out;
            }
            
            else if(sum>target)
            {
                end--;
            }
            else
            {
                start++;
            }
        }
        return new int[] {-1,-1};
    }

    public static void main(String[] args) 
    {
        int ar[]={1,2,4,8};
        int res[]=solutin(ar, 9);
        System.out.println(res[0]+" "+res[1]);

    }
}
