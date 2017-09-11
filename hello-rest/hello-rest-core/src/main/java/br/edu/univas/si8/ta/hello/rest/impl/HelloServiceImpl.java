package br.edu.univas.si8.ta.hello.rest.impl;

import br.edu.univas.si8.ta.hello.rest.api.HelloService;
import br.edu.univas.si8.ta.hello.rest.api.Result;

public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello(String name) {
		
		return String.format("<h1>Hello %s!!!</h1>", name);
		
	}

	@Override
	public Result sum(int a, int b) {
		int result = a+b;
		return new Result().withA(a).withB(b).withValue(result);
	}

}
