public class Sum {
    public static int printSum(int n,int i){
        if(i>n){
            return 0;
        }
        return i+printSum(n,i+1);
    }
    public static void main(String[] args) {
        System.out.println(printSum(10,0));
    }
}
