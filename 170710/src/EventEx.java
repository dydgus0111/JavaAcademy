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
		lbl=new JLabel("버튼을 선택하세요.");
		btn1=new JButton("☆버튼");
		btn2=new JButton("★버튼");
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
			lbl.setText("☆버튼을 눌렀습니다.");
		}
		else{
			lbl.setText("★버튼을 눌렀습니다.");
		}
	}
}
public class EventEx {
	public static void main(String args[])
	{
		new Event1("ActionEvent 테스트");
	}
}
