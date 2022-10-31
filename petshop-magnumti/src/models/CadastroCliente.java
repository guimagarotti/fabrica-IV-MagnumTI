/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

public class CadastroCliente {
    private int id;
    private String nome;
    private String email;
    private String senha;
    private String pet;
    
    public CadastroCliente() {}
    
    public CadastroCliente(int id, String nome, String email, String senha, String pet) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.pet = pet;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPet() {
        return pet;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }   

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }    
}
