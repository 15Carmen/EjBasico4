package ejbasico;

public class EjBasico4 {
    public static void main(String[] args) {

        //Declaramos las variables enteras nota1 y nota2 y les damos un valor a cada una
        int nota1=5;
        int nota2=4;

        //Declaramos la variable double media
        double media;

        /**
         * Calculamos la media de las dos notas anteriores casteandolas a double, sumándolas
         * y luego dividiendolas entre 2 (numero de notas que hay)
         */
        media=((double)nota1+(double)nota2)/2;

        //Mostramos por consola la nota media
        System.out.println("Sabiendo que el alumno ha sacado un "+nota1+" y un "+nota2+
                ", la nota media del alumno es de "+media);

    }
}