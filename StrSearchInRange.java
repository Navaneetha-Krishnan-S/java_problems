
import java.util.Scanner;

public class StrSearchInRange{
    public static void main(String[] args) {
        System.out.println("Enter the String : ");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        System.out.println("Enter the Character to Search in string: ");
        char c = in.next().trim().charAt(0);
        System.out.println("Enter the range of index: ");
        int start =in.nextInt();
        int end =in.nextInt();

        System.out.println(search1(name,c,start,end));
    }
    public static boolean search1(String name,char c,int start,int end){

        if (name.length()==0) {
            return false;
        }

        for (int i = start; i < end; i++) {
            if (c==name.charAt(i)) {
                return true;
            }
        }
        return false;
    }

}