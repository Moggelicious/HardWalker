package com.example.morga.hardwalker;

/**
 * Created by Morga on 2017-07-20.
 */

public class SensorFilter {
    //algorithm to filter out values that has close approx to steps
    private SensorFilter() {
    }

    public static float sum(float[] array) {
        float returnval = 0;
        for (int i = 0; i < array.length; i++ ) {
            returnval += array[i];
        }
        return returnval;
    }

    public static float[] cross(float[] arrayA, float[] arrayB) {
        float[] returnArray = new float[3];
        returnArray[0] = arrayA[1] * arrayB[2] - arrayA[2] * arrayB[1];
        returnArray[1] = arrayA[2] * arrayB[0] - arrayA[0] * arrayB[2];
        returnArray[2] = arrayA[0] * arrayB[1] - arrayA[1] * arrayB[0];
        return returnArray;
    }

    public static float norm(float[] array) {
        float returnval = 0;
        for (int i = 0; i < array.length; i++) {
            returnval += array[i] *array[i];
        }
        return (float) Math.sqrt(returnval);
    }

    public static float dot(float[] a, float[] b) {
        float returnval = a[0] * b[0] + a[1] *b[1] + a[2] * b[2];
        return returnval;
    }

    public static float[] normalize(float[] a) {
        float[] returnval = new float[a.length];
        float norm = norm(a);
        for (int i = 0; i < a.length; i++) {
            returnval[i] = a[i] / norm;
        }
        return returnval;
    }
}
