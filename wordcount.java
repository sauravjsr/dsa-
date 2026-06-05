public class wordcount 
{
    public static void main(String [] args)
    {
        String word="aaabbccc";
        int n=word.length();
        int count=1;

        for (int i = 0; i <n-1; i++) 
        {
            char ch=word.charAt(i);
            char ch1=word.charAt(i+1);

            if(ch==ch1)
            {
                count++;
            }
            else
            {
                System.out.print(ch+""+count+"");
                count=1;
            }
        }

        System.out.print(word.charAt(n-1)+""+count);
    }
    
}
