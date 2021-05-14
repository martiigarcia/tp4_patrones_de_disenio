package ejercicios.punto1;

public class Main {

    public static void main(String[] args) {

        EmpleadoRegular empleado1 = new EmpleadoRegular(20, "Pepe");
        EmpleadoRegular empleado2 = new EmpleadoRegular(20, "Anabel");
        EmpleadoRegular empleado3 = new EmpleadoRegular(20, "Juan");

        EmpleadoAlMando empleado4 = new EmpleadoAlMando(30, "Jose");
        EmpleadoAlMando empleado5 = new EmpleadoAlMando(30, "Maria");
        EmpleadoAlMando empleado6 = new EmpleadoAlMando(60, "Martina");

        empleado4.agregarEmpleado(empleado1);
        empleado5.agregarEmpleado(empleado2);
        empleado5.agregarEmpleado(empleado3);

        empleado6.agregarEmpleado(empleado4);
        empleado6.agregarEmpleado(empleado5);



        System.out.println("Monto total de la empresa desde Jose: "
                + empleado4.obtenerTotalSalario() + " dolares");

        System.out.println("Monto total de la empresa desde Maria: "
                + empleado5.obtenerTotalSalario() + " dolares");

        System.out.println("Monto total de la empresa desde Martina: "
                + empleado6.obtenerTotalSalario() + " dolares");


        Empresa empresa = new Empresa();
        empresa.agregarDirectorDeLaEmpresa(empleado6);

        System.out.println("\n---------------");
        System.out.println("----EMPRESA----");
        System.out.println("Monto total de la empresa: "
                + empresa.obtenerSalarioTotalDeEmpresa() + " dolares");
        System.out.println("---------------");


    }
}
