package triangle;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {
    @Test
    @DisplayName("Tam giác đều")
    void testCase1() {
        int canhA = 2;
        int canhB = 2;
        int canhC = 2;

        String expected = "Tam giác đều";
        assertEquals(expected,TriangleClassifier.checkTriangle(canhA, canhB, canhC));
    }

    @Test
    @DisplayName("Tam giác cân")
    void testCase2() {
        int canhA = 2;
        int canhB = 2;
        int canhC = 3;

        String expected = "Tam giác cân";
        assertEquals(expected,TriangleClassifier.checkTriangle(canhA, canhB, canhC));
    }

    @Test
    @DisplayName("Tam giác thường")
    void testCase3() {
        int canhA = 3;
        int canhB = 4;
        int canhC = 5;

        String expected = "Tam giác thường";
        assertEquals(expected,TriangleClassifier.checkTriangle(canhA, canhB, canhC));
    }

    @Test
    @DisplayName("Không phải tam giác")
    void testCase4() {
        int canhA = 8;
        int canhB = 2;
        int canhC = 3;

        String expected = "Không phải tam giác";
        assertEquals(expected,TriangleClassifier.checkTriangle(canhA, canhB, canhC));
    }

    @Test
    @DisplayName("Không phải tam giác")
    void testCase5() {
        int canhA = -1;
        int canhB = 2;
        int canhC = 1;

        String expected = "Không phải tam giác";
        assertEquals(expected,TriangleClassifier.checkTriangle(canhA, canhB, canhC));
    }

    @Test
    @DisplayName("Không phải tam giác")
    void testCase6() {
        int canhA = 0;
        int canhB = 1;
        int canhC = 1;

        String expected = "Không phải tam giác";
        assertEquals(expected,TriangleClassifier.checkTriangle(canhA, canhB, canhC));
    }
}