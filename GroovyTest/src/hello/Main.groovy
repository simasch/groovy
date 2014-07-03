package hello

def hello = new Hello()
hello.name = "Hugo"
println hello.greet()

def helloJava = new HelloJava()
println helloJava.sayHello()