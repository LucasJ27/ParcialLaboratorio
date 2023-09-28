import java.util.Scanner; // Importamos el Scanner para poder interactuar con el usuario
public class Calculadora_NombreAlumno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        double a,b;
        //Creamos un bucle do-while para manejar la Secuencia de Operaciones
        do{
            System.out.println("Que desea hacer?(seleccione con el numero de opcion segun corresponda) \n1-Sumar\n2-Restar\n3-Multiplicar\n4-Dividir\n0-Salir");
            opcion = sc.nextInt();
            if (opcion == 1){
                System.out.println("Ingrese el primer numero de la suma: ");
                a = sc.nextDouble();
                System.out.println("Ingrese el segundo numero de la suma: ");
                b = sc.nextDouble();
                double suma = a+b;
                System.out.println("El resultado de la SUMA de " + a + " + " + b + " es: " + suma );

            }else if (opcion == 2){
                System.out.println("Ingrese el primer numero de la resta: ");
                a = sc.nextDouble();
                System.out.println("Ingrese el segundo numero de la resta: ");
                b = sc.nextDouble();
                double resta = a-b;
                System.out.println("El resultado de la RESTA de " + a + " - " + b + " es: " + resta );
            } else if (opcion == 3){
                System.out.println("Ingrese el primer numero de la multipliacion: ");
                a = sc.nextDouble();
                System.out.println("Ingrese el segundo numero de la multiplicacion: ");
                b = sc.nextDouble();
                double multiplicacion = a*b;
                System.out.println("El resultado de la MULTIPLICACION de " + a + " X " + b + " es: " + multiplicacion );
            }else if (opcion == 4){
                System.out.println("Ingrese el primer numero de la division: ");
                a = sc.nextDouble();
                System.out.println("Ingrese el segundo numero de la division: ");
                b = sc.nextDouble();
                if(b == 0){
                    System.out.println("El valor del divisor no puede ser 0");
                }
                double division = a/b;
                System.out.println("El resultadode la DIVISION de " + a + " / " + b + " es: " + division );
            }else if(opcion == 0){
                System.out.println("Gracias por utilizar nuestra calculadora, hasta la proxima!");
                break;
            }}while(opcion >= 0 && opcion <= 4);

            }
        }

