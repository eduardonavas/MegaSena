package br.com.fiap.dao;

import java.util.List;

import javax.persistence.EntityManager;



public class GenericDao<T> implements Dao<T> {

	private final Class<T> classe;
	protected EntityManager em;

	public GenericDao(Class<T> classe) {
		this.classe = classe;
	}
	
	public void closeEm(){
		this.em.close();
	}

	@Override
	public T adicionar(T entidade) {
		em = JpaUtil.getEntityManager();
		em.getTransaction().begin();
		em.merge(entidade);
		em.getTransaction().commit();
		return entidade;
	}
	
	@Override
	public void cadastrar(T entidade) {
		em = JpaUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(entidade);
		em.getTransaction().commit();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<T> listar() {
		em = JpaUtil.getEntityManager();
		List<T> lista = em.createQuery("From MegasenaSorteio m").getResultList();
		em.close();
		return lista;
	}
	
	@SuppressWarnings("unchecked")
	public List<T> listarPorId(int id) {
		em = JpaUtil.getEntityManager();
		return em.createQuery("Select t From " + classe.getSimpleName()+" t Where t.id = :id").setParameter("id", id).getResultList();
	}


	@SuppressWarnings("unchecked")
	@Override
	public T buscar(int id) {
		em = JpaUtil.getEntityManager();
		em.getTransaction().begin();
		T entidade = (T) em.createQuery("Select t From " + classe.getSimpleName()+" t Where t.id = :id").setParameter("id", id).getSingleResult();
		em.getTransaction().commit();

		return entidade;
	}
	
	@SuppressWarnings("unchecked")
	
	public T buscarUltimo() {
		em = JpaUtil.getEntityManager();
		em.getTransaction().begin();
		T entidade = (T) em.createQuery("select m from MegasenaSorteio m order by m.id desc").setMaxResults(1).getSingleResult();
		em.getTransaction().commit();

		return entidade;
	}
		
}
