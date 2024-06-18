package DeclaracionVariablesNoPrimitivas;

public class Cuenta {
    private String nombre;
    private String email;
    private double saldo;
    private int retirosPorDia;

    public Cuenta(String nombre, String email, double saldo, int retirosPorDia) {
        this.nombre = nombre;
        this.email = email;
        this.saldo = saldo;
        this.retirosPorDia = retirosPorDia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getRetirosPorDia() {
        return retirosPorDia;
    }

    public void setRetirosPorDia(int retirosPorDia) {
        this.retirosPorDia = retirosPorDia;
    }
}
