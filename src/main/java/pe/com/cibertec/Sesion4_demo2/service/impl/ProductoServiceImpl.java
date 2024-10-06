package pe.com.cibertec.Sesion4_demo2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.cibertec.Sesion4_demo2.model.ProductoEntity;
import pe.com.cibertec.Sesion4_demo2.repository.ProductoRepository;
import pe.com.cibertec.Sesion4_demo2.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService{

	@Autowired
	private ProductoRepository productoRepository;
	
	@Override
	public List<ProductoEntity> listarProducto() {
		// TODO Auto-generated method stub
		return productoRepository.findAll();
	}

	@Override
	public void crearProducto(ProductoEntity productoEntity) {
		// TODO Auto-generated method stub
		productoRepository.save(productoEntity);
	}

}
