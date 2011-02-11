package www3.ntu.edu.sg;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import www3.ntu.edu.sg.cube.PhotoCube;
import www3.ntu.edu.sg.cube.TextureCube;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.opengl.GLU;

//public class MyGLRenderer implements Renderer {
public class MyGLRenderer implements GLSurfaceView.Renderer {
	Context context;
	
	int currentTextureFilter = 0;  // Texture filter (NEW)

//	private  Triangle triangle;
//	Square quad;
//	 
//	// Rotational angle and speed (NEW)
//	   private float angleTriangle = 0.0f; // (NEW)
//	   private float angleQuad = 0.0f;     // (NEW)
//	   private float speedTriangle = 0.5f; // (NEW)
//	   private float speedQuad = -0.4f;    // (NEW)

	  // private Pyramid pyramid;    // (NEW)
	  // private Cube cube;          // (NEW)
	   //private Cube1 cube; 
	   //private Cube2 cube; 	   
	  // private TextureCube cube;
	  // private PhotoCube cube;   
	  private TextureCube cube;
	   
	   // For controlling cube's z-position, x and y angles and speeds (NEW)
	   float angleX = 0;   // (NEW)
	   float angleY = 0;   // (NEW)
	   float speedX = 0;   // (NEW)
	   float speedY = 0;   // (NEW)
	   float z = -6.0f;    // (NEW)


	   
	  // private static float anglePyramid = 0; // Rotational angle in degree for pyramid (NEW)
	   private static float angleCube = 0;    // Rotational angle in degree for cube (NEW)
	 //  private static float speedPyramid = 2.0f; // Rotational speed for pyramid (NEW)
	   private static float speedCube = -1.5f;   // Rotational speed for cube (NEW)


	public MyGLRenderer(Context context) {
		 this. context = context;

//		// Set up the data-array buffers for these shapes
//		triangle = new Triangle(); //
//		quad = new Square();
		 
		// Set up the buffers for these shapes
	     // pyramid = new Pyramid();   // (NEW)
	      //cube = new Cube();         // (NEW)
	      //cube = new Cube1(); 
	     // cube = new Cube2();   
	    //  cube = new TextureCube();  
		 //cube = new PhotoCube(context);
		 cube = new TextureCube();  
	}

	@Override
	public void onSurfaceCreated(GL10 gl, EGLConfig config) {
		gl.glClearColor(0.2f, 0.2f, 0.2f, 1.0f); // Set color's clear-value to
													// black
		gl.glClearDepthf(1.0f); // Set depth's clear-value to farthest
		gl.glEnable(GL10.GL_DEPTH_TEST); // Enables depth-buffer for hidden
											// surface removal
		gl.glDepthFunc(GL10.GL_LEQUAL);
		gl.glHint(GL10.GL_PERSPECTIVE_CORRECTION_HINT, GL10.GL_NICEST); // nice
																		// perspective
																		// view
		gl.glShadeModel(GL10.GL_SMOOTH); // Enable smooth shading of color
		gl.glDisable(GL10.GL_DITHER); // Disable dithering for better
										// performance

		// You OpenGL|ES initialization code here
		// Setup Texture, each time the surface is created (NEW)
	    //  cube.loadTexture(gl, context);    // Load image into Texture (NEW)
		//cube.loadTexture(gl);             // Load images into textures (NEW)
		cube.loadTexture(gl, context);
		
	      gl.glEnable(GL10.GL_TEXTURE_2D);  // Enable texture (NEW)


	}

	@Override
	public void onDrawFrame(GL10 gl) {
		// Clear color and depth buffers using clear-value set earlier
		gl.glClear(GL10.GL_COLOR_BUFFER_BIT | GL10.GL_DEPTH_BUFFER_BIT);

		// You OpenGL|ES rendering code here
//		gl.glLoadIdentity(); // Reset model-view matrix ( NEW )
//		gl.glTranslatef(-1.5f, 0.0f, -6.0f); // Translate left and into the screen ( NEW )
//		gl.glRotatef(angleTriangle, 0.0f, 1.0f, 0.0f); // Rotate the triangle about the y-axis (NEW)
//
//		triangle.draw(gl); // Draw triangle ( NEW )
//		
////   	// Translate right, relative to the previous translation ( NEW )
////		gl.glTranslatef(3.0f, 0.0f, 0.0f);
////		quad.draw(gl); // Draw quad ( NEW )		
//		 gl.glLoadIdentity();                 // Reset the mode-view matrix (NEW)
//	      gl.glTranslatef(1.5f, 0.0f, -6.0f);  // Translate right and into the screen (NEW)
//	      gl.glRotatef(angleQuad, 1.0f, 0.0f, 0.0f); // Rotate the square about the x-axis (NEW)
//	      quad.draw(gl);                       // Draw quad
//
//	      // Update the rotational angle after each refresh (NEW)
//	      angleTriangle += speedTriangle; // (NEW)
//	      angleQuad += speedQuad;         // (NEW)


//		// ----- Render the Pyramid -----
//	      gl.glLoadIdentity();                 // Reset the model-view matrix
//	      gl.glTranslatef(-1.5f, 0.0f, -6.0f); // Translate left and into the screen
//	      gl.glRotatef(anglePyramid, 0.1f, 1.0f, -0.1f); // Rotate (NEW)
//	      pyramid.draw(gl);                              // Draw the pyramid (NEW)
//	    
//	      // ----- Render the Color Cube -----
//	      gl.glLoadIdentity();                // Reset the model-view matrix
//	      gl.glTranslatef(1.5f, 0.0f, -6.0f); // Translate right and into the screen
//	      gl.glScalef(0.8f, 0.8f, 0.8f);      // Scale down (NEW)
//	      gl.glRotatef(angleCube, 1.0f, 1.0f, 1.0f); // rotate about the axis (1,1,1) (NEW)
//	      cube.draw(gl);                      // Draw the cube (NEW)
		
//	      // ----- Render the texture Cube -----
//	      gl.glLoadIdentity();                // Reset the model-view matrix
//	      gl.glTranslatef(0f, 0.0f, -6.0f); // Translate right and into the screen
//	      gl.glScalef(0.8f, 0.8f, 0.8f);      // Scale down (NEW)
//	      gl.glRotatef(angleCube, 1.0f, 1.0f, 1.0f); // rotate about the axis (1,1,1) (NEW)
//	      cube.draw(gl);                      // Draw the cube (NEW)
//	      
//	      // Update the rotational angle after each refresh (NEW)
//	     // anglePyramid += speedPyramid;   // (NEW)
//	      angleCube += speedCube;         // (NEW)
		
		// ----- Render the Cube -----
	      gl.glLoadIdentity();              // Reset the model-view matrix
	      gl.glTranslatef(0.0f, 0.0f, z);   // Translate into the screen (NEW)
	      gl.glRotatef(angleX, 1.0f, 0.0f, 0.0f); // Rotate (NEW)
	      gl.glRotatef(angleY, 0.0f, 1.0f, 0.0f); // Rotate (NEW)
	      
	      //cube.draw(gl);
	      cube.draw(gl, currentTextureFilter); 
	      
	      // Update the rotational angle after each refresh (NEW)
	      angleX += speedX;  // (NEW)
	      angleY += speedY;  // (NEW)


	}

	@Override
	public void onSurfaceChanged(GL10 gl, int width, int height) {
		if (height == 0)
			height = 1;
		float aspect = (float) width / height;
		// Set the viewport (display area) to cover the entire window
		// set the Android's view port (display area) to cover the entire screen
		// from (0,0) to (width-1, height-1):
		gl.glViewport(0, 0, width, height);
		// Setup perspective projection, with aspect ratio matches viewport
		gl.glMatrixMode(GL10.GL_PROJECTION); // Select projection matrix
		gl.glLoadIdentity(); // reset projection matrix
		// Use perspective projection
		GLU.gluPerspective(gl, 45, aspect, 0.1f, 100.f);

		gl.glMatrixMode(GL10.GL_MODELVIEW); // Select model-view matrix
		gl.glLoadIdentity(); // reset

		// You OpenGL|ES display re-sizing code here
		// ......
	}

}
