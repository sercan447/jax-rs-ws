package com.istanbul.pojo;

import java.util.UUID;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "sahis")
@XmlAccessorType(XmlAccessType.FIELD)
public class Sahisler {

	@XmlElement
	private String kisiadi;
	@XmlElement
	private String kisisoyadi;
	@XmlElement
	private int kisihesapno;
	
	
	public Sahisler() {}
	
	public Sahisler(String kisiadi, String kisisoyadi) {
		
		this.kisiadi = kisiadi;
		this.kisisoyadi = kisisoyadi;
		this.kisihesapno = UUID.randomUUID().variant();
	}
	public String getKisiadi() {
		return kisiadi;
	}
	public void setKisiadi(String kisiadi) {
		this.kisiadi = kisiadi;
	}
	public String getKisisoyadi() {
		return kisisoyadi;
	}
	public void setKisisoyadi(String kisisoyadi) {
		this.kisisoyadi = kisisoyadi;
	}
	public int getKisihesapno() {
		return kisihesapno;
	}
	public void setKisihesapno(int kisihesapno) {
		this.kisihesapno = kisihesapno;
	}
	
	
}
