//HIDE
package pkg;
public class Color
{
    private int red,red1;
    private int green,green1;
    private int blue,blue1;

    // Color constants

    public static final Color RED = new Color(255, 0, 0);
    public static final Color GREEN = new Color(0, 255, 0);
    public static final Color BLUE = new Color(0, 0, 255);
    public static final Color WHITE = new Color(255, 255, 255);
    public static final Color LIGHT_GRAY = new Color(192, 192, 192);
    public static final Color GRAY = new Color(128, 128, 128);
    public static final Color DARK_GRAY = new Color(64, 64, 64);
    public static final Color BLACK = new Color(0, 0, 0);
    public static final Color CYAN = new Color(0, 255, 255);
    public static final Color MAGENTA = new Color(255, 0, 255);
    public static final Color YELLOW = new Color(255, 255, 0);
    public static final Color PINK = new Color(255, 175, 175);
    public static final Color ORANGE = new Color(255, 200, 0);
    
    /**
     * Constructs a new Color object.
     * @param red the red value of the color (between 0 and 255)
     * @param green the green value of the color (between 0 and 255)
     * @param blue the blue value of the color (between 0 and 255)
     */
    public Color(int red, int green, int blue)
    {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }
	
	public Color(Color c)
    {
        red = c.getRed();
        green = c.getGreen();
		blue = c.getBlue();
    }

    /**
     * Gets the red value of this color.
     * @return the red value (between 0 and 255)
     */
    public int getRed()
    {
       return red;
    }

    /**
     * Gets the green value of this color.
     * @return the green value (between 0 and 255)
     */
    public int getGreen()
    {
       return green;
    }

    /**
     * Gets the blue value of this color.
     * @return the blue value (between 0 and 255)
     */
    public int getBlue()
    {
       return blue;
    }
	
	//Sets the red value
	public void setRed(int nRed)
	{
		this.red = nRed;
	}
	
	//Sets the green value
	public void setGreen(int nGreen)
	{
		this.green = nGreen;
	}
	
	//Sets the blue value
	public void setBlue(int nBlue)
	{
		this.blue = nBlue;
	}
	
	//Creates a random color
	public static Color rRGB()
	{
		Color c = new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
		return c;
	}
	
	public Color shadedColor(int c) {
		int nRed = red - c;
		if(nRed < 0) nRed = 0;
		
		int nGreen = green - c;
		if(nGreen < 0) nGreen = 0;
		
		int nBlue = blue - c;
		if(nBlue < 0) nBlue = 0;
		
		return new Color(nRed, nGreen, nBlue);
	}
}
