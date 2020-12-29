1. Hello World Application 

In a bigger application, recompiling takes time, and it requires the application to be fully tested again. 
A better solution is, rather than changing the code, to externalize the message content and read it in at runtime.

- What if we want to change the message? Provider
- What if we want to output the message differently? Renderer
(e.g. maybe to standard error instead of standard output or enclosed in HTML tags rather than as plain text) 

2. Changes

- HelloWorld with Command Line
- HelloWorld Decoupled
- HelloWorld Decoupled with Factory
- HelloWorld Spring DI