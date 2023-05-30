package top.liangw.chat.controller

import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.multipart.MultipartFile
import top.liangw.chat.service.WebSocketServer
import java.util.*

/**
 * @author:wangliang
 * 弃用，该controller并无实际作用
 */
@RestController
class FileUploadController {
    @Autowired
    private lateinit var webSocketServer:WebSocketServer;
    companion object {
         val log = LoggerFactory.getLogger(FileUploadController.javaClass)
    }

    @PostMapping("/fileupload")
    public fun fileUpload(file:MultipartFile,to:String,from:String):String{
        var fileName: String? = file.originalFilename
        log.info("文件[{}]已经上传",fileName)
         //获取上传的文件的文件名
        //获取上传的文件的文件名
        var bytes = file.bytes

        return "success"
    }
}