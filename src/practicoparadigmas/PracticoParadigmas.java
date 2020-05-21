package practicoparadigmas;

import practicoparadigmas.objects.Cliente;
import practicoparadigmas.objects.Usuario;

public class PracticoParadigmas {

    public static void main(String[] args) 
    {
        // TODO code application logic here
        Cliente cliente;
        Usuario usuario;
        
        //instanciar objeto con valores
//        cliente = new Cliente();
        cliente = new Cliente(40154950,"Gaston","Kuti");
        
//        cliente.setNombre("Gaston");
//        cliente.setApellido("Kuti");
        
        //imprimir todos los atributos del objeto
        System.out.println(cliente);
    }    
}
