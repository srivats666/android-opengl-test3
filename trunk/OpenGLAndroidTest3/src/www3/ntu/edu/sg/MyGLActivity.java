package www3.ntu.edu.sg;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;

public class MyGLActivity extends Activity {
	private GLSurfaceView glView;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);
//        glView = new GLSurfaceView(this);
//        glView.setRenderer(new MyGLRenderer(this));
//        this.setContentView(glView);                // This activity sets to GLSurfaceView

        glView = new MyGLSurfaceView(this);
        setContentView(glView);  // Set View (NEW)

    }
    
    @Override
    protected void onPause(){
    	super.onPause();
    	glView.onPause();
    }
    
    @Override
    protected void onResume(){
    	super.onResume();
    	glView.onResume();
    }
}