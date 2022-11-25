package dev.projetos.springconfigurationproperties.app;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;
@Configuration
@ConfigurationProperties(prefix = "remetente") //usar o Config e não o @Component e o o config será com propriedades cujo prefixo tenha "remetente" no app.properties
public class Remetente { //objeto Bean ( Remetente) agora terá as informações a serem usadas
    private String nome;
    private String email;
    private List<Long> telefones;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
// os métodos getters and setters devem ser criados neste Bean
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Long> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Long> telefones) {
        this.telefones = telefones;
    }
}
