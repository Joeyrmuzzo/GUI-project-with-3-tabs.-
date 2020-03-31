package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JRadioButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class CourseProject1 extends JFrame {

	private JPanel contentPane;
	private JTextField CustomerName;
	private JTextField CustomerAddress;
	private JTextField FloorLngth;
	private JTextField FloorWidth;
	private JTextField txtOrderSummary;
	private JTextField CalcArea;
	private JTextField CalcCost;
	private JTextField txtOrdrList;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CourseProject1 frame = new CourseProject1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CourseProject1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 500);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmOpen = new JMenuItem("Open");
		mnFile.add(mntmOpen);
		
		JMenuItem mntmSave = new JMenuItem("Save");
		mnFile.add(mntmSave);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) 
			{
				String command = e.getActionCommand();
				switch (command) 
				{
				case "Exit":
					System.exit(0);
					break;
				default:
					break;
				}
			}
			});
		mnFile.add(mntmExit);
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 982, 427);
		contentPane.add(tabbedPane);
		
		JPanel CustInfo = new JPanel();
		tabbedPane.addTab("Customer Information", null, CustInfo, null);
		CustInfo.setLayout(null);
		
		JLabel lblCustomerName = new JLabel("Customer Name:");
		lblCustomerName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCustomerName.setBounds(12, 29, 188, 16);
		CustInfo.add(lblCustomerName);
		
		JLabel lblCustomerAddress = new JLabel("Customer Address:");
		lblCustomerAddress.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCustomerAddress.setBounds(12, 71, 149, 16);
		CustInfo.add(lblCustomerAddress);
		
		JLabel lblFloorLength = new JLabel("Floor Length:");
		lblFloorLength.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFloorLength.setBounds(12, 166, 129, 32);
		CustInfo.add(lblFloorLength);
		
		JLabel lblFloorWidth = new JLabel("Floor Width:");
		lblFloorWidth.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFloorWidth.setBounds(12, 211, 149, 16);
		CustInfo.add(lblFloorWidth);
		
		CustomerName = new JTextField();
		CustomerName.setBounds(177, 28, 116, 22);
		CustInfo.add(CustomerName);
		CustomerName.setColumns(10);
		
		CustomerAddress = new JTextField();
		CustomerAddress.setBounds(177, 70, 116, 22);
		CustInfo.add(CustomerAddress);
		CustomerAddress.setColumns(10);
		
		FloorLngth = new JTextField();
		FloorLngth.setBounds(177, 173, 116, 22);
		CustInfo.add(FloorLngth);
		FloorLngth.setColumns(10);
		
		FloorWidth = new JTextField();
		FloorWidth.setBounds(177, 210, 116, 22);
		CustInfo.add(FloorWidth);
		FloorWidth.setColumns(10);
		
		JRadioButton WoodFlooring = new JRadioButton("Wood Flooring");
		WoodFlooring.setFont(new Font("Tahoma", Font.PLAIN, 18));
		WoodFlooring.setBounds(12, 264, 188, 25);
		CustInfo.add(WoodFlooring);
		
		JRadioButton Carpet = new JRadioButton("Carpet Flooring");
		Carpet.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Carpet.setBounds(12, 294, 204, 25);
		CustInfo.add(Carpet);
		
		ButtonGroup grpRadios = new ButtonGroup();
		grpRadios.add(WoodFlooring);
		grpRadios.add(Carpet);
		
		JButton btnSubmitOrder = new JButton("Submit Order");
		btnSubmitOrder.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSubmitOrder.setBounds(427, 331, 141, 25);
		CustInfo.add(btnSubmitOrder);
		
		JButton btnCalculateArea = new JButton("Calculate Area");
		btnCalculateArea.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCalculateArea.setBounds(453, 27, 164, 25);
		CustInfo.add(btnCalculateArea);
		
		JButton btnCalculateCost = new JButton("Calculate Cost");
		btnCalculateCost.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCalculateCost.setBounds(453, 84, 164, 25);
		CustInfo.add(btnCalculateCost);
		
		CalcArea = new JTextField();
		CalcArea.setBounds(652, 28, 116, 22);
		CustInfo.add(CalcArea);
		CalcArea.setColumns(10);
		
		CalcCost = new JTextField();
		CalcCost.setBounds(652, 85, 116, 22);
		CustInfo.add(CalcCost);
		CalcCost.setColumns(10);
		
		JPanel OrderSummary = new JPanel();
		tabbedPane.addTab("Order Summary", null, OrderSummary, null);
		OrderSummary.setLayout(null);
		
		JButton btnDisplayOrdersummary = new JButton("Display Order Summary");
		btnDisplayOrdersummary.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDisplayOrdersummary.setBounds(344, 359, 237, 25);
		OrderSummary.add(btnDisplayOrdersummary);
		
		txtOrderSummary = new JTextField();
		txtOrderSummary.setBounds(51, 31, 854, 290);
		OrderSummary.add(txtOrderSummary);
		txtOrderSummary.setColumns(10);
		//radio button group
		
		JPanel OrderList = new JPanel();
		tabbedPane.addTab("Order List", null, OrderList, null);
		OrderList.setLayout(null);
		
		txtOrdrList = new JTextField();
		txtOrdrList.setBounds(37, 13, 900, 312);
		OrderList.add(txtOrdrList);
		txtOrdrList.setColumns(10);
		
		JButton btnDisplayOrderList = new JButton("Display Order List");
		btnDisplayOrderList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnDisplayOrderList.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDisplayOrderList.setBounds(385, 359, 214, 25);
		OrderList.add(btnDisplayOrderList);
	}
}