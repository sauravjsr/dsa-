import java.util.Scanner;

public class inverse 
{
    public static void main(String[] args) 
    {
        int inv=0,num;
        Scanner  sc = new Scanner(System.in);

        System.out.println("enter digit :- ");
        num=sc.nextInt();

        int oldpos=1;

        while (num>0) //num= 23153
        {
            int olddig =num%10;  ///od=3

            int newpos=olddig;
            int newdig=oldpos;

            //// MAKE CHANGES IN NEWDID AND NEWPOS TO GET INVERSE
            
            inv=inv+newdig*(int)Math.pow(10,newpos-1 );
            ///////
            
            oldpos++;

            num=num/10;
            
        }

        System.out.println(inv);
    }
    
}
