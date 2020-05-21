package practicoparadigmas.objects;

public class Socio extends Cliente /*implements IAlquilar*/{
    
    private Integer numeroSocio;
//    private ArrayList<Tarjeta> tarjetas; //Para relaciones de 1 a *
    private Tarjeta tarjeta;    //relaciones de 1 a 1/ cuando tenemos asociacion simple    

    public Socio(Integer numDoc, String nombreC, String apellidoC) {
        super(numDoc, nombreC, apellidoC);
    }
    
    public void Alquilar()
    {
        
    }
    
    
}
