public class five {
    static int reverseNum(int num){
        int revNum = 0;
        while(num!=0){
            int digit = num%10;
            revNum = revNum*10 + digit;
            num = num/10;
        }
        return revNum;
    }
    static boolean isPalindrome(int num){
        int originalNum = num;
        int reverseNum = reverseNum(num);
        if (originalNum == reverseNum){
            System.out.println("Is Palindrome");
            return true;
        }
        else {
            System.out.println("Not Palindrome");
            return false;
        }
    }
    static void main(){
        int num = 1221;
        isPalindrome(num);
    }
}
