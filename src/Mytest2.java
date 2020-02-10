import com.company.test.Circle;
import com.company.test.Rectangle;

/**
 * Created by heystephen on 2020/2/10.
 */
public class Mytest2 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(1,20,"绿色");
        rectangle.showAll();
        Circle circle = new Circle(20,"粉色");
        circle.showAll();
    }
}
