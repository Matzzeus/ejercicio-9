import java.util.Scanner;

public class ejercicio9{
    Scanner scanner = new Scanner(System.in);

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int t1 = 0;
        int t2 = 0;
        int cantidadTemperatura = 0;
        int temperaturas = 0;

        do{
            System.out.print("Ingrese la temperatura 1");
            t1 =  scanner.nextInt();
            if(t1 != 0){
                System.out.print("Ingrese la temperatura 2");
                t2  = scanner.nextInt();
                if(t1 >= 5 && t1 <= 15){
                    cantidadTemperatura = t1 + cantidadTemperatura;
                    temperaturas ++;
                }
                if(t2 >= 5 && t2 <= 15){
                    cantidadTemperatura = t2 + cantidadTemperatura;
                    temperaturas ++;
                }
            }
        } while(t1 != 0);
        double promedio = (double)cantidadTemperatura / temperaturas;
        System.out.println("El promedio de las temperaturas entre 5 grados y 15 grados es de " + promedio);
    } 
}
