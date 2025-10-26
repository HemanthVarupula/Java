class Fibonacci{
    public static int fib(int n,int i,int j){
        if(n<=1){
            return n;
        }
        return fib(n-1,i,j)+fib(n-2,i,j);
    }
    public static void main(String[] args) {
        System.out.println(fib(5,0,1));
    }
}