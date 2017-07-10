import javax.swing.*;

public class JFrameTest extends JFrame {
	public JFrameTest()
	{
		super("J프레임연습");
		setSize(260,100);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		JFrameTest f = new JFrameTest();
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}