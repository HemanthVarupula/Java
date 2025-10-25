public class ControlFlow {
    public static void main(String[] args) {
        //conditions

        //if

        int num=20;
        if(num%2==0){
            System.out.println("given number is even");
        }

        //if-else

        int n=1;
        if(n>=1){
            System.out.println("given number is natural number");
        }else{
            System.out.println("not a natural number");
        }

        //if-else if  lader 

        int a=9;
        if(a>0){
            System.out.println("a is a positive number");
        }else if(a<1){
            System.out.println("a is a negative number");
        }else{
            System.out.println("a is equal to zero");
        }


        //switch case 

        int day=5;
        switch (day) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("entered day is invalid day ");
                break;
        }

        //loops

        //for loop

        for(int i=0;i<5;i++){
            System.out.println("i value is "+i);
        }

        //while

        int n1=10;
        while(n1>5){
            System.out.println("the value of n1 is "+n1);
            n1--;
        }

        //d0-while at least executed one time 
        int ans=2;;
        do{
            System.out.println("hii "+ans);
            ans--;
        }while(ans>0);
    }
}
