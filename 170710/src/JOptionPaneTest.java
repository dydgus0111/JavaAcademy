import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JOptionPaneTest extends JFrame implements ActionListener{
	JButton btn[]=new JButton[4];
	String[] str={"�α���","ȸ������"};
	public JOptionPaneTest()
	{
		super("JOptionPane �׽�Ʈ");
		setLayout(new FlowLayout());

		btn[0]=new JButton("�޼���");
		btn[1]=new JButton("Ȯ��");
		btn[2]=new JButton("�Է�");
		btn[3]=new JButton("�ɼ�");

		for(JButton n : btn){
			add(n);
			n.addActionListener(this);
		}
		pack();
		setLocation(300,300);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand()=="�޼���"){
			JOptionPane.showMessageDialog(this, "�޼������̾�α׹ڽ�","�޼���",JOptionPane.INFORMATION_MESSAGE);
		}
		else if(e.getActionCommand()=="Ȯ��"){
			JOptionPane.showConfirmDialog(this, "Ȯ�δ��̾�α׹ڽ�", "�Է�", JOptionPane.YES_NO_CANCEL_OPTION);
		}
		else if(e.getActionCommand()=="�Է�"){
			JOptionPane.showInputDialog(this, "�Է´��̾�α׹ڽ�", "�Է�", JOptionPane.YES_NO_CANCEL_OPTION);
		}
		else if(e.getActionCommand()=="�ɼ�"){
			JOptionPane.showOptionDialog(this, "�ɼǴ��̾�α׹ڽ�", "�ɼ�", JOptionPane.YES_NO_CANCEL_OPTION,	JOptionPane.INFORMATION_MESSAGE,null,str,str[1]);
		}
	}
	public static void main(String args[]){
		new JOptionPaneTest();
	}
}
