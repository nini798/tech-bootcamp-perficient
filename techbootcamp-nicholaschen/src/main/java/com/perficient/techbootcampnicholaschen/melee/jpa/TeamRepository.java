package com.perficient.techbootcampnicholaschen.melee.jpa;

import org.springframework.data.repository.CrudRepository;

import com.perficient.techbootcampnicholaschen.melee.entity.TeamEntity;

interface TeamRepository extends CrudRepository<TeamEntity, Integer> {

}
