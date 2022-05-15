import java.awt.event.*;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ex9 extends JFrame implements ActionListener {
	JPanel cal;
	JButton one;
	JButton two;
	JButton three;
	JButton four;
	JButton five;
	JButton six;
	JButton seven;
	JButton eight;
	JButton nine;
	JButton zero;
	JButton add;
	JButton minus;
	JButton times;
	JButton divide;
	JButton go;
	JButton save;
	JButton recall;
	JTextField mytext;
	JLabel mylabel;
	String s = "";
	String check = "";
	String act = "";
	String s1 = "";
	String s2 = "";
	int result;
	GridBagConstraints i = new GridBagConstraints();

	public ex9() {

		cal = new JPanel();
		one = new JButton("1");
		two = new JButton("2");
		three = new JButton("3");
		four = new JButton("4");
		five = new JButton("5");
		six = new JButton("6");
		seven = new JButton("7");
		eight = new JButton("8");
		nine = new JButton("9");
		zero = new JButton("0");
		add = new JButton("+");
		minus = new JButton("-");
		times = new JButton("*");
		divide = new JButton("/");
		go = new JButton("=");
		save = new JButton("save");
		recall = new JButton("recall");
		mylabel = new JLabel("");

		mytext = new JTextField(20);
		mytext.setEditable(false);
		cal.setLayout(new GridBagLayout());

		add(cal);
		i.insets = new Insets(1, 1, 1, 1);
		i.fill = GridBagConstraints.HORIZONTAL;
		i.gridx = 1;
		i.gridy = 0;
		cal.add(mylabel, i);
		i.gridx = 1;
		i.gridy = 1;
		cal.add(one, i);
		i.gridx = 2;
		i.gridy = 1;
		cal.add(two, i);
		i.gridx = 3;
		i.gridy = 1;
		cal.add(three, i);
		i.gridx = 1;
		i.gridy = 2;
		cal.add(four, i);
		i.gridx = 2;
		i.gridy = 2;
		cal.add(five, i);
		i.gridx = 3;
		i.gridy = 2;
		cal.add(six, i);
		i.gridx = 1;
		i.gridy = 3;
		cal.add(seven, i);
		i.gridx = 2;
		i.gridy = 3;
		cal.add(eight, i);
		i.gridx = 3;
		i.gridy = 3;
		cal.add(nine, i);
		i.gridx = 1;
		i.gridy = 4;
		cal.add(zero, i);
		i.gridx = 4;
		i.gridy = 1;
		cal.add(add, i);
		i.gridx = 4;
		i.gridy = 2;
		cal.add(minus, i);
		i.gridx = 4;
		i.gridy = 3;
		cal.add(times, i);
		i.gridx = 4;
		i.gridy = 4;
		cal.add(divide, i);
		i.gridx = 2;
		i.gridy = 4;
		cal.add(go, i);
		i.gridx = 3;
		i.gridy = 4;
		cal.add(save, i);
		i.gridx = 2;
		i.gridy = 5;
		cal.add(recall, i);
		i.gridwidth = 4;
		i.gridx = 2;
		i.gridy = 0;
		cal.add(mytext, i);
		// initialises event handling for button
		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		four.addActionListener(this);
		five.addActionListener(this);
		six.addActionListener(this);
		seven.addActionListener(this);
		eight.addActionListener(this);
		nine.addActionListener(this);
		zero.addActionListener(this);
		add.addActionListener(this);
		minus.addActionListener(this);
		times.addActionListener(this);
		divide.addActionListener(this);
		go.addActionListener(this);
		save.addActionListener(this);
		recall.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		mylabel.setText("");

		if (e.getSource() == save) {
			check = read(result);
			mylabel.setText(check);
			s = "";
		}

		if (e.getSource() == recall) {
			check = split();
			mytext.setText(check);
			System.out.println("The last answer saved is " + check);
			s = check;
		}
		if (e.getSource() == one) {
			s += "1";
			mytext.setText(s);
		}
		if (e.getSource() == two) {
			s += "2";
			mytext.setText(s);
		}
		if (e.getSource() == three) {
			s += "3";
			mytext.setText(s);
		}
		if (e.getSource() == four) {
			s += "4";
			mytext.setText(s);
		}
		if (e.getSource() == five) {
			s += "5";
			mytext.setText(s);
		}
		if (e.getSource() == six) {
			s += "6";
			mytext.setText(s);
		}
		if (e.getSource() == seven) {
			s += "7";
			mytext.setText(s);
		}
		if (e.getSource() == eight) {
			s += "8";
			mytext.setText(s);
		}
		if (e.getSource() == nine) {
			s += "9";
			mytext.setText(s);
		}
		if (e.getSource() == zero) {
			s += "0";
			mytext.setText(s);
		}
		if (e.getSource() == add) {
			if ((("").equals(s)) && (("").equals(s1))) {
				s = "0";
			} else if (s.equals("")) {
				s += s1;
			}
			s += "+";
			mytext.setText(s);
			act = "+";
		}
		if (e.getSource() == minus) {
			if ((("").equals(s)) && (("").equals(s1))) {
				s = "0";
			} else if (s.equals("")) {
				s += s1;
			}
			s += "-";
			mytext.setText(s);
			act = "-";
		}
		if (e.getSource() == times) {
			if ((("").equals(s)) && (("").equals(s1))) {
				s = "0";
			} else if (s.equals("")) {
				s += s1;
			}
			s += "*";
			mytext.setText(s);
			act = "*";
		}
		if (e.getSource() == divide) {
			if (s.equals("")) {
				if (s1.equals("")) {
					s += "0";
				} else
					s += s1;
			}
			s += "/";
			mytext.setText(s);
			act = "/";
		}
		if (e.getSource() == go) {
			System.out.println(s);
			result = 0;
			int cal[] = new int[2];
			switch (act) {
			default: {
				if ("".equals(s)) {
					s = "0";
				}
				mytext.setText(s);
				break;
			}
			case "+": {
				String data[] = s.split("\\+");
				cal[0] = Integer.parseInt(data[0]);
				cal[1] = Integer.parseInt(data[1]);
				result = cal[0] + cal[1];
				s += " = " + Integer.toString(result);
				mytext.setText(s);
				check = s1 = Integer.toString(result);
				s2 = "";
				System.out.println(s1);
				break;
			}
			case "-": {
				String data[] = s.split("\\-");
				cal[0] = Integer.parseInt(data[0]);
				System.out.println(cal[0]);
				cal[1] = Integer.parseInt(data[1]);
				System.out.println(cal[1]);
				result = cal[0] - cal[1];
				s += " = " + Integer.toString(result);
				mytext.setText(s);
				check = s1 = Integer.toString(result);
				s2 = "";
				break;
			}
			case "*": {
				String data[] = s.split("\\*");
				cal[0] = Integer.parseInt(data[0]);
				System.out.println(cal[0]);
				cal[1] = Integer.parseInt(data[1]);
				System.out.println(cal[1]);
				result = cal[0] * cal[1];
				s += " = " + Integer.toString(result);
				mytext.setText(s);
				check = s1 = Integer.toString(result);
				s2 = "";
				break;
			}
			case "/": {
				String data[] = s.split("\\/");
				cal[0] = Integer.parseInt(data[0]);
				System.out.println(cal[0]);
				cal[1] = Integer.parseInt(data[1]);
				System.out.println(cal[1]);
				result = cal[0] / cal[1];
				s += " = " + Integer.toString(result);
				mytext.setText(s);
				check = s1 = Integer.toString(result);
				s2 = "";
				break;
			}
			}// switch
			s = "";
			cal = null;
		} // go

	}

	public static String read(int x) {
		try {
			FileWriter writehandle = new FileWriter("C:\\Users/Pig Chu ^(00)^/Desktop/file.txt");
			BufferedWriter bw = new BufferedWriter(writehandle);

			bw.write(Integer.toString(x));
			System.out.println("saved");

			bw.close();
			writehandle.close();
			return "saved";
		} catch (IOException ioe) {
			System.out.println("error.");
			return "ERROR";
		}

	}

	public static String split() {
		try {
			FileReader readhandle = new FileReader("C:\\Users/Pig Chu ^(00)^/Desktop/file.txt");
			BufferedReader br = new BufferedReader(readhandle);
			String next = "";
			String line = "";

			while ((line = br.readLine()) != null) {
				next = line;
				System.out.println(next);
			}

			br.close();
			readhandle.close();
			return next;
		} catch (IOException ioe) {
			System.out.println("error");
			return "ERROR";
		}

	}

	public static void main(String[] args) {

		JFrame ex9 = new ex9();
		ex9.setTitle("calculator(no d.p.)");
		ex9.setSize(280, 320);
		ex9.setLocation(100, 200);
		ex9.setVisible(true);
		ex9.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
