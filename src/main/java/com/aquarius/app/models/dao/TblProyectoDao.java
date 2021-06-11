package com.aquarius.app.models.dao;

import org.springframework.data.repository.CrudRepository;
import com.aquarius.app.models.entity.TblProyecto;

public interface TblProyectoDao extends CrudRepository<TblProyecto, Long>{
	
	/*
	 * @Query(nativeQuery = true, value= "SELECT * FROM TBL_PROYECTO WHERE NOMBRE = :search")
	public List<TblProyecto> findAllByNombre(@Param("search") String search);
	 * */
	
	
	
}
