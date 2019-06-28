package Chapter12;
public class TestStaticVar {
    static int x;
    public static void main(String[] args){
        staticMethod(x);
        x = x + 3;
        System.out.println(x);
    }
    public static void staticMethod(int x){
        x = x + 2;
    } 
}
