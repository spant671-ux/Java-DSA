public class one {

    static void printDigits(int num){
        //if num = 0, stop
        //if num != 0, keep continuing
        while (num!= 0){
            int digit = num%10;
            System.out.println(digit);
            //remove last digit
            num = num/10;
        }
    }
    static void main(){
        int num = 53127;
        printDigits(num);
    }
}
