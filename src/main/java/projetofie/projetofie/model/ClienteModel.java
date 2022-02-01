package projetofie.projetofie.model;

import java.io.Serializable;

public class ClienteModel implements Serializable {

	
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String nome;
  private String email;
  private String sexo;
  private String ativo;
  private String idade;
  
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
public String getSexo() {
	return sexo;
}
public void setSexo(String sexo) {
	this.sexo = sexo;
}
public String getAtivo() {
	return ativo;
}
public void setAtivo(String ativo) {
	this.ativo = ativo;
}
public String getIdade() {
	return idade;
}
public void setIdade(String idade) {
	this.idade = idade;
}
  
  
	
}
