import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.border.Border;

class whiteborder implements Border {


    private int radius;


    whiteborder(int radius) {
        this.radius = radius;
    }
    public boolean isBorderOpaque() {
        return true;
    }

	@Override
	public Insets getBorderInsets(Component c) {
		// TODO Auto-generated method stub
		 return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
	}


	@Override
	public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
		// TODO Auto-generated method stub
		//g.drawRoundRect(x, y, width-1, height-1, radius, radius);
		g.setColor(Color.WHITE);
		g.drawOval(x, y, width-1, height-1);
		g.fillOval(x, y, width-1, height-1);
		
		
		
	}
}