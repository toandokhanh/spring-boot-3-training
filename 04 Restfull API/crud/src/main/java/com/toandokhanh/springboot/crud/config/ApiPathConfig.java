package com.toandokhanh.springboot.crud.config;

public class ApiPathConfig {
    private static final String APIVERSION = "api/v1/";
    private ApiPathConfig(){
    }

    public static final String GET_ALL_EMPLOYEE_URL = APIVERSION + "employees";
    public static final String GET_EMPLOYEE_BY_ID_URL = APIVERSION + "employees/{id}";
    public static final String ADD_EMPLOYEE_URL = APIVERSION + "employees";
    public static final String UPDATE_EMPLOYEE_URL = APIVERSION + "employees";
    public static final String DELETE_EMPLOYEE_URL = APIVERSION + "employees";
 }



