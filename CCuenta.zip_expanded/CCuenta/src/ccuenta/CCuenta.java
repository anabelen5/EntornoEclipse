/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ccuenta;

/**
 *
 * @author admin
 */
public class CCuenta {


    // Propiedades de la Clase Cuenta
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /* Constructor sin argumentos */
    public CCuenta ()
    {

    }
    // Constructor con parámetro para iniciar todas las propiedades de la clase
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
        setTipoInteres(tipo);
    }
   // Método para asignar el nombre del titular de la cuenta
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }
    // Método que me devuelve el nombre del titular
    public String obtenerNombre()
    {

            return getNombre();
    }

    // Método que me devuelve el saldo disponible en cada momento
     public double estado ()
    {
        return getSaldo();
    }

    /* Método para ingresar cantidades en la cuenta. Modifica el saldo.
     * Este método va a ser probado con Junit
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }



    /* Método para retirar cantidades en la cuenta. Modifica el saldo.
     * Este método va a ser probado con Junit
     */
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad < 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    // Método que me devuelve el número de cuenta
    public String obtenerCuenta ()
    {
        return getCuenta();
    }
private String getNombre() {
	return nombre;
}
private void setNombre(String nombre) {
	this.nombre = nombre;
}
private String getCuenta() {
	return cuenta;
}
private void setCuenta(String cuenta) {
	this.cuenta = cuenta;
}
private double getSaldo() {
	return saldo;
}
private void setSaldo(double saldo) {
	this.saldo = saldo;
}
private double getTipoInteres() {
	return tipoInteres;
}
private void setTipoInteres(double tipoInteres) {
	this.tipoInteres = tipoInteres;
}
}
