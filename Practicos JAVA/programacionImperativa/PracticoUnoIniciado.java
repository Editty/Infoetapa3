import javax.swing.plaf.LabelUI;

public class PracticoUno {
    public static void main(String[] args) {
        int numero1 = 8;
        int numero2 = 7;
        int numero3 = 8 + 7;

        System.out.println("Numero1: " + numero1);
        System.out.println("Numero2: " + numero2);
        System.out.println("Resultado suma: " + numero3);

        int numero1bis = 6;
        int numero2bis = 6;
        int numero3bis = 6 + 6; 

    
        int paridad = (numero3bis%2 == 0 || numero3bis%2 == 1)?1:0;

        System.out.println("Numero1bis: " + numero1bis);
        System.out.println("Numero2bis: " + numero2bis);
        System.out.println("El resultado es: " + numero3bis + " y es " + paridad);

        //caracteres
        char letraUno = 'E';
        char letraDos = 'd';
        char letraTres= 'i';
        char letraCuatro = 't';
        char letraCinco =  'h';
        
        System.out.println(letraUno);
        System.out.println(letraDos);
        System.out.println(letraTres);
        System.out.println(letraCuatro);
        System.out.println(letraCinco);

        //No se puede usar comillas dobles en el char porque están reservadas al string.
        
        //divisibilidad
        int num1 = 18;
        int num2 = 9;
        int solucion = (num1%num2 == 0 || num1%num2 !=0)?1:0;

        System.out.println("La solucion es: " + solucion);

        //triangulo de asteriscos

        char asterisco = '*';

        System.out.println("*\n**\n***\n****\n*****");

        //bebida
        char nomMascota1 = 'M';
        char nomMascota2 = 'O';
        char nomMascota3 = 'N';
        char nomMascota4 = 'T';
        char nomMascota5 = 'E';

        char nomPeli1 = 'N';
        char nomPeli2 = 'E';
        char nomPeli3 = 'B';
        char nomPeli4 = 'O';

        System.out.println("Nombre de la próxima bebida: " + nomMascota1+nomMascota2+nomMascota3+nomMascota4+nomMascota5+' '+ nomPeli1+nomPeli2+nomPeli3+nomPeli4);
        
        //multiplicacion

        float numUno = 5.7f;
        float numDos = 3.5f;

        float numTres = numUno+numDos;

        int numeroUno = 4;
        int numeroDos = 6;

        int numeroTres = numeroUno+numeroDos;

        float resultado = numTres+numeroTres;

        System.out.println("La suma es: " + resultado); //guarda la mayor presicion

        //nombre y edad

        String nombreApellido = "Edith Blanco";

        int edad = 48;

        System.out.println("Mi nombre es: " + nombreApellido +'\n'+ "Mi edad es: " + edad);
        
        //potencia 2 y 3

        int numero = 6;

        int potenciaCuadrado = numero*numero;
        int potenciaCubo = numero*numero*numero;

        //Acumulador

        int digito1 = 2;
        int digito2 = 4;

        int resultadoFinal = digito1*digito2/1 + digito1*digito2/2 +digito1*digito2/3 + digito1*digito2/4 + digito1*digito2/5 + digito1*digito2/6 + digito1*digito2/7 + digito1*digito2/8 + digito1*digito2/9 + digito1*digito2/10 + digito1*digito2/11 + digito1*digito2/12 + digito1*digito2/13 + digito1*digito2/14 + digito1*digito2/15;
        
        System.err.println("El resultado es: " + resultadoFinal);


    }
}