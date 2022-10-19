package b_interfaces_funcionales;

public class Lambda06 {
    interface A6{
        String redondear(double d);
    }
    public static void main(String[] args){
        A6 a = (double d) -> Math.round(d) +" Hola";
        System.out.println(a.redondear(Math.random()*10));
    }
}
