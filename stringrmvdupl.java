import java.util.LinkedHashSet;

public class stringrmvdupl 
{
    public static void main(String[] args) 
    {
        String str ="programming";
        char [] chstr =str.toCharArray();
        LinkedHashSet<Character> linkedhashset = new LinkedHashSet<>();

        for (int i = 0; i < str.length(); i++) 
        {
            linkedhashset.add(chstr[i]);
        }

        for (Character character : linkedhashset) 
        {
            System.out.print(character);
            
        }

        
    }
    
}
