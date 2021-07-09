package herancaPolimorfismo.programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import herancaPolimorfismo.entidades.Produto;
import herancaPolimorfismo.entidades.ProdutoImportado;
import herancaPolimorfismo.entidades.ProdutoUsado;

public class ProgramaProduto {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner tec = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Produto> produto = new ArrayList<>();

		System.out.print("Quantos produtos serão cadastrados? ");
		int quant = tec.nextInt();

		for (int i = 1; i <= quant; i++) {
			tec.nextLine();
			System.out.printf("O %dº produto é Normal, Importado ou Usado? n/i/u ", i);
			String escolha = tec.nextLine().toLowerCase();

			System.out.print("Informe o nome do produto: ");
			String nome = tec.nextLine();

			System.out.print("Informe o preço do produto: ");
			double preco = tec.nextDouble();
			
			if(escolha.equals("n")) {
				Produto cadastroN = new Produto(nome, preco);
				produto.add(cadastroN);
				//produto.add(new Produto(nome, preco));
			}
			
			if (escolha.equals("i")) {
				System.out.println("Informe a taxa de importação: ");
				double taxaImportacao = tec.nextDouble();
				Produto cadastroI = new ProdutoImportado(nome, preco, taxaImportacao);
				produto.add(cadastroI);
				//produto.add(new ProdutoImportado(nome, preco, taxaImportacao);
			}

			if (escolha.equals("u")) {
				System.out.print("Informe a data de fabricação do produto: ");
				Date dataFabricacao = sdf.parse(tec.next());
				Produto cadastroU = new ProdutoUsado(nome, preco, dataFabricacao);
				produto.add(cadastroU);
			}
		}
		
		for(Produto p: produto) {
			System.out.print(p.etiqueta());
			System.out.println();
		}

		tec.close();
	}

}