package br.unibh.seguros.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name="tb_questionario")
public class Questionario {

	@Id 
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Column(name="segurado_e_principal_condutor",nullable=false)
	private Boolean seguradoEPrincipalCondutor;
	
	@Pattern(regexp="[A-zÀ-ú ]*",message="Deverá ter apenas Letras e Espaço")
	@Size(max=100)
	@Column(name="nome_condutor_principal", columnDefinition="varchar(100)",nullable=true)
	private String nomeCondutorPrincipal;
	
	@NotNull
	@Column(name="reside_com_pessoa_17_a_25_anos", nullable=false)
	private Boolean resideComPessoa17A25Anos;
	
	@NotNull
	@Column(name="possui_garagem_residencia", nullable=false)
	private Boolean possuiGaragemResidencia;
	
	@NotNull
	@Column(name="possui_garagem_trabalho", nullable=false)
	private Boolean possuiGaragemTrabalho;
	
	@NotNull
	@Column(name="possui_garagem_estudo", nullable=false)
	private Boolean possuiGaragemEstudo;
	
	@NotNull
	@Column(name="residencia_propria", nullable=false)
	private Boolean residenciaPropria;
	
	@NotNull
	@Column(nullable=false)
	private Long quilometragemAtual;
	
	@NotNull
	@Column(name="utiliza_veiculo_atividades_profissionais", nullable=false)
	private Boolean utilizaVeiculoAtividadesProfissionais;
	
	@NotNull
	@Column(name="acidente_ou_roubo_ultimos_2_anos", nullable=false)
	private Boolean acidenteOuRouboUltimos2Anos;
	
	@NotNull
	@Column(name="possui_dispositivo_anti_furto", nullable=false)
	private Boolean possuiDispositivoAntiFurto;
	
	@Version
	private Long version;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Boolean getSeguradoEPrincipalCondutor() {
		return seguradoEPrincipalCondutor;
	}
	public void setSeguradoEPrincipalCondutor(Boolean seguradoEPrincipalCondutor) {
		this.seguradoEPrincipalCondutor = seguradoEPrincipalCondutor;
	}
	public String getNomeCondutorPrincipal() {
		return nomeCondutorPrincipal;
	}
	public void setNomeCondutorPrincipal(String nomeCondutorPrincipal) {
		this.nomeCondutorPrincipal = nomeCondutorPrincipal;
	}
	public Boolean getResideComPessoa17A25Anos() {
		return resideComPessoa17A25Anos;
	}
	public void setResideComPessoa17A25Anos(Boolean resideComPessoa17A25Anos) {
		this.resideComPessoa17A25Anos = resideComPessoa17A25Anos;
	}
	public Boolean getPossuiGaragemResidencia() {
		return possuiGaragemResidencia;
	}
	public void setPossuiGaragemResidencia(Boolean possuiGaragemResidencia) {
		this.possuiGaragemResidencia = possuiGaragemResidencia;
	}
	public Boolean getPossuiGaragemTrabalho() {
		return possuiGaragemTrabalho;
	}
	public void setPossuiGaragemTrabalho(Boolean possuiGaragemTrabalho) {
		this.possuiGaragemTrabalho = possuiGaragemTrabalho;
	}
	public Boolean getPossuiGaragemEstudo() {
		return possuiGaragemEstudo;
	}
	public void setPossuiGaragemEstudo(Boolean possuiGaragemEstudo) {
		this.possuiGaragemEstudo = possuiGaragemEstudo;
	}
	public Boolean getResidenciaPropria() {
		return residenciaPropria;
	}
	public void setResidenciaPropria(Boolean residenciaPropria) {
		this.residenciaPropria = residenciaPropria;
	}
	public Long getQuilometragemAtual() {
		return quilometragemAtual;
	}
	public void setQuilometragemAtual(Long quilometragemAtual) {
		this.quilometragemAtual = quilometragemAtual;
	}
	public Boolean getUtilizaVeiculoAtividadesProfissionais() {
		return utilizaVeiculoAtividadesProfissionais;
	}
	public void setUtilizaVeiculoAtividadesProfissionais(
			Boolean utilizaVeiculoAtividadesProfissionais) {
		this.utilizaVeiculoAtividadesProfissionais = utilizaVeiculoAtividadesProfissionais;
	}
	public Boolean getAcidenteOuRouboUltimos2Anos() {
		return acidenteOuRouboUltimos2Anos;
	}
	public void setAcidenteOuRouboUltimos2Anos(Boolean acidenteOuRouboUltimos2Anos) {
		this.acidenteOuRouboUltimos2Anos = acidenteOuRouboUltimos2Anos;
	}
	public Boolean getPossuiDispositivoAntiFurto() {
		return possuiDispositivoAntiFurto;
	}
	public void setPossuiDispositivoAntiFurto(Boolean possuiDispositivoAntiFurto) {
		this.possuiDispositivoAntiFurto = possuiDispositivoAntiFurto;
	}
	public Long getVersion() {
		return version;
	}
	public void setVersion(Long version) {
		this.version = version;
	}
	
}
