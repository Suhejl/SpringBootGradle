package ch.nyp.Gradle_Demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/rest")
public class Controller {

  @GetMapping
  public ResponseEntity<String> saySomething() {
    return new ResponseEntity<>("Hello World", HttpStatus.OK);
  }

 /* @GetMapping("/{id}")
  public ResponseEntity<String> */
}