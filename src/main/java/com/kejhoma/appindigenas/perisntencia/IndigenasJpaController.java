/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kejhoma.appindigenas.perisntencia;

import com.kejhoma.appindigenas.logica.Indigenas;
import com.kejhoma.appindigenas.perisntencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author jhoan
 */
public class IndigenasJpaController implements Serializable {

    public IndigenasJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public IndigenasJpaController(){
        emf=Persistence.createEntityManagerFactory("appIndigenasPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Indigenas indigenas) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(indigenas);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Indigenas indigenas) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            indigenas = em.merge(indigenas);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = indigenas.getId();
                if (findIndigenas(id) == null) {
                    throw new NonexistentEntityException("The indigenas with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Indigenas indigenas;
            try {
                indigenas = em.getReference(Indigenas.class, id);
                indigenas.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The indigenas with id " + id + " no longer exists.", enfe);
            }
            em.remove(indigenas);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Indigenas> findIndigenasEntities() {
        return findIndigenasEntities(true, -1, -1);
    }

    public List<Indigenas> findIndigenasEntities(int maxResults, int firstResult) {
        return findIndigenasEntities(false, maxResults, firstResult);
    }

    private List<Indigenas> findIndigenasEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Indigenas.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Indigenas findIndigenas(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Indigenas.class, id);
        } finally {
            em.close();
        }
    }

    public int getIndigenasCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Indigenas> rt = cq.from(Indigenas.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
