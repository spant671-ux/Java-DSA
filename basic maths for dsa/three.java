public class three {
    static int sumOfNums(int num){
        int sum = 0;
        while(num!=0){
            int digit = num%10;
            sum = sum+digit;
            num = num/10;
        }
        return sum;
    }
    static void main(){
        System.out.println(sumOfNums(53127));
    }
}
