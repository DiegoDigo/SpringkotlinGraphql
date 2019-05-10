package com.example.demo.graphql

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import com.example.demo.service.PersonDao
import org.springframework.stereotype.Component

@Component
class Mutation(private val personDao: PersonDao) : GraphQLMutationResolver {

    fun personCreate(name: String) = personDao.createPerson(name)

}