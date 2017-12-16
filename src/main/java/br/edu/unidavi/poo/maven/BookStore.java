package br.edu.unidavi.poo.maven;
import java.util.List;

public class BookStore {

	private static final double PRECO = 8.00;	
	
	public Double calculateBasketCost(List<Integer> books) {
		
		return books.size() * PRECO;
		
	}

}
