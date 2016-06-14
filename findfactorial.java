import java.util.Scanner;

/**
 * Created by Subramanian Ganesan on 6/14/2016.
 */
public class findfactorial
{
    public static void main(String[] ard1){
        int no;
        Scanner sc =new Scanner (System.in);
        no=sc.nextInt();
        int fact=1;
        for (int i=no;i>=1;i--)
        {
            fact=fact*i;


        }
        System.out.println(fact);
    }

}
