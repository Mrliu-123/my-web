package com.example.demo.Controller; // 注意大写 C

import com.example.demo.eneity.Employee;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/emp")
@CrossOrigin
public class EmployeeController {

    @GetMapping("/list")
    public List<Employee> getEmpList() {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee(1, "EMP2026001", "张三", "男", "411521199601011234", "13800138001", "zhangsan@qq.com", 12000.0, "汉族"));
        list.add(new Employee(2, "EMP2026002", "李四", "女", "411521199402022345", "13800138002", "lisi@qq.com", 8500.0, "回族"));
        list.add(new Employee(3, "EMP2026003", "王五", "男", "411521199803033456", "13800138003", "wangwu@qq.com", 15000.0, "汉族"));

        return list;
    }
}