package top.zfxt.chat.controller

import jakarta.servlet.ServletContext
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.multipart.MultipartFile
import java.io.File
import java.util.*


/**
 *  @author:zfxt
 *  @version:1.0
 */
@RestController
class FileUploadController {
    @PostMapping("/fileupload")
    public fun fileUpload(file:MultipartFile,to:String,from:String):String{
        //获取上传的文件的文件名
        //获取上传的文件的文件名
        var fileName: String? = file.originalFilename
        //处理文件重名问题
        //处理文件重名问题
        val hzName = fileName?.substring(fileName.lastIndexOf("."))
        fileName = UUID.randomUUID().toString() + hzName
        //获取服务器中photo目录的路径
        //获取服务器中photo目录的路径
//        val servletContext: ServletContext = session.getServletContext()
//        val photoPath = servletContext.getRealPath("photo")
//        val file = File(photoPath)
//        if (!file.exists()) {
//            file.mkdir()
//        }
//        val finalPath = photoPath + File.separator + fileName
//        //实现上传功能
//        //实现上传功能
//        file.transferTo(File(finalPath))
        return "success"
    }
}