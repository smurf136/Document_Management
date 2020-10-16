package controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProtocolController {

    @GetMapping("/")
    public ResponseEntity<String> hola(){
        return new ResponseEntity<String>("hello", HttpStatus.OK);
    }

}
