package ssj_6;

public class TestCircleRectangle_11_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle_11_2 circle=new Circle_11_2(1);
		System.out.println("A circle "+circle.toString());
		System.out.println("The color is "+circle.getColor());
		System.out.println("The radius is "+circle.getRadius());
		System.out.println("The area is "+circle.getArea());
		System.out.println("The diameter is "+circle.getDiameter());
		
		Rectangle_11_3 rectangle=new Rectangle_11_3(2,4);
		System.out.println("\nA rectangle "+rectangle.toString());
		System.out.println("The area is "+rectangle.getArea());
		System.out.println("The perimeter is "+rectangle.getPerimeter());
	}

}
