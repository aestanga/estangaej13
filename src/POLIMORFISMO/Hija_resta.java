package POLIMORFISMO;

public class Hija_resta extends Padre {
    //Metodo get
    public int getoper(){
        return oper;
    }
    //Metodo restar
    @Override
    public void operaciones() {
         System.out.print("\n=== RESTAMOS ===\n");
         resultado = valor1 - valor2;
         System.out.print(valor1+" - "+valor2+" = ");
    }
}
