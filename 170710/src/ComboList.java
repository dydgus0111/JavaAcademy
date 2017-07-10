import java.awt.*;
import javax.swing.*;
public class ComboList extends JFrame{
	JPanel p, p1, p2;
	JList<String> jl;
	JComboBox<String> com;
	String name[]={"이순신", "김유신", "강감찬", "을지문덕", "세종대왕"};
	String count[]={"1","2","3","4","5"};
	
	public ComboList(){
		super("Jcomponent연습");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		p=new JPanel(new GridLayout(1,2));
		com=new JComboBox<String>(name);
		JScrollPane s = new JScrollPane(com);
		c.add(s);
		jl=new JList<String>(count);
		JScrollPane s1 = new JScrollPane(jl);
		jl.setVisibleRowCount(4);;
		c.add(s1);
		setSize(250,300);
		setVisible(true);
	}
	public static void main(String args[])
	{
		ComboList Obj=new ComboList();
		Obj.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
