package com.perficient.techbootcampnicholaschen.melee.jpa;

import org.springframework.data.repository.CrudRepository;

import com.perficient.techbootcampnicholaschen.melee.entity.PlayerEntity;

interface PlayerRepository extends CrudRepository<PlayerEntity, Integer>{

}
