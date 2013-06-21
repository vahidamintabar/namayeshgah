package edu.sharif.ce.ood.taghi.namayeshgah.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.SwingConstants;

public class BaseUI extends JFrame {

	protected JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BaseUI frame = new BaseUI();
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
	public BaseUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.EAST);
		
		JButton EditProcessButton = new JButton("فرآیندها");
		EditProcessButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel.setLayout(new GridLayout(20, 1, 10, 5));
		
		JButton newShowPlace = new JButton("تعریف نمایشگاه");
		newShowPlace.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel.add(newShowPlace);
		panel.add(EditProcessButton);
		
		JButton PropetiesButton = new JButton("ویژگی ها");
		PropetiesButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel.add(PropetiesButton);
		
		JButton button = new JButton("تیم اجرایی");
		button.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel.add(button);
		
		JButton ProcessElectionButton = new JButton("<html><div style=\"text-align:center;\">\r\nرای‌گیری\r\n<br>\r\nمشخصات و فرآیند\r\n</div></html>");
		ProcessElectionButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panel.add(ProcessElectionButton);
		
		JButton teamElectionButton = new JButton("<html><div style=\"text-align:center;\">\r\nرای‌گیری\r\n<br>\r\nتیم اجرایی\r\n</div></html>");
		teamElectionButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel.add(teamElectionButton);
		
		JButton button_1 = new JButton("اطلاع رسانی");
		panel.add(button_1);
		
		JButton button_2 = new JButton("اجرایی");
		panel.add(button_2);
		
		JButton button_4 = new JButton("نظرسنجی");
		panel.add(button_4);
		
		JButton button_3 = new JButton("پیغام ها");
		panel.add(button_3);
		
		JButton button_5 = new JButton("بازرسی");
		panel.add(button_5);
		
		JButton button_6 = new JButton("انبار");
		panel.add(button_6);
		
		JButton button_7 = new JButton("مالی");
		panel.add(button_7);
		
		JButton button_8 = new JButton("شرکت در نمایشگاه");
		panel.add(button_8);
		
		JButton button_9 = new JButton("درخواست غرفه و سالن");
		button_9.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panel.add(button_9);
		
		JButton button_10 = new JButton("تخصیص سالن و غرفه");
		panel.add(button_10);
		
		JButton button_11 = new JButton("نقشه");
		panel.add(button_11);
		
		JButton button_12 = new JButton("پست");
		panel.add(button_12);
	}

}