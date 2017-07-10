import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Event2Ex extends JFrame {

	JTextField text;
	JCheckBox bold;

	public Event2Ex() {
		super( "체크박스에서 ItemEvent 처리" );

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		//텍스트필드 생성
		text = new JTextField( "JAVA 연습", 10);
		//텍스트 필드에 글꼴, 스타일,크기를 지정
		text.setFont( new Font( "굴림", Font.PLAIN, 14 ) );
		c.add( text );

		//체크박스 생성
		bold = new JCheckBox( "진하게" );     
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

			text.setFont(new Font("굴림",valBold,14));
		}
	}
	public static void main(String args[]){
		Event2Ex item = new Event2Ex();
		item.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}