package lambda.entidades;

public class ProdutoPredicate {
	
	private String name;
	private Double price;
	
	public ProdutoPredicate() {
	}

	public ProdutoPredicate(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public static boolean staticPredicate(ProdutoPredicate p) {
		return p.getPrice() >= 100.0;
	}
	
	public boolean naoStaticPredicate() {
		return price >= 100.0;
	}

	@Override
	public String toString() {
		return "Produto: " + name + ", Preço: " + price;
	}
}
