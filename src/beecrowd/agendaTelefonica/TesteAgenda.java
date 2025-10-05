package beecrowd.agendaTelefonica;

public class TesteAgenda {
    public static void main(String[] args) {

        AgendaTelefonica agenda = new AgendaTelefonica();

        Cadastro jose = new Cadastro("José", "44 99858-9496", "Jd. Industrial");
        Cadastro rone = new Cadastro("Rone", "44 99999-9999", "Zona 7");

        agenda.adicionarContato(jose);
        agenda.adicionarContato(rone);

        for(var entry : agenda.agenda.entrySet()){
            System.out.println(entry.getKey() + " -> " +
                    entry.getValue().telefone +
                    " (" + entry.getValue().bairro + ")");
        }
        
    }
}
