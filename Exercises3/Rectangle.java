
public class Rectangle {

    private int width;
    private int height;

    public Rectangle(){
        width = 25;
        height = 10;

        System.out.println("Default rectangle created: width = 25, height = 10");
    }
    public Rectangle ( int w, int h){
        if (w > 0 && w < 30 && h > 0 && h< 30){
            width = w;
            height = h;
            System.out.println(" Rectangle created: width = " + width + " height = " + height);
        }else {
            System.out.println( " Invalid width and/or hight. "+ "\n" + " Each must be positive and less than 30.");
        }
    }
    public int getArea () {
        return width * height;
    }
    public void draw () {
        for ( int rowCounter = 0; rowCounter < height; rowCounter++){
            for ( int colCounter = 0; colCounter < width; colCounter++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
