package com.xmemebackend.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xmemebackend.springrest.entity.Memes;

public interface MemeDao extends JpaRepository<Memes, String>{

}
