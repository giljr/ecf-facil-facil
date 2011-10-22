package br.com.ecftef.model;

import java.text.DecimalFormat;

public class ProdutoBean {

	String codigo;
	Integer codigoUnidade;
	Integer codigoFornecedor;
	String descricao;
	Double valorCompra;
	Double valorVenda;
	Integer estoque;
	Integer estoqueCritico;
	String auditoria;
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Integer getCodigoUnidade() {
		return codigoUnidade;
	}
	public void setCodigoUnidade(Integer codigoUnidade) {
		this.codigoUnidade = codigoUnidade;
	}
	public Integer getCodigoFornecedor() {
		return codigoFornecedor;
	}
	public void setCodigoFornecedor(Integer codigoFornecedor) {
		this.codigoFornecedor = codigoFornecedor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getValorCompra() {
			return new Double(valorCompra);
	}
	public void setValorCompra(Double valorCompra) {
		this.valorCompra = valorCompra;
	}
	public Double getValorVenda() {
		return valorVenda;
	}
	
	public void setValorVenda(Double valorVenda) {
		this.valorVenda = valorVenda;
	}
	public Integer getEstoque() {
		return estoque;
	}
	public void setEstoque(Integer estoque) {
		this.estoque = estoque;
	}
	public Integer getEstoqueCritico() {
		return estoqueCritico;
	}
	public void setEstoqueCritico(Integer estoqueCritico) {
		this.estoqueCritico = estoqueCritico;
	}
	public String getAuditoria() {
		return auditoria;
	}
	public void setAuditoria(String auditoria) {
		this.auditoria = auditoria;
	}
	
	
	
}
