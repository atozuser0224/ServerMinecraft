package gang.atoz.serverminecraft.controller

import org.apache.coyote.http11.Constants.a
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController


@RestController(value = "/v1/user")
class UserController {
    @PostMapping("/join")
    fun join(){

    }
}
