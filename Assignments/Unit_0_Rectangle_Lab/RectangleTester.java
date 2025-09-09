public class RectangleTester {

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        System.out.println(rect.toString());

        Rectangle rect2 = new Rectangle();
        System.out.println(rect.equals(rect2));

        Rectangle rect3 = new Rectangle();
        System.out.println(rect3.calculateArea());

        System.out.println(rect.calculatePerimeter());

        System.out.println(rect.calculateDiagonal());

        
        
    }
    
}
