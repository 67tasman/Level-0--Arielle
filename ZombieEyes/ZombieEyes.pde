void setup(){
  size(500,500);
 PImage face = loadImage("scary-zombie-face-3d-model.jpg");
 face.resize(500,500);
image(face, 0, 0);

}
void draw(){
  fill(mouseX,0, mouseY);
  ellipse(130+50,130+85,20,20);
  ellipse(207+80,130+85,20,20);
 


fill(0,0,0);
ellipse(mouseX/50 + 127+49, mouseY/50 + 127+83,5,5);
  ellipse(mouseX/50 + 204+79,mouseY/50 + 127+83,5,5);
  
  
  

}