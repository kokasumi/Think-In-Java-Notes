/**
 * 练习题1，3结合答案
 * @author ligang
 * @version v1.0
 */
class ATypeName {
    private int x;
    private char ch;

    public int getX() {
        return x;
    }

    public char getCh() {
        return ch;
    }
}

/**
 * 练习题4，5答案
 * @author ligang
 * @version v1.0
 */
class DataOnly {
    int i;
    double d;
    boolean b;

    public void changeData() {
        i = 47;
        d = 1.1;
        b = false;
    }
}

/**
 * String处理类，练习题6答案
 * @author ligang
 */
class StringUtil {
    /**
     * 计算给定字符串需要的byte字节数
     * @param s 传入需要计算的字符串
     * @return 返回指定字符串计算后所需byte字节数
     */
    public static int storage(String s) {
        return s != null ? s.length() * 2 : 0;
    }
}

class StaticTest {
    static int i = 47;
}

class Incrementable {
    static void increment(){
        StaticTest.i++;
    }
}

/**
 * 练习题9，证明包装器类型会自动包装基本类型
 * 注意：包装器类型在赋值时必须与相应的普通类型相对应，不然会报编译错误。即Boolean->boolean,Byte->byte,Short->short,Integer->int,Long->long,Float->float,Double->double,Character->char。
 * 但是在基本类型中，long和float的表示类型与其他类型不同，long必须在后面加上L后缀，float必须在后面加上f后缀。
 * @author ligang
 */
class AutoBoxing {
    Boolean b = false;
    Byte bt = 1;
    Short st = 2;
    Integer ir = 12;
    Long lg = 1000L;
    Float ft = 0.2f;
    Double de = 1.22223;
    Character character = 'c';
}

/**
 * 练习题11
 */
class AllTheColorsOfTheRainbow {
    int anIntegerRepresentingColors;

    void changeTheHueOfTheColor(int newHue) {
        this.anIntegerRepresentingColors = newHue;
    }
}

public class Answer{
    public static void main(String[] args) {
        //练习题1,3
        ATypeName aTypeName = new ATypeName();
        System.out.println("int类型的x默认初始化值:" + aTypeName.getX());
        System.out.println("char类型的ch默认初始化值:" + aTypeName.getCh());
        //练习题2
        System.out.println("Hello,World!");
        //练习题4，5
        DataOnly data = new DataOnly();
        data.changeData();
        System.out.println("data.i=" + data.i);
        System.out.println("data.d=" + data.d);
        System.out.println("data.b=" + data.b);
        //练习题6
        String str = "测试字符串字节数";
        System.out.println("{" + str + "}共包含" + StringUtil.storage(str) + "个byte");
        //练习题7，8
        StaticTest test1 = new StaticTest();
        System.out.println("test1.i为:" + test1.i);
        StaticTest test2 = new StaticTest();
        System.out.println("test2.i为:" + test2.i);
        test1.i++;
        System.out.println("test1.i++后的test1.i为:" + test1.i + "，test2.i为:" + test2.i + "，StaticTest.i为:" + StaticTest.i);
        test2.i++;
        System.out.println("test2.i++后的test1.i为:" + test1.i + "，test2.i为:" + test2.i + "，StaticTest.i为:" + StaticTest.i);
        Incrementable.increment();
        System.out.println("调用Incrementable.increment()后的test1.i为:" + test1.i + "，test2.i为:" + test2.i + "，StaticTest.i为:" + StaticTest.i);
        //练习题9
        AutoBoxing autoBoxing = new AutoBoxing();
        System.out.println("autoBoxing.b=" + autoBoxing.b);
        System.out.println("autoBoxing.bt=" + autoBoxing.bt);
        System.out.println("autoBoxing.st=" + autoBoxing.st);
        System.out.println("autoBoxing.ir=" + autoBoxing.ir);
        System.out.println("autoBoxing.lg=" + autoBoxing.lg);
        System.out.println("autoBoxing.ft=" + autoBoxing.ft);
        System.out.println("autoBoxing.de=" + autoBoxing.de);
        System.out.println("autoBoxing.character=" + autoBoxing.character);
        //练习题10
        printArgs(args);
        //练习题11
        AllTheColorsOfTheRainbow allTheColorsOfTheRainbow = new AllTheColorsOfTheRainbow();
        System.out.println("改变前的anIntegerRepresentingColors:" + allTheColorsOfTheRainbow.anIntegerRepresentingColors);
        allTheColorsOfTheRainbow.changeTheHueOfTheColor(30);
        System.out.println("改变后的anIntegerRepresentingColors:" + allTheColorsOfTheRainbow.anIntegerRepresentingColors);
    }

    /**
     * 练习题10
     */
    private static void printArgs(String[] args) {
        if(args != null) {
            System.out.print("传入的参数：");
            for(String str : args) {
                System.out.print(str + ",");
            }
            System.out.println("\n");
        }
    }
}