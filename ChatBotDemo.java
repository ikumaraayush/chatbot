import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Chatbot extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextArea ca= new JTextArea();
	private JTextField cf=new JTextField();                                  
	private JButton b=new JButton();
	private JLabel l=new JLabel();

	Chatbot(){                                                // Layout and Properties defined in Constructer                                         

		JFrame f=new JFrame();                                     
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);                      
		f.setVisible(true);
		f.setResizable(false);
		f.setLayout(null);
		f.setSize(400,400);
		f.getContentPane().setBackground(Color.blue);
		f.setTitle("ChatBot");
		f.add(ca);
		f.add(cf);
		ca.setSize(370,310);
		ca.setLocation(1, 1);
		ca.setBackground(Color.WHITE);
		cf.setSize(300,20);
		cf.setLocation(1,320);
		f.add(b);
		l.setText("SEND");
		b.add(l);
		b.setSize(400,20);
		b.setLocation(300,320);

		b.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==b) {                           // Message sents on Click button
					String text=cf.getText().toLowerCase();
					ca.setForeground(Color.BLACK);
					ca.append("You-->"+text+"\n");
					cf.setText("");
					if(text.contains("hi")) {                         // input Checking
						replyMeth("HI WELCOME TO KIIT UNIVERSITY CHATBOT");
					}
					else if(text.contains("how are you")) {
						replyMeth("I'm Good :).Thankyou for asking");
					}
					else if(text.contains("where can I get the placement statistics")) {
						replyMeth("log on to https://kiitportal.kiituniversity.net/irj/portal/");
					}
					else if(text.contains("what is admission criteria")) {
						replyMeth("An aspirant has to appear for the KIITEE examination and has to secure the specified rank to get the specified branch");
					}
					else if(text.contains("what are the courses taught in kiit")) {
						replyMeth("log on to https://kiit.ac.in/academics/courses/");
					}
					else if(text.contains("what are the various rankings of kiit")) {
						replyMeth("log on to https://kiit.ac.in/about/ranking-recognition/");
					}
					else if(text.contains("is KIIT NAAC 'A' ACCREDIATTION")) {
						replyMeth("YES");
					}
					else if(text.contains("what are the ranking cutoffs")) {
						replyMeth("log on to https://www.shiksha.com/engineering/kiitee-exam-cutoff");
					}
					else if(text.contains("what is kiit")) {
						replyMeth("Kalinga Institute of Industrial Technologyformerly KIIT University, is a private deemed university located in Bhubaneswar, Odisha, India. It primarily emphasizes on higher education and research in engineering and science");
					}
                    else if(text.contains("where can i navigate in kiit")) {
						replyMeth("log onto https://kiit.ac.in/tour/");
					}
					else if(text.contains("bye")) {
						replyMeth("Too Soon :( AnyWays"+"\n"+"STAY HOME STAY SAFE ");
					}
					else 
						replyMeth("I Can't Understand");

				}

			}

		});

	}
	public void replyMeth(String s) {                          // Reply Method
		ca.append("ChatBot-->"+s+"\n");         
	}
}

public class ChatBotDemo {                                     //Driver Class

	public static void main(String[] args) {             //main class

          new Chatbot();                                  // instantiation 
	}

}