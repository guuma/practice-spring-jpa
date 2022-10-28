package spring.data.jpa.practice.controller;

@RestController
public class V1HelloRestController {

  @GetMapping("/hello")
  public String hello() {
    return "HELLO WORLD";
  }
}
