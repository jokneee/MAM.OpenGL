package zx.opengles;

import android.os.Bundle;
import android.app.Activity;

/**
 @author Marek Kulawiak
 */

public class MainActivity extends Activity
{
	protected ESSurfaceView glSurfaceView;

	@Override
	public void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		glSurfaceView = new ESSurfaceView(this);

		setContentView(glSurfaceView);
	}

	@Override
	protected void onResume() 
	{
		// The activity must call the GL surface view's onResume() on activity onResume().
		super.onResume();
		glSurfaceView.onResume();
	}

	@Override
	protected void onPause() 
	{
		// The activity must call the GL surface view's onPause() on activity onPause().
		super.onPause();
		glSurfaceView.onPause();
	}
}
