/*
 * programa que muestra el valor de a, b y su suma mientras que la suma de
 * ambas es menor de 10. En cada iteración el valor de a se incrementa en
 * 1 unidad y el de b en 2
 */
//definición de la clase Ejemplo3For
public class Ejemplo3For {
//define el método main
    public static void main(String[] args) {
//define las variables de tipo integer
        int a, b;
//valor inicial de la variable a y b es 1, durante el valor de a mas b sea menor a 10 y el valor de a se va incrementando mas 1 y el valor de b se va incrementando el valor mas 2. Escribe en la pantalla el valor a, el valor de b y el valor de la suma entre a y b..
        for(a = 1, b = 1; a + b < 10; a++, b+=2){
//pinta en la pantalla el valor de a, el de b y el de la suma entre a y b.
            System.out.println("a = " + a + "  b = " + b + "  a + b = " + (a+b));
        }
    }
}
