/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula8_exemploheranca;

/**
 *
 * @author rafae
 */
public class PessoaFisica extends Pessoa {
    private String nome;
    private String cpf;
    
    public PessoaFisica(){}
    
    public PessoaFisica(String nome, String cpf, 
                        String email, String celular){
        super(email, celular);
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public String imprimir(){
        return "CPF: " + cpf +
                "\nNome: " + nome +
                "\nE-mail: " + getEmail() +
                "\nCelular: " + getCelular();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
