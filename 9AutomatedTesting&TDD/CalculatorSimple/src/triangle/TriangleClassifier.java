package triangle;

public class TriangleClassifier {
    public static String checkTriangle(int canhA, int canhB, int canhC) {
        boolean isNotTriangle = canhA <= 0 || canhB <= 0 || canhC <= 0 || canhA + canhB <= canhC || canhA + canhC <= canhB || canhC + canhB <= canhA;
        if (isNotTriangle) {
            return "Không phải tam giác";
        } else if (canhA == canhB && canhB == canhC) {
            return "Tam giác đều";
        } else if (canhA == canhB || canhB == canhC || canhA == canhC) {
            return "Tam giác cân";
        } else {
            return "Tam giác thường";
        }
    }


}
