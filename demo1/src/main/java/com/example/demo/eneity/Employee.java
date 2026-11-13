package com.example.demo.eneity;



public class Employee {

    // 主键 ID
    private Integer id;

    // 员工工号 (如 2026001)
    private String empNo;

    // 员工姓名
    private String empName;

    // 性别
    private String gender;

    // 身份证号
    private String idCard;

    // 手机号
    private String phone;

    // 邮箱
    private String email;

    // 薪资
    private Double salary;

    // 民族
    private String nation;

    // ================= 构造方法 =================

    // 无参构造 (截图第17行)
    public Employee() {
    }

    // 全参构造 (截图第19行开始，补全了被截断的 String 参数)
    public Employee(Integer id, String empNo, String empName, String gender, String idCard, String phone, String email, Double salary, String nation) {
        this.id = id;
        this.empNo = empNo;
        this.empName = empName;
        this.gender = gender;
        this.idCard = idCard;
        this.phone = phone;
        this.email = email;
        this.salary = salary;
        this.nation = nation;
    }

    // ================= Getter 和 Setter 方法 =================

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }
}