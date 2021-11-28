package zx.opengles;

import android.opengl.GLES20;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;

/**
 * @author Marek Kulawiak
 */

public class MainActivity extends Activity {
    protected ESSurfaceView glSurfaceView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        glSurfaceView = new ESSurfaceView(this);
        setContentView(R.layout.activity_main);
        View tempView = findViewById(R.id.tempView);
        ViewGroup parent = (ViewGroup) tempView.getParent();
        int index = parent.indexOfChild(tempView);
        parent.removeView(tempView);
        parent.addView(glSurfaceView, index);

        SeekBar sb = (SeekBar) findViewById(R.id.lightSeekBar);
        sb.setOnSeekBarChangeListener(new SeekBarListener());
    }

    @Override
    protected void onResume() {
        // The activity must call the GL surface view's onResume() on activity onResume().
        super.onResume();
        glSurfaceView.onResume();
    }

    @Override
    protected void onPause() {
        // The activity must call the GL surface view's onPause() on activity onPause().
        super.onPause();
        glSurfaceView.onPause();
    }

    public void setLightWhite(View view) {
        GLRenderer.colourOfLight = 0;
    }

    public void setLightOrange(View view) {
        GLRenderer.colourOfLight = 1;
    }

    public class SeekBarListener implements SeekBar.OnSeekBarChangeListener {
        public SeekBarListener() {
        }

        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            GLRenderer.positionOfLight = (float) progress;
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    }
}
