package Package;

public class Test {
    public void printAll(Shape3D[] shapes) {

    }

    public static void main(String[] args) {
        Pyramid[] pyramids = new Pyramid[2];
        Pyramid pyramid1 = new Pyramid("pasta", 1, 0, 2, 3);
        Pyramid pyramid2 = new Pyramid("kek", 1, 0, 0, 7);
        pyramids[0] = pyramid1;
        pyramids[1] = pyramid2;
        System.out.println("-");
        
        printAll(pyramids);
        sort(pyramids);
        System.out.println("--");
        printAll(pyramids);
        System.out.println("---");
        Cube[] cubes = new Cube[2];
        Cube cube1 = new Cube("kutu", 6, 8, 2, 5);
        Cube cube2 = new Cube("bina", 1, 0, 0, 2);
        cubes[0] = cube1;
        cubes[1] = cube2;
        System.out.println("+");
        printAll(cubes);
        sort(cubes);
        System.out.println("++");
        printAll(cubes);
        System.out.println("+++");
        Ball[] balls = new Ball[2];
        Ball ball1 = new Ball("basketbol", 1, 0, 0, 11);
        Ball ball2 = new Ball("futbol", 1, 1, 1, 1);
        balls[0] = ball1;
        balls[1] = ball2;
        System.out.println("*");
        printAll(balls);
        sort(balls);
        System.out.println("**");
        printAll(balls);
        System.out.println("***");

        Shape3D[] shapes = new Shape3D[6];
        shapes[0] = ball1;
        shapes[1] = cube1;
        shapes[2] = pyramid2;
        shapes[3] = pyramid1;
        shapes[4] = ball2;
        shapes[5] = cube2;
        System.out.println("/");
        printAll(shapes);
        sort(shapes);
        System.out.println("/");
        printAll(shapes);
        System.out.println("/");
    }
}
