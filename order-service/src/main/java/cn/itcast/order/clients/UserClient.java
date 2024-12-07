package cn.itcast.order.clients;

import cn.itcast.order.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Title cloud-demo
 * @Author hzl
 * @Date 2024/12/7 16:57
 * @Description
 */
@FeignClient("userservice")
public interface UserClient {

    @GetMapping("/user/{id}")
    User getUserById(@PathVariable("id") Long id);

}
