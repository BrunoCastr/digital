package br.com.fiap.revisao.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ColecaoTeste {
	
	
public static void main (String args[]) {		
	
//Criar uma lisa
List<Pessoa> lista = new ArrayList<Pessoa>();

//Adicionar um elemento na lista
lista.add(new Funcionario("Bruno"));
lista.add(new Pessoa("kkk"));

//percorrer a lista
for (Pessoa p : lista) {
System.out.println(p.getNome());	
}

//criar um set
Set<String> set = new HashSet<>();
set.add("Kappa");
set.add("4Head");
set.add("4Head");

for (String s : set) {
System.out.println(s);}

System.out.println("SET");

//Criar um map

Map<String, Pessoa> map = new HashMap<>();

//adicionar valor pro mapa
map.put("Gerente", new Funcionario("Rita"));
map.put("Clinte", new Pessoa("Ronaldo"));

Pessoa p = map.get("Gerente");
System.out.println(p.getNome());

}}
