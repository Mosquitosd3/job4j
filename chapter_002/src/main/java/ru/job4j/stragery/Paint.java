package ru.job4j.stragery;

public class Paint {
  public void draw(Shape shape) {
      System.out.print(shape.draw());
  }

  public static void main(String[] args) {
      Paint paint = new Paint();
      Square square = new Square();
      Triangle triangle = new Triangle();
      paint.draw(triangle);
      paint.draw(square);
  }
}
