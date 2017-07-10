import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JOptionPaneTest extends JFrame implements ActionListener{
	JButton btn[]=new JButton[4];
	String[] str={"로그인","회원가입"};
	public JOptionPaneTest()
	{
		super("JOptionPane 테스트");
		setLayout(new FlowLayout());

		btn[0]=new JButton("메세지");
		btn[1]=new JButton("확인");
		btn[2]=new JButton("입력");
		btn[3]=new JButton("옵션");

		for(JButton n : btn){
			add(n);
			n.addActionListener(this);
		}
		pack();
		setLocation(300,300);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand()=="메세지"){
			JOptionPane.showMessageDialog(this, "메세지다이얼로그박스","메세지",JOptionPane.INFORMATION_MESSAGE);
		}
		else if(e.getActionCommand()=="확인"){
			JOptionPane.showConfirmDialog(this, "확인다이얼로그박스", "입력", JOptionPane.YES_NO_CANCEL_OPTION);
		}
		else if(e.getActionCommand()=="입력"){
			JOptionPane.showInputDialog(this, "입력다이얼로그박스", "입력", JOptionPane.YES_NO_CANCEL_OPTION);
		}
		else if(e.getActionCommand()=="옵션"){
			JOptionPane.showOptionDialog(this, "옵션다이얼로그박스", "옵션", JOptionPane.YES_NO_CANCEL_OPTION,	JOptionPane.INFORMATION_MESSAGE,null,str,str[1]);
		}
	}
	public static void main(String args[]){
		new JOptionPaneTest();
	}
}
