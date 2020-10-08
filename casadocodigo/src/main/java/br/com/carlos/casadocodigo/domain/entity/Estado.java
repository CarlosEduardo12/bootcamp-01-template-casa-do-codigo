package br.com.carlos.casadocodigo.domain.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Table(name = "estados")
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    @Getter @Setter
    private String nome;

    @ManyToOne
    @Getter @Setter
    private Pais pais;

    @Deprecated
    public Estado(){}

    public Estado(String nome, Pais pais) {
        this.nome = nome;
        this.pais = pais;
    }
    public boolean pertenceAPais(Pais pais) {
        return this.pais.equals(pais);
    }
}