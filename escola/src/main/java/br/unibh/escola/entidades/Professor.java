package br.unibh.escola.entidades;

import java.math.BigDecimal;

import javax.persistence.*;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

@Entity
@PrimaryKeyJoinColumn
@Table(name="TB_PROFESSOR")
@NamedQuery(name="Professor.findByName", query = "select p from Professor p where p.nome like :nome")
public class Professor extends Pessoa {

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((salario == null) ? 0 : salario.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Professor other = (Professor) obj;
		if (salario == null) {
			if (other.salario != null)
				return false;
		} else if (!salario.equals(other.salario))
			return false;
		return true;
	}

	@NotNull
	@DecimalMin("500.00")
	@DecimalMax("50000.00")
	@Column(name="SALARIO")
	private BigDecimal salario;
	
	public static Double BONUS = 0.1D;
	
	public Professor(){
	}
	
	public Professor(Long id, String nome, String cpf, BigDecimal salario) {
		super(id, nome, cpf);
		this.salario = salario;
	}
	
	public Professor(Long id, String nome, String cpf) {
		super(id, nome, cpf);
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return super.toString() + 
				"Professor [salario=" + salario + "]";
	}
	
	

	
}
