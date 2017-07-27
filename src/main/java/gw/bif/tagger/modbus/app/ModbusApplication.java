package gw.bif.tagger.modbus.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("gw.bif.tagger.modbus")
@EntityScan("cgw.bif.tagger.modbus")
public class ModbusApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModbusApplication.class, args);
	}
}
