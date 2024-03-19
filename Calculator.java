import java.util.Scanner;

abstract class Calc{
    public abstract int add(int a, int b);
    public abstract String add(String a,String b);
    public abstract float add(float a,float b);
    public abstract int sub(int a, int b);
    public abstract String sub(String a,String b);
    public abstract float sub(float a,float b);
    public abstract int mul(int a, int b);
    public abstract float mul(float a,float b);
    public abstract double div(double a,double b);
}

class Solution extends Calc{
    public int add(int a, int b){
        return a+b;
    }
    public String add(String a,String b){
        return a+b;
    }
    public float add(float a,float b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
    public String sub(String a,String b){
        StringBuilder res = new StringBuilder();
        for (int i=0; i<a.length(); i++){
            char c = a.charAt(i);
            if (b.indexOf(c) == -1){
                res.append(c);
            }
        }
        return res.toString();
    }
    public float sub(float a,float b){
        return a-b;
    }
    public int mul(int a, int b){
        return a*b;
    }
    public float mul(float a,float b){
        return a*b;
    }
    public double div(double a,double b){
        return a/b;
    }
}

public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integer numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Solution s = new Solution();
        System.out.println("Sum : "+s.add(a,b));
        System.out.println("Difference : "+s.sub(a,b));
        System.out.println("Multiply : "+s.mul(a,b));
        System.out.println("Division : "+s.div(a,b));
        System.out.println("Enter two float numbers: ");
        float p = sc.nextFloat();
        float q = sc.nextFloat();
        System.out.println("Float Sum : "+s.add(p,q));
        System.out.println("Float Difference : "+s.sub(p,q));
        System.out.println("Float Multiply : "+s.mul(p,q));
        System.out.println("Enter two Strings : ");
        String x = sc.next();
        String y = sc.next();
        System.out.println("Float Sum : "+s.add(x,y));
        System.out.println("Float Difference : "+s.sub(x,y));

    }
}

/*

Enter two integer numbers : 
5 10
Sum : 15
Difference : -5
Multiply : 50
Division : 0.5
Enter two float numbers:
7.88 4.51
Float Sum : 12.39
Float Difference : 3.37
Float Multiply : 35.538803
Enter two Strings :
debasree sree
Float Sum : debasreesree
Float Difference : dba

*/
