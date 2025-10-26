public class Powerof2 {
    public static boolean ans(int n){
        if(n==1){
            return true;
        }else if(n<1||n%2!=0){
            return false;
        }
        return ans(n/2);

    }
    public static void main(String[] args) {
        System.out.println(ans(18));
    }
}
