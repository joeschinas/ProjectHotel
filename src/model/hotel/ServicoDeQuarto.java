package model.hotel;

public class ServicoDeQuarto {
	private int idServicoQuarto, idOcupacao;
	private String tipo, descricao;
	private double valor;
	
	
	public ServicoDeQuarto() {
		super();
	}


	public ServicoDeQuarto(int idServicoQuarto, int idOcupacao, String tipo, String descricao, double valor) {
		super();
		this.idServicoQuarto = idServicoQuarto;
		this.idOcupacao = idOcupacao;
		this.tipo = tipo;
		this.descricao = descricao;
		this.valor = valor;
	}


	public int getIdServicoQuarto() {
		return idServicoQuarto;
	}


	public void setIdServicoQuarto(int idServicoQuarto) {
		this.idServicoQuarto = idServicoQuarto;
	}


	public int getIdOcupacao() {
		return idOcupacao;
	}


	public void setIdOcupacao(int idOcupacao) {
		this.idOcupacao = idOcupacao;
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

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
}
