/*
  3) Создать класс - точку на отрезке, создать массив точек, вывести только те точки, которые принадлежат интервалу 5-10
  */
public class Point {
    private int xCoordinate;

    public Point(int x) {
        xCoordinate = x;
    }
    public int getX() {
        return xCoordinate;
    }
    public void out(){
        System.out.println("X: " + xCoordinate);
    }
}
