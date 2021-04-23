/*
 *created by dipak
 * Java program to find out the wall area
 */


public class Wall {
    double width, height;

    public Wall(double width, double height) {

        this.height = height;
        this.width = width;

        if (this.height < 0) {
            height = 0;
        } else if (this.width < 0) {
            width = 0;
        }
    }

        public double getWidth () {

            return width;
    }
        public double getHeight(){

            return height;
        }

        public void setWidth(double width1){

             width = width1;

             if (width1<0){
                 width=0;
             }
    }

        public void setHeight(double height1){

             height=height1;

             if (height1<0){
                 height=0;
             }
        }

        public double getArea(){
        //wall area
        return width*height;
        }


    public static void main(String[] args) {

        Wall wall = new Wall (5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());

    }

}