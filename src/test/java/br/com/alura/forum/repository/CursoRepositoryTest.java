package br.com.alura.forum.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import br.com.alura.forum.modelo.Curso;

@ExtendWith(SpringExtension.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ActiveProfiles("test")
class CursoRepositoryTest {
// A anotação @DataJpaTest simplifica a escrita de testes automatizados de interfaces Repository.
//// SE NÃO USASSE H2, o correto é aquele autoConfig...
	@Autowired
	private CursoRepository repository;
	
	@Autowired
	private TestEntityManager em;
	
	@Test
	public void deveriaCarregarUmCursoPeloNome() {
		String nomeCurso = "HTML 5";
		
		Curso html5 = new Curso();
		html5.setNome(nomeCurso);
		html5.setCategoria("Programacao");
		em.persist(html5);
		
		Curso curso = repository.findByNome(nomeCurso);
		Assertions.assertNotNull(curso);
		Assertions.assertEquals(nomeCurso, curso.getNome());
	}
	
	@Test
	public void NaodeveriaCarregarUmCursoPeloNome() {
		String nomeCurso2 = "Wololo";
		Curso curso = repository.findByNome(nomeCurso2);
		Assertions.assertNull(curso);
		}
	
	//com mySql

}
