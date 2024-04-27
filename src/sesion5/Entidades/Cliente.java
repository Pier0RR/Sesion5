/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion5.Entidades;

public class Cliente extends Persona{

    public String getCodCliente() {
        return codCliente;
    }


    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }
    
    private String codCliente;
    
    public static Cliente fromPersona(Persona per){
                Cliente cli= new Cliente();
                cli.setNombre(per.getNombre());
                cli.setApellido(per.getApellido());
                cli.setDni(per.getDni());
                return cli;
                
    }
    
    public Cliente(){}
    
    public Cliente (String codCliente){
        this.codCliente= codCliente;
    }
    
    @Override
    public String getText(){
        return "CLIENTE : "+ 
                this.getNombre()+" "+
                this.getApellido()+ " /DNI: "+
                this.getDni();
    }
    
}
