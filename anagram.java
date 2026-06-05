import java.util.LinkedHashSet;

public class anagram 
{
    public static void main(String[] args)  
    {
        String  str  = "string";
        String  str1 = "risgtn";
        Boolean anagram=true;

        char[] ch1=str.toCharArray();
        char[] ch2=str.toCharArray();

       if(str.length()!=str1.length())
       {
            System.out.println("length is not same ");
            return;
       }
      

        for (int i = 0; i < ch1.length-1; i++) 
        {
            for (int j = i+1; j < ch2.length; j++) 
            {
                
            if(ch1[i]>ch1[j])
            {
                char temp=ch1[i];
                ch1[i]=ch1[j];
                ch1[j]=temp;
            }

            if(ch2[i]>ch2[j])
            {
                char temp=ch2[i];
                ch2[i]=ch2[j];
                ch2[j]=temp;
            }

            }
        }

        for (int i = 0; i < ch1.length; i++) 
        {
            if(ch1[i]!=ch2[i])
            {
                anagram=false;
            }
        }

        if(anagram)
        {
            System.out.println("anagram");
        }
        else
        {
            System.out.println("not anagram ");
        }   
    }
    
}
