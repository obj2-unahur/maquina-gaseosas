package ar.edu.unahur.obj2;

public abstract class EstadoSupport implements EstadoMaquina {

    protected MaquinaGolosinas maquinaGolosinas;

    public EstadoSupport(MaquinaGolosinas maquinaGolosinas) {
        this.maquinaGolosinas = maquinaGolosinas;
    }
}
