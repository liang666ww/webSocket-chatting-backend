package top.zfxt.chat

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WebChatKotlinApplication

fun main(args: Array<String>) {
    runApplication<WebChatKotlinApplication>(*args)
}
