import java.awt.*;
import javax.swing.*;
public class JTableTest extends JFrame {
	public JTableTest()
	{
		super("JTable �׽�Ʈ");
		String title[]={"��ȣ", "�̸�", "����"};
		String data[][]={{"1","��  ��","40"},{ "2","�̼���","41"},{"3","������","42"}};
		JTable table = new JTable(data, title);
		JScrollPane sp= new JScrollPane(table);
		getContentPane().add(sp, BorderLayout.CENTER);
		setSize(300,150);
		setVisible(true);
	}
	public static void main(String args[])
	{
		JTableTest jtable= new JTableTest();
		jtable.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}