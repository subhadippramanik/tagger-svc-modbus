package gw.bif.tagger.modbus.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import gw.bif.tagger.modbus.enricher.ModbusTagEnricher;

@RestController
public class TaggerModbusController {
	
	@Autowired
	ModbusTagEnricher modbusTagEnricher;
	
	@RequestMapping(value = "/modbus", method = RequestMethod.POST)
	public Map<String, String> modbus(@RequestBody Map<String, String> message) {		
		return modbusTagEnricher.enrich(message);
	}
	
}
