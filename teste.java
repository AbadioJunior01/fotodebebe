
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ingrid Sanae
 */
public class teste {
    public static void main(String[] args){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("fotos");
        EntityManager em = factory.createEntityManager();
        
        FotosBebe fotodetomate = new FotosBebe();
        fotodetomate.setNome("Carlos");
        fotodetomate.setTelefone("65-9875-6565");
        fotodetomate.setEmail("carlos1234@gmail.com");
        fotodetomate.setImportarFotos("arquivodefoto");
        fotodetomate.setFormaDePagamento("A vista");
        fotodetomate.setValor("Calculadora");
        
        
         EntityTransaction tx = em.getTransaction();
            tx.begin();
            em.persist(fotodetomate);
            tx.commit();
            em.close();
            factory.close();
           
    }   
}