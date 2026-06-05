public class repeatedstring 
{
    public static void main(String[] args) 
    {
         String str ="programming";
         int[] freq = new int[26];

         for (int i = 0; i < str.length() ; i++) 
         {
            char ch=str.charAt(i);
            int ind=ch-'a';
            
            freq[ind]++;
            
         }

         for (int i = 0; i < str.length() ; i++) 
        {
            char ch = str.charAt(i);

            if(freq[ch-'a']>=2)
            {
                System.out.println(ch);
                freq[ch-'a']=0;
            }
            
         }


        
    }
    
}
