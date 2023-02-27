package uk.co.digitaljeeves.viewmodelscopedemo

import kotlinx.coroutines.delay
import uk.co.digitaljeeves.viewmodelscopedemo.model.User

class UserRepository {
    suspend fun getUser(): List<User> {
        delay(8000)
        return listOf(
            User(1, "Dave"),
            User(2, "Trevor"),
            User(3, "Tracy"),
            User(4, "Karen")
        )
    }
}