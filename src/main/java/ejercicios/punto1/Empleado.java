package ejercicios.punto1;

abstract class Empleado {

    double salario;
    String nombre;

    Empleado(double salario, String nombre){
        this.salario = salario;
        this.nombre = nombre;
    }

    abstract double obtenerTotalSalario();



}
