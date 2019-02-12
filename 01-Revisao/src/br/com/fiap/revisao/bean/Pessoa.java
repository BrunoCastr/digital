package br.com.fiap.revisao.bean;

public class Pessoa {
	
private String nome;

private Genero genero;

public Genero getGenero() {
	return genero;
}

public void setGenero(Genero genero) {
	this.genero = genero;
}

protected long   rm;


// Modificador de acesso
// public, private
// protected - filhas e o pacote
// default/package - pacote

//1 Mesmo nome da classe
//2 Não tem retorno
//3 Chamar um construor do pai (1 linha)

public long getRm() {
	return rm;
}

public void setRm(long rm) {
	this.rm = rm;
}

public boolean validarRm() {
String rmStr = String.valueOf(rm);
if(rmStr.length() == 5) {
return true;}
else {
return false;}}


public Pessoa() {
super(); //Chama o construtor vazio do pai	
}

public Pessoa(String nome) {
 setNome(nome);
}

public String getNome() {
return nome;	
}

public void setNome(String nome) {
this.nome = nome;
}}
