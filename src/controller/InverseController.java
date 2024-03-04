package controller;

public class InverseController {
	
	public String inverse(String s, int size) {
		//O metodo se encerra quando toda a string for percorrida, retornando uma string vazia
		if(size <= 0) {
			return "";
		} else {
			//Primeira pega-se a substring do ponto atual ao anterior e a 
			//concatena a string que retornara da chamada do metodo, que e chamado
			//passando como parametro a string original e o tamanho um caracter menor
			return s.substring(size - 1, size) + inverse(s, size - 1 );
		}
	}
}
