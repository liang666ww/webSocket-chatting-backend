package top.liangw.chat.config
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.CorsRegistry

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

/**
 * @author:wangliang
 */
@Configuration
class CrosConfig : WebMvcConfigurer {
    /**
     * 允许跨域调用的过滤器
     */
    override fun addCorsMappings(registry: CorsRegistry) {
        registry.addMapping("/**")

            .allowedMethods("GET", "PUT", "POST", "DELETE", "HEAD", "OPTIONS")
            .allowCredentials(true)
            .maxAge(3600)
            .allowedHeaders("*")
            .allowedOriginPatterns("*")
    }
}