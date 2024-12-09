package cn.itcast.gateway;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @Title cloud-demo
 * @Author hzl
 * @Date 2024/9/30 22:52
 * @Description 全局过滤器
 */
@Component
public class AuthorizeFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) { 
        ServerHttpRequest request = exchange.getRequest();
        MultiValueMap<String, String> queryParams = request.getQueryParams();
        String first = queryParams.getFirst("authorization");
        // 判断参数值
        if (first.equals("admin")){
            // 放行请求,调用下一个过滤器
            return chain.filter(exchange);
        }
        // 拦截请求
        exchange.getResponse().setStatusCode(HttpStatus.FORBIDDEN);  // 设置状态码
        return exchange.getResponse().setComplete();
    }

    // 定义过滤器优先级，值越小优先级越高
    @Override
    public int getOrder() {
        return -1;
    }
}
