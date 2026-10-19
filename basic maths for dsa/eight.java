public class eight {
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
    static int getLCM(int a, int b){
        int gcd = getGCD(a, b);
        int prod = a*b;
        int lcm = prod/gcd;
        return lcm;
    }
    static void main(){
        System.out.println(getLCM(18, 12));
    }
}
