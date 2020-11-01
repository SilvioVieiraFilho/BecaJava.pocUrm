package com.app.service;

import java.util.Scanner;

import org.springframework.stereotype.Service;

import com.app.model.Clube;
import com.app.repository.ClubeRepository;

@Service
public class ClubeService {
	
	private final ClubeRepository clubeRepository;
	
	public ClubeService(ClubeRepository clubeRepository) {
		this.clubeRepository = clubeRepository;
	}
	
	public void inicial(Scanner leitor) {
		salvar(leitor);
	}
	
	public void exclusao(Scanner leitor) {
		excluir(leitor);
	}
	
	private void salvar(Scanner leitor) {
		System.out.println("Nome do time");

		String nome = leitor.next();
		Clube clube = new Clube();
		System.out.println("Escreva numero de pontos");
		int pontos = leitor.nextInt();
		clube.setNome(nome);
		clube.setPontos(pontos);
		
		clubeRepository.save(clube);
		
		System.out.println("Salvo");
	}
	
	
	private void excluir(Scanner leitor) {
		System.out.println("Nome do id");

		long id = leitor.nextLong();
		Clube clube = new Clube();
	
		clube.setId(id);
	
		
		clubeRepository.delete(clube);
		
		System.out.println("Excluido");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
