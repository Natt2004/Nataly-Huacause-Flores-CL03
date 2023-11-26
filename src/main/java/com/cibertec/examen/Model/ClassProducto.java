package com.cibertec.examen.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_producto")
public class ClassProducto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idProducto;
	
	private String nombre;
	private double precioVenta;
	private int	stock;  
	private double precioCompra;
	private String estado;
	private String descripcion;
	
	@Override
	public String toString() {
		return "ClassProducto [idProducto=" + idProducto + ", nombre=" + nombre + ", precioVenta=" + precioVenta +
				", stock=" + stock + ", precioCompra=" + precioCompra + ", estado=" + estado + ", descripcion=" + descripcion +"]";
	}

	public ClassProducto() {
		
	}

	public ClassProducto(int idProducto, String nombre, double precioVenta, int stock, double precioCompra,
			String estado, String descripcion) {
		//super();
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.precioVenta = precioVenta;
		this.stock = stock;
		this.precioCompra = precioCompra;
		this.estado = estado;
		this.descripcion = descripcion;
	}


	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	
	
}
