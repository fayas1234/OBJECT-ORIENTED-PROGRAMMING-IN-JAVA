//Program to implement Traffic Signal

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Traffic extends JFrame implements ActionListener
{
	JRadioButton r1,r2,r3,r4;
	JLabel l;
	JButton b;
	private Container c;
	
	Traffic()
	{
		super("Traffic Signal");
		c=getContentPane();
		
		r1=new JRadioButton("RED");
		r2=new JRadioButton("YELLOW");
		r3=new JRadioButton("GREEN");
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);bg.add(r2);bg.add(r3);
		
		b=new JButton("CLOSE");
		
		r1.addActionListener(this);
		r2.addActionListener(this);
		r3.addActionListener(this);
		
		b.addActionListener(this);
		
		l=new JLabel("Traffic Signal");
		add(r1);add(r2);add(r3);add(l);add(b);
		setSize(300,300);
		setLayout(new FlowLayout());
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String msg=e.getActionCommand();
		
		if(msg.equals("RED"))
			c.setBackground(Color.RED);
		
		else if(msg.equals("YELLOW"))
			c.setBackground(Color.YELLOW);
		
		else if(msg.equals("GREEN"))
			c.setBackground(Color.GREEN);
		
		else if(e.getSource()==b)
			System.exit(0);
	}
}

class TrafficSignal
{
	public static void main(String args[])
	{
		Traffic tf=new Traffic();
	}
}
