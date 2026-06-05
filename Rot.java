import java.util.Scanner;

public class Rot
{

    static void rev(int ar[],int startind,int lastind)
    {
        while (startind<lastind) 
        {
            int temp=ar[startind];
            ar[startind]=ar[lastind];
            ar[lastind]=temp;

            startind++;
            lastind--;
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int ar[]={1,2,3,4,5,6,7,8};
        System.out.println("enter how many didgit you want to rotate ");
        int d=sc.nextInt();

        if(d>ar.length)
        {
            d=d%ar.length;
        }

        rev(ar,0,d-1);
        rev(ar, d, ar.length-1);
        rev(ar, 0, ar.length-1);
        for (int i = 0; i < ar.length; i++) 
        {
            System.out.print(ar[i]+" "); 
        } 
    }
}