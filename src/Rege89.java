import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rege89 {
    public static void main(String[] args) {
        String target= "jdbc regular expression jdbc is important";
        Pattern v = Pattern.compile("jdbc");
        Matcher m = v.matcher(target);
        int ctr =0;
        while (m.find())
        {
            ctr++;
            System.out.println(m.start()+"--"+m.end()+"--"+m.group());
        }
        System.out.println(ctr);
    }
}







