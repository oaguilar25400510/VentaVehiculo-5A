public class Cliente {
    private String razonSocial;
    private String rfc;
    private String email;
    
    public Cliente(String razonSocial, String rfc, String email){
        this.razonSocial=razonSocial;
        this.rfc=rfc;
        this.email=email;
    }
    
    @Override
    public String toString(){
        return "Razón Social: "+this.razonSocial+"\n"+
                "RFC: "+this.rfc+"\n"+
                "Email: "+this.email+"\n";
    }
}
