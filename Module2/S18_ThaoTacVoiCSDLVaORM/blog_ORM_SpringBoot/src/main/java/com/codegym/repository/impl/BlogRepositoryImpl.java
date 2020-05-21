package com.codegym.repository.impl;

import com.codegym.model.Blog;
import com.codegym.repository.BlogRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class BlogRepositoryImpl implements BlogRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Blog> findAll() {
        TypedQuery<Blog> query = entityManager.createQuery("select blog from Blog blog", Blog.class);
        return query.getResultList();
    }

    @Override
    public Blog findById(Integer id) {
        TypedQuery<Blog> query = entityManager.createQuery("select blog from Blog blog where blog.id=:id", Blog.class);
        query.setParameter("id", id);
        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    @Override
    public void save(Blog model) {
        if (model.getId() != null) {
            entityManager.merge(model);
        } else {
            entityManager.persist(model);
        }
    }

    @Override
    public void remove(Integer id) {
        Blog blog = findById(id);
        if (blog != null) {
            entityManager.remove(blog);
        }
    }
}
