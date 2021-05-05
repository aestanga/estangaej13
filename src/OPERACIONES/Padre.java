package OPERACIONES;
import java.util.Scanner;

public class Padre {
    //Atributos
    protected int valor1, valor2, oper, resultado;
    //Objeto Scanner
    Scanner teclado = new Scanner(System.in);
    
    public void Oper(){
       System.out.print("¿Que operacion queres realizar?");
       System.out.print("\n(1)SUMAR");
       System.out.print("\n(2)RESTAR\n");
       oper = teclado.nextInt();
       if (oper>2 || oper<1){
           System.out.print("=== OPCION INVALIDA ===");
           System.exit(0);
       }
    }
    
    public void Entradatos(){
       System.out.print("\n=== Vamos a operar... ===");
       System.out.print("\nEsbribir el 1er valor:\n");
       valor1 = teclado.nextInt();
       System.out.print("Esbribir el 2do valor:\n");
       valor2 = teclado.nextInt();
    }
    
    public void MostrarRes(){
       System.out.println(resultado);
    }
}
