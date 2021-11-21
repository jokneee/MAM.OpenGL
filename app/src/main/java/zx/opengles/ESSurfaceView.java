package zx.opengles;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;

import org.xml.sax.helpers.AttributesImpl;

/**
 @author Marek Kulawiak
 */

class ESSurfaceView extends GLSurfaceView
{
	protected GLRenderer renderer=null;
    private VelocityTracker mVelocityTracker;

    public ESSurfaceView(Context context)
    {
        super(context);

        // Stworzenie kontekstu OpenGL ES 2.0.
        setEGLContextClientVersion(2);

        // Przypisanie renderera do widoku.
        renderer = new GLRenderer();
        renderer.setContext(getContext());
        setRenderer(renderer);
    }
    
    public GLRenderer getRenderer()
    {
    	return renderer;
    }

    private final float TOUCH_SCALE_FACTOR = 180.0f / 320;
    private float previousX;
    private float previousY;

    @Override
    public boolean onTouchEvent(MotionEvent e) {
        // MotionEvent reports input details from the touch screen
        // and other input controls. In this case, you are only
        // interested in events where the touch position changed.

        float x = e.getX();
        float y = e.getY();

        switch (e.getAction()) {
            case MotionEvent.ACTION_MOVE:

                float dx = x - previousX;
                float dy = y - previousY;

                // reverse direction of rotation above the mid-line
                if (y > getHeight() / 2) {
                    dx = dx * -1 ;
                }

                // reverse direction of rotation to left of the mid-line
                if (x < getWidth() / 2) {
                    dy = dy * -1 ;
                }

                renderer.setAngleX(
                        renderer.getAngleX() +
                                ((dx ) * TOUCH_SCALE_FACTOR));
                renderer.setAngleY(
                        renderer.getAngleY() +
                                ((dy) * TOUCH_SCALE_FACTOR));

                requestRender();
        }

        previousX = x;
        previousY = y;
        return true;
    }
}
