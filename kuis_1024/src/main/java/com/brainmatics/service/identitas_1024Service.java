/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainmatics.service;

import com.brainmatics.entity.identitas_1024;
import com.brainmatics.repo.identitas_1024Repo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Hendro Steven
 */
@Service("identitas_1024Service")
@Transactional
public class identitas_1024Service {

    @Autowired
    private identitas_1024Repo repo;

    public identitas_1024 insert(identitas_1024 identitas_1024) {
        return repo.save(identitas_1024);
    }
    
    public identitas_1024 update(identitas_1024 identitas_1024) {
        return repo.save(identitas_1024);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public identitas_1024 getById(Long id){
        return repo.findOne(id);
    }
    
    public List<identitas_1024> getAll(){
        return repo.findAllidentitas_1024();
    }
}
