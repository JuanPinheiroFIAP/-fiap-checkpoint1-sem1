package br.com.fiap.checkpoint1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ping")
public class PingControler {

    @GetMapping
    public String pong(){
        return "pong";
    }
}
