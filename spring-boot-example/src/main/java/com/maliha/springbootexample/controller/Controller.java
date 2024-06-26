package com.maliha.springbootexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @GetMapping("/")
    public String home(){
        return "Welcome";
    }
    @GetMapping("/greet")
    public String greet(){
        return "Hello";
    }
    @GetMapping("/greet/record")
    public GreetResponse greetResponse(){
        return new GreetResponse("Hello",List.of("Java ","Python","C++"),new Person("Person1", 30, 30000));
    }
    record Person(String name, int age,double savings){}
    record GreetResponse(String greet, List<String> favProgrammingLanguage,Person person){}



/*     equivalent of record:
    public class GreetResponse{
        public final String greet;

        public GreetResponse(String greet) {
            this.greet = greet;
        }

        public String getGreet() {
            return greet;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            GreetResponse that = (GreetResponse) o;
            return Objects.equals(greet, that.greet);
        }

        @Override
        public int hashCode() {
            return Objects.hash(greet);
        }

        @Override
        public String toString() {
            return "GreetResponse{" +
                    "greet='" + greet + '\'' +
                    '}';
        }
    }
*/
}
