package com.example.demo.controller;

import com.example.demo.entity.MyData;
import com.example.demo.repository.MyDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.annotation.PostConstruct;
import java.util.Optional;

@Controller
public class MyController {

    @Autowired
    MyDataRepository myDataRepository;

    @GetMapping("/main")
    public String index(Model model) {
        model.addAttribute("list", myDataRepository.findAll());
        return "th/index";
    }

    @GetMapping("/test1")
    public String test1(Model model) {
        model.addAttribute("msg", "테스트 자료");
        return "th/index2";
    }

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("list", myDataRepository.findAll());
        return "list";
    }

    @GetMapping("/data/{id}")
    public String index3(@PathVariable Long id, Model model) {
        Optional<MyData> myData = myDataRepository.findById(id);
        System.out.println("-----------------"+myData.get());
        model.addAttribute("object", myData.get());
        return "th/index3";
    }

    @PostConstruct
    public void init(){
        MyData d1 = new MyData();
        d1.setName("kim");
        d1.setAge(123);
        d1.setMail("kim@gilbut.co.kr");
        d1.setMemo("this is my data!");
        myDataRepository.saveAndFlush(d1);
        MyData d2 = new MyData();
        d2.setName("lee");
        d2.setAge(15);
        d2.setMail("lee@flower");
        d2.setMemo("my girl friend.");
        myDataRepository.saveAndFlush(d2);
        MyData d3 = new MyData();
        d3.setName("choi");
        d3.setAge(37);
        d3.setMail("choi@happy");
        d3.setMemo("my work friend...");
        myDataRepository.saveAndFlush(d3);
    }
}
