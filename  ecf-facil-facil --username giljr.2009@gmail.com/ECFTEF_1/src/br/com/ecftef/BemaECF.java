package br.com.ecftef;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import bemajava.BemaInteger;
import bemajava.Bematech;

public class BemaECF {
	
	private static int iRetorno;


	public static void analisaiRetorno() {
		switch (iRetorno) {
		case 0:
			JOptionPane.showMessageDialog(null, "Erro de Comunicação!");
			break;
		case -1:
			JOptionPane.showMessageDialog(null, "Erro de Execução na Função. Verifique!");
			break;
		case -2:
			JOptionPane.showMessageDialog(null, "Parâmetro Inválido !");
			break;
		case -3:
			JOptionPane.showMessageDialog(null, "Alíquota não programada !");
			break;
		case -4:
			JOptionPane.showMessageDialog(null, "Arquivo BemaFI32.INI não encontrado. Verifique!");
			break;
		case -5:
			JOptionPane.showMessageDialog(null, "Erro ao Abrir a Porta de Comunicação!");
			break;
		case -6:
			JOptionPane.showMessageDialog(null, "Impressora Desligada ou Desconectada!");
			break;
		case -7:
			JOptionPane.showMessageDialog(null, "Banco Não Cadastrado no Arquivo BemaFI32.ini!");
			break;
		case -8:
			JOptionPane.showMessageDialog(null, "Erro ao Criar ou Gravar no Arquivo Retorno.txt ou Status.txt");
			break;
		case -18:
			JOptionPane.showMessageDialog(null, "Não foi possível abrir arquivo INTPOS.001 !");
			break;
		case -19:
			JOptionPane.showMessageDialog(null, "Parâmetro Diferentes !");
			break;
		case -20:
			JOptionPane.showMessageDialog(null, "Transação Cancelada pelo Operador !");
			break;
		case -21:
			JOptionPane.showMessageDialog(null, "A Transação não foi Aprovada !");
			break;
		case -22:
			JOptionPane.showMessageDialog(null, "Não foi Possível Terminar a Impressão !");
			break;
		case -23:
			JOptionPane.showMessageDialog(null, "Não foi Possível Terminar a Operação !");
			break;
		case -24:
			JOptionPane.showMessageDialog(null, "Forma de Pagamento não Programada.");
			break;
		case -25:
			JOptionPane.showMessageDialog(null, "Totalizador não Fiscal não Programado.");
			break;
		case -26:
			JOptionPane.showMessageDialog(null, "Transação já Efetuada !");
			break;
		case -28:
			JOptionPane.showMessageDialog(null, "Não há Informações para Serem Impressas !");
			break;

		default:
			break;
		}
	}
	
	
	public static void retornoImpressora() {
		BemaInteger iACK = new BemaInteger();
		BemaInteger iST1 = new BemaInteger();
		BemaInteger iST2 = new BemaInteger();
		
	    iRetorno = Bematech.RetornoImpressora(iACK, iST1, iST2);
	    if (iACK.number == 6) {
	      // Verifica ST1
          if (iST1.number >= 128) { iST1.number = iST1.number - 128;JOptionPane.showMessageDialog(null,"Fim de Papel");}
          if (iST1.number >= 64)  { iST1.number = iST1.number - 64;  JOptionPane.showMessageDialog(null,"Pouco Papel");  					}
          if (iST1.number >= 32)  { iST1.number = iST1.number - 32;  JOptionPane.showMessageDialog(null,"Erro no Relógio"); 				}
          if (iST1.number >= 16)  { iST1.number = iST1.number - 16;  JOptionPane.showMessageDialog(null,"Impressora em ERRO"); 			}
          if (iST1.number >= 8)   { iST1.number = iST1.number - 8;   JOptionPane.showMessageDialog(null,"CMD não iniciado com ESC"); 	}
          if (iST1.number >= 4)   { iST1.number = iST1.number - 4;   JOptionPane.showMessageDialog(null,"Comando Inexistente"); 			}
          if (iST1.number >= 2)   { iST1.number = iST1.number - 2;   JOptionPane.showMessageDialog(null,"Cupom Aberto"); 					}
          if (iST1.number >= 1)   { iST1.number = iST1.number - 1;   JOptionPane.showMessageDialog(null,"Nº de Parâmetros Inválidos"); }

          // Verifica ST2
          if (iST2.number>= 128) { iST2.number = iST2.number - 128; JOptionPane.showMessageDialog(null,"Tipo de Parâmetro Inválido"); }
          if (iST2.number>= 64)  { iST2.number = iST2.number - 64;  JOptionPane.showMessageDialog(null,"Memória Fiscal Lotada"); 		}
          if (iST2.number>= 32)  { iST2.number = iST2.number - 32;  JOptionPane.showMessageDialog(null,"CMOS não Volátil"); 				}
          if (iST2.number>= 16)  { iST2.number = iST2.number - 16;  JOptionPane.showMessageDialog(null,"Alíquota Não Programada"); 	}
          if (iST2.number>= 8 )  { iST2.number = iST2.number - 8;   JOptionPane.showMessageDialog(null,"Alíquotas lotadas"); 			}
          if (iST2.number>= 4 )  { iST2.number = iST2.number - 4;   JOptionPane.showMessageDialog(null,"Cancelamento não Permitido"); }
          if (iST2.number>= 2 )  { iST2.number = iST2.number - 2;   JOptionPane.showMessageDialog(null,"CGC/IE não Programados"); 		}
          if (iST2.number>= 1 )  { iST2.number = iST2.number - 1;   JOptionPane.showMessageDialog(null,"Comando não Executado"); 		}
	    }
	}
	
	public static void leituraX() {
		if (JOptionPane.showConfirmDialog(null, "Deseja Emitir a Leitura X?", "Pergunta do Sistema", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) ==  JOptionPane.YES_OPTION) { 
			iRetorno = Bematech.LeituraX();
			analisaiRetorno();
			retornoImpressora();
		}
	}
	
	public static void reducaoZ() {
		if (JOptionPane.showConfirmDialog(null, "Deseja Emitir a Redução Z? - ATENÇÃO: Caixa será encerrado!!!", "Pergunta do Sistema", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) ==  JOptionPane.YES_OPTION) { 
			iRetorno = Bematech.ReducaoZ("", "");
			analisaiRetorno();
			retornoImpressora();
		}
	}
	
	public static void abreCupom() {
		iRetorno = Bematech.AbreCupom("11.111.111-11");
		analisaiRetorno();
		retornoImpressora();
	}
	
	public static void fechaCupom(String acrescimoDesconto, String tipoAcrescimoDesconto,
					   String valorAcrescimoDesconto, String mensagem, ArrayList<FormasPagamento> formasPagamento ) 
	{
		iRetorno = Bematech.IniciaFechamentoCupom(acrescimoDesconto, tipoAcrescimoDesconto, valorAcrescimoDesconto);

		for(int i=0;i<formasPagamento.size();i++){
			//System.out.println("Indice " + i + " = " + formasPagamento.get(i).getDescricao());
			iRetorno = Bematech.EfetuaFormaPagamento(formasPagamento.get(i).getDescricao() , formasPagamento.get(i).getValor());
		}
		
		iRetorno = Bematech.TerminaFechamentoCupom(mensagem);
		
		analisaiRetorno();
		retornoImpressora();
	}
	
	public static void abrirPortaSerial() {
		iRetorno = Bematech.AbrePortaSerial(); 
		analisaiRetorno();
		retornoImpressora();
	}
	
	public static void fecharPortaSerial() {
		iRetorno = Bematech.FechaPortaSerial(); 
		analisaiRetorno();
		retornoImpressora();
	}
	
	public static void horarioVerao() {
		if (JOptionPane.showConfirmDialog(null, "Deseja sair/entrar no Horário de Verão?", "Pergunta do Sistema", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) ==  JOptionPane.YES_OPTION) { 
			iRetorno = Bematech.ProgramaHorarioVerao();
			analisaiRetorno();
			retornoImpressora();
		}
	}
	
	public static void memoriaFiscalPorData(String data1, String data2) {
		if (JOptionPane.showConfirmDialog(null, "Deseja emitir o relatório de memória fiscal?", "Pergunta do Sistema", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) ==  JOptionPane.YES_OPTION) { 
			iRetorno = Bematech.LeituraMemoriaFiscalData(data1, data2);
			analisaiRetorno();
			retornoImpressora();
		}
	}

	public static void memoriaFiscalPorReducao(String red1, String red2) {
		if (JOptionPane.showConfirmDialog(null, "Deseja emitir o relatório de memória fiscal?", "Pergunta do Sistema", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) ==  JOptionPane.YES_OPTION) { 
			iRetorno = Bematech.LeituraMemoriaFiscalReducao(red1, red2);
			analisaiRetorno();
			retornoImpressora();
		}
	}
	
	public static void cancelaCupom() {
		if (JOptionPane.showConfirmDialog(null, "Deseja cancelar o cupom anterior?", "Pergunta do Sistema", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) ==  JOptionPane.YES_OPTION) { 
			iRetorno = Bematech.CancelaCupom();
			analisaiRetorno();
			retornoImpressora();
		}
	}

	public static void vendeItem(String codigo, String descricao, String aliquota,
			String tipoQtde, String qtde, int casasDecimais, String vlrUnitario,
			String tipoDesconto, String vlrDesconto) 
	{
		iRetorno = Bematech.VendeItem(codigo, descricao, aliquota, tipoQtde, qtde, casasDecimais, vlrUnitario, tipoDesconto, vlrDesconto);
		analisaiRetorno();
		retornoImpressora();
	}

	public static void cancelaItemAnterior() {
		iRetorno = Bematech.CancelaItemAnterior(); 
		analisaiRetorno();
		retornoImpressora();
	}

	public static void cancelaItemGenerico(String item) {
		iRetorno = Bematech.CancelaItemGenerico(item); 
		analisaiRetorno();
		retornoImpressora();
	}

	public static void programaAliquota(String aliquota) {
		if (JOptionPane.showConfirmDialog(null, "Deseja programar a aliquota?", "Pergunta do Sistema", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) ==  JOptionPane.YES_OPTION) { 
			iRetorno = Bematech.ProgramaAliquota(aliquota, 0);
			analisaiRetorno();
			retornoImpressora();
		}
	}
	
}
