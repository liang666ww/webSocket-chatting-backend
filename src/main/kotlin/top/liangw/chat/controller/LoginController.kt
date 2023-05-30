package top.liangw.chat.controller

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import top.liangw.chat.pojo.User
import top.liangw.chat.service.WebSocketServer
import java.util.*

/**
 * @author:wangliang
 */
@RestController
class LoginController {

    var UsersMap = WebSocketServer.UsersMap
    @PostMapping("/login")
    public fun login(username:String): String? {
        //第一次注册用户
        if(username!="" && UsersMap.get(username)==null)
        {
            //生成用户信息
            var userId = UUID.randomUUID().toString().replace("-","").substring(0,10)
            UsersMap.put(username,User(userId,username,null,"offline"))

            return "ok"
        }
            return "repeat"
    }

}