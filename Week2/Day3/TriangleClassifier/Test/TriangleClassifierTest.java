
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;


class TriangleClassifierTest {
    @Test
    void Check01() {
        int a =17;
        int b= 6;
        int c =12;
       String result = TriangleClassifier.chekcTriangleClassifier(a,b,c);
       String expected = "Tam giác thường";
        assertEquals(expected, result);
    }

    @Test
    void Check02() {
        int a =6;
        int b= 6;
        int c =12;
        boolean result = TriangleClassifier.isNormals(a,b,c);
        boolean expected =false ;
        assertEquals(expected, result);
    }

    @Test
    void Check03() {
        int a =1;
        int b= 2;
        int c =3;
        boolean result = TriangleClassifier.isTriangleClassifier(a,b,c);
        boolean expected =false ;
        assertEquals(expected, result);
    }

    @Test
    void Check04() {
        int a =2;
        int b= 2;
        int c =3;
        boolean result = TriangleClassifier.isCan(a,b,c);
        boolean expected =true ;
        assertEquals(expected, result);
    }
}