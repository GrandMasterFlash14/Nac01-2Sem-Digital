package br.com.fiap.capsuledev.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PACIENTE")
@SequenceGenerator(name = "pacienteSequence", sequenceName = "SQ_PACIENTE", allocationSize = 1)
public class Paciente {

    @Id
    @Column(name = "cd_paciente")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pacienteSequence")
    private Long codigo;

    @Column(name = "nm_paciente")
    private String nome;

    @Column(name = "dt_nascimento")
    private Date nascimento;

    @Column(name = "nr_rg")
    private String rg;

    @Column(name = "ds_genero")
    private String genero;

    @Column(name = "nm_mae")
    private String nomeMae;

    @Column(name = "ds_endereco")
    private String endereco;

    @Column(name = "nm_contato")
    private String contato;

    @Column(name = "tl_telefone")
    private String telefone;

    @Column(name = "ds_orgao")
    private String orgao;
    
    @ManyToMany
    @JoinTable(name = "TB_PACIENTE_MONITORAMENTO", joinColumns=@JoinColumn(name="cd_paciente"), inverseJoinColumns=@JoinColumn(name="cd_monitoramento"))
    private List<Monitoramento> monitoramentos = new ArrayList<Monitoramento>();
    
    @Column(name = "dt_transplante")
    private Date transplante;

    public Paciente(Long codigo, String nome, Date nascimento, String rg, String genero, String nomeMae, String endereco, String contato, 
    		String telefone, String orgao, Date transplante) 
    {
        this.codigo = codigo;
        this.nome = nome;
        this.nascimento = nascimento;
        this.rg = rg;
        this.genero = genero;
        this.nomeMae = nomeMae;
        this.endereco = endereco;
        this.contato = contato;
        this.telefone = telefone;
        this.orgao = orgao;
        this.transplante = transplante;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getOrgao() {
        return orgao;
    }

    public void setOrgao(String orgao) {
        this.orgao = orgao;
    }

    public Date getTransplante() {
        return transplante;
    }

    public void setTransplante(Date transplante) {
        this.transplante = transplante;
    }

	public List<Monitoramento> getMonitoramentos() {
		return monitoramentos;
	}

	public void setMonitoramentos(List<Monitoramento> monitoramentos) {
		this.monitoramentos = monitoramentos;
	}
    
}
