//HIDE
package pkg;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.BasicStroke;

public class Line implements Shape
{
    private Color color = Color.BLACK;
	private double thickness = 3;
    private double x1,y1,x2,y2;

    /**
       Constructs an empty line.
    */
    public Line()
    {
        x1 = 0;
        y1 = 0;
        x2 = 0;
        y2 = 0;
    }       

    /**
       Constructs a line.
       @param x1 coordinate of first x position
       @param y1 coordinate of first y position
       @param x2 coordinate of second x position
       @param y2 coordinate of second y position
    */
    public Line(double x1, double y1, double x2, double y2)
    {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

	/**
       Gets the width of this line.
       @return the width
    */    
    public int getWidth()
    {
        return (int) Math.round(x2-x1);
    }

    /**
       Gets the height of this line.
       @return the height
    */    
	public int getHeight()
    {
        return (int) Math.round(y2-y1);
    }
	
	/** Garbage */
    public int getX(){return 0;}
	/** Garbage */
    public int getY(){return 0;}
    
	
    /**
       Gets the x position of the first coord
    */
    public int getX1()
    {
        return (int) Math.round(x1);
    }

    /**
       Gets the y position of the first coord
    */
    public int getY1()
    {
        return (int) Math.round(y1);
    }
	
	/**
       Gets the x position of the second coord
    */
    public int getX2()
    {
        return (int) Math.round(x2);
    }

    /**
       Gets the y position of the second coord
    */
    public int getY2()
    {
        return (int) Math.round(y2);
    }
	
    /**
       Moves this line by a given amount.
       @param dx the amount by which to move in x-direction
       @param dy the amount by which to move in y-direction
    */
    public void translate(double dx, double dy)
    {
        x1 += dx;
        y1 += dy;
		x2 += dx;
        y2 += dy;
        Canvas.getInstance().repaint();
    }
	
	public void setThickness(int thicc)
	{
		thickness = thicc;
		Canvas.getInstance().repaint();
	}

    /**
       Resizes this rectangle both horizontally and vertically.
       @param dw the amount by which to resize the width on each side
       @param dw the amount by which to resize the height on each side
    */
    public void grow(double dw, double dh)
    {
		/** Copied from Neato's Line Class*/
        if (x1 <= x2)
        {
            x1 -= dw;
            x2 += dw;
        }
        else
        {
            x1 += dw;
            x2 -= dw;
        }
        if (y1 <= y2)
        {
            y1 -= dh;
            y2 += dh;
        }
        else
        {
            y1 += dh;
            y2 -= dh;
        }
            
        Canvas.getInstance().repaint();
    }

    /**
       Sets the color of this line.
       @param newColor the new color
    */
    public void setColor(Color newColor)
    {
        color = newColor;
        Canvas.getInstance().repaint();
    }

	/**
       Draws this line.
    */
    public void draw()
    {
        Canvas.getInstance().show(this);
    }
	
	public void undraw()
	{
		Canvas.getInstance().delete(this);
	}

    public String toString()
    {
        return "Line[x1=" + getX1() + ",y1=" + getY1() + ",x2=" + getX2() + ",y2=" + getY2() + "]";
    }

    public void paintShape(Graphics2D g2)
    {
        Line2D.Double line = new Line2D.Double(getX1(), getY1(), getX2(), getY2());
        g2.setColor(new java.awt.Color((int) color.getRed(), (int) color.getGreen(), (int) color.getBlue()));
		BasicStroke stroke = new BasicStroke((float)(thickness), BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
		g2.setStroke(stroke);
        g2.draw(line);
    }
}
