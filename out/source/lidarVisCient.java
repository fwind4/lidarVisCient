import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class lidarVisCient extends PApplet {





public void setup() {
    
    colorMode( RGB, 1.0f );
}

public void draw() {
}

  public void settings() {  size( 300, 300, OPENGL ); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "lidarVisCient" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
