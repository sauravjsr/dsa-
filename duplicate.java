import java.util.HashSet;
import java.util.Set;

public class duplicate 
{ 
    static boolean unique(int arr[])
    {
        Set<Integer> uniqueset = new HashSet<>();

        for (int i = 0; i < arr.length; i++) 
      {
        if(uniqueset.contains(arr[i]))
        {
            return true;
        }

        uniqueset.add(arr[i]);

      }

      return false;
    }

    public static void main(String[] args) 
    { 
        int ar[]={1,2,3,3};

        System.out.println(unique(ar));


     

    }
    
}
