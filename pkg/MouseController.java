package pkg;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseController{

    private Canvas c = null;
    private InputControl iC;

    public MouseController(Canvas c, InputControl iC){
        this.c = c;
        this.iC = iC;
        System.out.println("Mouse Started");
        handleClick();
    }

    private void handleClick(){
        this.c.frame.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
				int x = e.getX()-8;
                int y = e.getY()-31;
                iC.onMouseClick(x,y);
            }

            @Override
            public void mousePressed(MouseEvent e) {
				int x = e.getX()-8;
                int y = e.getY()-31;
                iC.onMousePress(x,y);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
				int x = e.getX()-8;
                int y = e.getY()-31;
                iC.onMouseRelease(x,y);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
				int x = e.getX()-8;
                int y = e.getY()-31;
                iC.onMouseEnter(x,y);
            }

            @Override
            public void mouseExited(MouseEvent e) {
				int x = e.getX()-8;
                int y = e.getY()-31;
                iC.onMouseExit(x,y);
            }
        });
		this.c.frame.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
				int x = e.getX()-8;
                int y = e.getY()-31;
				iC.onMouseDrag(x,y);
            }

			@Override
			public void mouseMoved(MouseEvent e) {
				int x = e.getX()-8;
                int y = e.getY()-31;
				iC.onMouseMove(x,y);
			}
        });

    }

}