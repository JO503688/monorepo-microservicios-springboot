package net.javaguides.departmentservice.service;

import net.javaguides.departmentservice.dto.DepartmentDto;

public interface DepartmentService {

    DepartmentDto savedDepartment(DepartmentDto departmentDto);

    DepartmentDto getDepartmentByCode(String code);
}
