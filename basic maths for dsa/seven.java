public class seven {
    static int getGCD(int a, int b){
        //gcd (a, b) = gcd (b, a%b)
        while (b!= 0){
            int oldValueOfb = b;
            b = a%b;
            a = oldValueOfb;
        }
        //when b = 0, a gcd found
        int ans = a;
        return ans;
    }
    static void main(){
        System.out.println(getGCD(18, 12));
    }
}
