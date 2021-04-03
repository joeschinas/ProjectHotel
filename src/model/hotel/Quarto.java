package model.hotel;

public class Quarto {
	private int idQuarto, numero, andar;
	private String tipo, descricao;
	private double preco;
	
	public Quarto() {
		super();
	}

	public Quarto(int idQuarto, int numero, int andar, String tipo, String descricao, double preco) {
		super();
		this.idQuarto = idQuarto;
		this.numero = numero;
		this.andar = andar;
		this.tipo = tipo;
		this.descricao = descricao;
		this.preco = preco;
	}

	public int getIdQuarto() {
		return idQuarto;
	}

	public void setIdQuarto(int idQuarto) {
		this.idQuarto = idQuarto;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAndar() {
		return andar;
	}

	public void setAndar(int andar) {
		this.andar = andar;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
