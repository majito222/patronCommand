abstract class Mando {
    protected Tarea tarea;

    public Mando(Tarea tarea) {
        this.tarea = tarea;
    }

    public abstract void ejecutar();
    public abstract void deshacer();
}