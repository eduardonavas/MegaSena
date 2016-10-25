package br.com.fiap.model;

import java.io.Serializable;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

import java.util.Date;


/**
 * The persistent class for the megasena_sorteios database table.
 * 
 */
@Entity
@Table(name="megasena_sorteios")
@NamedQuery(name="MegasenaSorteio.findAll", query="SELECT m FROM MegasenaSorteio m")
@XmlRootElement
public class MegasenaSorteio implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="concurso")
	private int concurso;
	
	@Temporal(TemporalType.DATE)
	@Column(name="data")
	private Date data;
	
	@Column(name="dezena_1")
	private int dezena1;
	
	@Column(name="dezena_2")
	private int dezena2;
	
	@Column(name="dezena_3")
	private int dezena3;
	@Column(name="dezena_4")
	private int dezena4;
	@Column(name="dezena_5")
	private int dezena5;
	@Column(name="dezena_6")
	private int dezena6;
	@Column(name="dezenas")
	private String dezenas;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public MegasenaSorteio() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public int getConcurso() {
		return this.concurso;
	}

	public void setConcurso(int concurso) {
		this.concurso = concurso;
	}

	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
		
	}

	public int getDezena1() {
		return this.dezena1;
	}

	public void setDezena1(int dezena1) {
		this.dezena1 = dezena1;
	}

	public int getDezena2() {
		return this.dezena2;
	}

	public void setDezena2(int dezena2) {
		this.dezena2 = dezena2;
	}

	public int getDezena3() {
		return this.dezena3;
	}

	public void setDezena3(int dezena3) {
		this.dezena3 = dezena3;
	}


	public int getDezena4() {
		return this.dezena4;
	}

	public void setDezena4(int dezena4) {
		this.dezena4 = dezena4;
	}


	public int getDezena5() {
		return this.dezena5;
	}

	public void setDezena5(int dezena5) {
		this.dezena5 = dezena5;
	}

	public int getDezena6() {
		return this.dezena6;
	}

	public void setDezena6(int dezena6) {
		this.dezena6 = dezena6;
	}


	public String getDezenas() {
		return this.dezenas;
	}

	public void setDezenas(String dezenas) {
		this.dezenas = dezenas;
	}

}