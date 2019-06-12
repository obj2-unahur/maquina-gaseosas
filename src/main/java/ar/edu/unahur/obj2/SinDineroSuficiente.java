package ar.edu.unahur.obj2;

public class SinDineroSuficiente extends EstadoSupport {

    public SinDineroSuficiente(MaquinaGolosinas maquinaGolosinas) {
        super(maquinaGolosinas);
    }

    @Override
    public void aprentarPalanca() {
        System.out.println("El precio del producto es: " + maquinaGolosinas.getPrecioBebida());
    }

    @Override
    public void agregarDinero(int cantidad) {
        this.maquinaGolosinas.setDineroIngresado(cantidad);
        if (maquinaGolosinas.getPrecioBebida() <= maquinaGolosinas.getDineroIngresado()) {
            this.maquinaGolosinas.setEstadoConDinero();
        } else {
            System.out.println("Falta ingrear: " + (maquinaGolosinas.getPrecioBebida()-maquinaGolosinas.getDineroIngresado()));
        }
    }

    @Override
    public void entregarBebida() {
        System.out.println("No se puede entregar bebida porque no ingreso el dinero suficiente");
    }

    @Override
    public void darVuelto() {
        System.out.println("No se puede dar vuelto porque no compró una bebida");
    }
}
