package br.com.fiap.spring.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "cartoes")
public class Cartao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false, updatable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_aluno")
    private Aluno aluno;

    @Column
    private String numero;

    @Column
    private String senha;

    @Column
    private String cod_seg;
}
