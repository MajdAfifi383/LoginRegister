package com.example.RegistrationLogin.Service;

import com.example.RegistrationLogin.Dto.EmployeeDTO;
import com.example.RegistrationLogin.Dto.LoginDTO;
import com.example.RegistrationLogin.response.LoginResponse;

public interface EmployeeService {
    String addEmployee(EmployeeDTO employeeDTO);

    LoginResponse loginEmployee(LoginDTO loginDTO);

}
