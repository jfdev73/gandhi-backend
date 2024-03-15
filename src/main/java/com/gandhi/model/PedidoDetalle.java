package com.gandhi.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PedidoDetalle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "id_libro")
	private Libro libro;
	
	private Integer cantidad;
	
	private BigDecimal precio;
	
	@Column(name = "sub_total")
	private BigDecimal subTotal;
	
	@ManyToOne
	@JoinColumn(name = "id_pedido")
	private Pedido pedido;
	


}
