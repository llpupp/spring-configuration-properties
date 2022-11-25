package dev.projetos.springconfigurationproperties.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem implements CommandLineRunner { //os dados @Value + private String nome e String email + List<Long> telefones foram para o Remetente
    @Autowired //aqui é a injeção de dependências (sem usar new, mas Autowired))
    private Remetente rementente; //refatoração, portanto precisamos de um Remetente
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mensagem enviada por: " + rementente.getNome()
                + "\nE-mail:" + rementente.getEmail() + "\nCom telefones para contato: "
                + rementente.getTelefones());
        System.out.println("Seu cadastro foi aprovado");
    }
}
