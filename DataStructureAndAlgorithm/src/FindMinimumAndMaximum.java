import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class FindMinimumAndMaximum {

    private static int[] array;
    private static float[] floatArray;
    




    public static void main(String[] args) throws IOException {

        LinkedList<String> list = new LinkedList<>();
    }

    private static void divindeAndConquer(String string) {
        array = new int[1];
        floatArray = new float[4];
        int i = 0;
        StringTokenizer st = new StringTokenizer(string, ",");
        while(st.hasMoreTokens()){
            if(i == 0)
                array[i] = Integer.parseInt(st.nextToken());
            else
                floatArray[i] = Float.parseFloat(st.nextToken());
            i++;
        }
    }
}
