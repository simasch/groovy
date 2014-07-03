package hello

import groovy.transform.Immutable

@Immutable
class HelloImmutable {
    
    String name = "Hugo"
    
    def greet() {
        "Hello, $name"
    }
	
}

