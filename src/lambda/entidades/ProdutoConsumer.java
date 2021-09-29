package lambda.entidades;

public class ProdutoConsumer {
	
	private String name;
	private Double price;
	
	public ProdutoConsumer() {
	}

	public ProdutoConsumer(String name, Double price) {
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
	
	public static void staticConsumer(ProdutoConsumer p) {
		p.setPrice(p.getPrice() * 1.1);
	}
	
	public void naoStaticConsumer() {
		//setPrice(getPrice() * 1.1);
		price = price * 1.1;
	}

	@Override
	public String toString() {
		return "Produto: " + name + ", Preço: " + String.format("%.2f", price);
	}
}
