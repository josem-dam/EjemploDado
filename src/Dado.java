public class Dado {

    /**
     * Número de caras del dado.
     */
    private int caras;
    /**
     * Cuantifica las veces que se ha lanzado el dado.
     */
    private int lanzamientos;
    /**
     * Valor del último lanzamiento
     */
    private Integer ultimo;


    public Dado(int caras) {
        this.caras = caras;
        lanzamientos = 0;
    }

    public Dado() {
        this(6);
    }

    /**
     * Devuelve un entero aleatorio entre un mínimo y un máximo, ambos incluidos.
     * @param min - Límite inferior.
     * @param max - Límite superior.
     * 
     * @return El entero aleatorio generado.
     */
    private static int aleatorioEntre(int min, int max) {
        return (int) (min + Math.random()*(max + 1 - min));
    }

    /**
     * Implementa el lanzamiento del dado.
     * @return El resultado del lanzamiento.
     */
    public int lanzar() {
        ultimo = aleatorioEntre(1, caras);
        lanzamientos++;
        return ultimo;
    }

    /**
     * Deja el estado del dado como si nunca se hubiera lanzado.
     */
    public void reset() {
        lanzamientos = 0;
        ultimo = null;
    }

    public int getTirada() {
        return ultimo;
    }

    public int getCaras() {
        return caras;
    }

    public int getLanzamientos() {
        return lanzamientos;
    }
}