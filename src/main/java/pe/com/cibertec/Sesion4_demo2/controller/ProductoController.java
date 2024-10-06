package pe.com.cibertec.Sesion4_demo2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.com.cibertec.Sesion4_demo2.model.CategoriaEntity;
import pe.com.cibertec.Sesion4_demo2.model.ProductoEntity;
import pe.com.cibertec.Sesion4_demo2.service.CategoriaService;
import pe.com.cibertec.Sesion4_demo2.service.ProductoService;

@Controller
@RequestMapping("/producto")
public class ProductoController {
	
	@Autowired
	private ProductoService productoService;
	
	@Autowired
	private CategoriaService categoriaService;
	
	@GetMapping("/")
	public String listarProducto(Model model) {
		List<ProductoEntity>listaProducto = productoService.listarProducto();
		model.addAttribute("listaprod", listaProducto);
		return "lista_productos";
	}
	
	@GetMapping("/registrar_producto")
	public String mostrarRegistrarProducto(Model model) {
		List<CategoriaEntity>listaCategoria = categoriaService.listarCategoria();
		model.addAttribute("categorias",listaCategoria);
		model.addAttribute("producto", new ProductoEntity());
		return "registrar_producto";
	}
	
	@PostMapping("/registrar_producto")
	public String registrarProducto(@ModelAttribute("producto") ProductoEntity prod
			, Model model) {
		
		productoService.crearProducto(prod);
		return "redirect:/producto/";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
