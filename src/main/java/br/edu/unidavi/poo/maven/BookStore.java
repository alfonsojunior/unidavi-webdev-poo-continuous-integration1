package br.edu.unidavi.poo.maven;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BookStore {

	private static final double PRECO = 8.00;	
	
	public Double calculateBasketCost(List<Integer> books) {
		
		double retorno;
		
		Set<Integer> unique = new HashSet<>(books);
		int counter = unique.size();
		retorno = counter * PRECO;
		retorno = this.aplicarDesconto(retorno, counter);
		int qtd = (books.size() - counter);
		retorno += this.aplicarDesconto(qtd * PRECO, qtd);
		
		return retorno;
		
	}
	
	private double aplicarDesconto(double valor, int qtd) {
		
		double retorno = valor;
		
		if (qtd == 2) {
			retorno = valor - (valor * 0.05);
		} else if (qtd == 3) {
			retorno = valor - (valor * 0.10);
		} else if (qtd == 4) {
			retorno = valor - (valor * 0.20);
		} else if (qtd >= 5) {
			retorno = valor - (valor * 0.25);
		}
		
		return retorno;
		
	}

}
