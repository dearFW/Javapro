/**
 * Created by heystephen on 2020/2/14.
 */
public class History7 {
    public static void main(String[] args) {
        System.out.println(method(8));
    }
    public static int method(int i){
        if(i==1||i==2){
            return 1;
        }
        else{
            int f1=1;
            int f2=1;
            int sum;
            for(int n=3;n<i;n++){
                sum=f1+f2;
                f1=f2;
                f2=sum;
            }
            return f2;
        }
    }
}
