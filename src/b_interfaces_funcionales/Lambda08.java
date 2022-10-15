package b_interfaces_funcionales;
interface A8{
    int suma(int a, int b);
    default String m(){return "Default";}
    default int f(int x) {return x + 1;}
}
public class Lambda08 {
    public static void main(String[] args){
        A8 f = (x, y) -> x + y;

        //Esto me encanta pero me duele la cola
        A8 p = (x, y) -> x + y;
        // que sera japon sin mi
               A8 v = (x, y) -> x + y;
        System.out.println(f.suma(4,9));
        System.out.println(f.m());
        // Vamos definiendo a mi gusto lo que mas necesite
        // Para un juego seria como los ataques de bola de fuego de mario
    }
}
