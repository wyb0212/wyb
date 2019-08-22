package cn.itcast.controller;
import cn.itcast.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HellpController {
    @Autowired
    private User user;

 @GetMapping("/hello")
 public String sayHello(){
     return "这是我第一个springboot项目";
 }
}
