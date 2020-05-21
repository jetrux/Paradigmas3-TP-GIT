package practicoparadigmas.objects;

public class Cliente {
    private Integer numeroDocumento;
    private String nombre;
    private String apellido;
    
    public void Comprar()
    {
        
    }
    
    public void DevolverCatalogo()
    {
        
    }
    
    public Cliente(Integer numDoc, String nombreC, String apellidoC)
    {
        numeroDocumento = numDoc;
        nombre = nombreC;
        apellido = apellidoC;
    }

    public String toString()
    {
        return "N Doc: " + numeroDocumento + "\n" + "Nombre: " + nombre + "\n" + "Apellido: " + apellido + "\n";
    }
    
    public Integer getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(Integer numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
