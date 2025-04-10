import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante: ");
        String nombreEstudiante = sc.nextLine();
        System.out.println("Ingrese el documento de identidad del estudiante: ");
        String documentoEstudiante = sc.nextLine();
        System.out.println("Seleccione el programa: \n1 - Desarrollo de Software\n2 - Diseño Grafico\n3 - Gastronomía");
        String programa = sc.nextLine();
        switch (programa) {
            case "1":
                System.out.println("Programa de desarrollo de software");
                System.out.println("Seleccione la materia:\n1 - Lógica de programación\n2 -Metodologías ágiles\n3 - Introducción a la programación");
                String materia = sc.nextLine();
                switch (materia) {
                    case "1":
                        System.out.println("Nota de Lógica de programación");
                        break;
                    case "2":
                        System.out.println("Nota de Metodologías ágiles");
                        break;
                    case "3":
                        System.out.println("Nota de Introducción a la programación");
                        break;
                }
                break;
            case "2":
                System.out.println("Programa diseño Grafico");
                System.out.println("Seleccione la materia:\n1 - Tipografía\n2 - Iconografía\n3 - Semántica");
                String materia = sc.nextLine();
                switch (materia) {
                    case "1":
                        System.out.println("Nota de tipografía");
                }
                break;
            case "3":
                System.out.println("Programa Gastronomía");
                break;
        }
    }
}