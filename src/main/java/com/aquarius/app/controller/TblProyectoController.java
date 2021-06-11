package com.aquarius.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.aquarius.app.models.entity.TblProyecto;
import com.aquarius.app.models.service.ITblProyectoService;

@RestController
@RequestMapping("proyecto")
@CrossOrigin("http://localhost:4200")
public class TblProyectoController {
	
	@Autowired
	private ITblProyectoService proyectoService;
	
	@GetMapping("list")
	public List<TblProyecto> findAll() {
		return proyectoService.findAll();
	}
	
	@GetMapping("find/id/{id}")
	public TblProyecto findByUsuario(@PathVariable Long id) {
		return proyectoService.findById(id);
	}
	
	@PostMapping("save")
	@ResponseBody
	public TblProyecto save(@RequestBody TblProyecto proyecto) {
		return proyectoService.save(proyecto);
	}
	
	@GetMapping("delete/id/{id}")
	public Long deleteById(@PathVariable Long id) {
		proyectoService.deleteById(id);
		return 1L;
	}

}
