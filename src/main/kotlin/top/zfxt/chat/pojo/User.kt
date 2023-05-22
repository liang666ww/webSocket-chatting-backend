package top.zfxt.chat.pojo

import lombok.Data

/**
 *  @author:zfxt
 *  @version:1.0
**/
class User() {
     lateinit var UserName:String
     lateinit var UserId:String
    constructor(UserId:String,UserName:String) : this(){
        this.UserName=UserName
        this.UserId=UserId
    }

    override fun toString(): String {
        return "User(UserName='$UserName', UserId='$UserId')"
    }


}