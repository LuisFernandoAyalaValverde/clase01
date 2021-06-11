package com.aquarius.app.models.service;

import java.util.List;

import com.aquarius.app.models.entity.TblProyecto;

public interface ITblProyectoService {
	
	public TblProyecto save(TblProyecto enitity);
	public TblProyecto findById(Long id);
	public void deleteById(Long id);
	public List<TblProyecto> findAll();

}
