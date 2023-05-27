package top.zfxt.chat.controller

import cn.hutool.json.JSONUtil
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import top.zfxt.chat.pojo.User
import top.zfxt.chat.service.WebSocketServer
import java.util.UUID

/**
 *  @author:zfxt
 *  @version:1.0
 */
@RestController
class LoginController {

    var UsersMap = WebSocketServer.UsersMap
    @GetMapping("/login")
    public fun login(username:String): String? {
        //第一次注册用户
        if(username!="" && UsersMap.get(username)==null)
        {
            //生成用户信息
            var userId = UUID.randomUUID().toString().replace("-","").substring(0,10)
            UsersMap.put(username,User(userId,username,null,"offline"))

            println(UsersMap)
            return "ok"
        }
            return "repeat"
    }
}