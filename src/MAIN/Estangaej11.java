/*
Realizar una suma y resta  de dos valores ingresados por el usuario 
utilizando herencia. Crear dos paquetes uno con la clase main y la 
otra con las operaciones. Crear una clase padre y dos hijas(resta, suma);
luego con la clase principal main llamar a esas clases.
 */
package MAIN;
import POLIMORFISMO.Hija_resta;
import POLIMORFISMO.Hija_suma;

public class Estangaej11 {

    public static void main(String[] args) {
        
        Hija_suma mensajsum = new Hija_suma ();
        Hija_resta mensajrest = new Hija_resta ();
        mensajsum.Oper();

        if (mensajsum.getoper() == 1){
            mensajsum.Entradatos();
            mensajsum.operaciones();
            mensajsum.MostrarRes();
        } if (mensajsum.getoper() == 2){
            mensajrest.Entradatos();
            mensajrest.operaciones();
            mensajrest.MostrarRes();
          }
        
    }
    
}
