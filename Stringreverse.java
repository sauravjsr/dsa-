public class Stringreverse 
{
    public static void main(String[] args) 
    {
        String str="Madam";
        str=str.toLowerCase();
        char [] strch =str.toCharArray();
        int start=0,end=str.length()-1;
        while(start<end) 
        {
            if(strch[start]!=strch[end])
            {
                System.out.println("not palindrome");
                return;
            }
            
            start++;
            end--;
            
        }
        System.out.println("palindrome");

    }
    
}
