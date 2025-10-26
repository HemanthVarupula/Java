public class Numbers{
    public static int a(int num){
        if(num>10){
            return num ;
        }
        System.out.println(num);
        num++;
        return a(num);
    }
    public static void main(String[] args) {
        System.out.println(a(5));
    }
}