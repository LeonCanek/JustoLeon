package b_interfaces_funcionales;
interface A3 {
    void m();
}
public class Lambda03 {
    public static void main(String[] args){
        A3 a = () -> System.out.println("Lambda 3");
        System.out.println(a);
        a.m();
        A3 b = () -> System.out.println("We all going to hell");
        System.out.println(b);
        b.m();
        A3 c = () -> System.out.println("bUT THE SHIT SMELL, WE ALL ARE Liars "+ 1988);
        c.m();
    }
}
