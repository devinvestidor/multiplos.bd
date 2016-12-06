package br.com.karanalpe.multiplos.bd.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.karanalpe.multiplos.bd.model.Usuario;

public class Teste {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("firebirdPU");
		EntityManager em = factory.createEntityManager();
		
		try {
			em.getTransaction().begin();
			
			Usuario usuario = new Usuario();
			usuario.setNome("Testando");
			
			em.merge(usuario);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			System.out.println(e);
		}


	}

}
