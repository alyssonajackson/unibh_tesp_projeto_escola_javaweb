package br.ajackson.escola_alysson.entidades;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "TB_PESSOA")
public abstract class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@NotBlank
	@Pattern(regexp = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}", message = "CPF invalido")
	@Size(min = 14, max = 14)
	@Column(name = "CPF", length = 14, nullable = false, unique = true)
	private String cpf;

	@NotBlank
	@Size(min = 5, max = 100)
	@Pattern(regexp = "[A-Za-zÀ-ú ]*")
	@Column(name = "NOME", length = 100, nullable = false, columnDefinition = "VARCHAR(100)")
	private String nome;

	public Pessoa() {

	}

	public Pessoa(Long id, String cpf, String nome) {
		super();
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", cpf=" + cpf + ", nome=" + nome + "]";
	}
}