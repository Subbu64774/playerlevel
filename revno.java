import java.util.Scanner;

/**
 * Created by Subramanian Ganesan on 6/14/2016.
 */
public class revno {
    public static void main(String[] Args) {
        int no;
        Scanner sc= new Scanner(System.in);
        no=sc.nextInt();
        int temp = no;
        int sum=0,rem=0;
        while(temp>0)
        {
            rem=temp%10;
            sum=(sum*10)+rem;
            temp=temp/10;
        }
        System.out.println(sum);
    }
}
