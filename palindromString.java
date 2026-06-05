public class palindromString 
{
    public static void main(String[] args) 
    {
        String str="madam";
        boolean palindrom=true;

        int start =0;
        int end=str.length()-1;

       while (start<end) 
       {
        char ch=str.charAt(start);
        char ch1=str.charAt(end);

        if(ch != ch1)
        {
            palindrom=false;
           break;
        }

        start++;
        end--;
       }

       if(palindrom)
       {
        System.out.println("palindrome "+str);

       }
       else
       {
        System.out.println("not palindrom "+str);
       }
        
    }
    
}
