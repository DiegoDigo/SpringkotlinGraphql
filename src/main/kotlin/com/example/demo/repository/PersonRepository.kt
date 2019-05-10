package com.example.demo.repository

import com.example.demo.entity.Person
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface PersonRepository: MongoRepository<Person, String> {

    fun findByNameLike(name: String): List<Person>


}