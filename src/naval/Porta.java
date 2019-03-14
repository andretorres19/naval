/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naval;

/**
 *
 * @author andre torres
 */
public class Porta {
    private Set<Navio> navio;

    public Porta() {
        navio = new HashSet<>();
    }
    
    private Navio procura(String m){
        for(Navio v: navio)
            if(n.getMatricula().compareTo(m)==0)
                return n;
        return null;
    }
    
    public void novoNavio(Navio n){
        Navio m = procura(n.getMatricula());
        if (navio.contains(n))
            navio.add(n);
        
    }
    
    public int totalContentores(){
        int total = 0;
        for(Navio n= navios){
            if(n instanceof PortaContentores){
                total += ((PortaContentores) n)get.Contentores();
            }
        }
        return total;
    }
    
    public float totalCapacidades(){
        float total = 0;
        for(Navio n= navios){
            if(n instanceof PortaContentores){
                total += ((PortaContentores) n)get.Contentores();
            } else 
                if(n instanceof Pertoleiro){
                total += ((Pertoleiro) n)get.Carga();
            }
        }
        return total;
    }
    
    public void listAll(){
        
    }
    private String nome = "Porto";

    /**
     * Get the value of nome
     *
     * @return the value of nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Set the value of nome
     *
     * @param nome new value of nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

}
