package t2_herencia;

class Dios {
    static {
        System.out.println("Dios");
    }

    void h() {
        System.out.println("Soy dios");
    }
}

class Hijo extends Dios {
    static {
        System.out.println("hijo");
    }

    void h() {
        System.out.println("Soy hijo");
    }
}

class EspirituSanto extends Hijo {
    static {
        System.out.println("Espiritu Santo");
    }

    void h() {
        System.out.println("EspituSanto");
    }
}

class Justo extends EspirituSanto {
    static {
        System.out.println("Justo");
    }

    void h() {
        System.out.println("Justo");
    }
}

public class HerenciaPaco extends Justo {
    public static void main(String[] args) {
        Dios j = new Dios();
        j.h();
        System.out.println((Justo) j);
        // como imprimir soy justo como realizar correctamente el downcasting

    }
}

