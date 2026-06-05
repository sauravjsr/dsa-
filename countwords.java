public class countwords 
{
    public static void main(String[] args) 
    {
        String str="i love java  programing";
        int count=0;

        for (int i = 0; i < str.length() ; i++) 
        {
            char ch=str.charAt(i);

            if(ch !=' ' && (i==0 || str.charAt(i-1)==' '))
            {
                count++;
            }
            
        }

        System.out.println("no of words  "+(count));
        
    }
    
}
