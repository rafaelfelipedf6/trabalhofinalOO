package models;

public class Perfumes extends Produto {
	String marca;
	String volume;
	String validade;
	String impostoMl;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getVolume() {
		return volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}
	public String getValidade() {
		return validade;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}
	public String getImpostoMl() {
		return impostoMl;
	}
	public void setImpostoMl(String impostoMl) {
		this.impostoMl = impostoMl;
	}
	
}
