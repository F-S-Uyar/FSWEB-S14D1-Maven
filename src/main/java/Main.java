import com.workintech.cylinder.Circle;
import com.workintech.cylinder.Cylinder;
import com.workintech.developers.HRManager;
import com.workintech.developers.JuniorDeveloper;
import com.workintech.developers.MidDeveloper;
import com.workintech.developers.SeniorDeveloper;
import com.workintech.pool.Cuboid;
import com.workintech.pool.Rectangle;

public class Main {

    public static final String MSG_PREFIX = "sonuç ";

    public static void main(String[] args) {
        /*Circle circle = new Circle(3.75);

        System.out.println("circle.radius= " + circle.getRadius());

        System.out.println("circle.area= " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);

        System.out.println("cylinder.radius= " + cylinder.getRadius());

        System.out.println("cylinder.height= " + cylinder.getHeight());

        System.out.println("cylinder.area= " + cylinder.getArea());

        System.out.println("cylinder.volume= " + cylinder.getVolume());*/

        /*Rectangle rectangle = new Rectangle(5, 10);

        System.out.println("rectangle.width= " + rectangle.getWidth());

        System.out.println("rectangle.length= " + rectangle.getLength());

        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5,10,5);

        System.out.println("cuboid.width= " + cuboid.getWidth());

        System.out.println("cuboid.length= " + cuboid.getLength());

        System.out.println("cuboid.area= " + cuboid.getArea());

        System.out.println("cuboid.height= " + cuboid.getHeight());

        System.out.println("cuboid.volume= " + cuboid.getVolume());*/

        JuniorDeveloper juniorDeveloper1 = new JuniorDeveloper(34, "mehmet", 5000);
        JuniorDeveloper juniorDeveloper2 = new JuniorDeveloper(35, "isa", 6000);
        printResult(MSG_PREFIX, juniorDeveloper1);
        printResult(MSG_PREFIX, juniorDeveloper2);
        juniorDeveloper1.work();
        juniorDeveloper2.work();

        MidDeveloper midDeveloper = new MidDeveloper(1, "ali", 10000);
        printResult(MSG_PREFIX, midDeveloper);
        midDeveloper.work();

        HRManager hrManager = new HRManager(5,"kerem", 8000,
                new JuniorDeveloper[5], new MidDeveloper[6], new SeniorDeveloper[7]);
        hrManager.addEmployee(0, juniorDeveloper1);
        hrManager.addEmployee(1, juniorDeveloper2);
        hrManager.addEmployee(0, midDeveloper);

        System.out.println(hrManager.toString());
    }
    private static void printResult(String x, JuniorDeveloper juniorDeveloper) {
        System.out.println(x + juniorDeveloper.toString());
    }
    private static void printResult(String x, MidDeveloper midDeveloper) {
        System.out.println(x + midDeveloper.toString());
    }
    private static void printResult(String x, SeniorDeveloper seniorDeveloper) {
        System.out.println(x + seniorDeveloper.toString());
    }
}