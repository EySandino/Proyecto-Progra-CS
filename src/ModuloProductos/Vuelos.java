package ModuloProductos;

/**
 *
 * @author Grupo8-Cliente/Servidor Concurrente
 */

public class Vuelos {
    private int numero_vuelo;
    private String provedor;
    private String destino;
    private String fecha_salida;
    private String fecha_llegada;
    private String asientos_disponibles;
    private String precio;

    public Vuelos(int numero_vuelo, String provedor, int aInt1, String destino) {
        this.numero_vuelo = numero_vuelo;
        this.provedor = provedor;
        this.destino = destino;
        this.fecha_salida = fecha_salida;
        this.fecha_llegada = fecha_llegada;
        this.asientos_disponibles = asientos_disponibles;
        this.precio = precio;
    }

    public int getNumero_vuelo() {
        return numero_vuelo;
    }

    public void setNumero_vuelo(int numero_vuelo) {
        this.numero_vuelo = numero_vuelo;
    }

    public String getProvedor() {
        return provedor;
    }

    public void setProvedor(String provedor) {
        this.provedor = provedor;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(String fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public String getFecha_llegada() {
        return fecha_llegada;
    }

    public void setFecha_llegada(String fecha_llegada) {
        this.fecha_llegada = fecha_llegada;
    }

    public String getAsientos_disponibles() {
        return asientos_disponibles;
    }

    public void setAsientos_disponibles(String asientos_disponibles) {
        this.asientos_disponibles = asientos_disponibles;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
    
    
}
