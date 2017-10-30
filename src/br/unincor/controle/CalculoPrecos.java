package br.unincor.controle;

import br.unincor.exception.PrecoZeradoException;
import br.unincor.model.Produto;

public class CalculoPrecos {
	
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
	private void calculaPrecoFinal(Produto p) {
		
	}
	
	/**
	 * No pagamento em dinheiro após o calculo final do preço, dar desconto de XX%.
	 */
	public void pagtoDinheiro(Produto p) throws PrecoZeradoException {

	}
	
	/**
	 * No pagamento em dinheiro após o calculo final do preço, acrescer XX% no valor do preço.
	 */
	public void pagtoCartao(Produto p) throws PrecoZeradoException {

	}

}
