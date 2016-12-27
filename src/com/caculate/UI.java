package com.caculate;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class UI extends JFrame {
	private static final long serialVersionUID = 1L;
	public void CreateUI(){
		setTitle("���Ѽ����");
		setBounds(0,0,1000,200);
		Container cp=getContentPane();
		getContentPane().setLayout(new GridLayout(4,1,5,3));
		JPanel p1 = new JPanel(new FlowLayout(0,10,10));
		JPanel p2 = new JPanel(new FlowLayout(0,10,10));
		JPanel p3 = new JPanel(new FlowLayout(0,10,10));
		JPanel p4 = new JPanel(new FlowLayout(0,10,10));
		JLabel infoone = new JLabel("������ּ�ڼ��㵳�ѣ����㷨���£�ÿ�¹������루˰����3000Ԫ���£���3000Ԫ���ߣ������¹��������0.5%��3000Ԫ������5000Ԫ����5000Ԫ���ߣ�����1%��");
		JLabel infotwo = new JLabel("5000Ԫ������10000Ԫ����10000Ԫ���ߣ�����1.5%��10000Ԫ�����ߣ�����2%��");
		JLabel tipone = new JLabel("���Ѽ��������Ԫ��:"); 
		JLabel tiptwo = new JLabel("�轻�ɵ��ѣ�Ԫ��:"); 
	    final JTextField jt1=new JTextField("",35);
	    JButton jb=new JButton("����");
	    final JTextField jt2=new JTextField("��������ʾ������",35);
        cp.add(p1);
        cp.add(p2);
        cp.add(p3);
        cp.add(p4);
	    p1.add(infoone);
	    p2.add(infotwo);
	    p3.add(tipone);
	    p3.add(jt1);
	    p3.add(jb);
	    p4.add(tiptwo);
	    p4.add(jt2);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		jb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				String str = jt1.getText();
				Caculate c = new Caculate();
				String result = c.partyFeeCaulate(str);
				jt2.setText(result);
			}
		});	
	}

	public static void main(String[] args) {
		UI demo = new UI();
		demo.CreateUI();
	}
	
}
