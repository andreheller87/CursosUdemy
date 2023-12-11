package geometricShapes.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import geometricShapes.entities.Circle;
import geometricShapes.entities.Rectangle;
import geometricShapes.entities.Shape;
import geometricShapes.entities.enums.Color;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();

		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Shape #" + i + " data: ");

			System.out.print("Rectangle or Circle (r/c)?");
			char ch = sc.next().charAt(0);

			System.out.print("Color(BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			if(ch == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Heigth: ");
				double heigth = sc.nextDouble();
				list.add(new Rectangle(color, width,heigth));
				
			}else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(color, radius));
				
			}

		}

		
		System.out.println();
		System.out.println("SHAPE AREAS:");
		for (Shape shape : list) {
			System.out.println( String.format("%.2f",shape.area()));
		}
		
		sc.close();
	}

}