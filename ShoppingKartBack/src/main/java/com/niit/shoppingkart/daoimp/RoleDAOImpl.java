package com.niit.shoppingkart.daoimp;

import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingkart.dao.RoleDAO;
import com.niit.shoppingkartback.domain.Role;

@Transactional
@Repository("RoleDAO")
public class RoleDAOImpl implements RoleDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public RoleDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	public List<Role> list() {
		@SuppressWarnings ({"unchecked"})
		List <Role> listRole = (List<Role>) sessionFactory.getCurrentSession().createCriteria(Role.class)
		.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listRole;
	}
    
	public Role getByName(String username) {
		String hql = "from Role where username ='" + username + "'";	
		Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
				@SuppressWarnings("unchecked")
				List<Role> listRole = (List<Role>) (query).list();
				
				if(listRole != null && !listRole.isEmpty()){
					return listRole.get(0);
				}
		return null;
		
		
	}

	public Role getByContact(String contact) {
		String hql = "from Role where contact ='" + contact + "'";
		Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Role> listRole = (List<Role>) (query).list();

		if (listRole != null && !listRole.isEmpty()) {
			return listRole.get(0);
		}
		return null;
	}

	
	public void delete(String username) {

		Role roleToDelete = new Role();
		roleToDelete.setId(username);
		sessionFactory.getCurrentSession().delete(roleToDelete);
		
	}

	
	public void saveOrUpdate(Role role) {
		sessionFactory.getCurrentSession().saveOrUpdate(role);
		
	}


	public Role getByEmail(String email) {
		String hql = "from Role where email ='" + email + "'";
		Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Role> listRole = (List<Role>) (query).list();

		if (listRole != null && !listRole.isEmpty()) {
			return listRole.get(0);
		}
		return null;
	}

	
}
