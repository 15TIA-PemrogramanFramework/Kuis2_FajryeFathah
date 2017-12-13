/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainmatics.repo;

import com.brainmatics.entity.ipk_1024;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


/**
 *
 * @author Hendro Steven
 */
public interface ipk_1024Repo extends CrudRepository<ipk_1024, Long>{
    
    @Query("select p from ipk_1024 p")
    public List<ipk_1024> findAllipk_1024();
    
    @Query("select p from ipk_1024 p where p.identitas_1024.id= :id")
    public List<ipk_1024> findByidentitas_1024(@Param("id") Long id);
    
    @Query("select p from ipk_1024 p where LOWER(p.name) LIKE LOWER(:name)")
    public List<ipk_1024> findByName(@Param("name") String name);
}
