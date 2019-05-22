//HIDE
package pkg;

public class RectangleWO extends Rectangle
{
	Rectangle outline;
    public RectangleWO(double x, double y, double width, double height, double thickness)
    {
        super(x, y, width, height);
		outline = new Rectangle(x - thickness, y - thickness, width + 2 * thickness, height + 2 * thickness);
    }
	
    public void setOutlineColor(Color newColor)
    {
		outline.setColor(newColor);
    }
	
	public Color getOutlineColor()
	{
		return outline.getColor();
	}
	
	@Override
    public void draw()
    {
        outline.fill();
		super.fill();
    }
	
	@Override
	public void undraw()
	{
		outline.undraw();
		super.undraw();
	}

    // public String toString()
    // {
        // return "Rectangle[x=" + getX() + ",y=" + getY() + ",width=" + getWidth() + ",height=" + getHeight() + "]";
    // }
}
