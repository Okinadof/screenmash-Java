import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello  , imersion java prueba de uso !");
        //System.out.println("pelicula Matrix");
        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBAsico = true;
        String nombre = "Matrix";
        String sinopsis = """
                la mejor pelicula del fin del milenio
                """;
        double mediaEvalucionUsuario= 0;

        System.out.println("Pelicula: " + nombre);
        System.out.println(fechaDeLanzamiento);
        System.out.println(evaluacion);
        System.out.println(incluidoEnElPlanBAsico);
        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
        System.out.println("Media de la Evaluacion: " + mediaEvaluacion);

        if (fechaDeLanzamiento > 2023){
            System.out.println("Pelicula Popular en el momento");
        } else {
            System.out.println("Pelicula Retro que vale la pena Ver");
        }
        //for (int i =0; i < 3; i++) {
    for (int i=0; i<3; i++) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa la Evaluacion que le darias a la pelicula Matrix");
        double NotaMatrix = teclado.nextDouble();
        mediaEvalucionUsuario = mediaEvalucionUsuario + NotaMatrix;
    }
        System.out.println("La media de la Pelicula" +
                            "Matrix calculada por el usuario es:" + mediaEvalucionUsuario / 3);
    }
}