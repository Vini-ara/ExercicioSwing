/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author Vini
 */

public class Cliente {
  private int id;
  private String RG;
  private String CPF;
  private String nome;
  private String telefone;

  public Cliente(int id, String RG, String CPF, String nome, String telefone) {
    this.id = id;
    this.RG = RG;
    this.CPF = CPF;
    this.nome = nome;
    this.telefone = telefone;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getRG() {
    return RG;
  }

  public void setRG(String RG) {
    this.RG = RG;
  }

  public String getCPF() {
    return CPF;
  }

  public void setCPF(String CPF) {
    this.CPF = CPF;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }
}