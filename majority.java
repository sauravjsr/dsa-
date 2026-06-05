public class majority 
{
    public static void main(String[] args) 
    {
        int count =0;
        int candidate=0;
        int[] arr={2,2,1,2,3,3,3};

        for (int i = 0; i < arr.length; i++) 
        {
            int num=arr[i];

            if(count==0)
            {
                candidate=num;     // IF COUNT=0 THAT NO IS CANDIDATE 
            }

            if(arr[i]==candidate)
            {                       // KEEP TRAVSERSING ARRAY ARRAY FROM LEFT TO RIGHT               
                    count++;        // IF NUM[i] is EQUALS CANDIDATE THEN COUNT ++
            }
            else
            {
                count--;
            }

            
        }

        System.out.println("candidate :- "+candidate);
        
    }
    
}
