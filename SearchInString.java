
import java.util.Scanner;

public class SearchInString{
    public static void main(String[] args) {
        System.out.println("Enter the String : ");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        System.out.println("Enter the Character to Search in string: ");
        char c = in.next().trim().charAt(0);
        System.out.println(search1(name,c));
        System.out.println(search2(name,c));
    }
    public static boolean search1(String name,char c){

        if (name.length()==0) {
            return false;
        }

        for (int i = 0; i < name.length(); i++) {
            if (c==name.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    public static boolean search2(String name,char c){

        for(char a : name.toCharArray()){
            if(a==c)
            return true;
        }
        return false;
    }
}