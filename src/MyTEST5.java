/**
 * Created by heystephen on 2020/2/10.
 */
public class MyTEST5 {
    public static void main(String[] args) {
    I3 i3 = new I3();
    I5 i5 = new I5();
    Mainborad mainborad = new Mainborad();
    //  setCPU 传cpu类型
    mainborad.setmYinterface(i5);
    mainborad.method();
    }
}
