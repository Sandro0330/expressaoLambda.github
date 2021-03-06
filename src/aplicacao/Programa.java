package aplicacao;

import java.util.ArrayList;
import java.util.List;

import entidades.Produto;

public class Programa {
	
	public static void main(String[] args) {
	
		List<Produto> list = new ArrayList<>();
		
		list.add(new Produto("Tv", 900.00));
		list.add(new Produto("Mouse", 50.00));
		list.add(new Produto("Tablet", 350.50));
		list.add(new Produto("HD Case", 80.90));
		list.add(new Produto("Controle", 800.00));
		list.add(new Produto("Porta Cd", 50.00));
		list.add(new Produto("Dvd", 350.50));
		list.add(new Produto("Abajour", 80.90));
	
		//		list.removeIf(Produto::produtoPredicateStatic); Predicate Static (m�todo est�tico)
		
		//		list.removeIf(Produto::produtoPredicateNaoStatic); Predicate n�o Static (m�todo n�o est�tico)
	
		//     Express�es Lambdas Declaradas
		//		double min = 100.0;
		//		Predicate<Produto> ped = p -> p.getPreco() >= min;
		//		list.removeIf(ped);
				
		// Express�o Lambda Inline
		double min = 100.0;
		list.removeIf(p -> p.getPreco() >= min);
		
		for(Produto p : list) {
			System.out.println(p);
		}
	
	}
}
