package cn.itcast.order.pojo;

import lombok.Data;

/**
 * @Title cloud-demo
 * @Author hzl
 * @Date 2024/12/7 16:58
 * @Description User实体
 */
@Data
public class User {
    private Long id;
    private String username;
    private String address;
}