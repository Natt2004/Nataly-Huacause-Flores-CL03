package com.cibertec.examen.Service;

import java.util.List;

import com.cibertec.examen.Model.ClassProducto;


public interface ProductoService {

	public List<ClassProducto> ListadoProductos();
	public void RegistrarProducto(ClassProducto xProducto);
	public void ActualizarProducto(ClassProducto xProducto);
	public ClassProducto BuscarPorId(Integer xProducto);
	public void EliminarProducto(Integer xProducto);
}
