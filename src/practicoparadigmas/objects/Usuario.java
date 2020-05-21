package practicoparadigmas.objects;

public class Usuario extends Cliente{
    
    private String numeroUsuario;
    private String nombreUsuario;
    private String apellidoUsuario;
    
    public Usuario(Integer numDoc, String nombreC, String apellidoC) {
        super(numDoc, nombreC, apellidoC);
    }
    
    public String toString()
    {
        return "N Usuario: " + numeroUsuario + "\n" + "Nombre: " + nombreUsuario + "\n" + "Apellido: " + apellidoUsuario + "\n";
    }
}
