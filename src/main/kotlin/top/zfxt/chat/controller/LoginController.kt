package top.zfxt.chat.controller

import cn.hutool.json.JSONUtil
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import top.zfxt.chat.pojo.User
import java.util.UUID

/**
 *  @author:zfxt
 *  @version:1.0
 */
@RestController
class LoginController {
    var UserMap:MutableMap<String,User> = mutableMapOf()
    @GetMapping("/login")
    public fun login(username:String): String? {
        //生成用户信息
        var userId = UUID.randomUUID().toString().replace("-","").substring(0,10)
        UserMap.put(userId,User(userId,username))

        println(UserMap)
        return JSONUtil.toJsonStr(UserMap)
    }
}