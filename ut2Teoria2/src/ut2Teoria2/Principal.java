package ut2Teoria2;

/*
    Dos clases
    -Principal es la conductora (sucursal bancaria)
    -Cuenta. Son cuentas bancarias
*/

public class Principal {
    public static void main(String[] args) {
        // Instanciamos cuentas
        Cuenta Cuenta1 = new Cuenta(1111,"Pepe","Corriente",10);
        Cuenta Cuenta2 = new Cuenta(2222,"Pepe","Evita","Corriente",10);
        
        // Cambiamos tipo de cuenta de la 1111
        Cuenta1.setTipoCuenta("Ahorro");
        
        // Llamamos a los Getters de la cuenta1
        System.out.println("EL NUMERO DE CUENTA ES: "+Cuenta1.getNumCuenta()+" Y EL TITULAR ES: "+Cuenta1.getTitular());
        
        // Ingresamos 40€ en la cuenta1 llamando a la funcion ingreso
        Cuenta1.ingreso(40);
        
        // Retiramos 30€ de la cuenta1 y se queda en 20€ llamando a la funcion retirada
        //Cuenta1.retirada(30);
        
        //Intentamos retirar mas dinero del que tiene
        Cuenta1.retirada(300);
        
        // Visualizamos las cuentas
        System.out.println(Cuenta1.toString());
        System.out.println(Cuenta2.toString());

    }// main()
}//class
