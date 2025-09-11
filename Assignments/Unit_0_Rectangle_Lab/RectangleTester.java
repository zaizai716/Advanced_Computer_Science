public class RectangleTester {

    public static void main(String[] args) {

        Rectangle rect = new Rectangle();
        System.out.println(rect.toString());

        Rectangle rect2 = new Rectangle();
        System.out.println("It's " + rect.equals(rect2) + " that rectangle 1 is equal to rectangle 2.");

        Rectangle rect3 = new Rectangle();
        System.out.println("The area of the rectangle is " + rect3.calculateArea() + ".");

        System.out.println("The perimeter of the rectangle is " + rect.calculatePerimeter() + ".");

        System.out.println("The diagonal length of the rectangle is " + rect.calculateDiagonal() + ".");
        
    }
    
}
