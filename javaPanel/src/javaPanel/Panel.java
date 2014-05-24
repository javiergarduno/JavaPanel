package javaPanel;

import java.awt.BorderLayout;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class Panel extends JFrame {
	private JTextArea logArea;
	private JLabel label;

	public Panel() {
		super("Titulo de la ventana");        
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		label = new JLabel();	
		add(label,BorderLayout.NORTH);

		logArea = new JTextArea(5, 5);
		logArea.setEditable(false);
		JScrollPane jp = new JScrollPane(logArea);        
		add(jp, BorderLayout.CENTER);
		
		pack();
		setSize(700, 500);
		setLocationByPlatform(true);
		setVisible(true);
	}

	public void logText(String text){
		logArea.append( "\n" + text);

	}
	
	public void setLabelText(String text){
		label.setText( "\n" + text);

	}

	public  void LogWriter(String text) throws IOException{		
		
		PrintWriter writer = new PrintWriter(new FileWriter("log.txt",true));
		writer.println(new Date().toString() + "   " + text);
		writer.close();	
	}

	

}