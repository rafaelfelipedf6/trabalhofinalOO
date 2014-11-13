package models;

public class Vendedor extends Usuario{
	private int idade;
	private String id;
	private String Departamento;
	private String loginMl;
	private String metasMensais;
	private String metasAnuais;
	private float comissaoMensal;
	private float comissaoAnual;
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDepartamento() {
		return Departamento;
	}
	public void setDepartamento(String departamento) {
		Departamento = departamento;
	}
	public String getLoginMl() {
		return loginMl;
	}
	public void setLoginMl(String loginMl) {
		this.loginMl = loginMl;
	}
	public String getMetasMensais() {
		return metasMensais;
	}
	public void setMetasMensais(String metasMensais) {
		this.metasMensais = metasMensais;
	}
	public String getMetasAnuais() {
		return metasAnuais;
	}
	public void setMetasAnuais(String metasAnuais) {
		this.metasAnuais = metasAnuais;
	}
	public float getComissaoMensal() {
		return comissaoMensal;
	}
	public void setComissaoMensal(float comissaoMensal) {
		this.comissaoMensal = comissaoMensal;
	}
	public float getComissaoAnual() {
		return comissaoAnual;
	}
	public void setComissaoAnual(float comissaoAnual) {
		this.comissaoAnual = comissaoAnual;
	}
	
	
}
