package com.maliha.springbootexample.records;

import java.util.List;

public record GreetResponse(String greet, List<String> favProgrammingLanguage, Person person) {
}



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
