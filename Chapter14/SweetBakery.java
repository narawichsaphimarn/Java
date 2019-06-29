package Chapter14;
public class SweetBakery implements First,Second,Third{
    public static void main(String[] args){
        SweetBakery wb = new SweetBakery();
        wb.abc1();
        System.out.println();
        System.out.println(SUPER);
        wb.def();
        wb.abc2();
        System.out.println();
        
        System.out.println();
        
        wb.abc1();
        System.out.print("(");
        wb.ghi();
        System.out.print(")");
        System.out.println();
        System.out.println(SUPER);
        wb.def();
        wb.abc2();
        System.out.println();
    }
    
    public void abc1(){
        System.out.print("Welcome to sweet bakery ");
    }
    
    public void abc2(){
        System.out.print("www.sweetbakery.com");
    }
    
    public void def(){
        System.out.print("Order online at ");
    }
    
    public void ghi(){
        System.out.print("Tel.02-746-9636");
    }
}
