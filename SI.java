//Program to implement claculator

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Calc extends JFrame implements ActionListener
{
	JTextField t1,t2,t3,t4;
	JLabel l1,l2,l3;
	JButton b1,b2,b3,b4,b5;
	
	Calc()
	{
		super("Calculator");
		
		l1=new JLabel("A=");
		t1=new JTextField(10);
		l2=new JLabel("B=");
		t2=new JTextField(10);
		b5=new JButton("X");
		t3=new JTextField(20);
		t4=new JTextField(25);
		b5.addActionListener(this);
		b1=new JButton("+");
		b2=new JButton("-");
		b3=new JButton("/");
		b4=new JButton("*");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		add(l1);add(t1);add(l2);add(t2);add(t3);
		add(t4);add(b1);add(b2);add(b3);add(b4);add(b5);
		
		setSize(300,300);
		setLayout(new FlowLayout());
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {  
        if(e.getSource()==b5)
			System.exit(0);
		double a,b,c=0.0;
		
		try{
		String msg1=t1.getText();  
        String msg2=t2.getText();
        a=Double.parseDouble(msg1);  
        b=Double.parseDouble(msg2);
		  
        if(e.getSource()==b1){
			
            c=(float)a+b;
			t4.setText("Success"); 	
			String result=String.valueOf(c);  
			t3.setText(result);
		
        }
		
		else if(e.getSource()==b2){  
            c=(float)a-b;  
			t4.setText("Success"); 
			String result=String.valueOf(c);  
			t3.setText(result);
        }
		
		else if(e.getSource()==b3)
		{
			if(b==0){
				t4.setText("can't Divide by zero"); 
				
				t3.setText("");
				
			}
			else{
            c=(float)a/b;
			t4.setText("Success"); 	
			String result=String.valueOf(c);  
			t3.setText(result);
			}
		}
		
		else if(e.getSource()==b4){
            c=(float)a*b;
			t4.setText("Success"); 
			String result=String.valueOf(c);  
			t3.setText(result);
        }
		
       
		}
		
		catch(Exception ex)
		{
			t4.setText("Invalid input");
		}
        
    } 
	
	
	
}


class SI
{
	public static void main(String args[])
	{
		new Calc();
	}
	
}