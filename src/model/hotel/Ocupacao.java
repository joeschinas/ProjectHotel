package model.hotel;

import java.util.Date;

public class Ocupacao {
	private int idOcupacao , idQuarto, idCliente;
	private Date data_inicio, data_fim;
	public int getIdOcupacao() {
		return idOcupacao;
	}
	public void setIdOcupacao(int idOcupacao) {
		this.idOcupacao = idOcupacao;
	}
	public int getIdQuarto() {
		return idQuarto;
	}
	public void setIdQuarto(int idQuarto) {
		this.idQuarto = idQuarto;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public Date getData_inicio() {
		return data_inicio;
	}
	public void setData_inicio(Date data_inicio) {
		this.data_inicio = data_inicio;
	}
	public Date getData_fim() {
		return data_fim;
	}
	public void setData_fim(Date data_fim) {
		this.data_fim = data_fim;
	}
}
