public class four {
    static int reverseNum(int num){
        int revNum = 0;
        //ans = ans*10 + currentDigit
        while(num!=0){
            int digit = num%10;
            //calculate reverse num
            revNum = revNum*10 + digit;
            //remove last digit
            num = num/10;
        }
        return revNum;
    }
    static void main(){
        System.out.println(reverseNum(98901));
    }
}
