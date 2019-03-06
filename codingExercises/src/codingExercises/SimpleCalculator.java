package codingExercises;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SimpleCalculator {
	JFrame frame = new JFrame("Savvas's BOOTLEG yeetculator");

	GridLayout mainL = new GridLayout(6, 1, 30, 30);
	GridLayout bLayout = new GridLayout(1, 4, 30, 30);

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
	JButton minus = new JButton("_");
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
	private int textFontSize = 40;
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

		one.setBackground(Color.LIGHT_GRAY);
		two.setBackground(Color.LIGHT_GRAY);
		three.setBackground(Color.LIGHT_GRAY);
		four.setBackground(Color.LIGHT_GRAY);
		five.setBackground(Color.LIGHT_GRAY);
		six.setBackground(Color.LIGHT_GRAY);
		seven.setBackground(Color.LIGHT_GRAY);
		eight.setBackground(Color.LIGHT_GRAY);
		nine.setBackground(Color.LIGHT_GRAY);
		zero.setBackground(Color.LIGHT_GRAY);

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

		frame.setLayout(mainL);
		p2.setLayout(bLayout);
		p3.setLayout(bLayout);
		p4.setLayout(bLayout);
		p5.setLayout(bLayout);
		p6.setLayout(bLayout);

		// ADDS PANELS TO FRAME

		frame.add(p1);
		frame.add(p2);
		frame.add(p3);
		frame.add(p4);
		frame.add(p5);
		frame.add(p6);

		// ADDS ELEMENTS TO PANELS

		label.setFont(new Font("", Font.BOLD, textFontSize));
		updateResult("hello and welcom");
		p1.add(label);
		p1.setBorder(BorderFactory.createLoweredSoftBevelBorder());

		p2.add(one);
		p2.add(two);
		p2.add(three);
		p2.add(plus);

		p3.add(four);
		p3.add(five);
		p3.add(six);
		p3.add(minus);

		p4.add(seven);
		p4.add(eight);
		p4.add(nine);
		p4.add(times);

		p5.add(dot);
		p5.add(zero);
		p5.add(cl);
		p5.add(devided);

		p6.add(del);
		p6.add(negative);
		p6.add(square);
		p6.add(equals);

		// NUMBER ACTION EVENTS

		one.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (currentVal.length() < 14) {
					currentVal = currentVal + "1";
					updateResult(currentVal);
				} else {
					textFontSize -= 2;
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
				} else {
					textFontSize -= 2;
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
				} else {
					textFontSize -= 2;
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
				} else {
					textFontSize -= 2;
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
				} else {
					textFontSize -= 2;
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
				} else {
					textFontSize -= 2;
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
				} else {
					textFontSize -= 2;
					currentVal = currentVal + "7";
					updateResult(currentVal);
				}
			}
		});

		eight.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (currentVal.length() < 14) {
					currentVal = currentVal + "8";
					updateResult(currentVal);
				} else {
					textFontSize -= 2;
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
				} else {
					textFontSize -= 2;
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
				} else {
					textFontSize -= 2;
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
				} else {
					textFontSize -= 2;
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
				textFontSize = 40;
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
		frame.setSize(350, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		new SimpleCalculator();
	}

}
