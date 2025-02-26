package rocks.zipcode.dreamhouse;

/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {       // Building
        wall = new Square();
        wall.changeColor("white");
        wall.moveVertical(150);
        wall.changeSize(75);
        wall.makeVisible();
            // Building
        wall = new Square();
        wall.changeColor("white");
        wall.moveVertical(150);
        wall.moveHorizontal(40);
        wall.changeSize(75);
        wall.makeVisible();
            // Building
        wall = new Square();
        wall.changeColor("white");
        wall.moveVertical(100);
        wall.moveHorizontal(40);
        wall.changeSize(75);
        wall.makeVisible();
            // Grass
        wall = new Square();
        wall.changeColor("green");
        wall.moveVertical(200);
        wall.moveHorizontal(-60);
        wall.changeSize(300);
        wall.makeVisible();
            // Bottom Right Window
        window = new Square();
        window.changeColor("blue");
        window.moveHorizontal(90);
        window.moveVertical(160);
        window.changeSize(15);
        window.makeVisible();
            // Top Right Window
        window = new Square();
        window.changeColor("blue");
        window.moveHorizontal(90);
        window.moveVertical(120);
        window.changeSize(15);
        window.makeVisible();
            // Top Left Window
        window = new Square();
        window.changeColor("blue");
        window.moveHorizontal(50);
        window.moveVertical(120);
        window.changeSize(15);
        window.makeVisible();
            // Bottom Left Window
        window = new Square();
        window.changeColor("blue");
        window.moveHorizontal(50);
        window.moveVertical(160);
        window.changeSize(15);
        window.makeVisible();
            // Garage Door
        window = new Square();
        window.changeColor("blue");
        window.moveHorizontal(7);
        window.moveVertical(170);
        window.changeSize(30);
        window.makeVisible();

        roof = new Triangle();
        roof.changeColor("red");
        roof.changeSize(45, 85);
        roof.moveHorizontal(85);
        roof.moveVertical(90);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeColor("red");
        roof.changeSize(20, 45);
        roof.moveHorizontal(30);
        roof.moveVertical(165);
        roof.makeVisible();
            // Moon white
        sun = new Circle();
        sun.changeColor("white");
        sun.moveHorizontal(180);
        sun.moveVertical(-10);
        sun.changeSize(60);
        sun.makeVisible();
            // Bush on Right
        sun = new Circle();
        sun.changeColor("green");
        sun.moveHorizontal(220);
        sun.moveVertical(165);
        sun.changeSize(40);
        sun.makeVisible();
            // Bush on Left
        sun = new Circle();
        sun.changeColor("green");
        sun.moveHorizontal(170);
        sun.moveVertical(165);
        sun.changeSize(40);
        sun.makeVisible();
            // Tree 'trunk' bottom
        window = new Square();
        window.changeColor("green");
        window.moveHorizontal(-40);
        window.moveVertical(185);
        window.changeSize(15);
        window.makeVisible();
            // Tree 'trunk' middle
        window = new Square();
        window.changeColor("green");
        window.moveHorizontal(-40);
        window.moveVertical(170);
        window.changeSize(15);
        window.makeVisible();
            // Tree 'trunk' top
        window = new Square();
        window.changeColor("green");
        window.moveHorizontal(-40);
        window.moveVertical(155);
        window.changeSize(15);
        window.makeVisible();
            // Tree 'leaves'
        roof = new Triangle();
        roof.changeColor("green");
        roof.changeSize(75, 35);
        roof.moveHorizontal(-25);
        roof.moveVertical(120);
        roof.makeVisible();
            // Door Bottom
        window = new Square();
        window.changeColor("blue");
        window.moveHorizontal(70);
        window.moveVertical(185);
        window.changeSize(15);
        window.makeVisible();
            // Door Top
        window = new Square();
        window.changeColor("blue");
        window.moveHorizontal(70);
        window.moveVertical(175);
        window.changeSize(15);
        window.makeVisible();
            // Doorknob
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(115);
        sun.moveVertical(175);
        sun.changeSize(7);
        sun.makeVisible();
            // Moon Cover
        sun = new Circle();
        sun.changeColor("black");
        sun.moveHorizontal(170);
        sun.moveVertical(-10);
        sun.changeSize(60);
        sun.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("orange");
            window.changeColor("light_gray");
            roof.changeColor("white");
            sun.changeColor("yellow");
        }
    }

}
