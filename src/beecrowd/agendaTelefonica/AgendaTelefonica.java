package beecrowd.agendaTelefonica;

import java.util.*;

public class AgendaTelefonica {

    Map<String, Cadastro> agenda = new TreeMap<>();

    void adicionarContato(Cadastro contato){
        agenda.put(contato.nome, contato);
    }

}
