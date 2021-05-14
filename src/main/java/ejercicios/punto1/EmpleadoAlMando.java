package ejercicios.punto1;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoAlMando extends Empleado {


    private final List<Empleado> empleadosACargo = new ArrayList<>();

    public EmpleadoAlMando(double salario, String nombre) {
        super(salario, nombre);
    }


    public void agregarEmpleado(Empleado empleado) {
        empleadosACargo.add(empleado);
    }


    public List<Empleado> recuperarListaEmpleados() {
        return empleadosACargo;
    }

    @Override
    public double obtenerTotalSalario() {
        double salarioTotal = 0;
        for (Empleado empleado : empleadosACargo) {
            salarioTotal = salarioTotal + empleado.obtenerTotalSalario();

        }
        return salarioTotal + super.salario;
    }


}
