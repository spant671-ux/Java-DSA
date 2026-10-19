public class two {
    static int countNum(int num){
        int count = 0;
        while (num!=0){
            int digit = num%10;
            count++;
            num = num/10;
        }
        return count;
    }
    static void main(){
        System.out.println(countNum(34567));
    }
}
