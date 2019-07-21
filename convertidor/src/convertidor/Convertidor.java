package convertidor;

import java.util.Scanner;

public class Convertidor {

    public static void main(String[] args) {
        System.out.println("Seleccione la unidad a convertir:");
        System.out.println("1: Newton a Dinas");
        System.out.println("2: Newton a Libras Fuerza");
        System.out.println("3: Dinas a Newton");

        Scanner reader = new Scanner(System.in);
        int n = 0;
        n = reader.nextInt();
        Procesos pro = new Procesos();
        switch (n) {
            case 1:
                System.out.println("INGRESE LA CANTIDAD EN NEWTONS");
                double f;
                f = reader.nextDouble();
                System.out.println("El resultado es; " + pro.NewtonDina(f) + "Dinas ");
                break;
            case 2:
                System.out.println("INGRESE LA CANTIDAD EN NEWTONS");
                double t = 0;
                f = reader.nextDouble();
                System.out.println("El resultado es: " + pro.Newtonlibraf(t) + "librasf");
                break;
            case 3:
                System.out.println("INGRESE LA CANTIDAD EN DINAS");
                double d = 0;
                d = reader.nextDouble();
                System.out.println("El resultado es: " + pro.Dinasnewton(d) + "newton");
                break;

        }
    }

}
