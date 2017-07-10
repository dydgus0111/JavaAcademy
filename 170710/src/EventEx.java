import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Event1 extends JFrame implements ActionListener
{
	JLabel lbl;
	JButton btn1, btn2;
	public Event1(String str)
	{
		super(str);
		lbl=new JLabel("��ư�� �����ϼ���.");
		btn1=new JButton("�ٹ�ư");
		btn2=new JButton("�ڹ�ư");
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		JPanel panel = new JPanel();
		panel.add(btn1);
		panel.add(btn2);
		add("Center",panel);
		add("South",lbl);
		setSize(300,200);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		Object obj=e.getSource();
		if((JButton)obj==btn1){
			lbl.setText("�ٹ�ư�� �������ϴ�.");
		}
		else{
			lbl.setText("�ڹ�ư�� �������ϴ�.");
		}
	}
}
public class EventEx {
	public static void main(String args[])
	{
		new Event1("ActionEvent �׽�Ʈ");
	}
}
