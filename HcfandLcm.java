
import java.util.Scanner;

public class HcfandLcm {
    public static void main(String[] args) {
        System.out.println("Enter two numbers to find HCF and LCM");
        Scanner in = new Scanner(System.in);
        int num1=in.nextInt();
        int num2=in.nextInt();
        System.out.println("The HCF of "+num1+num2+"is "+hcf(num1,num2));
        System.out.println("The LCM of "+num1+num2+"is "+((num1*num2)/hcf(num1,num2)));


    }

    public static int hcf(int num1,int num2){
        
        while (num2!=0) { 
            int temp=num2;
            num2=num1%num2;
            num1=temp;
        }
        return num1;
    }

    
}
