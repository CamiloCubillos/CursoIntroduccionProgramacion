public class Main {
    public static void main(String[] args) {
        int numeroIf = 3;

        // Primer punto
        if(numeroIf == 0){
            System.out.println("La variable es 0");
        }else if(numeroIf > 0){
            System.out.println("La variable es positiva");
        }else{
            System.out.println("La variable es negativa");
        }

        // Segundo punto
        int numeroWhile = 0;
        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        // Tercer punto
        // Solo se ejecutara una vez, pues debido al punto anterior ahora numeroWhile es >= 3
        do{
            System.out.println(numeroWhile);
            numeroWhile++;
        }while(numeroWhile < 3);

        // Cuarto punto
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        // Quinto punto
        String estacion = "verano";
        switch (estacion){
            case "verano":
                System.out.println("La estacion del año es verano");
                break;
            case "invierno":
                System.out.println("La estacion del año es invierno");
                break;
            case "primavera":
                System.out.println("La estacion del año es primavera");
                break;
            case "otoño":
                System.out.println("La estacion del año es otoño");
                break;
            default:
                System.out.println("No se reconoce la estacion");
                break;
        }

    }
}