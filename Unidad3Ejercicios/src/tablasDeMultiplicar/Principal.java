package tablasDeMultiplicar;
public class Principal {
    public static void main(String[] args) {

        int num1 = 1;
        int num2 = 1;
        
        //while
        while (num1 <= 10) { // Se ejecuta mientras num1 sea menor o igual que 10
            num2 = 1; //Volvemos a poner num2 a 1 para volver a calcular la siguiente tabla
            while (num2 <= 10) {
                System.out.println(num1+" x "+num2+" = "+num1 * num2);
                num2++;
            }
            num1++; // Cuando termina la tabla suma 1 a num1 y pinta esto
            System.out.println("-------------------");
        }
        
        // i se incrementa de 1 en 1
        for (int i = 1; i <= 10; i++) {
            //cada vez que se icrementa i una vez, j se incrementa hasta 10
            for (int j = 1; j <= 10; j++) { 
                System.out.println(i+" x "+j+" = "+i * j);
            }
            // Por cada tabla terminada da un salto pintando esto
            System.out.println("------------------");
        }
        
        // Inicializamos los num a 1
        num1 = 1;

        do {      
            num2 = 1; // Se vuelve a poner a 1 para poder calcular la tabla
            
            do { // Se ejecuta hasta num2 10               
                System.out.println(num1+" x "+num2+" = "+num1 * num2);
                num2+=1;
            } while (num2 <= 10);
            
            System.out.println("-----------------");
            num1+=1;
        } while (num1 <=10); // Mientras el num1 sea menor o igual a 10
    }
}
