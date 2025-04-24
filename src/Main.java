import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double notaParcialUno = 0, notaTaller = 0, notaFinal = 0,notaMateria = 0;
        String materia = "";
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
                materia = sc.nextLine();
                switch (materia) {
                    case "1":
                        System.out.println("Nota de Lógica de programación");
                        System.out.println("Nota examen parcial: ");
                        notaParcialUno = sc.nextDouble();
                        System.out.println("Nota taller: ");
                        notaTaller = sc.nextDouble();
                        System.out.println("Nota final: ");
                        notaFinal = sc.nextDouble();
                        notaMateria = (notaParcialUno*0.2)+(notaTaller*0.3)+(notaFinal*0.5);
                        System.out.println("El estudiante "+ nombreEstudiante + " tiene la siguiente nota en la materia logíca de programacion: "+notaMateria);
                        if(notaMateria<2){
                            System.out.println("Perdio definitivamente");
                        } else if (notaMateria<2.9) {
                            System.out.println("Puede hacer plan de mejoramiento");
                        }else {
                            System.out.println("Así quedo la materia");
                        }
                        break;
                    case "2":
                        System.out.println("Nota de Metodologías ágiles");
                        System.out.println("Nota examen parcial: ");
                        notaParcialUno = sc.nextDouble();
                        System.out.println("Nota taller: ");
                        notaTaller = sc.nextDouble();
                        System.out.println("Nota final: ");
                        notaFinal = sc.nextDouble();
                        notaMateria = (notaParcialUno*0.2)+(notaTaller*0.3)+(notaFinal*0.5);
                        System.out.println("El estudiante "+ nombreEstudiante + " tiene la siguiente nota en la materia Metodología ágiles: "+notaMateria);
                        if(notaMateria<2){
                            System.out.println("Perdio definitivamente");
                        } else if (notaMateria<2.9) {
                            System.out.println("Puede hacer plan de mejoramiento");
                        }else {
                            System.out.println("Así quedo la materia");
                        }
                        break;
                    case "3":
                        System.out.println("Nota de Introducción a la programación");
                        System.out.println("Nota examen parcial: ");
                        notaParcialUno = sc.nextDouble();
                        System.out.println("Nota taller: ");
                        notaTaller = sc.nextDouble();
                        System.out.println("Nota final: ");
                        notaFinal = sc.nextDouble();
                        notaMateria = (notaParcialUno*0.2)+(notaTaller*0.3)+(notaFinal*0.5);
                        System.out.println("El estudiante "+ nombreEstudiante + " tiene la siguiente nota en la materia Introducción a la programación: "+notaMateria);
                        if(notaMateria<2){
                            System.out.println("Perdio definitivamente");
                        } else if (notaMateria<2.9) {
                            System.out.println("Puede hacer plan de mejoramiento");
                        }else {
                            System.out.println("Así quedo la materia");
                        }
                        break;
                }
                break;
            case "2":
                System.out.println("Programa diseño Grafico");
                System.out.println("Seleccione la materia:\n1 - Tipografía\n2 - Iconografía\n3 - Semántica");
                materia = sc.nextLine();
                switch (materia) {
                    case "1":
                        System.out.println("Nota de diseño grafico");
                        System.out.println("Nota examen parcial: ");
                        notaParcialUno = sc.nextDouble();
                        System.out.println("Nota taller: ");
                        notaTaller = sc.nextDouble();
                        System.out.println("Nota final: ");
                        notaFinal = sc.nextDouble();
                        notaMateria = (notaParcialUno*0.2)+(notaTaller*0.3)+(notaFinal*0.5);
                        System.out.println("El estudiante "+ nombreEstudiante + " tiene la siguiente nota en la materia Tipografía: "+notaMateria);
                    if(notaMateria<2){
                        System.out.println("Perdio definitivamente");
                    } else if (notaMateria<2.9) {
                        System.out.println("Puede hacer plan de mejoramiento");
                    }else {
                        System.out.println("Así quedo la materia");
                    }
                        break;
                    case "2":
                        System.out.println("Nota de diseño grafico");
                        System.out.println("Nota examen parcial: ");
                        notaParcialUno = sc.nextDouble();
                        System.out.println("Nota taller: ");
                        notaTaller = sc.nextDouble();
                        System.out.println("Nota final: ");
                        notaFinal = sc.nextDouble();
                        notaMateria = (notaParcialUno*0.2)+(notaTaller*0.3)+(notaFinal*0.5);
                        System.out.println("El estudiante "+ nombreEstudiante + " tiene la siguiente nota en la materia Iconografía: "+notaMateria);
                        if(notaMateria<2){
                            System.out.println("Perdio definitivamente");
                        } else if (notaMateria<2.9) {
                            System.out.println("Puede hacer plan de mejoramiento");
                        }else {
                            System.out.println("Así quedo la materia");
                        }
                        break;
                    case "3":
                        System.out.println("Nota de diseño grafico");
                        System.out.println("Nota examen parcial: ");
                        notaParcialUno = sc.nextDouble();
                        System.out.println("Nota taller: ");
                        notaTaller = sc.nextDouble();
                        System.out.println("Nota final: ");
                        notaFinal = sc.nextDouble();
                        notaMateria = (notaParcialUno*0.2)+(notaTaller*0.3)+(notaFinal*0.5);
                        System.out.println("El estudiante "+ nombreEstudiante + " tiene la siguiente nota en la materia Sémantico: "+notaMateria);
                        if(notaMateria<2){
                            System.out.println("Perdio definitivamente");
                        } else if (notaMateria<2.9) {
                            System.out.println("Puede hacer plan de mejoramiento");
                        }else {
                            System.out.println("Así quedo la materia");
                        }
                        break;
                }
                break;
            case "3":
                System.out.println("Programa Gastronomía");
                System.out.println("Seleccione la materia:\n1 - Costos\n2 - Pasteleria Dulce\n3 - Cocina Internacional");
                materia = sc.nextLine();
                switch (materia) {
                    case "1":
                        System.out.println("Nota de Gastronomía");
                        System.out.println("Nota examen parcial: ");
                        notaParcialUno = sc.nextDouble();
                        System.out.println("Nota taller: ");
                        notaTaller = sc.nextDouble();
                        System.out.println("Nota final: ");
                        notaFinal = sc.nextDouble();
                        notaMateria = (notaParcialUno*0.2)+(notaTaller*0.3)+(notaFinal*0.5);
                        System.out.println("El estudiante "+ nombreEstudiante + " tiene la siguiente nota en la materia Costos: "+notaMateria);
                        if(notaMateria<2){
                            System.out.println("Perdio definitivamente");
                        } else if (notaMateria<2.9) {
                            System.out.println("Puede hacer plan de mejoramiento");
                        }else {
                            System.out.println("Así quedo la materia");
                        }
                        break;
                    case "2":
                        System.out.println("Nota de Gastronomía");
                        System.out.println("Nota examen parcial: ");
                        notaParcialUno = sc.nextDouble();
                        System.out.println("Nota taller: ");
                        notaTaller = sc.nextDouble();
                        System.out.println("Nota final: ");
                        notaFinal = sc.nextDouble();
                        notaMateria = (notaParcialUno*0.2)+(notaTaller*0.3)+(notaFinal*0.5);
                        System.out.println("El estudiante "+ nombreEstudiante + " tiene la siguiente nota en la materia Pasteleria dulce: "+notaMateria);
                        if(notaMateria<2){
                            System.out.println("Perdio definitivamente");
                        } else if (notaMateria<2.9) {
                            System.out.println("Puede hacer plan de mejoramiento");
                        }else {
                            System.out.println("Así quedo la materia");
                        }
                        break;
                    case "3":
                        System.out.println("Nota de Gastronomía");
                        System.out.println("Nota examen parcial: ");
                        notaParcialUno = sc.nextDouble();
                        System.out.println("Nota taller: ");
                        notaTaller = sc.nextDouble();
                        System.out.println("Nota final: ");
                        notaFinal = sc.nextDouble();
                        notaMateria = (notaParcialUno*0.2)+(notaTaller*0.3)+(notaFinal*0.5);
                        System.out.println("El estudiante "+ nombreEstudiante + " tiene la siguiente nota en la materia Cocina Internacional: "+notaMateria);
                        if(notaMateria<2){
                            System.out.println("Perdio definitivamente");
                        } else if (notaMateria<2.9) {
                            System.out.println("Puede hacer plan de mejoramiento");
                        }else {
                            System.out.println("Así quedo la materia");
                        }
                        break;
                }
                break;
        }
    }
}