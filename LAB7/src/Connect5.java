import java.awt.event.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Connect5 extends JFrame implements ActionListener {
	// Grid starts (0,0) at upper left corner
	// ImageIcon icon = new ImageIcon("C:\\cyan.png");
	JFrame col;
	JPanel board;
	JMenuBar menubar;
	JMenu menu;
	JMenuItem menuItem1;
	JMenuItem menuItem2;
	JMenuItem menuItem3;
	JButton hi[][];
	JButton press[];
	JButton user1; // player
	JButton user2; // pc
	JButton reset;
	JButton pause;
	JButton playcol;
	JButton read;
	JLabel mylabel;
	JLabel playerl;
	JLabel coml;
	String playert = "Player's Turn";
	String text = "";
	int column = 8;
	int row = 7;
	int turns = 0; // 1 = player 2=pc
	int count[] = new int[column];
	int check[][] = new int[column][row]; // 1=player 2=pc
	int playc = 0;
	int comc = 0;
	Color pl = Color.red;
	Color co = Color.BLUE;
	JPanel select;
	JButton red;
	JButton blue;
	JButton yellow;
	JButton black;
	int won = 0;
	whiteborder r = new whiteborder(10);

	GridBagConstraints i = new GridBagConstraints();
	BorderLayout l = new BorderLayout();

	public Connect5() {
		// menubar for JFrame
		menubar = new JMenuBar();
		add(menubar, BorderLayout.NORTH);
		menu = new JMenu("Change Size");
		menubar.add(menu);
		menuItem1 = new JMenuItem("9x8");
		menu.add(menuItem1);
		menuItem1.addActionListener(this);
		menuItem2 = new JMenuItem("8x7");
		menu.add(menuItem2);
		menuItem2.addActionListener(this);
		menuItem3 = new JMenuItem("7x6");
		menu.add(menuItem3);
		menuItem3.addActionListener(this);
		paint();
		printgrid();

	}

	public void actionPerformed(ActionEvent e) {
		// if left 1 is clicked
		if (e.getSource() == press[0]) {

			if (turns == 1) {
				hi[0][count[0]].setBorder(new playerborder(10));
				turns++;
				check[0][count[0]] = 1;
				count[0]--;
				playc++;

				playerl.setText("Player Turn:" + playc);
				// check player win
				if (win() == 1) {
					show(1);
				}
				// } else if (turns == 2) {

				pcmove(); // let ai move
				console_show(); // show grid in console
				/*
				 * hi[0][count[0]].setBackground(Color.blue); turns--;
				 * check[0][count[0]] = 2; count[0]--; comc++;
				 * mylabel.setText("Player's Turn");
				 * coml.setText("Computer Turn:" + comc);
				 */
			}
			if (turns == 0) {
				show(-1);
			}
			if (draw() == true) { // check if grid is full
				show(0);
			}

			if (win() == 2) { // check pc win
				show(2);
			}
		}
		if (e.getSource() == press[1]) {
			// if left 2 is clicked

			if (turns == 1) {
				hi[1][count[1]].setBorder(new playerborder(10));
				turns++;
				check[1][count[1]] = 1;
				count[1]--;
				playc++;

				playerl.setText("Player Turn:" + playc);
				if (win() == 1) { // check player win
					show(1);
				}
				// } else if (turns == 2) {
				pcmove(); // let ai move
				console_show(); // show grid in console
				/*
				 * hi[1][count[1]].setBackground(Color.blue); turns--;
				 * check[1][count[1]] = 2; count[1]--; comc++;
				 * mylabel.setText("Player's Turn");
				 * coml.setText("Computer Turn:" + comc);
				 */
			}
			if (turns == 0) {
				show(-1);
			}
			if (draw() == true) { // check if grid is full
				show(0);
			}
			if (win() == 2) { // check pc win
				show(2);
			}
		}
		if (e.getSource() == press[2]) {
			// if left 3 is clicked

			if (turns == 1) {
				hi[2][count[2]].setBorder(new playerborder(10));
				turns++;
				check[2][count[2]] = 1;
				count[2]--;
				playc++;

				playerl.setText("Player Turn:" + playc);
				if (win() == 1) { // check player win
					show(1);
				}
				// } else if (turns == 2) {
				pcmove(); // let ai move
				console_show(); // show grid in console
				/*
				 * hi[2][count[2]].setBackground(Color.blue); turns--;
				 * check[2][count[2]] = 2; count[2]--; comc++;
				 * mylabel.setText("Player's Turn");
				 * coml.setText("Computer Turn:" + comc);
				 */
			}
			if (turns == 0) {
				show(-1);
			}
			if (draw() == true) { // check if grid is full
				show(0);
			}

			if (win() == 2) { // check pc win
				show(2);
			}
		}
		if (e.getSource() == press[3]) {
			// if left 4 is clicked
			if (turns == 1) {
				hi[3][count[3]].setBorder(new playerborder(10));
				turns++;
				check[3][count[3]] = 1;
				count[3]--;
				playc++;

				playerl.setText("Player Turn:" + playc);
				if (win() == 1) { // check player win
					show(1);
				}
				// } else if (turns == 2) {
				pcmove(); // let ai move
				console_show(); // show grid in console
				/*
				 * hi[3][count[3]].setBackground(Color.blue); turns--;
				 * check[3][count[3]] = 2; count[3]--; comc++;
				 * mylabel.setText("Player's Turn");
				 * coml.setText("Computer Turn:" + comc);
				 */
			}
			if (turns == 0) {
				show(-1);
			}
			if (draw() == true) { // check if grid is full
				show(0);
			}

			if (win() == 2) { // check pc win
				show(2);
			}
		}
		if (e.getSource() == press[4]) {
			// if left 5 is clicked
			if (turns == 1) {
				hi[4][count[4]].setBorder(new playerborder(10));
				turns++;
				check[4][count[4]] = 1;
				count[4]--;
				playc++;

				playerl.setText("Player Turn:" + playc);
				if (win() == 1) { // check player win
					show(1);
				}
				// } else if (turns == 2) {
				pcmove(); // show ai move
				console_show(); // show grid in console
				/*
				 * hi[4][count[4]].setBackground(Color.blue); turns--;
				 * check[4][count[4]] = 2; count[4]--; comc++;
				 * mylabel.setText("Player's Turn");
				 * coml.setText("Computer Turn:" + comc);
				 */
			}
			if (turns == 0) {
				show(-1);
			}
			if (draw() == true) { // check if grid is full
				show(0);
			}
			if (win() == 2) { // check pc win
				show(2);
			}
		}
		if (e.getSource() == press[5]) {
			// if left 6 is pressed
			if (turns == 1) {
				hi[5][count[5]].setBorder(new playerborder(10));
				turns++;
				check[5][count[5]] = 1;
				count[5]--;
				playc++;

				playerl.setText("Player Turn:" + playc);
				if (win() == 1) { // check player win
					show(1);
				}
				// } else if (turns == 2) {
				pcmove(); // let ai move
				console_show(); // show grid in console
				/*
				 * hi[5][count[5]].setBackground(Color.blue); turns--;
				 * check[5][count[5]] = 2; count[5]--; comc++;
				 * mylabel.setText("Player's Turn");
				 * coml.setText("Computer Turn:" + comc);
				 */
			} else if (turns == 0) {
				show(-1);
			}
			if (draw() == true) { // check if grid is full
				show(0);
			}

			if (win() == 2) { // check pc win
				show(2);
			}
		}
		if (e.getSource() == press[6]) {
			// if left 7 is pressed
			if (turns == 1) {
				hi[6][count[6]].setBorder(new playerborder(10));
				turns++;
				check[6][count[6]] = 1;
				count[6]--;
				playc++;

				playerl.setText("Player Turn:" + playc);
				if (win() == 1) { // check player win
					show(1);
				}
				// } else if (turns == 2) {
				pcmove(); // let ai move
				console_show(); // show grid in console
				/*
				 * hi[6][count[6]].setBackground(Color.blue); turns--;
				 * check[6][count[6]] = 2; count[6]--; comc++;
				 * mylabel.setText("Player's Turn");
				 * coml.setText("Computer Turn:" + comc);
				 */
			}
			if (turns == 0) {
				show(-1);
			}
			if (draw() == true) { // check if grid is full
				show(0);
			}
			if (win() == 2) { // check pc win
				show(2);
			}
		}
		if (column >= 8) {
			if (e.getSource() == press[7]) {
				// if grid has 8 (prevent outofbounds & if left 8 is pressed

				if (turns == 1) {
					hi[7][count[7]].setBorder(new playerborder(10));
					turns++;
					check[7][count[7]] = 1;
					count[7]--;
					playc++;

					playerl.setText("Player Turn:" + playc);
					if (win() == 1) { // check player win
						show(1);
					}
					pcmove(); // let ai move
					console_show(); // show grid in console

					// } else if (turns == 2) {

					/*
					 * hi[7][count[7]].setBackground(Color.blue); turns--;
					 * check[7][count[7]] = 2; count[7]--; comc++;
					 * mylabel.setText("Player's Turn");
					 * coml.setText("Computer Turn:" + comc);
					 */
				} else if (turns == 0) {
					show(-1);
				}
				if (draw() == true) { // check if grid is full
					show(0);
				}

				if (win() == 2) { // check pc win
					show(2);
				}
			}
		}
		if (column >= 9) {
			if (e.getSource() == press[8]) {
				// check if grid has 9 & if left 9 is pressed
				if (turns == 1) {
					hi[8][count[8]].setBorder(new playerborder(10));
					turns++;
					check[8][count[8]] = 1;
					count[8]--;
					playc++;

					playerl.setText("Player Turn:" + playc);
					// } else if (turns == 2) {
					if (win() == 1) { // check player win
						show(1);
					}
					pcmove(); // let ai move
					console_show();// show grid in console
					/*
					 * hi[0][count[0]].setBackground(Color.blue); turns--;
					 * check[0][count[0]] = 2; count[0]--; comc++;
					 * mylabel.setText("Player's Turn");
					 * coml.setText("Computer Turn:" + comc);
					 */
				}
				if (turns == 0) {
					show(-1);
				}
				if (draw() == true) { // check if grid is full
					show(0);
				}

				if (win() == 2) { // check pc win
					show(2);
				}
			}
		}
		if (e.getSource() == user1) {
			turns = 1;
			mylabel.setText("Player Starts First!");
		}
		if (e.getSource() == user2) {
			turns = 2;
			pcmove();
		}
		if (e.getSource() == reset) {
			resetting();
		}
		if (e.getSource() == playcol) {

			col.setVisible(true);
		}
		if (e.getSource() == pause) {
			mylabel.setText(write());
		}
		if (e.getSource() == read) {
			mylabel.setText(read());
		}
		if (e.getSource() == red) {
			pl = Color.red;
			if (pl == co) {
				co = Color.yellow;
			}
			for (int x = 0; x < 8; x++) {
				for (int y = 0; y < 7; y++) {
					if (check[x][y] == 1)
						hi[x][y].setBorder(new playerborder(10));
					if (check[x][y] == 2)
						hi[x][y].setBackground(co);
				}
			}
		}
		if (e.getSource() == blue) {
			pl = Color.blue;
			if (pl == co) {
				co = Color.black;
			}
			for (int x = 0; x < 8; x++) {
				for (int y = 0; y < 7; y++) {
					if (check[x][y] == 1)
						hi[x][y].setBorder(new playerborder(10));
					if (check[x][y] == 2)
						hi[x][y].setBackground(co);
				}
			}
		}
		if (e.getSource() == yellow) {
			pl = Color.yellow;
			if (pl == co) {
				co = Color.blue;
			}
			for (int x = 0; x < 8; x++) {
				for (int y = 0; y < 7; y++) {
					if (check[x][y] == 1)
						hi[x][y].setBorder(new playerborder(10));
					if (check[x][y] == 2)
						hi[x][y].setBackground(co);
				}
			}
		}
		if (e.getSource() == black) {
			pl = Color.black;
			if (pl == co) {
				co = Color.red;
			}
			for (int x = 0; x < 8; x++) {
				for (int y = 0; y < 7; y++) {
					if (check[x][y] == 1)
						hi[x][y].setBorder(new playerborder(10));
					if (check[x][y] == 2)
						hi[x][y].setBackground(co);
				}
			}
		}
		if (e.getSource() == menuItem1) {
			column = 9;
			row = 8;
			playc = 0;
			comc = 0;

			board.removeAll();
			paint();
			revalidate();
			printgrid();
			setSize(800, 700);
			board.repaint();
			board.revalidate();
			board.setVisible(true);
			System.out.println(column + " " + row);
		}
		if (e.getSource() == menuItem2) {
			column = 8;
			row = 7;
			playc = 0;
			comc = 0;
			board.removeAll();
			paint();
			setSize(800, 660);
			revalidate();
			printgrid();
			board.repaint();
			board.revalidate();
			board.setVisible(true);
			System.out.println(column + " " + row);
		}
		if (e.getSource() == menuItem3) {
			column = 7;
			row = 6;
			playc = 0;
			comc = 0;
			board.removeAll();

			paint();
			revalidate();
			printgrid();
			setSize(760, 650);

			board.repaint();
			board.revalidate();
			board.setVisible(true);
			System.out.println(column + " " + row);
		}

	}

	public void printgrid() {

		hi = new JButton[column][row];
		press = new JButton[column];
		count = null;
		count = new int[column];
		check = null;
		check = new int[column][row];
		for (int x = 0; x < column; x++) {
			count[x] = row - 1;
		}
		for (int x = 0; x < column; x++) {
			for (int y = 0; y < row; y++) {
				hi[x][y] = new JButton("");
				hi[x][y].setPreferredSize(new Dimension(40, 40));
				// hi[x][y].setAction(null);
				// hi[x][y].setBorder(new whiteborder(5));
				hi[x][y].setBorder(new whiteborder(10));
				hi[x][y].setContentAreaFilled(false);
				i.gridx = x;
				i.gridy = y;
				board.add(hi[x][y], i);
				// hi[x][y].setEnabled(false);
			}
		}
		for (int x = 0; x < column; x++) {
			press[x] = new JButton("^");
			press[x].setPreferredSize(new Dimension(50, 40));
			// hi[x][y].setAction(null);
			press[x].setBackground(Color.PINK);
			press[x].addActionListener(this);
			i.gridx = x;
			i.gridy = row;
			board.add(press[x], i);
		}
	}

	public static void show(int x) {
		JFrame window = new JFrame();
		if (x == -1) {
			JOptionPane.showMessageDialog(window, "Choose Who Start First!");
		}
		if (x == 0) {
			JOptionPane.showMessageDialog(window, "Draw!");
		}
		if (x == 1) {
			JOptionPane.showMessageDialog(window, "User wins!");
		}
		if (x == 2) {
			JOptionPane.showMessageDialog(window, "Computer wins!");
		}
	}

	public void console_show() {
		for (int y = 0; y <= row - 1; y++) {
			for (int x = 0; x <= column - 1; x++) {
				if (hi[x][y].getBackground() == pl) {
					check[x][y] = 1;
				}
				if (hi[x][y].getBackground() == co) {
					check[x][y] = 2;
				}
				if (hi[x][y].getBackground() == Color.WHITE) {
					check[x][y] = 0;
				}
				System.out.print(check[x][y]);
			}
			System.out.println();
		}
	}

	public void paint() {
		board = new JPanel();
		add(board);
		board.setBackground(Color.cyan);

		board.setLayout(new GridBagLayout());
		i.insets = new Insets(1, 1, 1, 1);
		i.fill = GridBagConstraints.HORIZONTAL;

		mylabel = new JLabel("Select Who's First:");
		i.gridx = column + 1;
		i.gridy = 0;
		mylabel.setPreferredSize(new Dimension(150, 40));
		board.add(mylabel, i);

		user1 = new JButton("User First");
		i.gridx = column + 1;
		i.gridy = 1;
		board.add(user1, i);
		user1.setPreferredSize(new Dimension(180, 40));
		user1.addActionListener(this);

		user2 = new JButton("Computer Starts/ Move");
		i.gridx = column + 1;
		i.gridy = 2;
		user2.setPreferredSize(new Dimension(180, 40));
		board.add(user2, i);
		user2.addActionListener(this);

		playerl = new JLabel("Player Turn:" + playc);
		i.gridx = column + 1;
		i.gridy = 3;
		playerl.setPreferredSize(new Dimension(180, 40));
		board.add(playerl, i);

		coml = new JLabel("Computer Turn:" + comc);
		i.gridx = column + 1;
		i.gridy = 4;
		coml.setPreferredSize(new Dimension(180, 40));
		board.add(coml, i);

		playcol = new JButton("Choose player colour");
		i.gridx = column + 1;
		i.gridy = 5;
		playcol.setPreferredSize(new Dimension(180, 40));
		board.add(playcol, i);
		playcol.addActionListener(this);

		pause = new JButton("Pause and save");
		i.gridx = column + 1;
		i.gridy = 6;
		pause.setPreferredSize(new Dimension(180, 40));
		board.add(pause, i);
		pause.addActionListener(this);

		read = new JButton("Read data");
		i.gridx = column + 1;
		i.gridy = 7;
		read.setPreferredSize(new Dimension(180, 40));
		board.add(read, i);
		read.addActionListener(this);

		reset = new JButton("Reset/New Game");
		i.gridx = column + 1;
		i.gridy = 8;
		reset.setPreferredSize(new Dimension(180, 40));
		board.add(reset, i);
		reset.addActionListener(this);

		col = new JFrame();
		select = new JPanel();
		red = new JButton("red");
		blue = new JButton("blue");
		yellow = new JButton("yellow");
		black = new JButton("black");
		select.add(red);
		select.add(blue);
		select.add(yellow);
		select.add(black);
		red.addActionListener(this);
		blue.addActionListener(this);
		yellow.addActionListener(this);
		black.addActionListener(this);
		col.add(select);
		col.setSize(300, 150);
		col.setLocation(500, 100);
		col.setVisible(false);

	}

	public void resetting() {
		for (int x = 0; x < column; x++) {
			for (int y = 0; y < row; y++) {
				hi[x][y].setBorder(new whiteborder(10));
			}
		}
		won = 0;
		count = null;
		count = new int[column];
		for (int x = 0; x < column; x++) {
			count[x] = row - 1;
		}
		check = null;
		check = new int[column][row];
		playc = 0;
		comc = 0;
		turns = 1;

	}

	public String write() {
		try {
			FileWriter writehandle = new FileWriter("C:\\Users/Pig Chu ^(00)^/Desktop/file.txt");
			BufferedWriter bw = new BufferedWriter(writehandle);

			bw.write(column);
			bw.newLine();
			bw.write(row);
			bw.newLine();
			for (int y = 0; y <= row - 1; y++) {
				for (int x = 0; x <= column - 1; x++) {
					bw.write(check[x][y]);
					System.out.print(check[x][y]);
				}
				bw.newLine();
				System.out.println();
			}
			bw.write(playc);
			bw.newLine();
			bw.write(comc);

			System.out.println("saved");

			bw.close();
			writehandle.close();
			return "saved";
		} catch (IOException ioe) {
			System.out.println("error.");
			return "ERROR";
		}

	}

	public String read() {
		turns = 1;
		try {
			FileReader readhandle = new FileReader("C:\\Users/Pig Chu ^(00)^/Desktop/file.txt");
			BufferedReader br = new BufferedReader(readhandle);

			column = br.read();
			br.readLine();
			row = br.read();
			br.readLine();
			resetting();
			playc = 0;
			comc = 0;

			board.removeAll();
			paint();
			printgrid();

			for (int y = 0; y <= row - 1; y++) {
				for (int x = 0; x <= column - 1; x++) {
					check[x][y] = br.read();

					if (check[x][y] == 1) {
						hi[x][count[x]].setBorder(new playerborder(10));
						count[x]--;
					}
					if (check[x][y] == 2) {
						hi[x][count[x]].setBorder(new pcborder(10));
						count[x]--;
					}
				}
				br.readLine();
			}
			playc = br.read();
			br.readLine();
			comc = br.read();

			br.close();
			readhandle.close();

			setSize(700, 600);
			board.revalidate();
			return "Data Retrieved";
		} catch (IOException ioe) {
			System.out.println("error");
			return "ERROR";
		}

	}

	public int win() {

		int res = 0;
		for (int x = 0; x < column - 4; x++) {
			for (int y = 0; y < row; y++) {

				if (check[x][y] == 1 && check[x + 1][y] == 1 && check[x + 2][y] == 1 && check[x + 3][y] == 1
						&& check[x + 4][y] == 1) {
					hi[x][y].setBorder(new winborder(10));
					hi[x + 1][y].setBorder(new winborder(10));
					hi[x + 2][y].setBorder(new winborder(10));
					hi[x + 3][y].setBorder(new winborder(10));
					hi[x + 4][y].setBorder(new winborder(10));
					won = 1;
					return res = 1;
				}
				if (check[x][y] == 2 && check[x + 1][y] == 2 && check[x + 2][y] == 2 && check[x + 3][y] == 2
						&& check[x + 4][y] == 2) {
					hi[x][y].setBorder(new winborder(10));
					hi[x + 1][y].setBorder(new winborder(10));
					hi[x + 2][y].setBorder(new winborder(10));
					hi[x + 3][y].setBorder(new winborder(10));
					hi[x + 4][y].setBorder(new winborder(10));
					won = 1;
					return res = 2;
				} // hori
			}
		}
		for (int x = 0; x < column; x++) {
			for (int y = 0; y < row - 4; y++) {
				if (check[x][y] == 1 && check[x][y + 1] == 1 && check[x][y + 2] == 1 && check[x][y + 3] == 1
						&& check[x][y + 4] == 1) {
					hi[x][y].setBorder(new winborder(10));
					hi[x][y + 1].setBorder(new winborder(10));
					hi[x][y + 2].setBorder(new winborder(10));
					hi[x][y + 3].setBorder(new winborder(10));
					hi[x][y + 4].setBorder(new winborder(10));
					won = 1;
					return res = 1;
				}
				if (check[x][y] == 2 && check[x][y + 1] == 2 && check[x][y + 2] == 2 && check[x][y + 3] == 2
						&& check[x][y + 4] == 2) {
					hi[x][y].setBorder(new winborder(10));
					hi[x][y + 1].setBorder(new winborder(10));
					hi[x][y + 2].setBorder(new winborder(10));
					hi[x][y + 3].setBorder(new winborder(10));
					hi[x][y + 4].setBorder(new winborder(10));
					won = 1;
					return res = 2;
				} // verti
			}
		}

		for (int x = 0; x <= column - 5; x++) {
			for (int y = 0; y <= row - 5; y++) {
				if (check[x][y] == 1 && check[x + 1][y + 1] == 1 && check[x + 2][y + 2] == 1 && check[x + 3][y + 3] == 1
						&& check[x + 4][y + 4] == 1) {
					hi[x][y].setBorder(new winborder(10));
					hi[x + 1][y + 1].setBorder(new winborder(10));
					hi[x + 2][y + 2].setBorder(new winborder(10));
					hi[x + 3][y + 3].setBorder(new winborder(10));
					hi[x + 4][y + 4].setBorder(new winborder(10));
					won = 1;
					return res = 1;
				}
				if (check[x][y] == 2 && check[x + 1][y + 1] == 2 && check[x + 2][y + 2] == 2 && check[x + 3][y + 3] == 2
						&& check[x + 4][y + 4] == 2) {
					hi[x][y].setBorder(new winborder(10));
					hi[x + 1][y + 1].setBorder(new winborder(10));
					hi[x + 2][y + 2].setBorder(new winborder(10));
					hi[x + 3][y + 3].setBorder(new winborder(10));
					hi[x + 4][y + 4].setBorder(new winborder(10));
					won = 1;
					return res = 2;
				} // -slope
			}
		}
		for (int x = 0; x <= column - 5; x++) {
			for (int y = 0; y <= row - 5; y++) {
				if (check[x][y + 4] == 1 && check[x + 1][y + 3] == 1 && check[x + 2][y + 2] == 1
						&& check[x + 3][y + 1] == 1 && check[x + 4][y] == 1) {
					hi[x][y + 4].setBorder(new winborder(10));
					hi[x + 1][y + 3].setBorder(new winborder(10));
					hi[x + 2][y + 2].setBorder(new winborder(10));
					hi[x + 3][y + 1].setBorder(new winborder(10));
					hi[x + 4][y].setBorder(new winborder(10));
					won = 1;
					return res = 1;
				}
				if (check[x][y + 4] == 2 && check[x + 1][y + 3] == 2 && check[x + 2][y + 2] == 2
						&& check[x + 3][y + 1] == 2 && check[x + 4][y] == 2) {
					hi[x][y + 4].setBorder(new winborder(10));
					hi[x + 1][y + 3].setBorder(new winborder(10));
					hi[x + 2][y + 2].setBorder(new winborder(10));
					hi[x + 3][y + 1].setBorder(new winborder(10));
					hi[x + 4][y].setBorder(new winborder(10));
					won = 1;
					return res = 2;
				} // +slope

			}
		}

		return res;
	}

	public boolean draw() {
		for (int x = 0; x < column; x++) {
			if (count[x] >= 0) {
				return false;
			}
		}
		return true;
	}

	public int almost() {
		int ans = 100;
		for (int x = 0; x < column - 5; x++) {
			for (int y = 0; y < row; y++) {

				if (check[x + 1][y] == 1 && check[x + 2][y] == 1 && check[x + 3][y] == 1 && check[x + 4][y] == 1) {
					if ((check[x][y] == 0) && (count[x] == y)) {
						ans = x;
						System.out.println("block move h1-1: " + x + "," + count[x]);
					}
					if ((check[x + 5][y] == 0) && (count[x + 5] == y)) {
						ans = x + 5;
						System.out.println("block move h1-2: " + (x + 5) + "," + count[x + 5]);
					}
				}
				if (check[x + 1][y] == 2 && check[x + 2][y] == 2 && check[x + 3][y] == 2 && check[x + 4][y] == 2) {
					if ((check[x][y] == 0) && (count[x] == y)) {
						ans = x;
						System.out.println("aggr move h1-1: " + x + "," + count[x]);
					}
					if ((check[x + 5][y] == 0) && (count[x + 5] == y)) {
						ans = x + 5;
						System.out.println("aggr move h1-2: " + (x + 5) + "," + count[x + 5]);
					}
				}
			}
		} // AI block /go for hori
		for (int x = 0; x < column - 4; x++) {
			for (int y = 0; y < row; y++) {

				if (check[x][y] == 1 && check[x + 2][y] == 1 && check[x + 3][y] == 1 && check[x + 4][y] == 1) {
					if ((check[x + 1][y] == 0) && (count[x + 1] == y)) {
						ans = x + 1;
						System.out.println("block move h2-1: " + (x + 1) + "," + count[x + 1]);
					}
				}
				if (check[x][y] == 2 && check[x + 2][y] == 2 && check[x + 3][y] == 2 && check[x + 4][y] == 2) {
					if ((check[x + 1][y] == 0) && (count[x + 1] == y)) {
						ans = x + 1;
						System.out.println("aggr move h2-2: " + (x + 1) + "," + count[x + 1]);
					}
				} // left1

				if (check[x][y] == 1 && check[x + 1][y] == 1 && check[x + 3][y] == 1 && check[x + 4][y] == 1) {
					if ((check[x + 2][y] == 0) && (count[x + 2] == y)) {
						ans = x + 2;
						System.out.println("block move h3-1: " + (x + 2) + "," + count[x + 2]);
					}
				}
				if (check[x][y] == 2 && check[x + 1][y] == 2 && check[x + 3][y] == 2 && check[x + 4][y] == 2) {
					if ((check[x + 2][y] == 0) && (count[x + 2] == y)) {
						ans = x + 2;
						System.out.println("aggr move h3-2: " + (x + 2) + "," + count[x + 2]);
					}
				} // mid

				if (check[x][y] == 1 && check[x + 1][y] == 1 && check[x + 2][y] == 1 && check[x + 4][y] == 1) {
					if ((check[x + 3][y] == 0) && (count[x + 3] == y)) {
						ans = x + 3;
						System.out.println("block move h4-1: " + x + "," + count[x + 3]);
					}
				}
				if (check[x][y] == 2 && check[x + 1][y] == 2 && check[x + 2][y] == 2 && check[x + 4][y] == 2) {
					if ((check[x + 3][y] == 0) && (count[x + 3] == y)) {
						ans = x + 3;
						System.out.println("aggr move h4-2: " + x + "," + count[x + 3]);
					}
				} // right1

			}
		} // hori mid

		for (int x = 0; x < column; x++) {
			for (int y = 0; y < row - 4; y++) {
				if (check[x][y + 1] == 1 && check[x][y + 2] == 1 && check[x][y + 3] == 1 && check[x][y + 4] == 1) {
					if (count[x] == y) {
						System.out.println("block move v1: " + x + "," + count[x]);
						ans = x;
					}
				}
				if (check[x][y + 1] == 2 && check[x][y + 2] == 2 && check[x][y + 3] == 2 && check[x][y + 4] == 2) {
					if (count[x] == y) {
						ans = x;
						System.out.println("aggr move v1: " + x + "," + count[x]);
					}
				}
			}
		} // AI block or go for verti

		for (int x = 0; x <= column - 5; x++) {
			for (int y = 0; y <= row - 5; y++) {
				if (check[x + 1][y + 1] == 2 && check[x + 2][y + 2] == 2 && check[x + 3][y + 3] == 2) {
					if ((check[x][y] == 0) && (count[x] == y)) {
						System.out.println("aggr move |1-1: " + x + "," + count[x]);
						ans = x;
					}
					if ((check[x + 4][y + 4] == 0) && (count[x + 4] == y + 4)) {
						ans = x + 4;
						System.out.println("aggr move |1-2: " + (x + 4) + "," + count[x + 4]);
					}
				}
				if (check[x + 1][y + 1] == 1 && check[x + 2][y + 2] == 1 && check[x + 3][y + 3] == 1) {
					if ((check[x][y] == 0) && (count[x] == y)) {
						ans = x;
						System.out.println("block move |1-2: " + x + "," + count[x]);
					}
					if ((check[x + 4][y + 4] == 0) && (count[x + 4] == y + 4)) {
						ans = x + 4;
						System.out.println("block move |1-2: " + (x + 4) + "," + count[x + 4]);
					}
				} // -slope
			}
		}
		for (int x = 0; x <= column - 5; x++) {
			for (int y = 0; y <= row - 5; y++) {
				if (check[x + 1][y + 3] == 2 && check[x + 2][y + 2] == 2 && check[x + 3][y + 1] == 2) {
					if ((check[x][y + 4] == 0) && (count[x] == y + 4)) {
						ans = x;
						System.out.println("aggr move /1-1: " + x + "," + count[x]);
					}
					if ((check[x + 4][y] == 0) && (count[x + 4] == y)) {
						ans = x + 4;
						System.out.println("aggr move /1-2: " + (x + 4) + "," + count[x + 4]);
					}
				}
				if (check[x + 1][y + 3] == 1 && check[x + 2][y + 2] == 1 && check[x + 3][y + 1] == 1) {
					if ((check[x][y + 4] == 0) && (count[x] == y + 4)) {
						ans = x;
						System.out.println("block move /1-1: " + x + "," + count[x]);
					}
					if ((check[x + 4][y] == 0) && (count[x + 4] == y)) {
						ans = x + 4;
						System.out.println("block move /1-2: " + (x + 4) + "," + count[x + 4]);
					}
				} // +slope

			}
		}

		return ans;
	}

	public void pcmove() {
		if (won == 1) {

		} else {
			Random num = new Random();
			int x = num.nextInt(column);
			int brain = almost();
			if (brain != 100) {
				x = brain; // go for win or block wins( only verti or hori
				System.out.println("smarting");
			}

			if (count[x] != -1) {
				System.out.println("pc move is " + x + "," + count[x]);
				hi[x][count[x]].setBorder(new pcborder(10));
				turns--;
				check[x][count[x]] = 2;
				count[x]--;
				comc++;
				mylabel.setText("Player's Turn");
				coml.setText("Computer Turn:" + comc);
			} else {
				if (win() == 2)
					show(2);
				else if (draw() == true)
					show(0);
				else {
					pcmove();
				}

			}
		}
	}

	public static void main(String[] args) {
		JFrame tr = new Connect5();
		tr.setTitle("Connect5 Game");
		tr.setSize(700, 600);
		tr.setLocation(100, 0);
		tr.setVisible(true);
		tr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
