import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Event3Ex extends JFrame {
	JTextField text;
	JCheckBox bold;

	public Event3Ex() {
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

		//üũ�ڽ� ��ü bold�� ItemListener�� ���
		//�̶� �̺�Ʈó���޼ҵ带 ���� �ִ� Ŭ������ ���۷����� ���� ���
		bold.addItemListener(new ItemListener(){
			int valBold = Font.PLAIN;//���� ��Ʈ

			//[���ϰ�]üũ�ڽ��� ���� �Ǵ� ������ �ڵ����� ����
			public void itemStateChanged( ItemEvent e ) {
				//�̺�Ʈ�� �߻��� ������Ʈ�� bold�̸� ����
				if ( e.getSource() == bold )
					//�������� ���� ��ȭ�� üũ�ڽ� üũ �̸�
					if ( e.getStateChange() == ItemEvent.SELECTED )
						valBold = Font.BOLD; //�۲� ��Ÿ�� ���ϰ�
					else
						valBold = Font.PLAIN; //�۲� ��Ÿ�� ��������

				//������ ��Ʈ�� �ؽ�Ʈ ���ڿ� ����
				text.setFont( new Font( "����", valBold , 14 ) );
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