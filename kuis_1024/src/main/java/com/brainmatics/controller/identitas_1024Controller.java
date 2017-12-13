/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainmatics.controller;

import com.brainmatics.entity.identitas_1024;
import com.brainmatics.service.identitas_1024Service;
import java.util.List;
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
@RequestMapping("/identitas_1024")
public class identitas_1024Controller {

    @Autowired
    private identitas_1024Service identitas_1024Service;

    @RequestMapping(method = RequestMethod.POST)
    public identitas_1024 insert(@RequestBody identitas_1024 identitas_1024) {
        return identitas_1024Service.insert(identitas_1024);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public identitas_1024 update(@RequestBody identitas_1024 identitas_1024) {
        return identitas_1024Service.update(identitas_1024);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return identitas_1024Service.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public identitas_1024 getById(@PathVariable("id") Long id){
        return identitas_1024Service.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<identitas_1024> getAll(){
        return identitas_1024Service.getAll();
    }
}
