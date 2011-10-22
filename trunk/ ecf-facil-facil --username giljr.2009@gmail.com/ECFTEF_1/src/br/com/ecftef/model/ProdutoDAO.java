package br.com.ecftef.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.ecftef.bd.AcessoMySQL;

public class ProdutoDAO {

    PreparedStatement pstm;
    ResultSet rs;
    String consultaProduto = "SELECT * FROM PRODUTO WHERE DESCRICAO LIKE ?";
    String consultaProdutoCodigo = "SELECT * FROM PRODUTO WHERE CODIGO=?";

	AcessoMySQL bd = new AcessoMySQL();	
	
    public List<ProdutoBean> listarProdutos(String descricao){
        List<ProdutoBean> produtos = new ArrayList<ProdutoBean>();
        try{
            pstm = bd.conectar().prepareStatement(consultaProduto);
            pstm.setString(1, descricao);//SELECT * FROM PRODUTO WHERE DESCRICAO LIKE caneta
            rs = pstm.executeQuery();
            ProdutoBean prod;
            while (rs.next()){
                prod = new ProdutoBean();
                prod.setCodigo(rs.getString("codigo"));
                prod.setAuditoria(rs.getString("auditoria"));
                prod.setCodigoFornecedor(rs.getInt("fornecedor_codigo"));
                prod.setCodigoUnidade(rs.getInt("unidade_codigo"));
                prod.setEstoque(rs.getInt("estoque"));
                prod.setDescricao(rs.getString("descricao"));
                prod.setEstoqueCritico(rs.getInt("critico"));
                prod.setValorCompra(rs.getDouble("vlrcompra"));
                prod.setValorVenda(rs.getDouble("vlrvenda"));
                produtos.add(prod);
            }
            bd.desconectar();
        } catch(Exception e){
            e.printStackTrace();
        }
        return produtos;
    }
	
	public ProdutoBean listarProdutosPeloCodigo(String codigo) {
		ProdutoBean prod = new ProdutoBean();
		try {
			pstm = bd.conectar().prepareStatement(consultaProdutoCodigo);
			pstm.setString(1, codigo);
			rs = pstm.executeQuery();
			rs.first();
			prod.setCodigo(rs.getString("codigo"));
			prod.setAuditoria(rs.getString("auditoria"));
			prod.setCodigoFornecedor(rs.getInt("fornecedor_codigo"));
			prod.setCodigoUnidade(rs.getInt("unidade_codigo"));
			prod.setEstoque(rs.getInt("estoque"));
			prod.setDescricao(rs.getString("descricao"));
			prod.setEstoqueCritico(rs.getInt("critico"));
			prod.setValorCompra(rs.getDouble("vlrcompra"));
			prod.setValorVenda(rs.getDouble("vlrvenda"));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			bd.desconectar();
		}
		return prod;
	}
    
    
}
