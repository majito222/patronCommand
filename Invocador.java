class Invocador {
    private Stack<Mando> historialComandos;
    private GestorTareas gestorTareas;

    public Invocador(GestorTareas gestorTareas) {
        this.historialComandos = new Stack<>();
        this.gestorTareas = gestorTareas;
    }

    public void ejecutarComando(Mando comando) {
        comando.ejecutar();
        historialComandos.push(comando);
    }

    public void deshacer() {
        if (!historialComandos.isEmpty()) {
            Mando comando = historialComandos.pop();
            comando.deshacer();
        }
    }

    public void rehacer() {
        if (!historialComandos.isEmpty()) {
            Mando comando = historialComandos.pop();
            comando.ejecutar();
        }
    }
}