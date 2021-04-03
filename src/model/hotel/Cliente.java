package model.hotel;

public class Cliente {
	private int idCliente;
	private String RG, nome, telefone;
	private char sexo;
	
	public Cliente() {
	}

	public Cliente(int idCliente, String rG, String nome, String telefone, char sexo) {
		this.idCliente = idCliente;
		RG = rG;
		this.nome = nome;
		this.telefone = telefone;
		this.sexo = sexo;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", RG=" + RG + ", nome=" + nome + ", telefone=" + telefone + ", sexo=" + sexo + '}';
    }
	
	
}
