package Bancodedadosupx2;

import java.util.Date;

public class Morador {
    private int id;
    private String nome;
    private String email;
    private String telefone;
    private String endereco;
    private Date dataRegistro;
    private int pontos;
    private String historicoDenuncias;

    public Morador(int id, String nome, String email, String telefone, String endereco, Date dataRegistro, String historicoDenuncias) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.dataRegistro = dataRegistro;
        this.pontos = 0;
        this.historicoDenuncias = historicoDenuncias;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public Date getDataRegistro() {
        return dataRegistro;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public String getHistoricoDenuncias() {
        return historicoDenuncias;
    }
}
