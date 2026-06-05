public class vowels 
{
    public static void main(String[] args) 
    {
        String str="java 1programming 22";
        int vowel=0;
        int cons=0;

        for (int i = 0; i < str.length(); i++) 
        {
            char ch = str.charAt(i);

            if(Character.isLetter(ch))
            {

            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'|| ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            {
                vowel++;
            }
            else if(ch==' ')
            {

            }
            else 
            {
                cons++;
            }
        }

        }

        System.out.println("vowels "+vowel);
        System.out.println("consonent "+cons);
        
    }

    
}
