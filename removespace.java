public class removespace 
{
    public static void main(String[] args) 
    {
        String str="i love java";
        char [] charr =str.toCharArray();
        int length=str.length();

        for (int i = 0; i < length  ; i++) 
        {
           

            if(charr[i] ==' ')
            {
                for (int j = i; j < length-1  ; j++) 
                {
                    charr[j]=charr[j+1];
                }

                length--;

            }
        }
        
        for (int i = 0; i < length; i++) 
        {

            System.out.print(charr[i]);
            
        }
        
    }
    
}
