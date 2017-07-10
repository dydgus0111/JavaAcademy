import java.awt.*;
class BorderLayoutTest1 extends Frame 
{
	public BorderLayoutTest1(String str) 
	{
		super(str);
		setLayout(new BorderLayout());
		add("North", new Button("合率"));
		add("West", new Button("辑率"));
		add("East", new Button("悼率"));
		add("Center", new Button("吝居"));
		add("South", new Button("巢率"));

		setSize(200,200);
		setVisible(true);
	}
}

public class BorderLayoutEx{
	public static void main(String[] args) {
		new BorderLayoutTest1("BorderLayout 抗力");
	}
}