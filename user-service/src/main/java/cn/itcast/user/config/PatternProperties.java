package cn.itcast.user.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Title cloud-demo
 * @Author hzl
 * @Date 2024/9/26 16:20
 * @Description
 */
@Component
@Data
@ConfigurationProperties(prefix = "pattern")
public class PatternProperties {
    private String dataformat;
    private String envShereConfig;
}
