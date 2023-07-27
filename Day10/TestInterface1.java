interface Drawable{

void draw();
}

//implementation: by second user

class Rectangle implements Drawable{
public void draw(){System.out.println("drawing rectangle");}

}

class Circle implements Drawable{
public void draw(){System.out.println("drawing circle");}
}

//Using interface: by third user

//Main class starting
class TestInterface1{

//main method starting
public static void main(String args[]){


Drawable d = new Rectangle
(); //In scenario, object is provided by method e.g getDrawable()
d.draw();

}
}