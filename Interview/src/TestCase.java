import com.tianmou.Bean.Apple;
import com.tianmou.Utils.ComputingUtil;
import com.tianmou.Bean.Mango;
import com.tianmou.Bean.Strawberry;

public class TestCase {

    private final ComputingUtil computingUtil = new ComputingUtil();

    // 初始化苹果
    static Apple apple = new Apple("苹果", 8, 10);
    // 初始化苹果草莓
    static Strawberry strawberry = new Strawberry("草莓", 13, 10);
    // 初始化苹果芒果
    static Mango mango = new Mango("芒果", 20, 10);

    public void TestCaseMain() {
        // 题目答案
        TestCaseMain(apple, strawberry, mango);

        System.out.println("---------------测试用例-----------------");
        System.out.println("99.99满减后的价格为：" + computingUtil.FourCalculatePrice(99.99));
        System.out.println("100满减后的价格为：" + computingUtil.FourCalculatePrice(100));
        System.out.println("101满减后的价格为：" + computingUtil.FourCalculatePrice(101));

    }

    public void TestCaseMain(Apple apple, Strawberry strawberry, Mango mango) {
        // --------------------------第一题----------------------------------
        double totalPrice = computingUtil.OneCalculatePrice(apple, strawberry);
        System.out.println("苹果和草莓的总价格为：" + totalPrice);

        // --------------------------第二题----------------------------------
        totalPrice = computingUtil.TwoCalculatePrice(apple, strawberry, mango);
        System.out.println("苹果和草莓以及芒果的总价格为：" + totalPrice);

        // --------------------------第三题----------------------------------
        // 可以单独为打折的商品做一个算法
        totalPrice = computingUtil.ThreeCalculatePrice(apple, strawberry, mango);
        System.out.println("草莓打八折后的价格为：" + totalPrice);
        // 也可以重新设置草莓价格
        strawberry.setPrice(strawberry.getPrice() * 0.8);
        totalPrice = computingUtil.TwoCalculatePrice(apple, strawberry, mango);
        System.out.println("草莓打八折后的价格为：" + totalPrice);

        // --------------------------第四题----------------------------------
        totalPrice = computingUtil.FourCalculatePrice(totalPrice);
        System.out.println("满减后的价格为：" + totalPrice);
    }
}
