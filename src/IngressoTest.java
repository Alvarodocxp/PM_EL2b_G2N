import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.Test;

public class IngressoTest {
    //TODO
    //escolha uma categoria de ingresso para fazer o teste conforme enunciado
    @Test 
    public void calcularValorIngresso(){
        Clube ingresso = new Clube("lorax", LocalDateTime.now(), EClube.PIPOCA);

        ingresso.incluir(EAdicional.BALDE_ESPECIAL);
        ingresso.incluir(EAdicional.BALDE_ESPECIAL);
        ingresso.incluir(EAdicional.BALDE_ESPECIAL);
        ingresso.incluir(EAdicional.BALDE_ESPECIAL);
        ingresso.incluir(EAdicional.BALDE_ESPECIAL);       
        
        double total = ingresso.valorIngresso();
        assertEquals(99.6 , total, 0.01);
    }
}
