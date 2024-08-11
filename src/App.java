import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Dado dado = new Dado();
        int lanzamientos;

        System.out.print("Indique las veces que desea lanzar el dado: ");
        lanzamientos = sc.nextInt();

        while(dado.getLanzamientos() < lanzamientos) {
            System.out.printf("Lanzo el dado y obtengo un %d.\n", dado.lanzar());
        }

    }
}
