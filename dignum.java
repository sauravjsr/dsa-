import java.util.Scanner;

public class dignum 
{
    public static void main(String[] args) 
    {
        int num,div=100,r,nod=0,temp,temp1;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number:-  ");
        num=sc.nextInt();

        temp=num;
        while(temp>0)
        {
            temp=temp/10;
            nod++;

        }

        div = (int)Math.pow(10, nod-1);

        temp1=num;
        while (temp1>0)
        {
            r=temp1/div;
             System.out.println(r);

            temp1=temp1%div;
            div=div/10;
          

           
        }  
    }
    
}
