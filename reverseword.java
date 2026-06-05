public class reverseword 
{
    public static void main(String[] args) 
    {
        String str="i love java";
        String [] words=str.split(" ");

        for (int i = 0 ; i < words.length ; i++) 
        {
                
                for (int j = words[i].length()-1 ; j>=0 ; j--) 
                {
                    System.out.print(words[i].charAt(j));
                    
                }
                System.out.print(" ");
            
        }
        
    }
    
}
