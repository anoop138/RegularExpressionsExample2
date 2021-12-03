
public class Rege92{
    public static void main(String[] args) {
        String arr[]= {"aaa","abcd","banana"};
        for(String res: arr){
            if(res.matches("[a-z]{6}")==true)
            {
                System.out.println(res);
            }
        }
    }
}



