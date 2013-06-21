package edu.sharif.ce.ood.taghi.namayeshgah.ui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.BoxLayout;
import net.miginfocom.swing.MigLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.SpringLayout;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Map extends BaseUI {

	// private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Map frame = new Map();
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
	public Map() {
		super();
		setTitle("درخواست سالن یا غرفه");
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new MigLayout("", "[][grow][]", "[][grow][]"));
		
		JList list = new JList();
		panel.add(list, "cell 1 1,grow");
		
		JButton button = new JButton("ویرایش");
		panel.add(button, "flowx,cell 1 2,alignx center");
		
		JButton button_1 = new JButton("حذف");
		panel.add(button_1, "cell 1 2");
		
		JButton button_2 = new JButton("اضافه");
		panel.add(button_2, "cell 1 2");
		
		JComboBox comboBox = new JComboBox();
		panel.add(comboBox, "flowx,cell 1 0,alignx center");
		
		JLabel label = new JLabel("نمایشگاه");
		panel.add(label, "cell 1 0");
	}

}
