package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatoPorNome = new HashSet<>();
        for (Contato contato : contatoSet) {
            if (contato.getNome().startsWith(nome)) {
                contatoPorNome.add(contato);
            }
        }
        return contatoPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato contato : contatoSet) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contato.setNumero(novoNumero);  
                contatoAtualizado = contato;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Carla", 999558453);
        agendaContatos.adicionarContato("Lucas", 957861249);
        agendaContatos.adicionarContato("Lucas", 995845123);
        agendaContatos.adicionarContato("Pedro", 958462137);
        agendaContatos.adicionarContato("Luiza", 966471328);


        System.out.println("Exibindo os contatos: ");
        agendaContatos.exibirContatos();
        
        System.out.println("\nPesquisa por nome: ");
        System.out.println(agendaContatos.pesquisarPorNome("Carla"));
        agendaContatos.atualizarNumeroContato("Carla", 985463278);
        
        
        System.out.println("\nExibindo os contatos: ");
        agendaContatos.exibirContatos();

    }
}
