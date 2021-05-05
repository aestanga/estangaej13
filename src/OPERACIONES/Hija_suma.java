package OPERACIONES;

public class Hija_suma extends Padre {
    //Metodo get
    public int getoper(){
        return oper;
    }
    //Metodo sumar
    public void sumar() {
         System.out.print("\n=== SUMAMOS ===\n");
         resultado = valor1 + valor2;
         System.out.print(valor1+" + "+valor2+" = ");
    }
}
