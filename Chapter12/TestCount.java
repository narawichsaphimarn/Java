package Chapter12;
class One {
    One(){
    super();
    }
    One(String name,int num1, int num2, int num3){
        System.out.println(name + " " + num1 + num2 + num3);
    }
}
class Two extends One {
    Two(String msg, int num1, int num2, int num3){
        System.out.println(msg + " " + num1 + num2 + num3);
    }
}
public class TestCount{
    public static void main(String[] args){
        One one = new One("Hello Test", 1, 2, 3);
        Two two = new Two("Counting down", 3, 2, 1);
    } 
}

