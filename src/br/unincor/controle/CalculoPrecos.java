package br.unincor.controle;

import br.unincor.exception.PrecoZeradoException;
import br.unincor.model.Produto;
import br.unincor.model.Sanduiche;
import br.unincor.model.Sobremesa;

public class CalculoPrecos{
	
	/**
	 * Primeiro deve-se testar se o preço do produto não está 'null'
	 * 		- Caso o preço esteja zerado ('null'), lançar uma PrecoZeradoException
	 * 
	 * Realizar o cálculo do preço final do produto seguindo as regras:
	 * 
	 * Sanduiche:
	 * 		- Trio: se for TRUE acrescenta R$XX,XX no preço (valor referente a batata e bebida)
	 * 		- Dobro de recheio: ser for TRUE acresce o preço em XX%
	 * 
	 * Sobremesa:
	 * 		- Adicionais: se for TRUE acresce o preço em XX%
	 * 
	 */
	
	public void calculaPrecoFinal(Produto p) throws PrecoZeradoException{
		if(p.getPreco() != null && p.getPreco() != 0){
			if(p instanceof Sanduiche){
				Sanduiche sanduba = (Sanduiche)p;
				
				if(sanduba.getTrio() == true)
					sanduba.setPreco(sanduba.getPreco() + 10.0);
				
				if(sanduba.getDobroRecheio() == true)
					sanduba.setPreco(sanduba.getPreco() * 0.6);
			}
			else if(p instanceof Sobremesa){
				Sobremesa sobre = (Sobremesa)p;
				
				if(sobre.getAdicionais() == true)
					sobre.setPreco(sobre.getPreco() * 0.2);
			}
		}else{
			throw new PrecoZeradoException(p);
		}
	}
	/**
	 * No pagamento em dinheiro após o calculo final do preço, dar desconto de XX%.
	 */
	public void pagtoDinheiro(Produto p) throws PrecoZeradoException {
		p.setPreco(p.getPreco() * 0.5);
	}
	
	/**
	 * No pagamento em dinheiro após o calculo final do preço, acrescer XX% no valor do preço.
	 */
	public void pagtoCartao(Produto p) throws PrecoZeradoException {
		p.setPreco(p.getPreco() * 0.2);
	}

}