import java.awt.event.*;
import javax.swing.*;
import javax.swing.filechooser.*;
import java.io.*;
public class JFileChooserTest extends JFrame implements ActionListener{
	JFileChooser fc;
	public JFileChooserTest(){
		fc=new JFileChooser();
		fc.setMultiSelectionEnabled(true);
		JButton btn = new JButton("파일 선택");
		btn.addActionListener(this);
		add("North",btn);
		setBounds(0,0,200,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		FileNameExtensionFilter filter = new FileNameExtensionFilter("텍스트","txt");
		fc.setFileFilter(filter);
		int result = fc.showOpenDialog(this);
		if(result==JFileChooser.APPROVE_OPTION)
		{
			File [] f = fc.getSelectedFiles();
			int i=0;
			for(File n : f)
				System.out.println(++i+"번째 선택한 파일"+n.getName());
		}
	}
	public static void main(String args[]){
		new JFileChooserTest();
	}
}