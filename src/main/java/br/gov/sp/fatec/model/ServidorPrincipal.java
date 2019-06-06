package br.gov.sp.fatec.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

import br.gov.sp.fatec.view.View;


@Entity
@Table(name ="SER_SERVIDOR_PRINCIPAL")
public class ServidorPrincipal {
	
	public ServidorPrincipal(){
		
	}
	
	public ServidorPrincipal(String ip, String nome, String maquina,String processador,int memoria,String espaco,Integer status){
		this.ip = ip;
		this.nome = nome;
		this.maquina = maquina;
		this.processador = processador;
		this.memoria = memoria;
		this.espaco = espaco;
		this.status = status;
	}
	
	public void setServidorPrincipal(String ip, String nome, String maquina,String processador,int memoria,String espaco,Integer status) {
		this.ip = ip;
		this.nome = nome;
		this.maquina = maquina;
		this.processador = processador;
		this.memoria = memoria;
		this.espaco = espaco;
		this.status = status;
	}
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "SER_ID")
	private Long id; 
	
	@Column(name = "SER_IP",unique=true, length = 50, nullable = false)
	@JsonView({View.ServidorCompleto.class, View.ServidorIpNome.class})
	private String ip;
	
	@Column(name = "SER_NOME")
	@JsonView({View.ServidorCompleto.class, View.ServidorIpNome.class})
	private String nome;
	
	@Column(name = "SER_MAQUINA")
	@JsonView({View.ServidorCompleto.class})
	private String maquina;
	
	@Column(name = "SER_PROCESSADOR")
	@JsonView({View.ServidorCompleto.class, View.ServidorHardware.class})
	private String processador;
	
	@Column(name = "SER_MEMORIA")
	@JsonView({View.ServidorCompleto.class, View.ServidorHardware.class})
	private int memoria;
	
	@Column(name = "SER_ESPACO")
	@JsonView({View.ServidorCompleto.class, View.ServidorHardware.class})
	private String espaco;
	
	@Column(name = "SER_STATUS")
	@JsonView({View.ServidorCompleto.class, View.ServidorHardware.class})
	private Integer status;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getMaquina() {
		return maquina;
	}

	public void setMaquina(String maquina) {
		this.maquina = maquina;
	}
	
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	
	
	

}