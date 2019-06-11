import pkg.*;

public class Button implements InputControl{
	
	private RectangleWO rect;
	private boolean hasMethod;
	private boolean isToggled;
	private boolean isPressed;
	private Text label;
	private Color originalColor;
	private Color originalOutlineColor;
	private Runnable r;
	
	public Button()
	{
		MouseController mC = new MouseController(Canvas.getInstance(), this);
		hasMethod = false;
		isToggled = true;
		isPressed = false;
		originalColor = new Color(255, 255, 255);
		originalOutlineColor = new Color(255, 255, 255);
	}
	
	public Button(int x, int y, int w, int h, Color c1, Color c2)
	{
		this();
		rect = new RectangleWO(x, y, w, h, 4);
		rect.setColor(c1);
		rect.setOutlineColor(c2);
		originalColor = new Color(c1);
		originalOutlineColor = new Color(c2);
	}
	
	public Button(RectangleWO wo)
	{
		this();
		rect = new RectangleWO(wo.getX(), wo.getY(), wo.getWidth(), wo.getHeight(), 4);
		rect.setColor(wo.getColor());
		rect.setOutlineColor(wo.getOutlineColor());
		originalColor = new Color(wo.getColor());
		originalOutlineColor = new Color(wo.getOutlineColor());
	}
	
	public RectangleWO getRect()
	{
		return rect;
	}
	
	public void addLabel(String newLabel)
	{
		label = new Text(
			rect.getX(),
			rect.getY(), 
			newLabel
		);
		label.translate((rect.getWidth() - label.getWidth()) / 2, (rect.getHeight() - label.getHeight()) / 2);
	}
	
	// returns the new value
	public boolean toggle()
	{
		isToggled = !isToggled;
		return isToggled;
	}
	
	public void addMethod(Runnable toRun)
	{
		r = toRun;
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
		toggle();
		if(label != null) {
			label.undraw();
		}
	}
	
	public void onMousePress(double x, double y)
	{
		if(rect.contains(x, y)) {
			if(isToggled) {
				isPressed = true;
				if(r != null) {
					new Thread(r).start();
				}
				rect.setColor(rect.getColor().shadedColor(32));
				rect.setOutlineColor(rect.getOutlineColor().shadedColor(32));
			}
		}
	}
	
	public void onMouseRelease(double x, double y)
	{
		if(isPressed) {
			isPressed = false;
			rect.setColor(originalColor);
			rect.setOutlineColor(originalOutlineColor);
		}
	}
	public void onMouseDrag(double x, double y){}
	public void onMouseMove(double x, double y){}
	public void onMouseEnter(double x, double y){}
	public void onMouseExit(double x, double y){}
	public void onMouseClick(double x, double y){}
}

