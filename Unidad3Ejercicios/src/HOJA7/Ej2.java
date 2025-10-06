package HOJA7;
public class Ej2 {
    public static void main(String[] args) {
        String cadena = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec non fringilla dolor. Proin neque"
                + " mi, pharetra et elit malesuada, eleifend dictum erat. Curabitur eros tellus, lacinia nec nisi a, congue faucibus tortor. "
                + "Ut ullamcorper laoreet dolor malesuada laoreet. Ut sollicitudin scelerisque arcu, ac viverra diam malesuada eu."
                + " Phasellus facilisis nulla eu orci congue, vitae sagittis ligula rutrum. Ut tempus eros ac dui imperdiet mattis. "
                + "Fusce quis varius eros. Quisque malesuada lectus at nulla fringilla, in sodales sapien finibus";
        /*
        Debes crear el código para que al final imprima:
        - el número de vocales
        - el número de consonantes
        - el número de comas
        - el número de espacios
        Ten en cuenta que java distingue mayúsculas de minúsculas, pero en nuestro conteo no se
        debe hacer esa separación; es decir, ‘a’ es lo mismo que ‘A’, etc.
        El resultado debe ser exactamente el siguiente:
        */
        comprobar(cadena);
    }
    
    private static void comprobar(String cadena){
        int contador_vocal = 0, contador_comas = 0, contador_conso = 0, contador_espa = 0;
        cadena = cadena.toLowerCase();
        for (int i = 0; i < cadena.length(); i++) {
            
            if (cadena.charAt(i) == 'a' | cadena.charAt(i) == 'e' | 
                cadena.charAt(i) == 'i' | cadena.charAt(i) == 'o' | 
                cadena.charAt(i) == 'u') {
                contador_vocal += 1;
            }
            else if (cadena.charAt(i) == ','){
                contador_comas += 1;
            }
            else if (cadena.charAt(i) == ' '){
                contador_espa += 1;
            }
            else
                contador_conso += 1;
        }
        
        System.out.println("Hay "+contador_vocal+" vocales");
        System.out.println("Hay "+contador_conso+" consonantes");
        System.out.println("Hay "+contador_comas+" comas");
        System.out.println("Hay "+contador_espa+" espacios");
    }
}
