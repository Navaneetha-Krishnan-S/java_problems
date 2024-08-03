public class FindEvenDigit{

    public static void main(String[] args) {
        int[] arr = {100,10,1,10000,1000,10,10};

        System.out.println("The count of even digit numbers are ");
        System.out.println(countTotal(arr));
    }

    public static int countTotal(int[] arr){
        int count = 0;
        for (int num : arr) {
            if(even(num)){
                count++;
            }
            
        }
        return count;
    }

    public static boolean even(int num){
        int totaldigit = digit(num);
        if(totaldigit%2==0){
            return true;
        }
        return false;
    }

    public static int digit(int num){
        int count=0;
        while (num>0) { 
            count++;
            num=num/10;
        }
        return count;
    }
}