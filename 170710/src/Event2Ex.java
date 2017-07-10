import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Event2Ex extends JFrame {

	JTextField text;
	JCheckBox bold;

	public Event2Ex() {
		super( "üũ�ڽ����� ItemEvent ó��" );

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		//�ؽ�Ʈ�ʵ� ����
		text = new JTextField( "JAVA ����", 10);
		//�ؽ�Ʈ �ʵ忡 �۲�, ��Ÿ��,ũ�⸦ ����
		text.setFont( new Font( "����", Font.PLAIN, 14 ) );
		c.add( text );

		//üũ�ڽ� ����
		bold = new JCheckBox( "���ϰ�" );     
		c.add(bold);
		CheckBoxHandler handler = new CheckBoxHandler();
		bold.addItemListener( handler );

		setSize( 300, 100 );
		setVisible(true);
	}

	private class CheckBoxHandler implements ItemListener{
		int valBold= Font.PLAIN;

		public void itemStateChanged(ItemEvent e){
			if(e.getSource()==bold)
				if(e.getStateChange()==ItemEvent.SELECTED)
					valBold=Font.BOLD;
				else
					valBold=Font.PLAIN;

			text.setFont(new Font("����",valBold,14));
		}
	}
	public static void main(String args[]){
		Event2Ex item = new Event2Ex();
		item.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}