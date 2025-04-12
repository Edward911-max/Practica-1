
package app1;

public class Administrativo extends Empleado {
    private String cargo;

    public Administrativo(String nombre, float sueldoMes, String cargo) {
        super(nombre, sueldoMes);
        this.cargo = cargo;
    }

    @Override
    public void mostrar() {
        System.out.println("Administrativo: " + nombre + " - Cargo: " + cargo + " - Sueldo: $" + sueldoMes);
    }
}

