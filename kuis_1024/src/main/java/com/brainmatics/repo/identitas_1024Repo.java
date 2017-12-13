/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainmatics.repo;

import com.brainmatics.entity.identitas_1024;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Hendro Steven
 */
public interface identitas_1024Repo extends CrudRepository<identitas_1024, Long> {

    @Query("select c from identitas_1024 c")
    public List<identitas_1024> findAllidentitas_1024();
}
