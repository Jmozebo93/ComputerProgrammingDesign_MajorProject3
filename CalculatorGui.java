/**
 * 
 */
package mp3;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author jordanmozebo
 * 
 * After the execution of this program, a calculator will appear. For simple operation such addition, subtraction, division, modular division, and integer division enter
 * the first number then the sign corresponding the operation you need to execute, and the second number and press equal. However, when it comes to special functions, such as
 * trigonometric functions, square root, a number raised to a certain power, the absolute value of a number, the number 10 raised to a certain power; you should start by entering
 * a number, then press on the functions you need to find, once pressed the answer will be displayed, you won't need to press equal. In addition to that, the percentage button does not
 * work, the decimal button does not work if you press it, it will give you an error. 
 * So there is no need to press them; plus, you will not need the button for the sign(+-) since you can just press the subtraction sign if you want a negative number.
 * Finally, trying to do multiple operations like "1 + 2 + 3 + 5" will not work, it will give you an error, multiple digits and single digits work though, and the result of the operation
 * depends on type of the variable, I used integers, but you can also use double or float.
 * 
 */
public class CalculatorGui implements ActionListener {
		private JFrame calculatorFrame;
		private JPanel controlPanel;
		private JTextField in;
		private JTextField out;
		private JButton one;
		private JButton two;
		private JButton three;
		private JButton four;
		private JButton five;
		private JButton six;
		private JButton seven;
		private JButton eight;
		private JButton nine;
		private JButton zero;
		private JButton add;
		private JButton sub;
		private JButton mult;
		private JButton div;
		private JButton percent;
		private JButton equal;
		private JButton powerx2;
		private JButton powerx3;
		private JButton mod;
		private JButton FirstDataManup;
		private JButton SecDataManup;
		private JButton dec;
		private JButton approx;
		private JButton log;
		private JButton ln;
		private JButton bin;
		private JButton abs;
		private JButton sin;
		private JButton cos;
		private JButton tan;
		private JButton asin;
		private JButton acos;
		private JButton atan;
		private JButton sinh;
		private JButton cosh;
		private JButton tanh;
		private JButton clear;
		private JButton exit;
		
		
		
		public CalculatorGui() {
			calculatorFrame = new JFrame("CI-Calculator");
			calculatorFrame.setSize(300, 430);
			calculatorFrame.getContentPane().setBackground(Color.GRAY);
			calculatorFrame.setResizable(true);
			controlPanel = new JPanel();
			controlPanel.setBackground(Color.GRAY);
			controlPanel.setLayout(null);
			
			in = new JTextField();
			in.setSize(300, 20);
			in.setBackground(Color.green);
			controlPanel.add(in);
			
			out = new JTextField();
			out.setSize(300,50);
			out.setLocation(0, 20);
			out.setBackground(Color.green);
			controlPanel.add(out);
			
			clear = new JButton("C");
			clear.setSize(50, 35);
			clear.setLocation(245, 75);
			clear.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					in.setText("");
					out.setText("");
				}
			});
			controlPanel.add(clear);
			
			seven = new JButton("7");
			seven.setSize(49, 35);
			seven.setLocation(8, 109);
			seven.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					in.setText(in.getText() + "7");
				}
			});
			controlPanel.add(seven);
			
			eight = new JButton("8");
			eight.setSize(49, 35);
			eight.setLocation(55, 109);
			eight.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					in.setText(in.getText() + "8");
				}
			});
			controlPanel.add(eight);
			
			nine = new JButton("9");
			nine.setSize(49, 35);
			nine.setLocation(103, 109);
			nine.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					in.setText(in.getText() + "9");
				}
			});
			controlPanel.add(nine);
			
			mult = new JButton("x");
			mult.setSize(49, 35);
			mult.setLocation(151, 109);
			mult.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					in.setText(in.getText() + "x");
				}
			});
			controlPanel.add(mult);
			
			div = new JButton("/");
			div.setSize(49, 35);
			div.setLocation(198, 109);
			div.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					in.setText(in.getText() + "/");
				}
			});
			controlPanel.add(div);
			
			powerx2 = new JButton("x^2");
			powerx2.setSize(49, 35);
			powerx2.setLocation(245, 109);
			powerx2.addActionListener(this);
			controlPanel.add(powerx2);
			
			four = new JButton("4");
			four.setSize(49, 35);
			four.setLocation(8, 143);
			four.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					in.setText(in.getText() + "4");
				}
			});
			controlPanel.add(four);
			
			five = new JButton("5");
			five.setSize(49, 35);
			five.setLocation(55, 143);
			five.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					in.setText(in.getText() + "5");
				}
			});
			controlPanel.add(five);
			
			six = new JButton("6");
			six.setSize(49, 35);
			six.setLocation(103, 143);
			six.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					in.setText(in.getText() + "6");
				}
			});
			controlPanel.add(six);
			
			add = new JButton("+");
			add.setSize(49, 35);
			add.setLocation(151, 143);
			add.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					in.setText(in.getText() + "+");
				}
			});
			controlPanel.add(add);
			
			sub = new JButton("-");
			sub.setSize(49, 35);
			sub.setLocation(198, 143);
			sub.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					in.setText(in.getText() + "-");
				}
			});
			controlPanel.add(sub);
			
			powerx3 = new JButton("x^3");
			powerx3.setSize(49, 35);
			powerx3.setLocation(245, 143);
			powerx3.addActionListener(this);
			controlPanel.add(powerx3);
			
			one = new JButton("1");
			one.setSize(49, 35);
			one.setLocation(8, 177);
			one.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					in.setText(in.getText() + "1");
				}
			});
			controlPanel.add(one);
			
			two = new JButton("2");
			two.setSize(49, 35);
			two.setLocation(55, 177);
			two.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					in.setText(in.getText() + "2");
				}
			});
			controlPanel.add(two);
			
			three = new JButton("3");
			three.setSize(49, 35);
			three.setLocation(103, 177);
			three.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					in.setText(in.getText() + "3");
				}
			});
			controlPanel.add(three);
			
			equal = new JButton("=");
			equal.setSize(98, 35);
			equal.setLocation(151, 177);
			equal.addActionListener(this);
			controlPanel.add(equal);
			
			mod = new JButton("Mod");
			mod.setSize(49, 35);
			mod.setLocation(245, 177);
			mod.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					in.setText(in.getText() + "%");
				}
			});
			controlPanel.add(mod);
			
			zero = new JButton("0");
			zero.setSize(49, 35);
			zero.setLocation(8, 211);
			zero.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					in.setText(in.getText()+ "0");
				}
			});
			controlPanel.add(zero);
			
			dec = new JButton(".");
			dec.setSize(49, 35);
			dec.setLocation(55, 211);
			dec.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					in.setText(in.getText() + ".");
				}
			});
			controlPanel.add(dec);
			
			approx = new JButton("+-");
			approx.setSize(49, 35);
			approx.setLocation(103, 211);
			approx.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					in.setText(in.getText() + "+-");
				}
			});
			controlPanel.add(approx);
			
			FirstDataManup = new JButton("1/n");
			FirstDataManup.setSize(49, 35);
			FirstDataManup.setLocation(151, 211);
			FirstDataManup.addActionListener(this);
			controlPanel.add(FirstDataManup);
			
			percent = new JButton("%");
			percent.setSize(49, 35);
			percent.setLocation(198, 211);
			controlPanel.add(percent);
			
			SecDataManup = new JButton("sqrt");
			SecDataManup.setSize(49, 35);
			SecDataManup.setLocation(245, 211);
			SecDataManup.addActionListener(this);
			controlPanel.add(SecDataManup);
			
			sin = new JButton("sin");
			sin.setSize(60, 35);
			sin.setLocation(8, 260);
			sin.addActionListener(this);
			controlPanel.add(sin);
			
			cos = new JButton("cos");
			cos.setSize(60, 35);
			cos.setLocation(67, 260);
			cos.addActionListener(this);
			controlPanel.add(cos);
			
			tan = new JButton("tan");
			tan.setSize(60, 35);
			tan.setLocation(126, 260);
			tan.addActionListener(this);
			controlPanel.add(tan);
			
			log = new JButton("log");
			log.setSize(60, 35);
			log.setLocation(186, 260);
			log.addActionListener(this);
			controlPanel.add(log);
			
			ln = new JButton("ln");
			ln.setSize(50, 35);
			ln.setLocation(246, 260);
			ln.addActionListener(this);
			controlPanel.add(ln);
			
			asin = new JButton("asin");
			asin.setSize(60, 35);
			asin.setLocation(8, 294);
			asin.addActionListener(this);
			controlPanel.add(asin);
			
			acos = new JButton("acos");
			acos.setSize(60, 35);
			acos.setLocation(67, 294);
			acos.addActionListener(this);
			controlPanel.add(acos);
			
			atan = new JButton("atan");
			atan.setSize(60, 35);
			atan.setLocation(126, 294);
			atan.addActionListener(this);
			controlPanel.add(atan);
			
			bin = new JButton("10^n");
			bin.setSize(60, 35);
			bin.setLocation(185, 294);
			bin.addActionListener(this);
			controlPanel.add(bin);
			
			abs = new JButton("abs");
			abs.setSize(50, 35);
			abs.setLocation(246, 294);
			abs.addActionListener(this);
			controlPanel.add(abs);
			
			sinh = new JButton("sinh");
			sinh.setSize(60, 35);
			sinh.setLocation(8, 328);
			sinh.addActionListener(this);
			controlPanel.add(sinh);
			
			cosh = new JButton("cosh");
			cosh.setSize(60, 35);
			cosh.setLocation(67, 328);
			cosh.addActionListener(this);
			controlPanel.add(cosh);
			
			tanh = new JButton("tanh");
			tanh.setSize(60, 35);
			tanh.setLocation(126, 328);
			tanh.addActionListener(this);
			controlPanel.add(tanh);
			
			exit = new JButton("EXIT");
			exit.setSize(110, 35);
			exit.setLocation(186, 328);
			exit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
			controlPanel.add(exit);
			
			
			
			calculatorFrame.add(controlPanel);
			calculatorFrame.setVisible(true);
		}
		
		public static void main(String[] args) {
			CalculatorGui calc = new CalculatorGui();
		}
			
			

	@Override
	public void actionPerformed(ActionEvent e) {
		Font f = new Font("SansSerif", Font.BOLD, 50);
		
		
		
		float result = 0;	
			
			if(e.getSource() == equal) {
				String op = in.getText();
				int addIndex = op.indexOf("+");
				int subIndex = op.indexOf("-");
				int multIndex = op.indexOf("x");
				int modIndex = op.indexOf("%");
				int divIndex = op.indexOf("/");
				
				if(addIndex > 0) {
					int a = Integer.parseInt(in.getText().substring(0,addIndex));
					int b = Integer.parseInt(in.getText().substring(addIndex + 1));
					result = a + b;
				}
				else if(subIndex > 0) {
					int c = Integer.parseInt(in.getText().substring(0,subIndex));
					int d = Integer.parseInt(in.getText().substring(subIndex + 1));
					result = c - d;
				}
				else if(multIndex > 0) {
					int g = Integer.parseInt(in.getText().substring(0,multIndex));
					int h = Integer.parseInt(in.getText().substring(multIndex + 1));
					
					result = g * h;
					
				}
				else if(modIndex > 0) {
					int m = Integer.parseInt(in.getText().substring(0,modIndex));
					int n = Integer.parseInt(in.getText().substring(modIndex + 1));
					
					result = m % n;
					
				}
				else if(divIndex > 0) {
					int x = Integer.parseInt(in.getText().substring(0,divIndex));
					int y = Integer.parseInt(in.getText().substring(divIndex + 1));
					
					result = x / y;
					
				}
				
				
			}
			
			else if(e.getSource() == sin) {
				double k = Double.parseDouble(in.getText());
				
				
					
					result =  (float) Math.sin(k);
					in.setText("sin("+ k +")");
					
			}
			else if(e.getSource() == cos) {
				double l = Double.parseDouble(in.getText());
				
					result =  (float) Math.cos(l);
					in.setText("cos("+ l +")");
					
				
			}
			
			else if(e.getSource() == tan) {
				double m = Double.parseDouble(in.getText());
				
				result =  (float) Math.tan(m);
				in.setText("tan("+ m +")");
				
			}
			else if(e.getSource() == asin) {
				double n = Double.parseDouble(in.getText());
				
				result =  (float) Math.asin(n);
				in.setText("asin("+ n +")");
				
			}
			else if(e.getSource() == acos) {
				double o = Double.parseDouble(in.getText());
				
				result =  (float) Math.acos(o);
				in.setText("acos("+ o +")");
				
			}
			else if(e.getSource() == atan) {
				double p = Double.parseDouble(in.getText());
				
				result =  (float) Math.atan(p);
				in.setText("atan("+  p +")");
			}
			else if(e.getSource() == sinh) {
				double g = Double.parseDouble(in.getText());
				
				result =  (float) Math.sinh(g);
				in.setText("sinh("+ g +")");
				
			}
			else if(e.getSource() == cosh) {
				double h = Double.parseDouble(in.getText());
				
				result =  (float) Math.cosh(h);
				in.setText("cosh("+ h +")");
			}
			else if(e.getSource() == tanh) {
				double i = Double.parseDouble(in.getText());
				
				result =  (float) Math.tanh(i);
				in.setText("tanh("+ i +")");
			}
			else if(e.getSource() == log) {
				double j = Double.parseDouble(in.getText());
				
				result =  (float) Math.log10(j);
				in.setText("log("+ j +")");
			}
			else if(e.getSource() == ln) {
				double k = Double.parseDouble(in.getText());
				
				result =  (float) Math.log(k);
				in.setText("ln("+ k +")");
			}
			else if(e.getSource() == abs) {
				int ab = Integer.parseInt(in.getText());
				
				result = (int) Math.abs(ab);
				in.setText("abs|"+ ab +"|");
				
			}
			else if(e.getSource() == FirstDataManup) {
				int ac = Integer.parseInt(in.getText());
				
				result = 1/ac;
				in.setText("1/"+ ac +"");
			}
			else if(e.getSource() == SecDataManup) {
				double bc = Double.parseDouble(in.getText());
				
				result =  (float) Math.sqrt(bc);
				in.setText("sqrt("+ bc +")");
				
				
			}
			else if(e.getSource() == bin) {
				double cb = Double.parseDouble(in.getText());
				
				result =  (float) Math.pow(10, cb);
				in.setText("10^"+ cb +"");
			}
			else if(e.getSource() == powerx3) {
				double c = Double.parseDouble(in.getText());
				
				result =  (float) Math.pow(c, 3);
				in.setText( c +"^"+ "3 ");
			}
			else if(e.getSource() == powerx2) {
				double d = Double.parseDouble(in.getText());
				
				result =  (float) Math.pow(d, 2);
				in.setText( d +"^"+ "2");
				
			}
			out.setText("                                                                   "+result);
			out.setFont(f);
		
	}
}
