package HOJA2;

public class Alfil extends Figura {
    public Alfil(int fila, int columna) {
        super(fila, columna, "Alfil");
    }

    @Override
    public boolean amenaza(Figura otra) {
        return Math.abs(this.getFila() - otra.getFila()) == Math.abs(this.getColumna() - otra.getColumna());
    }
}

