package java_3_internas.t1_fundamentos;

interface I{
    void m();
}
class Concreta{
    void p(){}
}
public class Parcel07 {
    public Contents contents(){
        return new Contents(){
            private final int i = 11;
            public int value(){return i;}
        };
    }
    public Concreta getI(){
        return new Concreta(){
            public void p(){}
        };
    }
    public static void main(String[] args){
        Parcel07 p = new Parcel07();
        Contents c = p.contents();
        System.out.println(c.value());
        System.out.println(c);
    }
}
