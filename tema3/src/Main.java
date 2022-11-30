public class Main {
    public static void main(String[] args) {
        // Primera parte
        int resultado = sumaNumeros(10,5,2);
        System.out.println("El resultado de la suma es: "+resultado);

        // Segunda parte
        Coche miCoche = new Coche();
        miCoche.incrementarPuertasCoche();
        System.out.println("El numero de puertas del coche es: "+miCoche.puertasCoche);


    }

    public static int sumaNumeros(int a, int b, int c){
        return a + b + c;
    }
}

class Coche{
    public int puertasCoche;

    public void incrementarPuertasCoche(){
        puertasCoche++;
    }
}