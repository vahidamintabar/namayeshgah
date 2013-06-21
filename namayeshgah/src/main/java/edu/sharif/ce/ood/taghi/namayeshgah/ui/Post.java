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

public class Post extends BaseUI {
	private JTextField textField;
	private JTextField textField_1;

	// private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Post frame = new Post();
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
	public Post() {
		super();
		setTitle("پست");
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new MigLayout("", "[][grow][50px:n:100px][]", "[grow][][][][grow 20][grow 20]"));
		
		JList list = new JList();
		panel.add(list, "cell 1 0,grow");
		
		JLabel label = new JLabel("فیش ها");
		panel.add(label, "cell 2 0,aligny top");
		
		JButton button = new JButton("حذف");
		panel.add(button, "flowx,cell 1 1,alignx center");
		
		JButton button_1 = new JButton("تغییر");
		panel.add(button_1, "cell 1 1");
		
		JButton button_2 = new JButton("اضافه");
		panel.add(button_2, "cell 1 1");
		
		textField = new JTextField();
		panel.add(textField, "cell 1 2,growx");
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("شماره");
		panel.add(label_1, "cell 2 2");
		
		textField_1 = new JTextField();
		panel.add(textField_1, "cell 1 3,growx");
		textField_1.setColumns(10);
		
		JLabel label_4 = new JLabel("متقاضی");
		panel.add(label_4, "cell 2 3");
		
		JTextArea textArea = new JTextArea();
		panel.add(textArea, "cell 1 4,grow");
		
		JLabel label_2 = new JLabel("توضیحات");
		panel.add(label_2, "cell 2 4,aligny top");
		
		JTextArea textArea_1 = new JTextArea();
		panel.add(textArea_1, "cell 1 5,grow");
		
		JLabel label_3 = new JLabel("آدرس مقصد");
		panel.add(label_3, "cell 2 5,aligny top");
	}

}