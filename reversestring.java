/**
 * Created by Subramanian Ganesan on 6/14/2016.
 */
public class reversestring {
    public static void main(String[] srgs)
    {
     String s="subramanian";
        String s1=new String(s);
        for(int i=s.length()-1;i>=0;i--)
            System.out.print(s.charAt(i));

    }
}
