package com.tianmou.Utils;

import com.tianmou.Bean.Apple;
import com.tianmou.Bean.Mango;
import com.tianmou.Bean.Strawberry;

public class ComputingUtil {
    /**
     * 第一题
     * 计算苹果，草莓总价格
     *
     * @param apple      苹果
     * @param strawberry 草莓
     * @return 总价格
     */
    public double OneCalculatePrice(Apple apple, Strawberry strawberry) {
        return apple.getTotalPrice() + strawberry.getTotalPrice();
    }

    /**
     * 第二题
     * 计算苹果，草莓，芒果总价格
     *
     * @param apple      苹果
     * @param strawberry 草莓
     * @param mango      芒果
     * @return 总价格
     */
    public double TwoCalculatePrice(Apple apple, Strawberry strawberry, Mango mango) {
        return apple.getTotalPrice() + strawberry.getTotalPrice() + mango.getTotalPrice();
    }

    /**
     * 第三题
     * 计算草莓打八折后的水果总价格
     *
     * @param apple      苹果
     * @param strawberry 草莓
     * @param mango      芒果
     * @return 总价格
     */
    public double ThreeCalculatePrice(Apple apple, Strawberry strawberry, Mango mango) {
        return apple.getTotalPrice() + (strawberry.getTotalPrice() * 0.8) + mango.getTotalPrice();
    }

    /**
     * 第四题
     * 计算满减后的水果总价格
     *
     * @param totalPrice 总价格
     * @return 总价格
     */
    public double FourCalculatePrice(double totalPrice) {
        return totalPrice >= 100 ? totalPrice - 10 : totalPrice;
    }
}
