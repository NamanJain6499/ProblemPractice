package LeetCode;
interface  I1{
    void show();
    public int  i=96;
}
public class Test implements  I1{
    public void show() {
        System.out.println(123);
    }
    public static void main(String[] args) {
        Test t=new Test();
        System.out.println(i);
        t.show();
    }


}
