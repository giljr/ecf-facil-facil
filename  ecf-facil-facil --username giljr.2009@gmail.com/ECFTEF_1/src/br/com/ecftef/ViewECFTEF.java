package br.com.ecftef;

import java.awt.AWTEvent;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.BevelBorder;

import br.com.ecftef.control.Controle;
import br.com.ecftef.model.CabecalhoVendaBean;
import br.com.ecftef.model.DetalheVendaBean;
import br.com.ecftef.model.ProdutoBean;

/**
 * This code was edited or generated using CloudGarden's Jigloo SWT/Swing GUI
 * Builder, which is free for non-commercial use. If Jigloo is being used
 * commercially (ie, by a corporation, company or business for any purpose
 * whatever) then you should purchase a license for each developer using Jigloo.
 * Please visit www.cloudgarden.com for details. Use of Jigloo implies
 * acceptance of these licensing terms. A COMMERCIAL LICENSE HAS NOT BEEN
 * PURCHASED FOR THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED LEGALLY FOR
 * ANY CORPORATE OR COMMERCIAL PURPOSE.
 */
public class ViewECFTEF extends javax.swing.JFrame {

	private static String vlrDesconto = "0";
	private static DefaultListModel model;
	private static double totalGeral = 0;

	private JPanel jPanel1;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private static JFormattedTextField jFormattedTextField3;
	private JLabel jLabel10;
	private static JFormattedTextField jFormattedTextField2;
	private static JFormattedTextField jFormattedTextField1;
	private JLabel jLabel9;
	private static JPanel jPanel4;
	private static JLabel jLabel8;
	private static JLabel jLabel7;
	private JLabel jLabel6;
	private JSeparator jSeparator1;
	private JPanel jPanel3;
	private JList jList1;
	private JPanel jPanel2;
	private JTextPane jTextPane1;
	private static JTextField jTextField5;
	private JLabel jLabel20;
	private JLabel jLabel21;
	private JLabel jLabel22;
	private static JFormattedTextField jFormattedTextField14;
	private static JFormattedTextField jFormattedTextField13;
	private static JFormattedTextField jFormattedTextField12;
	private static JFormattedTextField jFormattedTextField11;
	private JLabel jLabel19;
	private JLabel jLabel18;
	private static JFormattedTextField jFormattedTextField10;
	private static JPanel jPanel6;
	private JMenuItem jMenuItem17;
	private JMenuItem jMenuItem16;
	private JMenuItem jMenuItem15;
	private JMenuItem jMenuItem14;
	private JMenuItem jMenuItem13;
	private JMenuItem jMenuItem12;
	private JMenuItem jMenuItem11;
	private JMenuItem menuReducaoZ;
	private static JLabel jLabel23;
	private JMenuItem jMenuItem3;
	private JMenuItem jMenuItem9;
	private JMenuItem menuLeituraX;
	private JMenuItem menuFechaCupom;
	private JMenuItem menuAbreCupom;
	private JMenuItem menuConcedeDesconto;
	private JMenuItem menuCancelaCupom;
	private JMenuItem menuCancelaUltimoItem;
	private JMenuItem menuCancelaItemGenerico;
	private JMenuItem jMenuItem2;
	private JMenuItem jMenuItem1;
	private JMenu jMenu4;
	private JMenu jMenu3;
	private JMenu jMenu2;
	private JMenu jMenu1;
	private JPopupMenu jPopupMenu1;
	private static JPanel jPanel5;
	private JLabel jLabel17;
	private static JFormattedTextField jFormattedTextField9;
	private static JFormattedTextField jFormattedTextField8;
	private JLabel jLabel16;
	private static JFormattedTextField jFormattedTextField7;
	private JLabel jLabel15;
	private static JFormattedTextField jFormattedTextField6;
	private JLabel jLabel14;
	private static JFormattedTextField jFormattedTextField5;
	private JLabel jLabel13;
	private JLabel jLabel12;
	private static JFormattedTextField jFormattedTextField4;
	private JLabel jLabel11;
	private static JFormattedTextField jTextField4;
	private JLabel jLabel2;
	private static JTextField jTextField3;
	private static JTextField jTextField2;
	private static JTextField jTextField1;
	private JLabel jLabel1;

	private static ArrayList<DetalheVendaBean> arrayDVendaBean;// = new ArrayList<DetalheVendaBean>();
	private static CabecalhoVendaBean cVendaBean;// = new CabecalhoVendaBean();
	private static Controle controle;
	private static ImageIcon imagem;

	private DetalheVendaBean dVendaBean = null;
	private ProdutoBean produtoBean;

	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				ViewECFTEF inst = new ViewECFTEF();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
		EventQueue queue = new EventQueue() {
			protected void dispatchEvent(AWTEvent event) {
				super.dispatchEvent(event);

				String a[];
				String tecla[];

				if (!event.paramString().equals("")) {
					if (event.paramString().substring(0, 5).equals("KEY_P")) {
						a = event.paramString().split(",");
						tecla = a[1].split("=");

						switch (Integer.parseInt(tecla[1])) {
						case 112: // F1
							JOptionPane.showMessageDialog(null,
									"Pressionou F1!");
							break;
						case 113: // F2
							try {
								Runtime.getRuntime().exec("calc.exe");
							} catch (IOException e) {
								e.printStackTrace();
							}
							break;
						case 114: // F3
							JOptionPane.showMessageDialog(null,
									"Pressionou F3!");
							break;
						case 115: // F4
							String descricao = JOptionPane
									.showInputDialog("Qual o nome do Produto? ");
							break;
						case 116: // F5
							JOptionPane.showMessageDialog(null,
									"Pressionou F5!");
							break;
						case 117: // F6
							String item = JOptionPane
									.showInputDialog("Qual item deseja cancelar? ");
							BemaECF.cancelaItemGenerico(item);
							insereItemCancelado(item);
							break;
						case 118: // F7
							BemaECF.cancelaItemAnterior();
							insereItemCancelado("Anterior");
							break;
						case 119: // F8
							BemaECF.cancelaCupom();
							break;
						case 120: // F9
							JOptionPane.showMessageDialog(null,
									"Pressionou F9!");
							break;
						case 121: // F10
							vlrDesconto = JOptionPane
									.showInputDialog("Informe o valor do desconto R$: ");
							break;
						case 122: // F11
							BemaECF.abreCupom();
							iniciaVenda();
							break;
						case 123: // F12
							fechaCupom();
							break;
						default:
							break;
						}
					}
				}
			}
		};
		Toolkit.getDefaultToolkit().getSystemEventQueue().push(queue);

	}

	public ViewECFTEF() {
		super();
		Toolkit.getDefaultToolkit().addAWTEventListener(new AWTEventListener() {
			public void eventDispatched(AWTEvent e) {
			}
		}, AWTEvent.KEY_EVENT_MASK);
		initGUI();
		controle = new Controle();
		viewPadrao();
	}

	private void initGUI() {
		try {
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setTitle("Protótipo Frente de Caixa com TEF (Para Fins de Apresentações Didáticas - por Gil jr) ");
			this.setResizable(false);
			{
				jPanel1 = new JPanel();
				getContentPane().add(jPanel1);
				jPanel1.setBounds(0, 0, 694, 68);
				jPanel1.setBackground(new java.awt.Color(47, 151, 255));
				jPanel1.setBorder(BorderFactory
						.createEtchedBorder(BevelBorder.LOWERED));
				jPanel1.setLayout(null);
				{
					jLabel1 = new JLabel();
					jPanel1.add(jLabel1);
					jLabel1.setText("Código:");
					jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
					jLabel1.setBounds(7, 9, 54, 17);
				}
				{
					jTextField1 = new JTextField();
					jPanel1.add(jTextField1);
					jTextField1.setBounds(66, 7, 142, 21);
					jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14));
					jTextField1.setHorizontalAlignment(SwingConstants.RIGHT);
					jTextField1
							.setToolTipText("Insira o código do produto aqui - use o leitor de códigos de barra");
					jTextField1.setText("1234567891025");
					jTextField1.addFocusListener(new FocusAdapter() {
						public void focusLost(FocusEvent evt) {
							jTextField1FocusLost(evt);
						}
					});
				}
				{
					jTextField2 = new JTextField();
					jPanel1.add(jTextField2);
					jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14));
					jTextField2.setHorizontalAlignment(SwingConstants.LEFT);
					jTextField2.setBounds(208, 7, 472, 21);
					jTextField2
							.setBackground(new java.awt.Color(255, 255, 183));
					jTextField2.setEditable(false);
					jTextField2.setToolTipText("Descrição do produto");
					jTextField2.setText("CANETA");
				}
				{
					jTextField3 = new JTextField();
					jPanel1.add(jTextField3);
					jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14));
					jTextField3.setHorizontalAlignment(SwingConstants.RIGHT);
					jTextField3.setBounds(96, 36, 112, 21);
					jTextField3.setToolTipText("Insira a quantidade desejada");
					jTextField3.setText("10");
					jTextField3.addFocusListener(new FocusAdapter() {
						public void focusLost(FocusEvent evt) {
							jTextField3FocusLost(evt);
						}
					});
				}
				{
					jLabel2 = new JLabel();
					jPanel1.add(jLabel2);
					jLabel2.setText("Quantidade:");
					jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
					jLabel2.setBounds(7, 38, 89, 17);
				}
				{
					jLabel3 = new JLabel();
					jPanel1.add(jLabel3);
					jLabel3.setText("Valor Unitário:");
					jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14));
					jLabel3.setBounds(213, 38, 107, 17);
				}
				{
					jTextField4 = new JFormattedTextField();
					jPanel1.add(jTextField4);
					jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14));
					jTextField4.setHorizontalAlignment(SwingConstants.RIGHT);
					jTextField4.setBounds(317, 39, 115, 21);
					jTextField4
							.setBackground(new java.awt.Color(255, 255, 183));
					jTextField4.setEnabled(false);
					jTextField4.setText("0.00");
					jTextField4.setToolTipText("Valor unitário do produto");
				}
				{
					jLabel4 = new JLabel();
					jPanel1.add(jLabel4);
					jLabel4.setText("Valor Total:");
					jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14));
					jLabel4.setBounds(450, 38, 83, 17);
				}
				{
					jTextField5 = new JTextField();
					jPanel1.add(jTextField5);
					jTextField5.setFont(new java.awt.Font("Tahoma", 0, 14));
					jTextField5.setHorizontalAlignment(SwingConstants.RIGHT);
					jTextField5.setText("0.00");
					jTextField5.setEnabled(false);
					jTextField5
							.setBackground(new java.awt.Color(255, 255, 183));
					jTextField5.setBounds(545, 37, 136, 21);
					jTextField5.setToolTipText("Valor total do produto");
				}
			}
			{
				jTextPane1 = new JTextPane();
				getContentPane().add(jTextPane1);
				jTextPane1
						.setText("<F1> Ajuda | <F2> Calculadora | <F3> Retorna | <F4> Importa Produto | <F5> Dados da Venda | <F6> Cancela Item Genérico | <F7> Cancela Último Item | <F8> Cancela Cupom | <F9> Retoma Venda | <F10> Desconto | <F11> Abre Cupom | <F12> Fecha Cupom");
				jTextPane1.setBounds(0, 482, 694, 36);
				jTextPane1.setBackground(new java.awt.Color(47, 151, 255));
				jTextPane1.setEditable(false);
				jTextPane1.setFont(new java.awt.Font("Tahoma", 1, 9));
			}
			{
				model = new DefaultListModel();
				JList jList1 = new JList(model);
				getContentPane().add(jList1);
				jList1.setBounds(-1, 69, 247, 414);
				jList1.setBackground(new java.awt.Color(255, 255, 183));
				jList1.setFont(new java.awt.Font("Courier New", 1, 11));
				jList1.setBorder(BorderFactory
						.createEtchedBorder(BevelBorder.LOWERED));
			}
			{
				jPanel2 = new JPanel();
				getContentPane().add(jPanel2);
				jPanel2.setLayout(null);
				jPanel2.setBounds(247, 68, 447, 414);
				jPanel2.setBackground(new java.awt.Color(64, 128, 128));
				{
					jPanel3 = new JPanel();
					jPanel2.add(jPanel3);
					jPanel3.setLayout(null);
					jPanel3.setBounds(0, 346, 447, 68);
					jPanel3.setBackground(new java.awt.Color(90, 173, 173));
					jPanel3.setBorder(BorderFactory
							.createEtchedBorder(BevelBorder.LOWERED));
					{
						jSeparator1 = new JSeparator();
						jPanel3.add(jSeparator1);
						jSeparator1.setBounds(221, 2, 11, 66);
						jSeparator1.setOrientation(SwingConstants.VERTICAL);
					}
					{
						jLabel5 = new JLabel();
						jPanel3.add(jLabel5);
						jLabel5.setText("Código da Venda:");
						jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14));
						jLabel5.setBounds(55, 9, 130, 17);
					}
					{
						jLabel6 = new JLabel();
						jPanel3.add(jLabel6);
						jLabel6.setText("Total Geral:");
						jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14));
						jLabel6.setBounds(291, 9, 82, 17);
					}
					{
						jLabel7 = new JLabel();
						jPanel3.add(jLabel7);
						jLabel7.setText("0000000000");
						jLabel7.setFont(new java.awt.Font("Tahoma", 1, 26));
						jLabel7.setBounds(2, 34, 219, 29);
						jLabel7.setHorizontalAlignment(SwingConstants.CENTER);
						jLabel7.setBackground(new java.awt.Color(0, 0, 0));
						jLabel7.setForeground(new java.awt.Color(255, 255, 0));
					}
					{
						jLabel8 = new JLabel();
						jPanel3.add(jLabel8);
						jLabel8.setText("0.00");
						jLabel8.setHorizontalAlignment(SwingConstants.RIGHT);
						jLabel8.setBackground(new java.awt.Color(0, 0, 0));
						jLabel8.setFont(new java.awt.Font("Tahoma", 1, 26));
						jLabel8.setForeground(new java.awt.Color(255, 255, 0));
						jLabel8.setBounds(238, 32, 195, 29);
					}
				}
				{
					jPanel4 = new JPanel();
					jPanel2.add(jPanel4);
					jPanel4.setBounds(223, 0, 224, 346);
					jPanel4.setLayout(null);
					jPanel4.setBorder(BorderFactory
							.createEtchedBorder(BevelBorder.LOWERED));
					jPanel4.setBackground(new java.awt.Color(64, 128, 128));
					{
						jLabel9 = new JLabel();
						jPanel4.add(jLabel9);
						jLabel9.setText("1 - Dinheiro:");
						jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12));
						jLabel9.setBounds(8, 18, 80, 17);
						jLabel9.setForeground(new java.awt.Color(255, 255, 0));
					}
					{
						jFormattedTextField1 = new JFormattedTextField();
						jPanel4.add(jFormattedTextField1);
						jFormattedTextField1.setText("0,00");
						jFormattedTextField1.setBounds(112, 15, 103, 21);
						jFormattedTextField1
								.setHorizontalAlignment(SwingConstants.RIGHT);
						jFormattedTextField1.setFont(new java.awt.Font(
								"Tahoma", 1, 11));
					}
					{
						jFormattedTextField2 = new JFormattedTextField();
						jPanel4.add(jFormattedTextField2);
						jFormattedTextField2.setFont(new java.awt.Font(
								"Tahoma", 1, 11));
						jFormattedTextField2
								.setHorizontalAlignment(SwingConstants.RIGHT);
						jFormattedTextField2.setText("0,00");
						jFormattedTextField2.setBounds(111, 47, 103, 21);
					}
					{
						jLabel10 = new JLabel();
						jPanel4.add(jLabel10);
						jLabel10.setText("2 - Cheque:");
						jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12));
						jLabel10.setForeground(new java.awt.Color(255, 255, 0));
						jLabel10.setBounds(8, 50, 80, 17);
					}
					{
						jFormattedTextField3 = new JFormattedTextField();
						jPanel4.add(jFormattedTextField3);
						jFormattedTextField3.setFont(new java.awt.Font(
								"Tahoma", 1, 11));
						jFormattedTextField3
								.setHorizontalAlignment(SwingConstants.RIGHT);
						jFormattedTextField3.setText("0,00");
						jFormattedTextField3.setBounds(112, 80, 103, 21);
					}
					{
						jLabel11 = new JLabel();
						jPanel4.add(jLabel11);
						jLabel11.setText("3 - Cheque-Pré:");
						jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12));
						jLabel11.setForeground(new java.awt.Color(255, 255, 0));
						jLabel11.setBounds(8, 80, 104, 17);
					}
					{
						jFormattedTextField4 = new JFormattedTextField();
						jPanel4.add(jFormattedTextField4);
						jFormattedTextField4.setFont(new java.awt.Font(
								"Tahoma", 1, 11));
						jFormattedTextField4
								.setHorizontalAlignment(SwingConstants.RIGHT);
						jFormattedTextField4.setText("0,00");
						jFormattedTextField4.setBounds(112, 113, 103, 21);
					}
					{
						jLabel12 = new JLabel();
						jPanel4.add(jLabel12);
						jLabel12.setText("4 - Ticket:");
						jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12));
						jLabel12.setForeground(new java.awt.Color(255, 255, 0));
						jLabel12.setBounds(8, 113, 80, 17);
					}
					{
						jLabel13 = new JLabel();
						jPanel4.add(jLabel13);
						jLabel13.setText("5 - Cartão:");
						jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12));
						jLabel13.setForeground(new java.awt.Color(255, 255, 0));
						jLabel13.setBounds(8, 150, 80, 17);
					}
					{
						jFormattedTextField5 = new JFormattedTextField();
						jPanel4.add(jFormattedTextField5);
						jFormattedTextField5.setFont(new java.awt.Font(
								"Tahoma", 1, 11));
						jFormattedTextField5
								.setHorizontalAlignment(SwingConstants.RIGHT);
						jFormattedTextField5.setText("0,00");
						jFormattedTextField5.setBounds(112, 147, 103, 21);
					}
					{
						jLabel14 = new JLabel();
						jPanel4.add(jLabel14);
						jLabel14.setText("6 - Vale:");
						jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12));
						jLabel14.setForeground(new java.awt.Color(255, 255, 0));
						jLabel14.setBounds(8, 184, 80, 17);
					}
					{
						jFormattedTextField6 = new JFormattedTextField();
						jPanel4.add(jFormattedTextField6);
						jFormattedTextField6.setFont(new java.awt.Font(
								"Tahoma", 1, 11));
						jFormattedTextField6
								.setHorizontalAlignment(SwingConstants.RIGHT);
						jFormattedTextField6.setText("0,00");
						jFormattedTextField6.setBounds(112, 181, 103, 21);
					}
					{
						jLabel15 = new JLabel();
						jPanel4.add(jLabel15);
						jLabel15.setText("7 - Convênio:");
						jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12));
						jLabel15.setForeground(new java.awt.Color(255, 255, 0));
						jLabel15.setBounds(8, 223, 98, 17);
					}
					{
						jFormattedTextField7 = new JFormattedTextField();
						jPanel4.add(jFormattedTextField7);
						jFormattedTextField7.setFont(new java.awt.Font(
								"Tahoma", 1, 11));
						jFormattedTextField7
								.setHorizontalAlignment(SwingConstants.RIGHT);
						jFormattedTextField7.setText("0,00");
						jFormattedTextField7.setBounds(112, 220, 103, 21);
					}
					{
						jLabel16 = new JLabel();
						jPanel4.add(jLabel16);
						jLabel16.setText("8 - Contra-Vale:");
						jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12));
						jLabel16.setForeground(new java.awt.Color(255, 255, 0));
						jLabel16.setBounds(8, 256, 98, 17);
					}
					{
						jFormattedTextField8 = new JFormattedTextField();
						jPanel4.add(jFormattedTextField8);
						jFormattedTextField8.setFont(new java.awt.Font(
								"Tahoma", 1, 11));
						jFormattedTextField8
								.setHorizontalAlignment(SwingConstants.RIGHT);
						jFormattedTextField8.setText("0,00");
						jFormattedTextField8.setBounds(112, 253, 103, 21);
					}
					{
						jFormattedTextField9 = new JFormattedTextField();
						jPanel4.add(jFormattedTextField9);
						jFormattedTextField9.setFont(new java.awt.Font(
								"Tahoma", 1, 11));
						jFormattedTextField9
								.setHorizontalAlignment(SwingConstants.RIGHT);
						jFormattedTextField9.setText("0,00");
						jFormattedTextField9.setBounds(112, 292, 103, 21);
						jFormattedTextField9
								.addFocusListener(new FocusAdapter() {
									public void focusLost(FocusEvent evt) {
										jFormattedTextField9FocusLost(evt);
									}
								});
					}
					{
						jLabel17 = new JLabel();
						jPanel4.add(jLabel17);
						jLabel17.setText("9 - Crediário:");
						jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12));
						jLabel17.setForeground(new java.awt.Color(255, 255, 0));
						jLabel17.setBounds(8, 291, 98, 17);
					}
				}
				{
					jPanel5 = new JPanel();
					jPanel2.add(jPanel5);
					jPanel5.setBounds(0, 0, 223, 346);
					jPanel5.setBackground(new java.awt.Color(255, 255, 0));
					jPanel5.setBorder(BorderFactory
							.createEtchedBorder(BevelBorder.LOWERED));
					jPanel5.setLayout(null);
					{
						jPopupMenu1 = new JPopupMenu();
						setComponentPopupMenu(jPanel5, jPopupMenu1);
						{
							jMenu1 = new JMenu();
							jPopupMenu1.add(jMenu1);
							jMenu1.setText("Comandos de Inicialização");
							{
								jMenuItem1 = new JMenuItem();
								jMenu1.add(jMenuItem1);
								jMenuItem1
										.setText("Alteração do Símbolo da Moeda Corrente");
								jMenuItem1
										.setMnemonic(java.awt.event.KeyEvent.VK_A);
							}
							{
								jMenuItem2 = new JMenuItem();
								jMenu1.add(jMenuItem2);
								jMenuItem2.setText("Programa Truncamento");
							}
							{
								jMenuItem9 = new JMenuItem();
								jMenu1.add(jMenuItem9);
								jMenuItem9.setText("Programa Horário de Verão");
								jMenuItem9
										.addActionListener(new ActionListener() {
											public void actionPerformed(
													ActionEvent evt) {
												jMenuItem9ActionPerformed(evt);
											}
										});
							}
							{
								jMenuItem3 = new JMenuItem();
								jMenu1.add(jMenuItem3);
								jMenuItem3.setText("Programa Aliquota ICMS");
								jMenuItem3
										.addActionListener(new ActionListener() {
											public void actionPerformed(
													ActionEvent evt) {
												jMenuItem3ActionPerformed(evt);
											}
										});
							}
						}
						{
							jMenu2 = new JMenu();
							jPopupMenu1.add(jMenu2);
							jMenu2.setText("Comandos de Cupom Fiscal");
							{
								menuCancelaItemGenerico = new JMenuItem();
								jMenu2.add(menuCancelaItemGenerico);
								menuCancelaItemGenerico
										.setText("F6 - Cancela Item Genérico");
								menuCancelaItemGenerico
										.addActionListener(new ActionListener() {
											public void actionPerformed(
													ActionEvent evt) {
												menuCancelaItemGenericoActionPerformed(evt);
											}
										});
							}
							{
								menuCancelaUltimoItem = new JMenuItem();
								jMenu2.add(menuCancelaUltimoItem);
								menuCancelaUltimoItem
										.setText("F7 - Cancela Último Item");
								menuCancelaUltimoItem
										.addActionListener(new ActionListener() {
											public void actionPerformed(
													ActionEvent evt) {
												menuCancelaUltimoItemActionPerformed(evt);
											}
										});
							}
							{
								menuCancelaCupom = new JMenuItem();
								jMenu2.add(menuCancelaCupom);
								menuCancelaCupom.setText("F8 - Cancela Cupom");
								menuCancelaCupom
										.addActionListener(new ActionListener() {
											public void actionPerformed(
													ActionEvent evt) {
												menuCancelaCupomActionPerformed(evt);
											}
										});
							}
							{
								menuConcedeDesconto = new JMenuItem();
								jMenu2.add(menuConcedeDesconto);
								menuConcedeDesconto
										.setText("F10 - Concede Desconto");
								menuConcedeDesconto
										.addActionListener(new ActionListener() {
											public void actionPerformed(
													ActionEvent evt) {
												menuConcedeDescontoActionPerformed(evt);
											}
										});
							}
							{
								menuAbreCupom = new JMenuItem();
								jMenu2.add(menuAbreCupom);
								menuAbreCupom.setText("F11 - Abre Cupom");
								menuAbreCupom
										.addActionListener(new ActionListener() {
											public void actionPerformed(
													ActionEvent evt) {
												menuAbreCupomActionPerformed(evt);
											}
										});
							}
							{
								menuFechaCupom = new JMenuItem();
								jMenu2.add(menuFechaCupom);
								menuFechaCupom.setText("F12 - Fecha Cupom");
								menuFechaCupom
										.addActionListener(new ActionListener() {
											public void actionPerformed(
													ActionEvent evt) {
												menuFechaCupomActionPerformed(evt);
											}
										});
							}
						}
						{
							jMenu3 = new JMenu();
							jPopupMenu1.add(jMenu3);
							jMenu3.setText("Comandos dos Relatórios Fiscais");
							{
								menuLeituraX = new JMenuItem();
								jMenu3.add(menuLeituraX);
								menuLeituraX.setText("Leitura X");
								menuLeituraX
										.addActionListener(new ActionListener() {
											public void actionPerformed(
													ActionEvent evt) {
												menuLeituraXActionPerformed(evt);
											}
										});
							}
							{
								menuReducaoZ = new JMenuItem();
								jMenu3.add(menuReducaoZ);
								menuReducaoZ.setText("Redução Z");
								menuReducaoZ
										.addActionListener(new ActionListener() {
											public void actionPerformed(
													ActionEvent evt) {
												menuReducaoZActionPerformed(evt);
											}
										});

							}
							{
								jMenuItem11 = new JMenuItem();
								jMenu3.add(jMenuItem11);
								jMenuItem11
										.setText("Memória por Faixa de Data");
								jMenuItem11
										.addActionListener(new ActionListener() {
											public void actionPerformed(
													ActionEvent evt) {
												jMenuItem11ActionPerformed(evt);
											}
										});
							}
							{
								jMenuItem12 = new JMenuItem();
								jMenu3.add(jMenuItem12);
								jMenuItem12
										.setText("Memória por Faixa de Redução");
								jMenuItem12
										.addActionListener(new ActionListener() {
											public void actionPerformed(
													ActionEvent evt) {
												jMenuItem12ActionPerformed(evt);
											}
										});
							}
						}
						{
							jMenu4 = new JMenu();
							jPopupMenu1.add(jMenu4);
							jMenu4.setText("Outras Opções");
							{
								jMenuItem13 = new JMenuItem();
								jMenu4.add(jMenuItem13);
								jMenuItem13.setText("F1 - Ajuda");
							}
							{
								jMenuItem14 = new JMenuItem();
								jMenu4.add(jMenuItem14);
								jMenuItem14.setText("F2 - Calculadora");
							}
							{
								jMenuItem15 = new JMenuItem();
								jMenu4.add(jMenuItem15);
								jMenuItem15.setText("F3 - Retorna");
							}
							{
								jMenuItem16 = new JMenuItem();
								jMenu4.add(jMenuItem16);
								jMenuItem16.setText("F5 - Dados da Venda");
							}
							{
								jMenuItem17 = new JMenuItem();
								jMenu4.add(jMenuItem17);
								jMenuItem17.setText("F9 - Retoma Venda");
							}
						}
					}
					{
						jPanel6 = new JPanel();
						jPanel5.add(jPanel6);
						jPanel6.setBounds(9, 77, 207, 189);
						jPanel6.setLayout(null);
						jPanel6.setBackground(new java.awt.Color(64, 128, 128));
						jPanel6.setBorder(BorderFactory
								.createEtchedBorder(BevelBorder.LOWERED));
						{
							jFormattedTextField10 = new JFormattedTextField();
							jPanel6.add(jFormattedTextField10);
							jFormattedTextField10.setFont(new java.awt.Font(
									"Tahoma", 1, 11));
							jFormattedTextField10
									.setHorizontalAlignment(SwingConstants.RIGHT);
							jFormattedTextField10.setText("0,00");
							jFormattedTextField10.setBounds(90, 14, 103, 21);
							jFormattedTextField10.setEditable(false);
							jFormattedTextField10
									.setBackground(new java.awt.Color(255, 255,
											183));
						}
						{
							jLabel18 = new JLabel();
							jPanel6.add(jLabel18);
							jLabel18.setText("Total Din:");
							jLabel18
									.setFont(new java.awt.Font("Tahoma", 1, 12));
							jLabel18.setForeground(new java.awt.Color(255, 255,
									0));
							jLabel18.setBounds(10, 18, 80, 17);
						}
						{
							jLabel19 = new JLabel();
							jPanel6.add(jLabel19);
							jLabel19.setText("Desconto:");
							jLabel19
									.setFont(new java.awt.Font("Tahoma", 1, 12));
							jLabel19.setForeground(new java.awt.Color(255, 255,
									0));
							jLabel19.setBounds(10, 54, 80, 17);
						}
						{
							jFormattedTextField11 = new JFormattedTextField();
							jPanel6.add(jFormattedTextField11);
							jFormattedTextField11.setFont(new java.awt.Font(
									"Tahoma", 1, 11));
							jFormattedTextField11
									.setHorizontalAlignment(SwingConstants.RIGHT);
							jFormattedTextField11.setText("0,00");
							jFormattedTextField11.setBounds(90, 50, 103, 21);
							jFormattedTextField11.setEditable(false);
							jFormattedTextField11
									.setBackground(new java.awt.Color(255, 255,
											183));
						}
						{
							jLabel20 = new JLabel();
							jPanel6.add(jLabel20);
							jLabel20.setText("SubTotal:");
							jLabel20
									.setFont(new java.awt.Font("Tahoma", 1, 12));
							jLabel20.setForeground(new java.awt.Color(255, 255,
									0));
							jLabel20.setBounds(10, 90, 80, 17);
						}
						{
							jFormattedTextField12 = new JFormattedTextField();
							jPanel6.add(jFormattedTextField12);
							jFormattedTextField12.setFont(new java.awt.Font(
									"Tahoma", 1, 11));
							jFormattedTextField12
									.setHorizontalAlignment(SwingConstants.RIGHT);
							jFormattedTextField12.setText("0,00");
							jFormattedTextField12.setBounds(90, 86, 103, 21);
							jFormattedTextField12.setEditable(false);
							jFormattedTextField12
									.setBackground(new java.awt.Color(255, 255,
											183));
						}
						{
							jFormattedTextField13 = new JFormattedTextField();
							jPanel6.add(jFormattedTextField13);
							jFormattedTextField13.setFont(new java.awt.Font(
									"Tahoma", 1, 11));
							jFormattedTextField13
									.setHorizontalAlignment(SwingConstants.RIGHT);
							jFormattedTextField13.setText("0,00");
							jFormattedTextField13.setBounds(90, 122, 103, 21);
						}
						{
							jLabel21 = new JLabel();
							jPanel6.add(jLabel21);
							jLabel21.setText("Vlr. Rec:");
							jLabel21
									.setFont(new java.awt.Font("Tahoma", 1, 12));
							jLabel21.setForeground(new java.awt.Color(255, 255,
									0));
							jLabel21.setBounds(10, 126, 80, 17);
						}
						{
							jFormattedTextField14 = new JFormattedTextField();
							jPanel6.add(jFormattedTextField14);
							jFormattedTextField14.setFont(new java.awt.Font(
									"Tahoma", 1, 11));
							jFormattedTextField14
									.setHorizontalAlignment(SwingConstants.RIGHT);
							jFormattedTextField14.setText("0,00");
							jFormattedTextField14.setBounds(90, 158, 103, 21);
							jFormattedTextField14.setEditable(false);
							jFormattedTextField14
									.setBackground(new java.awt.Color(255, 255,
											183));
						}
						{
							jLabel22 = new JLabel();
							jPanel6.add(jLabel22);
							jLabel22.setText("Troco:");
							jLabel22
									.setFont(new java.awt.Font("Tahoma", 1, 12));
							jLabel22.setForeground(new java.awt.Color(255, 255,
									0));
							jLabel22.setBounds(10, 162, 80, 17);
						}
					}
					{
						jLabel23 = new JLabel();
						jPanel5.add(jLabel23);
						jLabel23.setBounds(9, 8, 205, 324);
					}
				}
			}
			pack();
			this.setSize(700, 550);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Auto-generated method for setting the popup menu for a component
	 */
	private void setComponentPopupMenu(final java.awt.Component parent,
			final javax.swing.JPopupMenu menu) {
		parent.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent e) {
				if (e.isPopupTrigger())
					menu.show(parent, e.getX(), e.getY());
			}

			public void mouseReleased(java.awt.event.MouseEvent e) {
				if (e.isPopupTrigger())
					menu.show(parent, e.getX(), e.getY());
			}
		});
	}

	private void menuLeituraXActionPerformed(ActionEvent evt) {
		BemaECF.leituraX();
	}

	private void menuReducaoZActionPerformed(ActionEvent evt) {
		BemaECF.reducaoZ();
	}

	private void jMenuItem11ActionPerformed(ActionEvent evt) {
		String data1 = JOptionPane
				.showInputDialog("Insira a Data Inicial(ddmmaaaa): ");
		String data2 = JOptionPane
				.showInputDialog("Insira a Data Final(ddmmaaaa): ");
		BemaECF.memoriaFiscalPorData(data1, data2);
	}

	private void jMenuItem12ActionPerformed(ActionEvent evt) {
		String reducao1 = JOptionPane
				.showInputDialog("Insira o Número da Redução Z Inicial(4 dígitos): ");
		String reducao2 = JOptionPane
				.showInputDialog("Insira o Número da Redução Z Inicial(4 dígitos): ");
		BemaECF.memoriaFiscalPorData(reducao1, reducao2);
	}

	private void jMenuItem9ActionPerformed(ActionEvent evt) {
		BemaECF.horarioVerao();
	}

	private void menuCancelaItemGenericoActionPerformed(ActionEvent evt) {
		String item = JOptionPane
				.showInputDialog("Qual item deseja cancelar? ");
		BemaECF.cancelaItemGenerico(item);
		insereItemCancelado(item);
	}

	private void jMenuItem3ActionPerformed(ActionEvent evt) {
		String aliquota = JOptionPane.showInputDialog("Informe a aliquota? ");
		BemaECF.programaAliquota(aliquota);
	}

	private void menuCancelaUltimoItemActionPerformed(ActionEvent evt) {
		BemaECF.cancelaItemAnterior();
		insereItemCancelado("Anterior");
	}

	private void menuCancelaCupomActionPerformed(ActionEvent evt) {
		BemaECF.cancelaCupom();
	}

	private void menuConcedeDescontoActionPerformed(ActionEvent evt) {
		// implementar
	}

	private void menuAbreCupomActionPerformed(ActionEvent evt) {
		BemaECF.abreCupom();
		iniciaVenda();
	}

	private void menuFechaCupomActionPerformed(ActionEvent evt) {
		// implementar
	}

	private void jTextField3FocusLost(FocusEvent evt) {
		BemaECF.vendeItem(jTextField1.getText(), jTextField2.getText(), "1700",
		"I", jTextField3.getText(), 2, jTextField4.getText(), "$", "0000");
		insereItemVendido();
		atualizaTotais();
	}

	private void atualizaTotais() {
		int quantidade = Integer.parseInt(jTextField3.getText());
		double valorUnitario = Double.parseDouble(jTextField4.getText());
		double valorTotalProduto = quantidade * valorUnitario;
		jTextField5.setText(String.valueOf(valorTotalProduto));
		totalGeral = totalGeral + valorTotalProduto;
		jLabel8.setText(String.valueOf(totalGeral));
	}

	private void insereItemVendido() {
		model.addElement(jTextField1.getText() + "  " + jTextField2.getText());
		model.addElement("     " + jTextField3.getText() + " X "
				+ jTextField4.getText() + "  " + jTextField5.getText());

		dVendaBean = new DetalheVendaBean();

		dVendaBean.setCodigoCabecalhoVenda(Integer.parseInt(jLabel7.getText()));
		dVendaBean.setCodigoProduto(jTextField1.getText());
		dVendaBean.setQuantidade(Integer.parseInt(jTextField3.getText()));
		dVendaBean.setValorUnitario(new Double(Double.parseDouble(jTextField4.getText())).doubleValue());
		dVendaBean.setValorTotal(Double.parseDouble(jTextField5.getText()));

		arrayDVendaBean.add(dVendaBean);
	}

	private static void insereItemCancelado(String item) {
		model.addElement("*******************************");
		model.addElement("Item Cancelado: " + item);
		model.addElement("*******************************");
	}

	private static void fechaCupom() {
		habilitarCamposPanelFechamento();
		jFormattedTextField1.requestFocus();
	}

	private void jFormattedTextField9FocusLost(FocusEvent evt) {
		verificaTotais();

	}

	public void verificaTotais() {
		double totais = Double.parseDouble(jFormattedTextField1.getText())
				+ Double.parseDouble(jFormattedTextField2.getText())
				+ Double.parseDouble(jFormattedTextField3.getText())
				+ Double.parseDouble(jFormattedTextField4.getText())
				+ Double.parseDouble(jFormattedTextField5.getText())
				+ Double.parseDouble(jFormattedTextField6.getText())
				+ Double.parseDouble(jFormattedTextField7.getText())
				+ Double.parseDouble(jFormattedTextField8.getText())
				+ Double.parseDouble(jFormattedTextField9.getText());

		if (totais != totalGeral) {
			JOptionPane.showMessageDialog(null, "Totais Divergentes. Corrija!");
			jFormattedTextField1.requestFocus();
		} else {
			terminaFechamentoCupom();
		}
	}

	private static void terminaFechamentoCupom() {
		ArrayList<FormasPagamento> a = new ArrayList<FormasPagamento>();

		if (!jFormattedTextField1.getText().equals("0,00")) {
			FormasPagamento f = new FormasPagamento();
			f.setDescricao("Dinheiro");
			f.setValor(jFormattedTextField1.getText());
			a.add(f);
		}
		if (!jFormattedTextField2.getText().equals("0,00")) {
			FormasPagamento f = new FormasPagamento();
			f.setDescricao("Cheque");
			f.setValor(jFormattedTextField2.getText());
			a.add(f);
		}
		if (!jFormattedTextField3.getText().equals("0,00")) {
			FormasPagamento f = new FormasPagamento();
			f.setDescricao("Cheque-Pré");
			f.setValor(jFormattedTextField3.getText());
			a.add(f);
		}
		if (!jFormattedTextField4.getText().equals("0,00")) {
			FormasPagamento f = new FormasPagamento();
			f.setDescricao("Ticket");
			f.setValor(jFormattedTextField4.getText());
			a.add(f);
		}
		if (!jFormattedTextField5.getText().equals("0,00")) {
			FormasPagamento f = new FormasPagamento();
			f.setDescricao("Cartão");
			f.setValor(jFormattedTextField5.getText());
			a.add(f);
		}

		BemaECF.fechaCupom("D", "$", vlrDesconto, "Venda de Número "
				+ jLabel7.getText(), a);

		cVendaBean.setCodigo(Integer.parseInt(jLabel7.getText()));
		cVendaBean.setValorVenda(Double.parseDouble(jLabel8.getText()));
		cVendaBean.setDescontoVenda(Double.parseDouble(vlrDesconto));
		cVendaBean.setTotalVenda(Double.parseDouble(jLabel8.getText()));

		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date d = new java.util.Date();
		Date data = Date.valueOf(formato.format(d));
		cVendaBean.setDataVenda(data);
		controle.fechaVenda(cVendaBean, arrayDVendaBean);
		arrayDVendaBean = null;
		viewPadrao();
	}

	public static void iniciaVenda() {
		cVendaBean = controle.iniciaVenda();
		jLabel7.setText(String.valueOf(cVendaBean.getCodigo()));
		arrayDVendaBean = new ArrayList<DetalheVendaBean>();
	}

	private void jTextField1FocusLost(FocusEvent evt) {
		if (!jTextField1.getText().equals("")) {
			produtoBean = controle.retornaProdutoPeloCodigo(jTextField1.getText());
			jTextField2.setText(produtoBean.getDescricao());
			jTextField4.setText(String.valueOf(produtoBean.getValorVenda()));
			setarImagem(jTextField1.getText() + ".jpg");
		}
	}

	private static void viewPadrao() {
		jTextField1.setText("");
		jTextField2.setText("");
		jTextField3.setText("1");
		jTextField4.setText("0.00");
		jTextField5.setText("0.00");
		//
		model.clear();
		//
		jPanel6.setVisible(false);
		//
		jLabel7.setText("0000000000");
		jLabel8.setText("0.00");
		//
		jFormattedTextField1.setText("0.00");
		jFormattedTextField2.setText("0.00");
		jFormattedTextField3.setText("0.00");
		jFormattedTextField4.setText("0.00");
		jFormattedTextField5.setText("0.00");
		jFormattedTextField6.setText("0.00");
		jFormattedTextField7.setText("0.00");
		jFormattedTextField8.setText("0.00");
		jFormattedTextField9.setText("0.00");
		jFormattedTextField10.setText("0.00");
		jFormattedTextField11.setText("0.00");
		jFormattedTextField12.setText("0.00");
		jFormattedTextField13.setText("0.00");
		jFormattedTextField14.setText("0.00");
		//
		desabilitarCamposPanelFechamento();
		//
		setarImagem("noimage.bmp");
	}

	private static void setarImagem(String nome) {
		String caminho = System.getProperty("user.dir") + "\\src\\imagens\\";
		String imagem = caminho + nome;
		ImageIcon img = new ImageIcon(imagem);
		if (img.getIconHeight() < 0) {
			imagem = caminho + "noimage.bmp";
			img = new ImageIcon(imagem);
		}
		jLabel23.setIcon(img);
	}

	private static void desabilitarCamposPanelFechamento() {
		jFormattedTextField1.setEnabled(false);
		jFormattedTextField2.setEnabled(false);
		jFormattedTextField3.setEnabled(false);
		jFormattedTextField4.setEnabled(false);
		jFormattedTextField5.setEnabled(false);
		jFormattedTextField6.setEnabled(false);
		jFormattedTextField7.setEnabled(false);
		jFormattedTextField8.setEnabled(false);
		jFormattedTextField9.setEnabled(false);
		jFormattedTextField10.setEnabled(false);
		jFormattedTextField11.setEnabled(false);
		jFormattedTextField12.setEnabled(false);
		jFormattedTextField13.setEnabled(false);
		jFormattedTextField14.setEnabled(false);
	}

	private static void habilitarCamposPanelFechamento() {
		jFormattedTextField1.setEnabled(true);
		jFormattedTextField2.setEnabled(true);
		jFormattedTextField3.setEnabled(true);
		jFormattedTextField4.setEnabled(true);
		jFormattedTextField5.setEnabled(true);
		jFormattedTextField6.setEnabled(true);
		jFormattedTextField7.setEnabled(true);
		jFormattedTextField8.setEnabled(true);
		jFormattedTextField9.setEnabled(true);
		jFormattedTextField10.setEnabled(true);
		jFormattedTextField11.setEnabled(true);
		jFormattedTextField12.setEnabled(true);
		jFormattedTextField13.setEnabled(true);
		jFormattedTextField14.setEnabled(true);
	}

}

class FormasPagamento {
	private String descricao;
	private String valor;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

}
