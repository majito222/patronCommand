class CompletarTarea extends Mando {
    private EstadoTarea estadoAnterior;

    public CompletarTarea(Tarea tarea) {
        super(tarea);
        this.estadoAnterior = tarea.getEstado();
    }

    @Override
    public void ejecutar() {
        // Completar la tarea y actualizar su estado
        tarea.setEstado(EstadoTarea.COMPLETADA);
    }

    @Override
    public void deshacer() {
        // Restaurar el estado anterior de la tarea
        tarea.setEstado(estadoAnterior);
    }
}
