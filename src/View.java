import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class View extends JPanel implements Observer, ActionListener {

	private Controller controller;
	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	private JPanel panel3 = new JPanel();
	private JPanel panel4 = new JPanel();
	
	private JTextField tfR1 = new JTextField();

	
	public View(Controller ctrl) {
		super(new GridBagLayout());
		//setBorder(MyBorderFactory.createMyBorder(" GridBagLayoutPanel "));
		this.controller = ctrl;

		byte a = 5;
		byte b = 4;
		byte c = (byte) (a|b);
		System.out.println(Float.POSITIVE_INFINITY + Float.NaN);
		
		
		panel1.setPreferredSize(new Dimension(200, 0));
		//panel1.setBorder(MyBorderFactory.createMyBorder(" Panel 1 "));
		System.out.println("Gr�ezi");
		
		panel1.setLayout(new GridBagLayout());
		// x, y, x-span, y-span, x-weight, y-weight, anchor, fill, insets(int top, int left, int bottom, int right), internal padding x, internal padding y. 
		panel1.add(new JLabel("R1"), new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
				new Insets(10, 10, 10, 10), 0, 0));
		panel1.add(tfR1, new GridBagConstraints(1, 0, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
				new Insets(10, 10, 10, 10), 0, 0));
		panel1.add(new JLabel("Ohm"), new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
				new Insets(10, 10, 10, 10), 0, 0));
		panel1.add(new JLabel(), new GridBagConstraints(1, 1, 1, 1, 0.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
				new Insets(10, 10, 10, 10), 0, 0));

		// x, y, x-span, y-span, x-weight, y-weight, anchor, fill, insets(int top, int left, int bottom, int right), internal padding x, internal padding y. 
		add(panel1, new GridBagConstraints(0, 0, 1, 2, 0.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
				new Insets(10, 10, 10, 10), 0, 0));

		panel2.setPreferredSize(new Dimension(80, 0));
		panel2.setBorder(MyBorderFactory.createMyBorder(" Panel 2 "));
		// x, y, x-span, y-span, x-weight, y-weight, anchor, fill, insets(int top, int left, int bottom, int right), internal padding x, internal padding y. 
		add(panel2, new GridBagConstraints(1, 0, 1, 1, 0.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
				new Insets(10, 10, 10, 10), 0, 0));

		panel3.setPreferredSize(new Dimension(80, 0));
		panel3.setBorder(MyBorderFactory.createMyBorder(" Panel 3 "));
		// x, y, x-span, y-span, x-weight, y-weight, anchor, fill, insets(int top, int left, int bottom, int right), internal padding x, internal padding y. 
		add(panel3, new GridBagConstraints(1, 1, 1, 1, 0.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
				new Insets(10, 10, 10, 10), 0, 0));

		panel4.setPreferredSize(new Dimension(120, 400));
		panel4.setBorder(MyBorderFactory.createMyBorder(" Panel 4 "));
		// x, y, x-span, y-span, x-weight, y-weight, anchor, fill, insets(int top, int left, int bottom, int right), internal padding x, internal padding y. 
		add(panel4, new GridBagConstraints(2, 0, 1, 2, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(10, 10, 10, 10), 0, 0));

		// x-weight, y-weight: 	Geben an wie die ZELLEN in x resp. y - Richtung wachsen!
		// anchor:				Gibt an, wie die Komponente innerhab der zugeh�rigen Zellen verankert ist!
		// fill:				Gibt an, wie die KOMPONENTE sich an die zugeh�rigen Zellen anpasst!
	}
	
	public void actionPerformed(ActionEvent e) {}


	public void update(Observable modelObject, Object dataObject) {
		Model model = (Model) modelObject;
	}
}
