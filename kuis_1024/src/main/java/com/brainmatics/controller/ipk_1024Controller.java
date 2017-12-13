/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainmatics.controller;

import com.brainmatics.entity.ipk_1024;
import com.brainmatics.repo.ipk_1024Repo;
import com.brainmatics.service.ipk_1024Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Hendro Steven
 */
@RestController
@RequestMapping("/ipk_1024")
public class ipk_1024Controller {
    
    @Autowired
    private ipk_1024Service ipk_1024Service;
    
    @RequestMapping(method = RequestMethod.POST)
    public ipk_1024 insertOrUpdate(@RequestBody ipk_1024 ipk_1024){
        return ipk_1024Service.insertOrUpdate(ipk_1024);
    }
      @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
      
    public boolean delete(@PathVariable("id") Long id) {
        return ipk_1024Service.delete(id);
    }
}