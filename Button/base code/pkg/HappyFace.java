//HIDE
package pkg;
public class HappyFace
{
	private Rectangle mouth;
	private Ellipse outline;
	private Ellipse lEye, rEye;
	public HappyFace(double x, double y)
	{
		outline = new Ellipse(x,y,70,70);
		lEye =    new Ellipse(x+15,y+15,10,10);
		rEye =    new Ellipse(x+55,y+15,10,10);
		mouth = new Rectangle(x+20,y+50,30,10);
	}
	
	public void draw()
	{
		outline.draw();
		rEye.fill();
		lEye.fill();
		mouth.fill();
	}
	
	public void translate(double dx, double dy)
	{
		outline.translate(dx,dy);
		rEye.translate(dx,dy);
		lEye.translate(dx,dy);
		mouth.translate(dx,dy);
	}
}
