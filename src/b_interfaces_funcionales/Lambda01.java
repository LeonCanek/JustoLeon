package b_interfaces_funcionales;
interface A1{
    void m();
    int X = 10;
    static class Interna{
        static String xx = "VIEJO";
    }
}
public class Lambda01 {
    public static void main(String[] args){
        A1 a = () -> {
            System.out.println("Lambda 1"+ A1.X);
        };
        System.out.println(a);
        a.m();
        System.out.println(A1.X);
        System.out.println(A1.Interna.xx);
        System.out.println("I don´t love you like i did yesterday :')");
    }
}
