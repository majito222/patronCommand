class CrearTarea extends Mando {
    public CrearTarea(Tarea tarea) {
        super(tarea);
    }

    @Override
    public void ejecutar() {
        // Crear la tarea y agregarla al gestor de tareas
        gestorTareas.agregarTarea(tarea);
    }

    @Override
    public void deshacer() {
        // Eliminar la tarea del gestor de tareas
        gestorTareas.eliminarTarea(tarea);
    }
}