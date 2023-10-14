package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;

        for (Convidado convidado : convidadosSet) {
            if (convidado.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = convidado;
                break;
            }
        }
        convidadosSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadosSet.size();
    }
    
    public void exibirConvidados(){
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) throws Exception {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");
        
        conjuntoConvidados.adicionarConvidado("Carla", 15983);        
        conjuntoConvidados.adicionarConvidado("Pedro", 19854);        
        conjuntoConvidados.adicionarConvidado("Julia", 14846);        
        conjuntoConvidados.adicionarConvidado("Bia", 14846);        
        conjuntoConvidados.adicionarConvidado("Raquel", 17875);        
        conjuntoConvidados.adicionarConvidado("Bruno", 18464);    
        
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro(s) do Set de Convidados");
        
        conjuntoConvidados.removerConvidadoPorCodigoConvite(14846);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro(s) do Set de Convidados");

        conjuntoConvidados.exibirConvidados();
    }
}
