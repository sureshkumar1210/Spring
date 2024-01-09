package com.example.java.springBoot.model;

public class vendor {
    private String empId;
    private String  empName;
    private String empNO;

    public vendor() {
    }

    public vendor(String empId, String empName, String empNO) {
        this.empId = empId;
        this.empName = empName;
        this.empNO = empNO;
    }


    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpNO() {
        return empNO;
    }

    public void setEmpNO(String empNO) {
        this.empNO = empNO;
    }
}
