package unitTest;

import model.Dado;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class DadoTeste {

    private Dado dado;


    @Before
    public void setUp(){
        dado = new Dado();
    }

    @Test
    public void testGetQtdFaces(){
        assertEquals(6, dado.getQtdFaces());
    }

    @Test
    public void testGetFace(){
        int vetorResultado[] = new int[]{1,2,3,4,5,6};
        int vetorGerado[] = new int[6];
        for(int i=0; i<6; vetorGerado[i++]=0);
        int i=0;
        while(i<6){
            dado.jogarDado();
            if(dado.getFace() == (i+1)){
                vetorGerado[i] = dado.getFace();
                i++;
            }
        }

        assertArrayEquals(vetorResultado, vetorGerado);

    }

}
