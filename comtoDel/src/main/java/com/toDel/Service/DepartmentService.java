package com.toDel.Service;

import com.toDel.DAO.DepartmentDao;
import com.toDel.Entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    public DepartmentDao departmentDao;

    public List<Department> getAllDepartment(){
        return this.getAllDepartment();
    }


    public void saveDepartment(Department department){
        this.departmentDao.save(department);
    }

    public void deleteById(int id){
        this.departmentDao.deleteById(id);
    }

    public void updateDepartment(Department department){
        this.departmentDao.save(department);
    }








}
