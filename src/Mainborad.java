/**
 * Created by heystephen on 2020/2/10.
 */
/*
多态---------建立在继承的基础之上
引用   一个变量存储了一个对象的地址
赋值多态
父类引用指向子类对象   子类的对象可以给父类的引用赋值
Wang wang = new wang();
Teacher wang = new wang();
传参多态
当一个方法的参数类型定位为父类的时候  所有子类都 可以传参
Wang wang = new wang();
method(wang);
public static void method(Teacher  teacher){
}

* */
public class Mainborad {
    private MYinterface mYinterface;

    public MYinterface getmYinterface() {
        return mYinterface;
    }

    public void setmYinterface(MYinterface mYinterface) {
        this.mYinterface = mYinterface;
    }

    public void method(){
    this.mYinterface.method();
    }
}
