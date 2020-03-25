package Resturant;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.print.Paper;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import javax.swing.Icon;

public class Resturant_Management {

	private JFrame frame;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblTax;
	private JTextField textField_4;
	private JTextField textField_5;
	private JComboBox comboBox;
	private JLabel drinkslabel;
	private JLabel meallabel;
	private JLabel lblNewLabel_2;
	private JTextField textField_3;
	private JTextField textField_6;
	protected JTextArea textArea_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Resturant_Management window = new Resturant_Management();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Resturant_Management() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1368, 689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 9));
		panel.setBounds(40, 62, 626, 301);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblChickenBurger = new JLabel("Chicken Burger");
		lblChickenBurger.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblChickenBurger.setBounds(31, 36, 93, 14);
		panel.add(lblChickenBurger);
		
		JLabel label = new JLabel("Chicken Burger Meal");
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setBounds(31, 61, 136, 14);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Chicken Dum Biriyani");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_1.setBounds(31, 84, 136, 14);
		panel.add(label_1);
		
		JTextField textField = new JTextField();
		textField.setText("0");
		textField.setBounds(282, 34, 307, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("0");
		textField_1.setColumns(10);
		textField_1.setBounds(282, 59, 307, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("0");
		textField_2.setColumns(10);
		textField_2.setBounds(282, 82, 307, 20);
		panel.add(textField_2);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"-Select a Drinks-", "Apple Juice", "Orange Juice", "Banana Juice", "Pineapple Juice", "Mango juice", "Badam Milk Shake", "Oreo Shake", "Mango Shake", "Pudina Juice", "Sugarcane  Juice", "Carrot Juice", "Grape  Juice", "Lemon Juice"}));
		comboBox.setBounds(31, 201, 158, 22);
		panel.add(comboBox);
		
		JTextArea textArea = new JTextArea();
		textArea.setText("0");
		textArea.setBounds(298, 203, 152, 20);
		panel.add(textArea);
		
		JLabel lblDrinksName = new JLabel("Drinks Name");
		lblDrinksName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDrinksName.setBounds(31, 177, 145, 20);
		panel.add(lblDrinksName);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblQuantity.setBounds(298, 172, 145, 20);
		panel.add(lblQuantity);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("HomeDelivery");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 12));
		chckbxNewCheckBox.setBounds(27, 244, 109, 23);
		panel.add(chckbxNewCheckBox);
		
		JCheckBox chckbxGst = new JCheckBox("GST");
		chckbxGst.setFont(new Font("Tahoma", Font.BOLD, 12));
		chckbxGst.setBounds(303, 245, 49, 23);
		panel.add(chckbxGst);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(31, 164, 574, 2);
		panel.add(separator);
		
		JLabel lblVegRoundMeal = new JLabel("Veg Round Meal");
		lblVegRoundMeal.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblVegRoundMeal.setBounds(31, 109, 136, 14);
		panel.add(lblVegRoundMeal);
		
		textField_4 = new JTextField();
		textField_4.setText("0");
		textField_4.setColumns(10);
		textField_4.setBounds(282, 107, 307, 20);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setText("0");
		textField_5.setColumns(10);
		textField_5.setBounds(282, 132, 307, 20);
		panel.add(textField_5);
		
		JLabel lblNonvegRoundMeal = new JLabel("Non-Veg Round Meal");
		lblNonvegRoundMeal.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNonvegRoundMeal.setBounds(31, 134, 136, 14);
		panel.add(lblNonvegRoundMeal);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 9));
		panel_1.setBounds(40, 374, 626, 168);
		frame.getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 9));
		panel_2.setBounds(672, 62, 267, 301);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"-Choose an Currency-", "INDIA(Indian Rupee)", "USA(United States Dollar)", "CHINA(Chnese yuan)", "UK(British Pound)", "CANADA(Canadian Dollar)", "BULGERIA(Bulgerian lev)", "CAMBODIA(Cambodian riel)", "CAMEROON(Central African CFA Franc)", "COLOMBIA(Colombian peso)", "CUBA(Cuban peso)"}));
		comboBox_1.setBounds(39, 57, 158, 22);
		panel_2.add(comboBox_1);
		
		JLabel lblCurrencyConverter = new JLabel("Currency Converter");
		lblCurrencyConverter.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblCurrencyConverter.setBounds(20, 24, 247, 22);
		panel_2.add(lblCurrencyConverter);
		
		JLabel label_4 = new JLabel("");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_4.setBounds(20, 156, 210, 51);
		panel_2.add(label_4);
		
		JButton btnNewButton = new JButton("Convert");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				
			double INDIA=1.0;
			double	USA=.0149;
			double CHINA=.0972;
			double	UK=.0105;
			double	CANADA=.0198;
			double BULGERIA=.0264;
			double	CAMBODIA=59.5928;
			double	CAMEROON=.2265;
			double	COLOMBIA=47.3778;
			double	CUBA=.014;
		
			if(comboBox_1.getSelectedItem().equals("INDIA(Indian Rupee)")) {
				double cur=Double.parseDouble(textField_3.getText());
				double inc=cur*INDIA;
				label_4.setText(String.format("IND %.2f",inc));
				
			}
			
			if(comboBox_1.getSelectedItem().equals("USA(United States Dollar)")) {
				double cur=Double.parseDouble(textField_3.getText());
				double usc=cur*USA;
				label_4.setText(String.format("$ %.2f",usc));
				
			}
			

			if(comboBox_1.getSelectedItem().equals("CHINA(Chnese yuan)")) {
				double cur=Double.parseDouble(textField_3.getText());
				double cc=cur*CHINA;
				label_4.setText(String.format("CHI %.2f",cc));
				
			}
			
			if(comboBox_1.getSelectedItem().equals("UK(British Pound)")) {
				double cur=Double.parseDouble(textField_3.getText());
				double ukc=cur*UK;
				label_4.setText(String.format("UK %.2f",ukc));
				
			}
			
			if(comboBox_1.getSelectedItem().equals("CANADA(Canadian Dollar)")) {
				double cur=Double.parseDouble(textField_3.getText());
				double cac=cur*CANADA;
				label_4.setText(String.format("CAN %.2f",cac));
				
			}
			
			if(comboBox_1.getSelectedItem().equals("BULGERIA(Bulgerian lev)")) {
				double cur=Double.parseDouble(textField_3.getText());
				double bc=cur*BULGERIA;
				label_4.setText(String.format("BUL %.2f",bc));
				
			}
			
			if(comboBox_1.getSelectedItem().equals("CAMBODIA(Cambodian riel)")) {
				double cur=Double.parseDouble(textField_3.getText());
				double cdc=cur*CAMBODIA;
				label_4.setText(String.format("CBD %.2f",cdc));
				
			}
			
			if(comboBox_1.getSelectedItem().equals("CAMEROON(Central African CFA Franc)")) {
				double cur=Double.parseDouble(textField_3.getText());
				double cmc=cur*CAMEROON;
				label_4.setText(String.format("CAM %.2f",cmc));
				
			}
			
			if(comboBox_1.getSelectedItem().equals("COLOMBIA(Colombian peso)")) {
				double cur=Double.parseDouble(textField_3.getText());
				double cuc=cur*COLOMBIA;
				label_4.setText(String.format("CLMB %.2f",cuc));
				
			}
			
			if(comboBox_1.getSelectedItem().equals("CUBA(Cuban peso)")) {
				double cur=Double.parseDouble(textField_3.getText());
				double cubc=cur*CUBA;
				label_4.setText(String.format("CUBA %.2f",cubc));
				
			}
			
			if(comboBox_1.getSelectedItem().equals("-Choose an Currency-")) {
				label_4.setText(null);
				
			}
			
			
			}
		});
		btnNewButton.setBounds(25, 240, 89, 23);
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_3.setText(null);
				comboBox_1.setSelectedItem("-Choose an Currency-");
				label_4.setText("Thanks for usuing our"+"\n"+"currency coverter !!!!!");
			}
		});
		btnNewButton_1.setBounds(141, 240, 89, 23);
		panel_2.add(btnNewButton_1);
		
		textField_3 = new JTextField();
		textField_3.setText("0");
		textField_3.setBounds(39, 93, 191, 34);
		panel_2.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 9));
		panel_3.setBounds(676, 374, 263, 169);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		lblTax = new JLabel("GST");
		lblTax.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblTax.setBounds(25, 39, 50, 27);
		panel_3.add(lblTax);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(116, 39, 137, 25);
		lblNewLabel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_3.add(lblNewLabel_3);
		
		JLabel lblSubtotal = new JLabel("SubTotal");
		lblSubtotal.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblSubtotal.setBounds(25, 77, 93, 27);
		panel_3.add(lblSubtotal);
		
		JLabel label_5 = new JLabel("");
		label_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_5.setBounds(116, 77, 137, 25);
		panel_3.add(label_5);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblTotal.setBounds(25, 115, 64, 27);
		panel_3.add(lblTotal);
		
		JLabel label_7 = new JLabel("");
		label_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_7.setBounds(116, 115, 137, 25);
		panel_3.add(label_7);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 9));
		panel_4.setBounds(40, 553, 1220, 91);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("Total");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double cb=Double.parseDouble(textField.getText());
				double  ocb=80;
					double cb_1=cb*ocb;
					String cb1=String.format("%.2f",cb_1);
					meallabel.setText(cb1);
				
					double cbm=Double.parseDouble(textField_1.getText());
					double  ocbm=120;
						double cbm_1=cbm*ocbm;
						double cbbm_1=cbm_1+cb_1;
						String cbm1=String.format("%.2f",cbbm_1);
						meallabel.setText(cbm1);
					
						double cdb=Double.parseDouble(textField_2.getText());
						double  ocdb=120;
							double cdb_1=cdb*ocdb;
							double cdbm_1=cdb_1+cbbm_1;
							String cdbm1=String.format("%.2f",cbbm_1);
							meallabel.setText(cdbm1);
						
							double vrm=Double.parseDouble(textField_4.getText());
							double  ovrm=140;
								double tvrm=vrm*ovrm;
								double tvrm_1=tvrm+cdbm_1;
								String tvrm1=String.format("%.2f",tvrm_1);
								meallabel.setText(tvrm1);
								
								double nvrm=Double.parseDouble(textField_5.getText());
								double  onvrm=180;
									double tnvrm=nvrm*onvrm;
									double tnvrm_1=tnvrm+tvrm_1;
									String tnvrm1=String.format("%.2f",tnvrm_1);
									meallabel.setText(tnvrm1);
					//------------home delivery--------------			
									
				
						if(chckbxNewCheckBox.isSelected()) {
							double hdel=20.0;
							String hdelve=String.format("%.2f", hdel);
							lblNewLabel_2.setText(hdelve);
						}
						else {
							lblNewLabel_2.setText("0");
						}
						//--------------------------------------------------------
						//--------------drinks--------------------------
						double drinks=Double.parseDouble(textArea.getText());
					double	AppleJuice=25.0*drinks;
					double  OrangeJuice=20.0*drinks;
					double  BananaJuice=25.0*drinks;
					double	PineappleJuice=30.0*drinks;
					double	Mangojuice=30.0*drinks;
					double	BadamMilkShake=40.0*drinks;
					double	OreoShake=35.0*drinks;
					double	MangoShake=35.0*drinks;
					double	PudinaJuice=25.0*drinks;
					double	SugarcaneJuice=25.0*drinks;
					double	CarrotJuice=25.0*drinks;
					double	GrapeJuice=25.0*drinks;
					double	LemonJuice=20.0*drinks;
						
			if(comboBox.getSelectedItem().equals("Apple Juice")) {
				String papp=String.format("%.2f",AppleJuice);
				drinkslabel.setText(papp);
			}
			if(comboBox.getSelectedItem().equals("Orange Juice")) {
				String poj=String.format("%.2f",OrangeJuice);
				drinkslabel.setText(poj);
			}
			if(comboBox.getSelectedItem().equals("Banana Juice")) {
				String pbj=String.format("%.2f",BananaJuice);
				drinkslabel.setText(pbj);
			}
			if(comboBox.getSelectedItem().equals("Pineapple Juice")) {
				String ppj=String.format("%.2f",PineappleJuice);
				drinkslabel.setText(ppj);
			}
			if(comboBox.getSelectedItem().equals("Mango juice")) {
				String pmj=String.format("%.2f",Mangojuice);
				drinkslabel.setText(pmj);
			}
			if(comboBox.getSelectedItem().equals("Badam Milk Shake")) {
				String pbms=String.format("%.2f",BadamMilkShake);
				drinkslabel.setText(pbms);
			}
			if(comboBox.getSelectedItem().equals("Oreo Shake")) {
				String pos=String.format("%.2f",OreoShake);
				drinkslabel.setText(pos);
			}
			if(comboBox.getSelectedItem().equals("Mango Shake")) {
				String pms=String.format("%.2f",MangoShake);
				drinkslabel.setText(pms);
			}
			if(comboBox.getSelectedItem().equals("Pudina Juice")) {
				String ppj=String.format("%.2f",PudinaJuice);
				drinkslabel.setText(ppj);}
			
			if(comboBox.getSelectedItem().equals("Sugarcane Juice")) {
					String pscj=String.format("%.2f",SugarcaneJuice);
					drinkslabel.setText(pscj);}
			
				if(comboBox.getSelectedItem().equals("Grape Juice")) {
						String pgj=String.format("%.2f",GrapeJuice);
						drinkslabel.setText(pgj);
			}
				if(comboBox.getSelectedItem().equals("Carrot Juice")) {
					String pcj=String.format("%.2f",CarrotJuice);
					drinkslabel.setText(pcj);
		}
				if(comboBox.getSelectedItem().equals("Lemon Juice")) {
					String plj=String.format("%.2f",LemonJuice);
					drinkslabel.setText(plj);
		}
				if(comboBox.getSelectedItem().equals("-Select a Drinks-")) {
					drinkslabel.setText("0");
					}
				//-------------------------------------------------------------
				String dr=drinkslabel.getText();
				double dr1=Double.parseDouble(dr);
				String dv=lblNewLabel_2.getText();
				double dv1=Double.parseDouble(dv);
				String  ml = meallabel.getText();
				double ml1=Double.parseDouble(ml);
				double tot=dr1+dv1+ml1;
				if(tot>0.0) {
					label_5.setText(String.format("%.2f",tot));
				}
				else {
					label_5.setText("0");
				}
				double gst=Double.parseDouble(label_5.getText());
				if(chckbxGst.isSelected()) {
					double tgst=tot*0.05;
					double gt=tot+tgst;
					lblNewLabel_3.setText(String.format("%.2f", tgst));
					label_7.setText(String.format("%.2f",gt));
				}
				else
					{
					lblNewLabel_3.setText("Please Check GST : ");
					double gt=tot;
					label_7.setText(String.format("%.2f", gt));
					}
				
				
				
				
				
				
			
				
				
				
			}
		});
		btnNewButton_2.setBounds(247, 36, 89, 23);
		panel_4.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Receipt");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
																
									
									
									
									
								
							
					
			}
		});
		btnNewButton_3.setBounds(424, 36, 89, 23);
		panel_4.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Reset");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lblNewLabel_3.setText("");
				label_5.setText("");
				label_7.setText("");
				label_4.setText("");
				drinkslabel.setText("");
				meallabel.setText("0");
				lblNewLabel_2.setText("");
				textField.setText("0");
				textField_1.setText("0");
				textField_2.setText("0");
				textField_4.setText("0");
				textField_5.setText("0");
				textArea.setText("0");
				textField_3.setText("0");
				comboBox.setSelectedItem("-Select a Drinks-");
				comboBox_1.setSelectedItem("-Choose an Currency-");
				
				
			}
		});
		btnNewButton_4.setBounds(633, 36, 89, 23);
		panel_4.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Exit");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_5.setBounds(848, 36, 89, 23);
		panel_4.add(btnNewButton_5);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 9));
		panel_5.setBounds(949, 62, 309, 475);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 27, 289, 437);
		panel_5.add(tabbedPane);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Receipt", null, panel_6, null);
		panel_6.setLayout(null);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(0, 11, 284, 387);
		panel_6.add(textArea_1);
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("Calculater", null, panel_7, null);
		panel_7.setLayout(null);
		
		textField_6 = new JTextField();
		textField_6.setText("0");
		textField_6.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_6.setColumns(10);
		textField_6.setBounds(0, 11, 284, 51);
		panel_7.add(textField_6);
		
		JButton button = new JButton("CE");
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.setBounds(10, 73, 52, 23);
		panel_7.add(button);
		
		JButton button_1 = new JButton("<<");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_1.setBounds(73, 74, 52, 23);
		panel_7.add(button_1);
		
		JButton button_2 = new JButton("%");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_2.setBounds(135, 74, 52, 23);
		panel_7.add(button_2);
		
		JButton button_3 = new JButton("/");
		button_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_3.setBounds(197, 73, 52, 23);
		panel_7.add(button_3);
		
		JButton button_4 = new JButton("*");
		button_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_4.setBounds(197, 116, 52, 23);
		panel_7.add(button_4);
		
		JButton button_5 = new JButton("9");
		button_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_5.setBounds(135, 118, 52, 23);
		panel_7.add(button_5);
		
		JButton button_6 = new JButton("8");
		button_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_6.setBounds(73, 118, 52, 23);
		panel_7.add(button_6);
		
		JButton button_7 = new JButton("7");
		button_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_7.setBounds(10, 117, 52, 23);
		panel_7.add(button_7);
		
		JButton button_8 = new JButton("4");
		button_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_8.setBounds(10, 161, 52, 23);
		panel_7.add(button_8);
		
		JButton button_9 = new JButton("5");
		button_9.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_9.setBounds(73, 161, 52, 23);
		panel_7.add(button_9);
		
		JButton button_10 = new JButton("6");
		button_10.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_10.setBounds(135, 161, 52, 23);
		panel_7.add(button_10);
		
		JButton button_11 = new JButton("-");
		button_11.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_11.setBounds(197, 160, 52, 23);
		panel_7.add(button_11);
		
		JButton button_12 = new JButton("+");
		button_12.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_12.setBounds(197, 201, 52, 23);
		panel_7.add(button_12);
		
		JButton button_13 = new JButton("3");
		button_13.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_13.setBounds(135, 202, 52, 23);
		panel_7.add(button_13);
		
		JButton button_14 = new JButton("2");
		button_14.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_14.setBounds(73, 202, 52, 23);
		panel_7.add(button_14);
		
		JButton button_15 = new JButton("1");
		button_15.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_15.setBounds(10, 202, 52, 23);
		panel_7.add(button_15);
		
		JButton button_16 = new JButton("0");
		button_16.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_16.setBounds(10, 252, 52, 23);
		panel_7.add(button_16);
		
		JButton button_17 = new JButton(".");
		button_17.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_17.setBounds(73, 252, 52, 23);
		panel_7.add(button_17);
		
		JButton button_18 = new JButton("=");
		button_18.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_18.setBounds(135, 235, 114, 40);
		panel_7.add(button_18);
		
		JLabel lblNewLabel = new JLabel("Kishan Restaurant Management System");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Plantagenet Cherokee", Font.BOLD, 60));
		lblNewLabel.setBounds(40, 0, 1228, 62);
		frame.getContentPane().add(lblNewLabel);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 10));
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Cost Of Drinks");
		lblNewLabel_1.setFont(new Font("Vani", Font.BOLD, 25));
		lblNewLabel_1.setBackground(new Color(240, 240, 240));
		lblNewLabel_1.setBounds(16, 25, 223, 46);
		panel_1.add(lblNewLabel_1);
		
		drinkslabel = new JLabel("");
		drinkslabel.setForeground(new Color(0, 0, 0));
		drinkslabel.setBackground(Color.BLACK);
		drinkslabel.setBounds(322, 25, 261, 31);
		drinkslabel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.add(drinkslabel);
		
		JLabel lblNewLabel_4 = new JLabel("Cost of Meals");
		lblNewLabel_4.setFont(new Font("Vani", Font.BOLD, 25));
		lblNewLabel_4.setBounds(16, 69, 186, 31);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Delivey Charges");
		lblNewLabel_5.setFont(new Font("Vani", Font.BOLD, 25));
		lblNewLabel_5.setBounds(16, 111, 205, 31);
		panel_1.add(lblNewLabel_5);
		
		meallabel = new JLabel("");
		meallabel.setBounds(322, 67, 261, 31);
		meallabel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.add(meallabel);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(321, 111, 262, 31);
		lblNewLabel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.add(lblNewLabel_2);
		
		
	}
}
