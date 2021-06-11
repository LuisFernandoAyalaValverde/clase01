package com.aquarius.app.models.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aquarius.app.models.dao.TblProyectoDao;
import com.aquarius.app.models.entity.TblProyecto;
import com.aquarius.app.models.service.ITblProyectoService;

@Service
public class TblProyectoServiceImpl implements ITblProyectoService{
	
	@Autowired
	private TblProyectoDao proyectoDao;


	@Override
	public TblProyecto save(TblProyecto enitity) {
		// TODO Auto-generated method stub
		return proyectoDao.save(enitity);
	}

	@Override
	public TblProyecto findById(Long id) {
		// TODO Auto-generated method stub
		return proyectoDao.findById(id).orElse(null);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		proyectoDao.deleteById(id);
	}

	@Override
	public List<TblProyecto> findAll() {
		// TODO Auto-generated method stub
		return (List<TblProyecto>) proyectoDao.findAll();
	}

}
