package com.cibertec.examen.Implements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.examen.Model.ClassProducto;
import com.cibertec.examen.Repository.ProductoRepository;
import com.cibertec.examen.Service.ProductoService;
@Service
public class ProductoImplements implements ProductoService  {

	@Autowired
	ProductoRepository xProductoRepository;
	
	
	@Override
	public List<ClassProducto> ListadoProductos() {
		// TODO Auto-generated method stub
		return (List<ClassProducto>)xProductoRepository.findAll();
	}

	@Override
	public void RegistrarProducto(ClassProducto xProducto) {
		// TODO Auto-generated method stub
		 xProductoRepository.save(xProducto);	
	}

	@Override
	public void ActualizarProducto(ClassProducto xProducto) {
		// TODO Auto-generated method stub
		xProductoRepository.save(xProducto);	
	}
	
	@Override
	public ClassProducto BuscarPorId(Integer xProducto) {
		// TODO Auto-generated method stub
		return xProductoRepository.findById(xProducto).orElse(null);
	}

	@Override
	public void EliminarProducto(Integer xProducto) {
		// TODO Auto-generated method stub
		xProductoRepository.deleteById(xProducto);
	}

	

}
