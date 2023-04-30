package me.kjgleh.springbootmongo.user

import org.springframework.data.repository.findByIdOrNull
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class UserController(
    private val userRepository: UserRepository,
) {

    @PostMapping("/users")
    fun create(
        @RequestBody user: CreateUserRequest,
    ): User {
        return userRepository.save(
            User(
                name = user.name,
            ),
        )
    }

    @GetMapping("/users")
    fun findAll(): MutableList<User> {
        return userRepository.findAll()
    }

    @GetMapping("/users/{id}")
    fun findById(
        @PathVariable id: String,
    ): User? {
        return userRepository.findByIdOrNull(id)
    }
}
