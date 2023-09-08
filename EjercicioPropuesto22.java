import java.util.Scanner;
public class EjercicioPropuesto22 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado: ");
        String nombre=entrada.nextLine();
        System.out.println("Ingrese el salario basico por hora: ");
        double salario_hora=entrada.nextDouble();
        System.out.println("Ingrese cantidad de horas trabajadas en el mes: ");
        double horas_mes=entrada.nextDouble();
        double salario_mes=salario_hora*horas_mes;
        if(salario_mes>450000){
            System.out.println(nombre);
            System.out.println("Salario mensual: "+salario_mes);
        }
        else{
            System.out.println(nombre);
        }
    }


}
