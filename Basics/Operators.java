public class Operators {
    public static void main(String[] args) {
        //arithmetic operators +,-,*,%

        // int a=9;
        // int b=99;
        // System.out.println(a+b);
        // System.out.println(b-a);
        // System.out.println(a*b);
        // System.out.println(b/a);

        //Assignment operators >>=,<<=,= ,+=,-=.....

        //int d=9; ===========> 9 assigned to variable b

        //comparison >=,<=,==

        int age=19;
        //ternary operator 
        System.out.println(age >= 18 ? "adult" : "not adult");

        //logical &&,!,||

        int num=5;
        int num2=7;
        if(num>4&&num2>4){
            System.out.println("both are statisfied");
        }else{
            System.out.println("not statisfied");
        }
        System.out.println(num !=5?"invald number":"valid number");
    }
}
