package models;

public class Produto {
	int Quantidade;
	int Peso;
	float PrecoFinal;
	int Codigo;
	String Categoria;
	String Fornecedor;
	String tipoAnuncioMl;
	float impostosML;
	
	EmbalagemPadrao embalagem = new EmbalagemPadrao();

	public int getQuantidade() {
		return Quantidade;
	}

	public void setQuantidade(int quantidade) {
		Quantidade = quantidade;
	}

	public int getPeso() {
		return Peso;
	}

	public void setPeso(int peso) {
		Peso = peso;
	}

	public float getPrecoFinal() {
		return PrecoFinal;
	}

	public void setPrecoFinal(float precoFinal) {
		PrecoFinal = precoFinal;
	}

	public int getCodigo() {
		return Codigo;
	}

	public void setCodigo(int codigo) {
		Codigo = codigo;
	}

	public String getCategoria() {
		return Categoria;
	}

	public void setCategoria(String categoria) {
		Categoria = categoria;
	}

	public String getFornecedor() {
		return Fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		Fornecedor = fornecedor;
	}

	public String getTipoAnuncioMl() {
		return tipoAnuncioMl;
	}

	public void setTipoAnuncioMl(String tipoAnuncioMl) {
		this.tipoAnuncioMl = tipoAnuncioMl;
	}

	public float getImpostosML() {
		return impostosML;
	}

	public void setImpostosML(float impostosML) {
		this.impostosML = impostosML;
	}

	public EmbalagemPadrao getEmbalagem() {
		return embalagem;
	}

	public void setEmbalagem(EmbalagemPadrao embalagem) {
		this.embalagem = embalagem;
	}
}
