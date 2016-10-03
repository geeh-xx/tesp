package br.unibh.seguros.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CPF;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@Table(name="tb_pessoa")
public abstract class Pessoa {

public Pessoa(){}
	
	public Pessoa(Long id, String nome, String sexo, String cpf,
			String telefoneComercial, String telefoneResidencial,
			String telefineCelular, String email, Date dataNascimento,
			Date dataCadastro) {
		super();
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
		this.cpf = cpf;
		this.telefoneComercial = telefoneComercial;
		this.telefoneResidencial = telefoneResidencial;
		this.telefineCelular = telefineCelular;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.dataCadastro = dataCadastro;
	}
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Size(min = 3, max = 100)
	@Pattern(regexp = "[A-Z]*", message = "Deve permitir apenas caracteres de A à Z maiúsculos sem espaços.")
	@Column(columnDefinition="varchar(100)", nullable=false)
	private String nome;
	
	@NotBlank
	@Size(min = 2, max = 10)
	@Pattern(regexp = "(F|M)", message = "Deve conter apenas caracter F ou M.")
	@Column(columnDefinition="char(1)", nullable=false)
	private String sexo;
	
	@CPF
	@Column(columnDefinition="char(11)", nullable=false, unique=true)
	private String cpf;
	
	@Pattern(regexp = "\\(\\d{2}\\)\\d{0,1}\\d{4}-\\d{4}")
	@Column(name="telefone_comercial", columnDefinition="char(14)", nullable=true)
	private String telefoneComercial;
	
	@NotBlank
	@Pattern(regexp = "\\(\\d{2}\\)\\d{0,1}\\d{4}-\\d{4}")
	@Column(name="telefone_residencial", columnDefinition="char(14)", nullable=false)
	private String telefoneResidencial;
	
	@Pattern(regexp = "\\(\\d{2}\\)\\d{0,1}\\d{4}-\\d{4}")
	@Column(name="telefone_celular", columnDefinition="char(14)", nullable=true)
	private String telefineCelular;
	
	
	@Size(max = 100)
	@Pattern(regexp = ".+@.+\\.[a-z]+")
	@Column(columnDefinition="varchar(100)", nullable=true)
	private String email;
	
	@Past
	@NotNull
	@Temporal(TemporalType.DATE)
	@Column(name="data_nascimento", nullable=false)
	private Date dataNascimento;
	
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="data_cadastro", nullable=false)
	private Date dataCadastro;
	
	@Version
	private Long version;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefoneComercial() {
		return telefoneComercial;
	}
	public void setTelefoneComercial(String telefoneComercial) {
		this.telefoneComercial = telefoneComercial;
	}
	public String getTelefoneResidencial() {
		return telefoneResidencial;
	}
	public void setTelefoneResidencial(String telefoneResidencial) {
		this.telefoneResidencial = telefoneResidencial;
	}
	public String getTelefineCelular() {
		return telefineCelular;
	}
	public void setTelefineCelular(String telefineCelular) {
		this.telefineCelular = telefineCelular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", sexo=" + sexo
				+ ", cpf=" + cpf + ", telefoneComercial=" + telefoneComercial
				+ ", telefoneResidencial=" + telefoneResidencial
				+ ", telefineCelular=" + telefineCelular + ", email=" + email
				+ ", dataNascimento=" + dataNascimento + ", dataCadastro="
				+ dataCadastro + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result
				+ ((dataCadastro == null) ? 0 : dataCadastro.hashCode());
		result = prime * result
				+ ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
		result = prime * result
				+ ((telefineCelular == null) ? 0 : telefineCelular.hashCode());
		result = prime
				* result
				+ ((telefoneComercial == null) ? 0 : telefoneComercial
						.hashCode());
		result = prime
				* result
				+ ((telefoneResidencial == null) ? 0 : telefoneResidencial
						.hashCode());
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
		Pessoa other = (Pessoa) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (dataCadastro == null) {
			if (other.dataCadastro != null)
				return false;
		} else if (!dataCadastro.equals(other.dataCadastro))
			return false;
		if (dataNascimento == null) {
			if (other.dataNascimento != null)
				return false;
		} else if (!dataNascimento.equals(other.dataNascimento))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (sexo == null) {
			if (other.sexo != null)
				return false;
		} else if (!sexo.equals(other.sexo))
			return false;
		if (telefineCelular == null) {
			if (other.telefineCelular != null)
				return false;
		} else if (!telefineCelular.equals(other.telefineCelular))
			return false;
		if (telefoneComercial == null) {
			if (other.telefoneComercial != null)
				return false;
		} else if (!telefoneComercial.equals(other.telefoneComercial))
			return false;
		if (telefoneResidencial == null) {
			if (other.telefoneResidencial != null)
				return false;
		} else if (!telefoneResidencial.equals(other.telefoneResidencial))
			return false;
		return true;
	}
	
	

	
}
