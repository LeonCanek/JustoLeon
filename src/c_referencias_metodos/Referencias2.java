package c_referencias_metodos;
interface I2{
    double m(int i);
}
class C2{
    static double p(int i){return i*3.33;}
    static double q(int i){return i*4.44;}
    //static double p(int i){return i*3.33;}
}

public class Referencias2 {
    public static void main(String[] args){
        I2 i2 = (x) -> x * 2;
        System.out.println(i2.m(45));
        i2 = (x) -> 0;
        C2 paco = new C2();//
        i2 = C2::q;
        System.out.println(paco);
    }
}
