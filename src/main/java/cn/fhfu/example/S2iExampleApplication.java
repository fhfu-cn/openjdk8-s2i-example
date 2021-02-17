package cn.fhfu.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;

import static cn.fhfu.example.SystemInfo.SystemProperty;

@SpringBootApplication
@RestController
@RequestMapping
public class S2iExampleApplication
{
	@RequestMapping("hello")
	public String hello(){
		return "hello ";
	}
	@RequestMapping("/")
	public Object info() throws Exception
	{
		return SystemProperty();
	}

	public static void main(String[] args) {
		SpringApplication.run(S2iExampleApplication.class, args);
	}

}
