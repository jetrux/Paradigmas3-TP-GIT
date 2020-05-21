package practicoparadigmas.objects;

public class Usuario extends Cliente{
    
    private String numeroUsuario;
    private String nombreUsuario;
    
    public Usuario(Integer numDoc, String nombreC, String apellidoC) {
        super(numDoc, nombreC, apellidoC);
    }
}
