/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainmatics.service;

import com.brainmatics.entity.ipk_1024;
import com.brainmatics.repo.ipk_1024Repo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Hendro Steven
 */
@Service("ipk_1024Service")
@Transactional
public class ipk_1024Service {

    @Autowired
    private ipk_1024Repo repo;

    public ipk_1024 insertOrUpdate(ipk_1024 ipk_1024) {
        return repo.save(ipk_1024);
    }

    public boolean delete(Long id) {
        repo.delete(id);
        return true;
    }

    public List<ipk_1024> findAll() {
        return repo.findAllipk_1024();
    }

    public List<ipk_1024> findByidentitas_1024(Long identitas_1024Id) {
        return repo.findByidentitas_1024(identitas_1024Id);
    }

    public List<ipk_1024> findByName(String name) {
        return repo.findByName("%" + name + "%");
    }
}
