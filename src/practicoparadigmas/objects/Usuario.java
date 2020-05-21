package practicoparadigmas.objects;

public class Usuario extends Cliente{
    
    private Integer numeroUsuario;
    private String nombreUsuario;
    private String apellidoUsuario;

    public Usuario(Integer numU, String nombreU, String apellidoU) {
        super(numU, nombreU, apellidoU);
    }
        
    public String toString()
    {
        return "N Usuario: " + numeroUsuario + "\n" + "Nombre: " + nombreUsuario + "\n" + "Apellido: " + apellidoUsuario + "\n";
    }

    public Integer getNumeroUsuario() {
        return numeroUsuario;
    }

    public void setNumeroUsuario(Integer numeroUsuario) {
        this.numeroUsuario = numeroUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

}
