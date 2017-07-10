import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Event3Ex extends JFrame {
	JTextField text;
	JCheckBox bold;

	public Event3Ex() {
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

		//체크박스 객체 bold에 ItemListener를 등록
		//이때 이벤트처리메소드를 갖고 있는 클래스의 레퍼런스를 갖고 등록
		bold.addItemListener(new ItemListener(){
			int valBold = Font.PLAIN;//보통 폰트

			//[진하게]체크박스를 선택 또는 해제시 자동으로 실행
			public void itemStateChanged( ItemEvent e ) {
				//이벤트가 발생한 컴포넌트가 bold이면 실행
				if ( e.getSource() == bold )
					//아이템의 상태 변화가 체크박스 체크 이면
					if ( e.getStateChange() == ItemEvent.SELECTED )
						valBold = Font.BOLD; //글꼴 스타일 진하게
					else
						valBold = Font.PLAIN; //글꼴 스타일 보통으로

				//지정한 폰트를 텍스트 상자에 적용
				text.setFont( new Font( "굴림", valBold , 14 ) );
			}
		});

		setSize( 300, 100 );
		setVisible(true);
	}
	public static void main(String args[]){
		Event3Ex item= new Event3Ex();
		item.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}