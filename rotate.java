import java.util.Scanner;

public class rotate 
{
    public static void main(String[] args) 
    {
        int rem,i=0,num,dig=0,mul,div,temp,turnno,que,rotno;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number :- ");
        num=sc.nextInt();
        System.out.println("enter rotate no");
        turnno=sc.nextInt();


        temp=num;
        while (temp>0)
        {
            rem=temp%10;
            temp = temp/10;
            dig++;
        }

        if (turnno>dig) 
        {
            turnno=turnno%dig;
            
        }
    
            rem=num%(int)Math.pow(10, turnno); // last sliced  no
            que=num/(int)Math.pow(10, turnno); // first remaing no

            rotno=rem*(int)Math.pow(10,dig-turnno)+que; 

            System.out.println(num+" after "+turnno+" rotation is:- "+rotno);
           

    }
    
}
