package ejercicios.punto1;

public class Empresa {

    private EmpleadoAlMando director;

    public void agregarDirectorDeLaEmpresa(EmpleadoAlMando director) {
        if(this.esDatoNulo(director)){
            throw new RuntimeException("Ingrese el director de la empresa correctamente");
        }
        this.director = director;
    }

    public double obtenerSalarioTotalDeEmpresa() {
        return this.director.obtenerTotalSalario();
    }



    private boolean esDatoNulo(Object dato){
        return dato == null;
    }

}
