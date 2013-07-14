package edu.sharif.ce.ood.taghi.namayeshgah.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

public class StartShowPlace extends BaseUI {

	// private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartShowPlace frame = new StartShowPlace();
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
	public StartShowPlace() {
		super();
		setTitle("اجرای نمایشگاه");
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new MigLayout("", "[][grow][50px:n:100px][]", "[][]"));
		
		JComboBox comboBox = new JComboBox();
		panel.add(comboBox, "cell 1 0,alignx right");
		
		JLabel label = new JLabel("نمایشگاه");
		panel.add(label, "cell 2 0");
		
		JButton button_1 = new JButton("خاتمه");
		panel.add(button_1, "flowx,cell 1 1");
		
		JButton button = new JButton("اجرا");
		panel.add(button, "cell 1 1,alignx right");
	}

}
