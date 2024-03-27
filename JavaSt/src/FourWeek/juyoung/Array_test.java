package FourWeek.juyoung;
import java.util.Arrays;

import ThreeWeek.Jooyeong.forex;

public class Array_test {
    public static void main(String[] args) {
    int[] iArr1 = new int[10]; //길이가 10인 int배열 생성
    int[] iArr2 = new int[10]; //길이가 10인 int배열 생성
    //int[] iArr3 = new int[]{100, 95, 80, 70, 60};
    int[] iArr3 = {100,95,80,70,60}; 
    char[] chArr = {'a','b','c','d'};

    for(int i=0; i < iArr1.length; i++){  //1부터 10까지 배열에 저장
        iArr1[i] = i + 1;
    }

    for(int i=0; i < iArr2.length; i++) {   //난수(int타입)를 배열에 저장
        iArr2[i] = (int)(Math.random()*10) + 1;
    }

    for(int i =0; i < iArr1.length; i++) {  //Arr1배열 출력
        System.out.print(iArr1[i]+",");
    }
    System.out.println();

    System.out.println(Arrays.toString(iArr2)); 
    System.out.println("iArr3출력: " + Arrays.toString(iArr3));
    System.out.println("chArr출력: " + Arrays.toString(chArr));
    System.out.println(iArr3);
    System.out.println(chArr);
}

    
    
}
