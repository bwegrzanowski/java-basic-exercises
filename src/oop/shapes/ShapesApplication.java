package oop.shapes;

import java.util.HashMap;
import java.util.Map;

public class ShapesApplication {
    public static void main(String[] args) {

        Shape[] shapes = {new Square(4), new Rectangle(2, 3), new Diamond()};
        Square[] squares2 = {new Square(4), new Square(8), new Square(2)};
        showShapes(shapes);
        showShapes(squares2);

        Map<String, Integer> map = new HashMap<>();
        map.put("abc", 2);
        map.put("abce", 3);
        map.forEach((k, v) -> {
            System.out.println(k + ": " + v);
        });
    }

    private static void showShapes(Shape[] shapes) {
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Name = " + shapes[i].getName());
            System.out.println("Field = " + shapes[i].field());
            System.out.println("Circuit = " + shapes[i].circuit());
            System.out.println("Diagonal = " + shapes[i].diagonal());
            System.out.println(shapes[i]);
        }
    }
}
