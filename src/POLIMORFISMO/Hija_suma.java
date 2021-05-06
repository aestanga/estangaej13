package POLIMORFISMO;

public class Hija_suma extends Padre {
    //Metodo get
    public int getoper(){
        return oper;
    }
    //Metodo operar
    @Override
    public void operaciones() {
         System.out.print("\n=== SUMAMOS ===\n");
         resultado = valor1 + valor2;
         System.out.print(valor1+" + "+valor2+" = ");
    }
}
