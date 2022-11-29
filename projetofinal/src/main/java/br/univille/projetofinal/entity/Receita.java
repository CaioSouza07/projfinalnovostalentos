package br.univille.projetofinal.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Receita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nome;
    private String informacao;
    private float valor;
    private Date dataReceita;
    
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getInformacao() {
        return informacao;
    }
    public void setInformacao(String informacao) {
        this.informacao = informacao;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public Date getDataDespesa() {
        return dataReceita;
    }
    public void setDataDespesa(Date dataDespesa) {
        this.dataReceita = dataDespesa;
    }
}
