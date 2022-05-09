import java.util.Scanner;

public class Ejercicio311 {

    static Scanner lt=new Scanner(System.in);
    public static void main(String[] args) {
        double bono;
        int añostrabajando ;
        //Datos de entrada
        System.out.println("Ingrese la cantidad de años trabajando en esta tienda");
        añostrabajando=lt.nextInt();
        //Proceso
        if (añostrabajando<=1) {
            bono=100;
        } else if (añostrabajando>1 && añostrabajando<3) {
            bono=200;
         } else if (añostrabajando>2 && añostrabajando<4) {
             bono=300;
          } else if (añostrabajando>3 && añostrabajando<5) {
              bono=400;
          } else if (añostrabajando>4 && añostrabajando<6) {
              bono=500;
           } else {
               bono=1000;
          }
                 //Datos de salida
                 System.out.println("El bono que le toca al siguiente empleado por haber trabajado "+añostrabajando+" años, es de"+bono);

    }
}