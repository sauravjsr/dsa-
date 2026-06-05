public class longestsubstring 
{
    public static void main(String[] args) 
    {
        String str="java is object oriented language";
        String[] words =str.split(" ");

        int count=0,maxlen=0,ind=0;

        for (int i = 0; i < words.length; i++) 
        {
            int len = words[i].length();

            if(len>maxlen)
            {
                maxlen=len;
                ind=i;
            }  
        }

        System.out.println(words[ind]+" "+maxlen);

       
    }
    
}
