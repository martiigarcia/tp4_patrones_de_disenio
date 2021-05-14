package ejercicios.punto1;

public class EmpleadoRegular extends Empleado{

    public EmpleadoRegular(double salario, String nombre){
        super(salario, nombre);
    }

    public double obtenerTotalSalario(){
        return super.salario;
    }



}
