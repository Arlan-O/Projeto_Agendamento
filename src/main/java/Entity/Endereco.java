package Entity;


import DTO.DadosEnderecoDto;
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
}
