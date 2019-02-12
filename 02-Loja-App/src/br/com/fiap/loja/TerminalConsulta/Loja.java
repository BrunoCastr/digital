package br.com.fiap.loja.TerminalConsulta;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Loja {

public static void main(String[] args) {
	
Scanner sc = new Scanner(System.in);

Calendar datao = Calendar.getInstance();
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

int resp = -1;

do {
System.out.println("Informe o codigo: ");	
resp = sc.nextInt();

switch(resp) {
case 401:
System.out.println("Camisa branca"+" LojaL "+sdf.format(datao.getTime()));
break;

case 402:
System.out.println("Camisa azul");
break;

case 403:
System.out.println("Camisa rosa");
break;

default:
System.out.println("Produto não encontrado");
break;
}

}while(resp!=0);
sc.close();
}}
