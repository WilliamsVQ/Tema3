public class Main {
    public static void main(String[] args) {
        System.out.println(suma(4, 4, 4));
        Coche coche1 = new Coche();
        coche1.maspuerta();
        coche1.maspuerta();
        coche1.maspuerta();
        coche1.maspuerta();
        System.out.println(coche1.puertas);

    }
    public static int suma(int a, int b, int c){
            return (a+b+c);
    }

}
class Coche {
    public int puertas = 0;

    public void maspuerta() {
        this.puertas++;
    }
}