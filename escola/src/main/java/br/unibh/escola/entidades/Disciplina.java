package br.unibh.escola.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "TB_DISCIPLINA")
public class Disciplina {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	
	@NotNull
	@Size(max=100)
	@Column(length=100)
	private String nome;

	@NotNull
	@Size(max=100)
	@Column(length=100)
	private String curso;
	
	@NotNull
	@Max(100)
	private int cargaHoraria;
	
	@NotNull
	@Min(1)
	@Max(3)
	private int tipo;
	
}
