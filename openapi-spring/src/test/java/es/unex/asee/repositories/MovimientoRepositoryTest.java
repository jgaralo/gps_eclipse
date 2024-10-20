package es.unex.asee.repositories;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import es.unex.asee.models.Movimiento;

@SpringBootTest
public class MovimientoRepositoryTest{
	
	@SpringBootApplication
	static class TestConfig {}

	@Autowired MovimientoRepository movimientoRepository;

	@Test
	public void savesMovimiento() {
		Movimiento movimiento=new Movimiento();
		movimiento.setFila(1);
		movimiento.setColumna(1);
		movimiento.setFicha("X");
		movimientoRepository.save(movimiento);
		assertThat(movimiento.getId()).isNotNull();
	}

	@Test
	public void findsMovimiento() {

		Optional<Movimiento> movimiento = movimientoRepository.findById(1L);
		assertThat(movimiento.get()).isNotNull();
	}
}