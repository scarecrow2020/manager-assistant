package com.lmz.hc.utils;

/**
 * User: Scarecrow
 * Date: 2019/1/3
 * Time: 9:53
 * Description: 常量
 */
public class Constant {

    /**
     * 字典-角色
     */
    public static final String DT_ROLE = "role";

    /**
     *  角色集合
     *  admin超管、visitor游客、boss老板、employee员工、customer客户
     */
    public interface ROLES {
        String ADMIN = "admin";
        String VISITOR = "visitor";
        String BOSS = "boss";
        String EMPLOYEE = "employee";
        String CUSTOMER = "customer";
    }

    /**
     * 字典-消费类型
     */
    public static final String DT_CONSUMPTION = "consumption";

    /**
     * 消费类型集合
     * rent房租、water水费、electricity电费、gas燃气费、catering餐饮费
     */
    public interface CONSUMPTIONS {
        String RENT = "rent";
        String WATER = "water";
        String ELECTRICITY = "electricity";
        String GAS = "gas";
        String CATERING = "catering";
    }
}

