package com.rookie.bigdata.controller;

import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

/**
 * @Class MultipartResolverController
 * @Description
 * @Author rookie
 * @Date 2024/9/2 16:05
 * @Version 1.0
 */

@RestController
@Slf4j
@RequestMapping("file")
public class MultipartResolverController {


    @RequestMapping("/uploads")
    public String httpUploads(@RequestParam("files") MultipartFile files[]){

        for(int i=0;i<files.length;i++){
            String fileName = files[i].getOriginalFilename();  // 文件名

            log.info("上传文件名为:{}",fileName);
//            File dest = new File(uploadFilePath +'/'+ fileName);
//            if (!dest.getParentFile().exists()) {
//                dest.getParentFile().mkdirs();
//            }
//            try {
//                files[i].transferTo(dest);
//            } catch (Exception e) {
//                log.error("{}",e);
//                object.put("success",2);
//                object.put("result","程序错误，请重新上传");
//                return object.toString();
//            }
        }


        return "sucess";
//        JSONObject object=new JSONObject();
//        for(int i=0;i<files.length;i++){
//            String fileName = files[i].getOriginalFilename();  // 文件名
////            File dest = new File(uploadFilePath +'/'+ fileName);
//            if (!dest.getParentFile().exists()) {
//                dest.getParentFile().mkdirs();
//            }
//            try {
//                files[i].transferTo(dest);
//            } catch (Exception e) {
//                log.error("{}",e);
//                object.put("success",2);
//                object.put("result","程序错误，请重新上传");
//                return object.toString();
//            }
//        }
//        object.put("success",1);
//        object.put("result","文件上传成功");
//        return object.toString();
    }


    @RequestMapping("/download")
    public String fileDownLoad(HttpServletResponse response, @RequestParam("fileName") String fileName){
//        File file = new File(downloadFilePath +'/'+ fileName);
        File file=null;
        if(!file.exists()){
            return "下载文件不存在";
        }
        response.reset();
        response.setContentType("application/octet-stream");
        response.setCharacterEncoding("utf-8");
        response.setContentLength((int) file.length());
        response.setHeader("Content-Disposition", "attachment;filename=" + fileName );

        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));) {
            byte[] buff = new byte[1024];
            OutputStream os  = response.getOutputStream();
            int i = 0;
            while ((i = bis.read(buff)) != -1) {
                os.write(buff, 0, i);
                os.flush();
            }
        } catch (IOException e) {
            log.error("{}",e);
            return "下载失败";
        }
        return "下载成功";
    }


}
