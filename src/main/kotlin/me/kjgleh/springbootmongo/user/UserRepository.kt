package me.kjgleh.springbootmongo.user

import org.springframework.data.mongodb.repository.MongoRepository

interface UserRepository : MongoRepository<User, String>
