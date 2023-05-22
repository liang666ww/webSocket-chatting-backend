package top.zfxt.chat.config

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.CorsRegistry

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

/**
 *  @author:zfxt
 *  @version:1.0
 */
@Configuration
class CrosConfig : WebMvcConfigurer {
    /**
     * 允许跨域调用的过滤器
     */
    override fun addCorsMappings(registry: CorsRegistry) {
        registry.addMapping("/**")
            .allowedOriginPatterns("*")
            .allowedMethods("GET", "PUT", "POST", "DELETE", "HEAD", "OPTIONS")
            .allowCredentials(true)
            .maxAge(3600)
            .allowedHeaders("*")
    }
}