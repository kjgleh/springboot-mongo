package me.kjgleh.springbootmongo.user

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "users")
class User(
    @Id
    var id: String? = null,
    var name: String = "",
)
