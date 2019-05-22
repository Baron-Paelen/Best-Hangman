package pkg;

public interface InputControl{
    public void onMouseClick(double x, double y);
	public void onMousePress(double x, double y);
	public void onMouseRelease(double x, double y);
	public void onMouseEnter(double x, double y);
	public void onMouseExit(double x, double y);
	public void onMouseDrag(double x, double y);
	public void onMouseMove(double x, double y);
}