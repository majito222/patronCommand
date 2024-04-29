class EliminarTarea extends Mando {
    private Tarea tareaEliminada;

    public EliminarTarea(Tarea tarea) {
        super(tarea);
        this.tareaEliminada = tarea;
    }

    @Override
    public void ejecutar() {
        // Eliminar la tarea del gestor de tareas
        gestorTareas.eliminarTarea(tarea);
    }

    @Override
    public void deshacer() {
        // Agregar la tarea eliminada al gestor de tareas
        gestorTareas.agregarTarea(tareaEliminada);
    }
}