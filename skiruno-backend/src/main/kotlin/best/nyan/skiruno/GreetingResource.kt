package best.nyan.skiruno

import javax.ws.rs.GET
import javax.ws.rs.Path

@Path("/hello")
class GreetingResource {

    @GET
    fun hello() = "Hello World"

}