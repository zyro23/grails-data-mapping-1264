package myapp

class BootStrap {

    DummyTwoService dummyTwoService

    def init = { servletContext ->
        dummyTwoService.hello()
    }
    def destroy = {
    }
}
