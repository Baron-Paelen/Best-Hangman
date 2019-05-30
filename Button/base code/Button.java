import pkg.*;

interface ButtonRunnable<T> {
	void runThis(T... list);
}

public class Button<T> implements InputControl{
	
	private RectangleWO rect;
	private boolean hasMethod;
	private boolean isToggled;
	private T[] t;
	private ButtonRunnable<T> r;
	private Text label;
	
	public Button()
	{
		MouseController mC = new MouseController(Canvas.getInstance(), this);
		hasMethod = false;
		isToggled = true;
	}
	
	public Button(int x, int y, int w, int h, Color c1, Color c2)
	{
		this();
		rect = new RectangleWO(x, y, w, h, 4);
		rect.setColor(c1);
		rect.setOutlineColor(c2);
	}
	
	public Button(RectangleWO wo)
	{
		this();
		rect = new RectangleWO(wo.getX(), wo.getY(), wo.getWidth(), wo.getHeight(), 4);
		rect.setColor(wo.getColor());
		rect.setOutlineColor(wo.getOutlineColor());
	}
	
	public RectangleWO getRect()
	{
		return rect;
	}
	
	public void addLabel(String newLabel)
	{
		label = new Text(
			rect.getX() + (rect.getWidth() - label.getWidth()) / 2,
			rect.getY() + (rect.getHeight() - label.getHeight()) / 2, 
			newLabel
		);
	}
	
	// returns the new value
	public boolean toggle()
	{
		isToggled = !isToggled;
		return isToggled;
	}
	
	public void addMethod(ButtonRunnable<T> r1, T... t1)
	{
		r = r1;
		t = t1;
		hasMethod = true;
	}
	
	public void draw()
	{
		rect.draw();
		if(label != null) {
			label.draw();
		}
	}
	
	public void undraw() {
		rect.undraw();
		if(label != null) {
			label.undraw();
		}
	}
	
	public void onMousePress(double x, double y)
	{
		if(rect.contains(x, y))
			if(hasMethod && isToggled)
				r.runThis(t);
	}
	
	public void onMouseRelease(double x, double y){}
	public void onMouseDrag(double x, double y){}
	public void onMouseMove(double x, double y){}
	public void onMouseEnter(double x, double y){}
	public void onMouseExit(double x, double y){}
	public void onMouseClick(double x, double y){}
}

