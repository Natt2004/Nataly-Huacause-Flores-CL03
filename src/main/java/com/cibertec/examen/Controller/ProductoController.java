package com.cibertec.examen.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cibertec.examen.Model.ClassProducto;
import com.cibertec.examen.Service.ProductoService;

@Controller
@RequestMapping("/Vistas")
public class ProductoController {

	@Autowired
	private ProductoService xProductoService;
	
	@GetMapping("/ListadoProductos")
	public String ListaProducto(Model model) {
		List<ClassProducto> xListarClassProductos = xProductoService.ListadoProductos();
		model.addAttribute("listaProducto",xListarClassProductos);
		return "Vistas/Producto/ListadoProductos";
	}
	
	@GetMapping("/RegistrarProducto")
	public String RegistrarProducto(Model model) {
		ClassProducto xRegistrarProducto = new ClassProducto();
		model.addAttribute("registrarProducto",xRegistrarProducto);
		return "Vistas/Producto/RegistrarProducto";
	} 
	
	@PostMapping("/GuardarProducto")
	public String GuardarProducto(@ModelAttribute ClassProducto xProducto	 ) {
		xProductoService.RegistrarProducto(xProducto);
		return "redirect:/Vistas/ListadoProductos";
		
	}
	
	
	@GetMapping("/Actualizar/{xProducto}")
	public String Actulizar(@PathVariable("xProducto") Integer idProducto,Model model) {
		ClassProducto xClassProducto = xProductoService.BuscarPorId(idProducto);
		model.addAttribute("registrarProducto",xClassProducto);
		return "Vistas/Producto/ActualizarProducto";
	}
	
	@GetMapping("/Eliminar/{xProducto}")
	public String Eliminar(@PathVariable("xProducto") Integer idProducto,Model model) {
		xProductoService.EliminarProducto(idProducto);
		List<ClassProducto> xListado = xProductoService.ListadoProductos();
		model.addAttribute("listaProducto",xListado);
		return "redirect:/Vistas/ListadoProductos";
		
	}
	
	//fin del metodo eliminar...
}
