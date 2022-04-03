import java.net.SocketPermission;

public class tst{
    public static void main (String[] arg)
    {
        char c = 'D';
        System.out.println(c);

        c = 68;
        System.out.println(c);

        c = '\104';
        System.out.println(c);

        c = '\u0044';
        System.out.println(c);

        String s  = "\u0044\u0045\105P\101\113";
        System.out.println(s);
        if (53=='5')
        System.out.println("yes");
        else
        System.out.println("no");
    }

}
