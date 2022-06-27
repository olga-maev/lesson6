package org.example.lesson6_1.service;
public class SQRService {

    public int inTarget(int leftPoint, int rightPoint) {
        int count = 0;
        for (int i = 10; i < 100; i++) {
            if ((i * i > leftPoint) && (i * i < rightPoint)) count++;
        }
        return count;
    }

}
