package com.api.v1

import org.springframework.stereotype.Service
import org.springframework.beans.factory.annotation.Autowired

@Service
class HelloService {

    fun getHello():String {
        return "hello world"
    }
}