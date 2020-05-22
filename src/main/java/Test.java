import org.openjdk.jol.info.ClassLayout;

public class Test {
    private int m = 8;
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(ClassLayout.parseClass(Test.class).toPrintable(t));
        System.out.println("m: " + t.m);

    }
}
