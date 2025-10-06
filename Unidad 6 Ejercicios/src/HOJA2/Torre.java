package HOJA2;

public class Torre extends Figura {
    public Torre(int fila, int columna) {
        super(fila, columna, "Torre");
    }

    @Override
    public boolean amenaza(Figura otra) {
        return this.getFila() == otra.getFila() || this.getColumna() == otra.getColumna();
    }
}
