package com.br.primefaces.controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.br.primefaces.model.Cliente;

@ManagedBean
@SessionScoped
/**
 * 
 * @author Christian
 *
 */
public class IndexBean {
	
	private String sMensagemEscrita;
	private String sNome, sSobrenome;
	
	public String getsMensagemEscrita() {
		return sMensagemEscrita;
	}

	public void setsMensagemEscrita(String sMensagemEscrita) {
		this.sMensagemEscrita = sMensagemEscrita;
	}

	public String getsNome() {
		return sNome;
	}

	public void setsNome(String sNome) {
		this.sNome = sNome;
	}

	public String getsSobrenome() {
		return sSobrenome;
	}

	public void setsSobrenome(String sSobrenome) {
		this.sSobrenome = sSobrenome;
	}

	Cliente cliente;
	
	public void mensagem() 
	{
		
		sMensagemEscrita = "Meu nome é: "+sNome+" "+sSobrenome;
	}
	
}
