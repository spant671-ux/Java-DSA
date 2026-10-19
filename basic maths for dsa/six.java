public class six {
    static boolean isPrimeOrNot(int num){
        for(int i = 2; i*i <= num; i++){
            if(num % i == 0){
                //not a prime;
                return false;
            }
        }
        return true;
    }
    static void main(){
        int num = 11;
        System.out.println(isPrimeOrNot(num));
    }
}
