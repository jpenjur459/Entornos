import java.util.Scanner;
    public class Factorial {
        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);

            int numero;

            do{
                System.out.println("introduce un numero ");
                numero = entrada.nextInt();

                long factorial = 1;

                if (numero < 0){
                    System.out.println("no se pueden insertar numero negativos ");
                }else {
                    for (int i = 1; i <= numero; i++) {
                        factorial = factorial * i;
                    }
                }
                System.out.println("El factorial de "+ numero + " es " + factorial);

            }while(numero != -1);

        }
    }

