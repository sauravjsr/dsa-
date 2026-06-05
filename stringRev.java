public class stringRev 
{
    public static void main(String[] args) 
    {
        String name ="saurav";

        char [] arr=name.toCharArray();

        int start=0;
        int end=name.length()-1;

        while (start<end) 
        {
           
            char temp =arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
            
        }

        System.out.println(name);
        System.out.println(arr);
        
    }
    
}
