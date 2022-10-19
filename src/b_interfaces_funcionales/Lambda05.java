package b_interfaces_funcionales;
interface A5{
    void m();
}
interface A51{
    int redondear(double d);
}
interface A52{
    String m(int x);
}
public class Lambda05 {
    public static void main(String[] args) {
    A5 a = () ->
            System.out.println("Lambda 5");
            System.out.println("Lambda 5");
            ;
    System.out.println(a);
    a.m();
    A51 a2 = (double d)-> (int)Math.round(d);
        System.out.println(a2.redondear(Math.random()*10));
        A52 a3 = (int x) -> "Valor recibido: " + x;
        System.out.println(a3.m(78));
    }
}
