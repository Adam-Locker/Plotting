import java.awt.*;
import javax.swing.*;

public class Plotting extends JFrame {

	public Plotting() {
		JSplitPane sp = new JSplitPane();
		// not middle, just hasty setting
		sp.setDividerLocation(1000);
		add(sp);
		sp.setLeftComponent(new CirclePanel());
		sp.setRightComponent(new JPanel());

		setSize(1000, 1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("DEMO");
		setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Plotting();
			}
		});
	}

	// inner class for demo, best not to use inner
	// for your purpose
	private class CirclePanel extends JPanel {
		public CirclePanel() {
			setBackground(Color.WHITE);
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			// smoother look
			Graphics2D g2 = (Graphics2D) g;
			g2.setColor(Color.BLACK);
			g2.drawLine(10, 0, 10, 1000);
			g2.drawLine(20, 0, 20, 1000);
			
			g2.setColor(Color.RED);
			g2.fillOval(0, 0, 10, 10);
			g2.fillOval(10, 0, 10, 10);
			g2.fillOval(20, 20, 10, 10);
		}
		
		
	}

}
