package br.com.alura.forum.modelo;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime data = LocalDateTime.now();
    private String titulo;
    private String mensagem;
    @ManyToOne
    private Curso curso;
    @ManyToOne
    private Usuario dono;
    @OneToMany(mappedBy = "topico")
    private List<Resposta> respostas = new ArrayList<>();
    @Enumerated(EnumType.STRING)
    private StatusTopico status = StatusTopico.NAO_RESPONDIDO;

    // construtor default exigido pela JPA
    protected Topico() {
    }

    // getters
    public Long getId() {
        return id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public Curso getCurso() {
        return curso;
    }

    public Usuario getDono() {
        return dono;
    }

    public List<Resposta> getRespostas() {
        return respostas;
    }

    public StatusTopico getStatus() {
        return status;
    }
}
