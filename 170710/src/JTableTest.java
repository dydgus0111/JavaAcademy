import java.awt.*;
import javax.swing.*;
public class JTableTest extends JFrame {
	public JTableTest()
	{
		super("JTable 테스트");
		String title[]={"번호", "이름", "나이"};
		String data[][]={{"1","김  구","40"},{ "2","이순신","41"},{"3","강감찬","42"}};
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