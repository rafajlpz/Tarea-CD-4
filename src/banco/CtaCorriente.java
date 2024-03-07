package banco;

public class CtaCorriente {
    private String nombre;
    private String cuenta;
    private double saldocuenta;
    private double interes;

    public CtaCorriente()
    {
    }
    public CtaCorriente(String nombre, String cuenta, double saldo, double interes)
    {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldocuenta = saldo;
        this.interes = interes;
    }
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldocuenta(getSaldocuenta() + cantidad);
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldocuenta(getSaldocuenta() - cantidad);
    }

    /**
     * @return the nombre
     */
    private String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    private String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    private void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldocuenta
     */
    private double getSaldocuenta() {
        return saldocuenta;
    }

    /**
     * @param saldocuenta the saldocuenta to set
     */
    private void setSaldocuenta(double saldocuenta) {
        this.saldocuenta = saldocuenta;
    }

    /**
     * @return the interes
     */
    private double getInteres() {
        return interes;
    }

    /**
     * @param interes the interes to set
     */
    private void setInteres(double interes) {
        this.interes = interes;
    }

    public double estado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}