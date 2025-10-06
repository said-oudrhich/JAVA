package HOJA15;

class Electrodomestico {
    private String id;
    private String nombre;
    private double precio;
    private int precioInstalacion;
    private int potencia;

    // Getters y setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getPrecioInstalacion() {
        return precioInstalacion;
    }

    public void setPrecioInstalacion(int precioInstalacion) {
        this.precioInstalacion = precioInstalacion;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    // Método para desglosar el precio
    public void desglosarPrecio() {
        System.out.println(nombre);
        System.out.println("Precio final: " + precio + "€");
        System.out.println("Porte e instalación: " + precioInstalacion + "€");
        System.out.println("Total: " + (precio + precioInstalacion) + "€");
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", precioInstalacion=" + precioInstalacion + ", potencia=" + potencia + '}';
    }
}