import javax.swing.JOptionPane;

public class VendaProduto {

	public static void main(String[] args) {
		/*
		 * Você deve solicitar: nome do produto, qtde a ser vendida, preco bruto e forma de pagamento (VISTA ou CARTAO)
		 * Se a forma for igual a "VISTA" e a qtde for maior que 10 o preco será reduzido em 10%
		 * Se a forma for igual a "VISTA" e a qtde for menor ou igual a 10 o preco será reduzido em 5%
		 * Exiba no final: 
		 * Nome do produto e o valor total 
		 */
		String produto = JOptionPane.showInputDialog("Produto").toUpperCase();
		int qtde = Integer.parseInt(JOptionPane.showInputDialog("Qtde"));
		float preco = Float.parseFloat(JOptionPane.showInputDialog("Digite o preco"));
		char forma=JOptionPane.showInputDialog("Digite <C> Cartao ou <V> Vista").toUpperCase().charAt(0);
		if (forma=='V') {
			if (qtde>10) {
				preco = preco * (float) 0.9;
			}else {
				preco = preco * (float) 0.95;
			}
		}
		System.out.println("Produto: " + produto);
		System.out.println("Total: " + (preco*qtde));
	}
}
