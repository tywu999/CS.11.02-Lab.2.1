public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int result = add(a, b);
        System.out.println("The sum of " + a + " and " + b + " is: " + result);
        int result2 = add4(3, 8, 9, 10);
        System.out.println(result2);
        String hello = morningGreeting("Toby Fox");
        System.out.println(hello);
        String hello2 = afternoonGreeting("Toby Fox");
        System.out.println(hello2);
        String triple1 = triple("YES");
        System.out.println(triple1);
        double half = half(7);
        System.out.println(half);
        int round = roundPositiveValueToNearestInteger(8.73);
        System.out.println(round);
        int round2 = roundNegativeValueToNearestInteger(-9.8);
        System.out.println(round2);

    }

    public static int add(int a, int b) {
        return a + b;
    }
    public static int add4(int a, int b, int c, int d) {
        return add(add(a, b), add(c, d));
    }

    public static String morningGreeting(String string){
        return "早上好, " + string + "!";
    }
    public static String afternoonGreeting(String string){
        return "下午好, " + string + "!";
    }
    public static String triple(String string){
        return string + string + string;
    }
    public static double half(int a){
        return a * 0.5;
    }
    public static int roundPositiveValueToNearestInteger(double myDouble){
        double myDub = myDouble + 0.5;
        int myInt = (int) myDub;
        return myInt;
    }
    public static int roundNegativeValueToNearestInteger(double myDouble){
        double myDub = myDouble - 0.5;
        int myInt = (int) myDub;
        return myInt;
    }
}