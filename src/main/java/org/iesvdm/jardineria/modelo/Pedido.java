package org.iesvdm.jardineria.modelo;
// Generated 3 dic 2023 12:28:04 by Hibernate Tools 5.6.15.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Pedido generated by hbm2java
 */
public class Pedido implements java.io.Serializable {

	private int codigoPedido;
	private Cliente cliente;
	private Date fechaPedido;
	private Date fechaEsperada;
	private Date fechaEntrega;
	private String estado;
	private String comentarios;
	private Set detallePedidos = new HashSet(0);

	public Pedido() {
	}

	public Pedido(int codigoPedido, Cliente cliente, Date fechaPedido, Date fechaEsperada, String estado) {
		this.codigoPedido = codigoPedido;
		this.cliente = cliente;
		this.fechaPedido = fechaPedido;
		this.fechaEsperada = fechaEsperada;
		this.estado = estado;
	}

	public Pedido(int codigoPedido, Cliente cliente, Date fechaPedido, Date fechaEsperada, Date fechaEntrega,
			String estado, String comentarios, Set detallePedidos) {
		this.codigoPedido = codigoPedido;
		this.cliente = cliente;
		this.fechaPedido = fechaPedido;
		this.fechaEsperada = fechaEsperada;
		this.fechaEntrega = fechaEntrega;
		this.estado = estado;
		this.comentarios = comentarios;
		this.detallePedidos = detallePedidos;
	}

	public int getCodigoPedido() {
		return this.codigoPedido;
	}

	public void setCodigoPedido(int codigoPedido) {
		this.codigoPedido = codigoPedido;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getFechaPedido() {
		return this.fechaPedido;
	}

	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public Date getFechaEsperada() {
		return this.fechaEsperada;
	}

	public void setFechaEsperada(Date fechaEsperada) {
		this.fechaEsperada = fechaEsperada;
	}

	public Date getFechaEntrega() {
		return this.fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getComentarios() {
		return this.comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public Set getDetallePedidos() {
		return this.detallePedidos;
	}

	public void setDetallePedidos(Set detallePedidos) {
		this.detallePedidos = detallePedidos;
	}

	@Override
	public String toString() {
		return "Pedido{" +
				"codigoPedido=" + codigoPedido +
				", cliente=" + cliente +
				", fechaPedido=" + fechaPedido +
				", fechaEsperada=" + fechaEsperada +
				", fechaEntrega=" + fechaEntrega +
				", estado='" + estado + '\'' +
				", comentarios='" + comentarios + '\'' +
				'}';
	}
}
