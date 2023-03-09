package com.toyproject.challengeplannersystem.common.controller;

import com.toyproject.challengeplannersystem.common.service.BaseService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class BaseController {
    private BaseService service;

    protected BaseController(BaseService baseService){
        this.service = baseService;
    }
}
