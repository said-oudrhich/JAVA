package ventasAnuales;
// Ejercicio de la teoria parte 2
public class Principal {
    public static void main(String[] args) {
        
        int ventas[][] = new int[12][31];
        
        rellenar(ventas);
        // 0 --> enero, 1--> febrero
        System.out.println("Las ventas del mes de marzo son "+ventasMes(ventas[2]));
        System.out.println("Ventas totales del año: "+ventasAnno(ventas));
        
        mesMasVentas(ventas);
    }
    
    //**************************************************************************
    
    // Rellenar la tabla de ventas aleatoriamente
    private static void rellenar(int ventas[][]){
        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[0].length; j++) {
                ventas[i][j] = (int) (Math.random()*100+100);
            }
        }
        
        //Ponemos a 0 días inexistentes
        ventas[1][28] = 0;
        ventas[1][29] = 0;
        ventas[1][30] = 0;
        
        ventas[3][30] = 0;
        ventas[5][30] = 0;
        ventas[8][30] = 0;
        ventas[10][30] = 0;
    }
    
    //**************************************************************************

    private static int ventasMes(int mes[]){
        
        int total=0;
        
        for (int i = 0; i < mes.length; i++) {
            total += mes[i];
        }
        return total;
    }
    
    //**************************************************************************
    
    private static int ventasAnno(int ventas[][]){
        
        int total=0;
        
        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[0].length; j++) {
                total += ventas[i][j];
            }
        }
        return total;
    }
    
    //**************************************************************************
    
    private static void mesMasVentas(int ventas[][]){
        int mayor = 0,dia = 0, mes = 0;
        
        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[0].length; j++) {
                if (mayor < ventas[i][j]) {
                    mayor = ventas[i][j];
                    dia = j;
                    mes = i;
                }
            }
        }
        System.out.println("El maximo de ventas en un dia es: "+mayor+" en el dia "+(dia+1)+" del mes "+(mes+1));
    }
}
