package pe.com.cibertec.Sesion4_demo2.service;

import java.util.List;

import pe.com.cibertec.Sesion4_demo2.model.ProductoEntity;

public interface ProductoService {
	List<ProductoEntity>listarProducto();
	void crearProducto(ProductoEntity productoEntity);
}
