package com.toDel.Controller;

import com.toDel.Entity.Department;
import com.toDel.Service.DepartmentService;
import com.toDel.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/department")
public class DepartmentController {

    @Autowired
    public DepartmentService departmentService;


    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Department> getAllDepartment(){
        return departmentService.getAllDepartment();
    }

    @RequestMapping(value = "/saveDepartment", method = RequestMethod.POST)
    public void saveDepartment(Department department){
        this.departmentService.saveDepartment(department);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void deleteById(int id){
        this.departmentService.deleteById(id);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public void updateDepartment(Department department){
        this.departmentService.updateDepartment(department);
    }












}
