import java.util.Scanner;

import static java.lang.Math.pow;

/**
 * Created by Subramanian Ganesan on 6/20/2016.
 */
public class powoftwo {
    public static void main(String[] args){
        int i,num;
        Scanner sc=new Scanner(System.in);
        int count=0;
        num=sc.nextInt();
        for (i=1;i<=num;i++) {
            if(num==pow(i,2))
                System.out.println(num+"  is a power of two");
            //else
                //System.out.println(num+"  is not power of two");



        }
        }
    }

