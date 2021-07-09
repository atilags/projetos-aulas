package tratamentoExcecoes.modelo.excecoes;

// extends RuntimeException n�o obriga a tratar excec�oes
// extends Exception obriga a tratar 

public class ExcecoesDominio extends Exception {
	private static final long serialVersionUID = 1L;

	public ExcecoesDominio(String msg) {
		super(msg);
	}
}
