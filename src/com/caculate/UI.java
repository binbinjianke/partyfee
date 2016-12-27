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
		setTitle("党费计算机");
		setBounds(0,0,1000,200);
		Container cp=getContentPane();
		getContentPane().setLayout(new GridLayout(4,1,5,3));
		JPanel p1 = new JPanel(new FlowLayout(0,10,10));
		JPanel p2 = new JPanel(new FlowLayout(0,10,10));
		JPanel p3 = new JPanel(new FlowLayout(0,10,10));
		JPanel p4 = new JPanel(new FlowLayout(0,10,10));
		JLabel infoone = new JLabel("本工具旨在计算党费，其算法如下：每月工资收入（税后）在3000元以下（含3000元）者，交纳月工资收入的0.5%；3000元以上至5000元（含5000元）者，交纳1%；");
		JLabel infotwo = new JLabel("5000元以上至10000元（含10000元）者，交纳1.5%；10000元以上者，交纳2%。");
		JLabel tipone = new JLabel("党费计算基数（元）:"); 
		JLabel tiptwo = new JLabel("需交纳党费（元）:"); 
	    final JTextField jt1=new JTextField("",35);
	    JButton jb=new JButton("计算");
	    final JTextField jt2=new JTextField("在这里显示计算结果",35);
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
