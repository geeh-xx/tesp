package br.unibh.seguros.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import br.unibh.seguros.enums.TipoCombustivel;

@Entity
@Table(name="tb_veiculo")
public class Veiculo {

	@Id @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Pattern(regexp="[A-zÀ-ú ]*",message="Deverá ter apenas Letras e Espaço")
	@Size(max=50)
	@Column(columnDefinition="varchar(50)", nullable=false)
	private String marca;
	
	@NotBlank
	@Pattern(regexp="[A-zÀ-ú ]*",message="Deverá ter apenas Letras e Espaço")
	@Size(max=150)
	@Column(columnDefinition="varchar(150)", nullable=false)
	private String descricao;
	
	@NotNull
	@Min(value=1950, message ="Só é permitido acima de 1950")
	@Column(name="ano_fabricacao", nullable=false)	
	private int anoFabricacao;
	
	@NotNull
	@Min(value=1950, message ="Só é permitido acima de 1950")
	@Column(name="ano_modelo", nullable=false)
	private int anoModelo;
	
	@NotBlank
	@Pattern(regexp="[A-Z]{3}-\\d{4}",message="Exemplo modelo de placa AAA-9999")
	@Column(columnDefinition="char(8)", nullable=false)
	private String placa;
	
	@NotBlank
	@Pattern(regexp="[A-z ]*",message="Deverá ter apenas Letras e Espaço")
	@Size(max=50)
	@Column(columnDefinition="varchar(50)", nullable=false)
	private String chassi;
	
	@NotNull
	@Column(name="tipo_combustivel", nullable=false)
	private TipoCombustivel tipoCombustivel;
	
	@NotNull
	@Column(name="zero_km", nullable=false)
	private Boolean zeroKm;
	
	@NotNull
	@Column(name="veiculo_alienado", nullable=false)
	private Boolean veiculoAlienado;
	
	
	@Version 
	private Long version;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public int getAnoModelo() {
		return anoModelo;
	}
	public void setAnoModelo(int anoModelo) {
		this.anoModelo = anoModelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public TipoCombustivel getTipoCombustivel() {
		return tipoCombustivel;
	}
	public void setTipoCombustivel(TipoCombustivel tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	public Boolean getZeroKm() {
		return zeroKm;
	}
	public void setZeroKm(Boolean zeroKm) {
		this.zeroKm = zeroKm;
	}
	public Boolean getVeiculoAlienado() {
		return veiculoAlienado;
	}
	public void setVeiculoAlienado(Boolean veiculoAlienado) {
		this.veiculoAlienado = veiculoAlienado;
	}
	public Long getVersion() {
		return version;
	}
	public void setVersion(Long version) {
		this.version = version;
	}
	
	
	
}
