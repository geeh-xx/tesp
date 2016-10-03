package br.unibh.seguros.entidades;

import java.io.File;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import br.unibh.seguros.enums.EtapaProcesso;
import br.unibh.seguros.enums.TipoDecisao;

@Entity
@Table(name="tb_tramitacao")
public class Tramitacao {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private Proposta proposta;
	
	@NotNull
	@Column(name="etapa_processo", nullable=false)
	private EtapaProcesso EtapaProcesso;
	
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="data_hora", nullable=false)
	private Date dataHora;
	
	@NotNull
	@Column(name="tipo_decisao", nullable=false)
	private TipoDecisao tipoDecisao;
	
	
	@OneToOne
	@JoinColumn(name="funcionario_id")
	private Funcionario usuarioDecisao;
	
	@Pattern(regexp="[A-z]*",message="Não deve ter caracteres especiais e espaços")
	@Size(max=4000)
	@Column(columnDefinition="varchar(4000)",nullable=true)
	private String comentario;
	
	@Column(columnDefinition="blob", nullable=false)
	private File documento;
	
	@Version
	private Long version;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Proposta getProposta() {
		return proposta;
	}
	public void setProposta(Proposta proposta) {
		this.proposta = proposta;
	}
	public EtapaProcesso getEtapaProcesso() {
		return EtapaProcesso;
	}
	public void setEtapaProcesso(EtapaProcesso etapaProcesso) {
		EtapaProcesso = etapaProcesso;
	}
	public Date getDataHora() {
		return dataHora;
	}
	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}
	public TipoDecisao getTipoDecisao() {
		return tipoDecisao;
	}
	public void setTipoDecisao(TipoDecisao tipoDecisao) {
		this.tipoDecisao = tipoDecisao;
	}
	public Funcionario getUsuarioDecisao() {
		return usuarioDecisao;
	}
	public void setUsuarioDecisao(Funcionario usuarioDecisao) {
		this.usuarioDecisao = usuarioDecisao;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public File getDocumento() {
		return documento;
	}
	public void setDocumento(File documento) {
		this.documento = documento;
	}
	public Long getVersion() {
		return version;
	}
	public void setVersion(Long version) {
		this.version = version;
	}
	
}
