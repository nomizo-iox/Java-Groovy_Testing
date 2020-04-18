package com.nomizo

import com.nomizo.model.Users
import org.junit.jupiter.api.Test

class UsersTest {
    def users
    @Test
    void 'should test Users pojo'() {
       users = new Users()
        users.id = 1
        users.name = "Samuel Ademola"
        users.salary = 104_000_000_000L

    }
}
