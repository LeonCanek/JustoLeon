package b_interfaces_funcionales;
interface A0{
    void m();
    int X = 10;
    final String yo ="MSC";
}
public class Lambda00 {
    public static void main(String[] args){
        A0 a = new A0() {
            @Override
            public void m() {
                System.out.println("Lambda 0" + X);
            }
        };
        System.out.println(a);
        a.m();
        System.out.println(A0.X+A0.yo);
    }
}
