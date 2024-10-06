package pe.com.cibertec.Sesion4_demo2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.cibertec.Sesion4_demo2.model.CategoriaEntity;
import pe.com.cibertec.Sesion4_demo2.repository.CategoriaRepository;
import pe.com.cibertec.Sesion4_demo2.service.CategoriaService;

@Service
public class CategoriaServiceImpl implements CategoriaService{

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Override
	public List<CategoriaEntity> listarCategoria() {
		// TODO Auto-generated method stub
		return categoriaRepository.findAll();
	}

}
