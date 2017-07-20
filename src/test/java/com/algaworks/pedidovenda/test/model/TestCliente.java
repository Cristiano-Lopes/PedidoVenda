package com.algaworks.pedidovenda.test.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.algaworks.pedidovenda.model.Cliente;
import com.algaworks.pedidovenda.model.Endereco;
import com.algaworks.pedidovenda.model.TipoPessoa;

public class TestCliente {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("PedidoPU");
		EntityManager manager = factory.createEntityManager();

		EntityTransaction trx = manager.getTransaction();

//		trx.begin();
//
//		Cliente cliente = new Cliente();
//		cliente.setNome("João das Couves");
//		cliente.setEmail("joao@dascouves.com");
//		cliente.setDocumentoReceitaFederal("123.123.123-12");
//		cliente.setTipo(TipoPessoa.FISICA);
//
//		Endereco end = new Endereco();
//		end.setLogradouro("Rua das Aboboras Vermelhas");
//		end.setNumero("111");
//		end.setCidade("Uberlândia");
//		end.setUf("MG");
//		end.setCep("38400-000");
//		end.setCliente(cliente);
//
//		cliente.getEnderecos().add(end);
//
//		manager.persist(cliente);
//
//		trx.commit();
	}
}
