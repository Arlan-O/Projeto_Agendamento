package Agendamento.Sistema.Entity;


import DTO.EventosDTO.DadosEnderecoDto;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
    private String local;
    private String logradouro;
    private String numero;
    private String cep;
    private String cidade;
    private String uf;

    public Endereco(DadosEnderecoDto dados) {
        this.local = dados.local();
        this.logradouro = dados.logradouro();
        this.numero = dados.numero();
        this.cep = dados.cep();
        this.cidade = dados.cidade();
        this.uf = dados.uf();
    }



    public void atualizarEndereco(DadosEnderecoDto dados){
        if (dados.local() != null){
            this.local = dados.local();
        }
        if (dados.logradouro() !=null){
            this.logradouro = dados.logradouro();
        }
        if (dados.numero() != null){
            this.numero = dados.numero();
        }
        if (dados.cep() != null){
            this.cep = dados.cep();
        }
        if (dados.cidade() != null){
            this.cidade = dados.cidade();
        }
        if (dados.uf() != null){
            this.uf = dados.uf();
        }
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
}
