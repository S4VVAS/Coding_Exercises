package codingExercises;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SimpleCalculator {
	JFrame frame = new JFrame("Savvas's BOOTLEG yeetculator");

	Font font = new Font("", Font.BOLD, 40);
	
	GridLayout mainL = new GridLayout(6, 1, 10, 20);
	GridLayout bLayout = new GridLayout(1, 4, 10, 20);

	JButton one = new JButton("1");
	JButton two = new JButton("2");
	JButton three = new JButton("3");
	JButton four = new JButton("4");
	JButton five = new JButton("5");
	JButton six = new JButton("6");
	JButton seven = new JButton("7");
	JButton eight = new JButton("8");
	JButton nine = new JButton("9");
	JButton zero = new JButton("0");

	JButton plus = new JButton("+");
	JButton minus = new JButton("-");
	JButton times = new JButton("x");
	JButton devided = new JButton("/");
	JButton cl = new JButton("CL");
	JButton dot = new JButton(".");
	JButton equals = new JButton("=");
	JButton square = new JButton("^");
	JButton negative = new JButton("(-)");
	JButton del = new JButton("Del");

	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	JPanel p4 = new JPanel();
	JPanel p5 = new JPanel();
	JPanel p6 = new JPanel();

	JLabel label = new JLabel();

	private String currentVal = "";
	private int textFontSize = 50;
	private double storedValue = 0;
	private String operation = "plus";

	private void updateResult(String s) {
		label.setFont(new Font("", Font.BOLD, textFontSize));
		label.setText(s);
	}

	private void adder(double d) {
		if (operation.equals("plus")) {
			storedValue += d;
		}
		else if (operation.equals("minus")) {
			storedValue -= d;
		}
		else if (operation.equals("times")) {
			storedValue *= d;
		}
		else if (operation.equals("devided")) {
			storedValue /= d;
		}
		else if (operation.equals("square")) {
			storedValue *= storedValue;
		}
		else {
			return;
		}
		
		operation = "";
	}

	public SimpleCalculator() {

		// SETS COLOR OF BUTTONS

		one.setBackground(Color.white);
		two.setBackground(Color.white);
		three.setBackground(Color.white);
		four.setBackground(Color.white);
		five.setBackground(Color.white);
		six.setBackground(Color.white);
		seven.setBackground(Color.white);
		eight.setBackground(Color.white);
		nine.setBackground(Color.white);
		zero.setBackground(Color.white);

		plus.setBackground(Color.LIGHT_GRAY);
		minus.setBackground(Color.LIGHT_GRAY);
		times.setBackground(Color.LIGHT_GRAY);
		devided.setBackground(Color.LIGHT_GRAY);
		cl.setBackground(Color.ORANGE);
		dot.setBackground(Color.LIGHT_GRAY);

		equals.setBackground(Color.cyan);
		square.setBackground(Color.LIGHT_GRAY);
		negative.setBackground(Color.LIGHT_GRAY);
		del.setBackground(Color.LIGHT_GRAY);

		// SETS LAYOUT OF PANELS
		JPanel yo = new JPanel();
		
		frame.add(yo);
		yo.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		yo.setLayout(mainL);
		p2.setLayout(bLayout);
		p3.setLayout(bLayout);
		p4.setLayout(bLayout);
		p5.setLayout(bLayout);
		p6.setLayout(bLayout);

		// ADDS PANELS TO FRAME

		yo.add(p1);
		yo.add(p2);
		yo.add(p3);
		yo.add(p4);
		yo.add(p5);
		yo.add(p6);

		// ADDS ELEMENTS TO PANELS

		label.setFont(new Font("", Font.BOLD, textFontSize));
		updateResult("hello and welcom");
		p1.add(label);
		p1.setBorder(BorderFactory.createLoweredSoftBevelBorder());

		p2.add(one).setFont(font);
		p2.add(two).setFont(font);
		p2.add(three).setFont(font);
		p2.add(plus).setFont(font);

		p3.add(four).setFont(font);
		p3.add(five).setFont(font);
		p3.add(six).setFont(font);
		p3.add(minus).setFont(font);

		p4.add(seven).setFont(font);
		p4.add(eight).setFont(font);
		p4.add(nine).setFont(font);
		p4.add(times).setFont(font);

		p5.add(dot).setFont(font);
		p5.add(zero).setFont(font);
		p5.add(cl).setFont(font);
		p5.add(devided).setFont(font);

		p6.add(del).setFont(font);
		p6.add(negative).setFont(font);
		p6.add(square).setFont(font);
		p6.add(equals).setFont(font);

		// NUMBER ACTION EVENTS

		one.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (currentVal.length() < 14) {
					currentVal = currentVal + "1";
					updateResult(currentVal);
				} else if(currentVal.length() < 25){
					textFontSize -= 2;
					currentVal = currentVal + "1";
					updateResult(currentVal);
				}else{
					textFontSize -= 1;
					currentVal = currentVal + "1";
					updateResult(currentVal);
				}
			}
		});

		two.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (currentVal.length() < 14) {
					currentVal = currentVal + "2";
					updateResult(currentVal);
				} else if(currentVal.length() < 25){
					textFontSize -= 2;
					currentVal = currentVal + "2";
					updateResult(currentVal);
				}else{
					textFontSize -= 1;
					currentVal = currentVal + "2";
					updateResult(currentVal);
				}
			}
		});

		three.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (currentVal.length() < 14) {
					currentVal = currentVal + "3";
					updateResult(currentVal);
				} else if(currentVal.length() < 25){
					textFontSize -= 2;
					currentVal = currentVal + "3";
					updateResult(currentVal);
				}else{
					textFontSize -= 1;
					currentVal = currentVal + "3";
					updateResult(currentVal);
				}
			}
		});

		four.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (currentVal.length() < 14) {
					currentVal = currentVal + "4";
					updateResult(currentVal);
				} else if(currentVal.length() < 25){
					textFontSize -= 2;
					currentVal = currentVal + "4";
					updateResult(currentVal);
				}else{
					textFontSize -= 1;
					currentVal = currentVal + "4";
					updateResult(currentVal);
				}
			}
		});

		five.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (currentVal.length() < 14) {
					currentVal = currentVal + "5";
					updateResult(currentVal);
				} else if(currentVal.length() < 25){
					textFontSize -= 2;
					currentVal = currentVal + "5";
					updateResult(currentVal);
				}else{
					textFontSize -= 1;
					currentVal = currentVal + "5";
					updateResult(currentVal);
				}
			}
		});

		six.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (currentVal.length() < 14) {
					currentVal = currentVal + "6";
					updateResult(currentVal);
				} else if(currentVal.length() < 25){
					textFontSize -= 2;
					currentVal = currentVal + "6";
					updateResult(currentVal);
				}else{
					textFontSize -= 1;
					currentVal = currentVal + "6";
					updateResult(currentVal);
				}
			}
		});

		seven.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (currentVal.length() < 14) {
					currentVal = currentVal + "7";
					updateResult(currentVal);
				} else if(currentVal.length() < 25){
					textFontSize -= 2;
					currentVal = currentVal + "7";
					updateResult(currentVal);
				}else{
					textFontSize -= 1;
					currentVal = currentVal + "7";
					updateResult(currentVal);
				}
		}});

		eight.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (currentVal.length() < 14) {
					currentVal = currentVal + "8";
					updateResult(currentVal);
				} else if(currentVal.length() < 25){
					textFontSize -= 2;
					currentVal = currentVal + "8";
					updateResult(currentVal);
				}else{
					textFontSize -= 1;
					currentVal = currentVal + "8";
					updateResult(currentVal);
				}
			}
		});

		nine.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (currentVal.length() < 14) {
					currentVal = currentVal + "9";
					updateResult(currentVal);
				} else if(currentVal.length() < 25){
					textFontSize -= 2;
					currentVal = currentVal + "9";
					updateResult(currentVal);
				}else{
					textFontSize -= 1;
					currentVal = currentVal + "9";
					updateResult(currentVal);
				}
			}
		});

		zero.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (currentVal.length() < 14) {
					currentVal = currentVal + "0";
					updateResult(currentVal);
				} else if(currentVal.length() < 25){
					textFontSize -= 2;
					currentVal = currentVal + "0";
					updateResult(currentVal);
				}else{
					textFontSize -= 1;
					currentVal = currentVal + "0";
					updateResult(currentVal);
				}
			}
		});

		dot.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (currentVal.length() < 14) {
					currentVal = currentVal + ".";
					updateResult(currentVal);
				} else if(currentVal.length() < 25){
					textFontSize -= 2;
					currentVal = currentVal + ".";
					updateResult(currentVal);
				}else{
					textFontSize -= 1;
					currentVal = currentVal + ".";
					updateResult(currentVal);
				}
			}
		});

		// MATH OPERATIONS

		plus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				adder(Double.parseDouble(currentVal));
				operation = "plus";
				currentVal = "";
				updateResult(currentVal);
			}
		});

		minus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				adder(Double.parseDouble(currentVal));
				operation = "minus";
				currentVal = "";
				updateResult(currentVal);
			}
		});

		times.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				adder(Double.parseDouble(currentVal));
				operation = "times";
				currentVal = "";
				updateResult(currentVal);
			}
		});

		devided.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				adder(Double.parseDouble(currentVal));
				operation = "devided";
				currentVal = "";
				updateResult(currentVal);
			}
		});

		negative.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				currentVal = "-" + currentVal;
				storedValue = storedValue - (storedValue * 2);
				updateResult(currentVal);
			}
		});

		square.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				adder(Double.parseDouble(currentVal));
				operation = "square";
				
				adder(Double.parseDouble(currentVal));
				currentVal = Double.toString(storedValue);
				updateResult(currentVal);
			}
		});

		// EQUALS AND CLEAR OPERATIONS

		equals.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				adder(Double.parseDouble(currentVal));
				currentVal = Double.toString(storedValue);
				updateResult(currentVal);
			}
		});

		cl.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textFontSize = 50;
				updateResult("");
				currentVal = "";
				storedValue = 0;
				operation = "plus";
			}
		});

		del.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				currentVal = "";
				updateResult(currentVal);
			}
		});

		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setSize(450, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		new SimpleCalculator();
	}

}
