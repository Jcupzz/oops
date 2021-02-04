import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
public class MyCalculator implements ActionListener
{
	String button=" ",str=" ",screen=" ",btn=" ";
	int num=0,result=0;
	boolean state;
	JFrame jframe=new JFrame("Calculator");
	JTextField jtextfield=new JTextField();
	JButton one=new JButton("1");
	JButton two=new JButton("2");
	JButton three=new JButton("3");
	JButton four=new JButton("4");
	JButton five=new JButton("5");
	JButton six=new JButton("6");
	JButton seven=new JButton("7");
	JButton eight=new JButton("8");
	JButton nine=new JButton("9");
	JButton zero=new JButton("0");
	JButton add=new JButton("+");
	JButton substract=new JButton("-");
	JButton multiply=new JButton("*");
	JButton divide=new JButton("/");
	JButton period = new JButton(".");
	JButton equalto=new JButton("=");
	JButton clear=new JButton("C");
	MyCalculator()
	{
		//setting frame
		jframe.setLayout(null);
		jframe.setSize(300,400);
		jframe.setLocation(500,100);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.add(one);
	 	jframe.add(two);
		jframe.add(three);
		jframe.add(four);
		jframe.add(five);
		jframe.add(six);
		jframe.add(seven);
		jframe.add(eight);
		jframe.add(nine);
		jframe.add(zero);
		jframe.add(add);
		jframe.add(substract);
		jframe.add(multiply);
		jframe.add(divide);
		jframe.add(equalto);
		jframe.add(clear);
		jframe.add(jtextfield);
		jframe.add(period);
		
		//setting buttons and textfield
		period.setBounds(30, 160, 50, 50);
		one.setBounds(30,110,50,50);
		two.setBounds(90,110,50,50);
		three.setBounds(150,110,50,50);
		add.setBounds(210,110,50,50);
		four.setBounds(30,170,50,50);
		five.setBounds(90,170,50,50);
		six.setBounds(150,170,50,50);
		substract.setBounds(210,170,50,50);
		seven.setBounds(30,230,50,50);
		eight.setBounds(90,230,50,50);
		nine.setBounds(150,230,50,50);
		multiply.setBounds(210,230,50,50);
		clear.setBounds(30,290,50,50);
		zero.setBounds(90,290,50,50);
		equalto.setBounds(150,290,50,50);
		divide.setBounds(210,290,50,50);
		jtextfield.setBounds(30,30,230,50);
		//Adding Colors
		one.setBackground(Color.DARK_GRAY);
		one.setForeground(Color.WHITE);
		
		two.setBackground(Color.DARK_GRAY);
		two.setForeground(Color.WHITE);
		
		three.setBackground(Color.DARK_GRAY);
		three.setForeground(Color.WHITE);
		
		four.setBackground(Color.DARK_GRAY);
		four.setForeground(Color.WHITE);
		
		five.setBackground(Color.DARK_GRAY);
		five.setForeground(Color.WHITE);
		
		six.setBackground(Color.DARK_GRAY);
		six.setForeground(Color.WHITE);
		
		seven.setBackground(Color.DARK_GRAY);
		seven.setForeground(Color.WHITE);
		
		eight.setBackground(Color.DARK_GRAY);
		eight.setForeground(Color.WHITE);
		
		nine.setBackground(Color.DARK_GRAY);
		nine.setForeground(Color.WHITE);
		
		zero.setBackground(Color.DARK_GRAY);
		zero.setForeground(Color.WHITE);
		
		substract.setBackground(Color.DARK_GRAY);
		substract.setForeground(Color.WHITE);
		
		add.setBackground(Color.DARK_GRAY);
		add.setForeground(Color.WHITE);

		divide.setBackground(Color.DARK_GRAY);
		divide.setForeground(Color.WHITE);

		multiply.setBackground(Color.DARK_GRAY);
		multiply.setForeground(Color.WHITE);

		clear.setBackground(Color.DARK_GRAY);
		clear.setForeground(Color.WHITE);

		equalto.setBackground(Color.GRAY);
		equalto.setForeground(Color.WHITE);


		//setting action listener
		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		four.addActionListener(this);
		five.addActionListener(this);
		six.addActionListener(this);
		seven.addActionListener(this);
		eight.addActionListener(this);
		nine.addActionListener(this);
		zero.addActionListener(this);
		add.addActionListener(this);
		substract.addActionListener(this);
		multiply.addActionListener(this);
		divide.addActionListener(this);
		clear.addActionListener(this);
		equalto.addActionListener(this);
		period.addActionListener(this);
	}
	public void reset()
	{
		result=0;
		num=0;
		str=" ";
		btn=" ";
		screen=" ";
	}
	public boolean solve()
	{
		try
		{
			if(btn=="+")
				result=result+num;
			else if(btn=="-")
				result=result-num;
			else if(btn=="*")
				result=result*num;
			else if(btn=="/")
				result=result/num;
			else
				result=num;
		}catch(Exception e)
		{
			System.out.println(e);
			reset();
			jtextfield.setText("Error");
			return false;
		}
		return true;
	}
	public void actionPerformed(ActionEvent ae)
	{
		button=ae.getActionCommand();
		switch(button)
		{
		case "1":
		case "2":
		case "3":
		case "4":
		case "5":
		case "6":
		case "7":
		case "8":
		case "9":
		case "0":
			str=str+button;
			screen=screen+button;
			System.out.println(button);
			System.out.println(screen);
			num=Integer.parseInt(str.substring(1,str.length()));
			jtextfield.setText(screen);
			if(btn==" ")
				btn=".";
			break;
		case "+":
		case "*":
		case "-":
		case "/":
			if(btn==" ")
			{
				jtextfield.setText("Error");
				break;
			}
			if(result==0)
			{
				num=Integer.parseInt(str.substring(1,str.length()));
				result=num;
			}
			else if(num!=0)
			{
				num=Integer.parseInt(str.substring(1,str.length()));
				state=solve();
				if(state==false)
					break;
			}
			btn=button;
			screen=screen+button;
			jtextfield.setText(screen);
			str=" ";
			break;
		case "=":
			if(btn==" ")
			{
				jtextfield.setText("Error");
				break;
			}
			num=Integer.parseInt(str.substring(1,str.length()));
			state=solve();
			if(state==false)
				break;
			jtextfield.setText(String.valueOf(result));
			screen=String.valueOf(result);
			str="00";
			num=0;
			break;
		case "C":
			reset();
			jtextfield.setText(str);
			break;
		}
	}
	public static void main(String args[])
	{
		new MyCalculator();
	}
}