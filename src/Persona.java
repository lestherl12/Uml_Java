public abstract class Persona {
    protected String nombre;
    protected long descripcion;
    protected int poder;
    protected int vida;

    public Persona(String nombre, long descripcion, int poder, int vida) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.poder = poder;
        this.vida = vida;
    }

    public abstract void Desplazarse();

    public int MostrarVida() {
        return vida;
    }

    public void MostrarPoder() {
    }
}