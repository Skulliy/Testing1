package Test;

import java.util.*;
public class Physics{
    public static String physics(int n, int[][] arr) {
        int sumX = 0, sumY = 0, sumZ = 0;

        for (int i = 0; i < n; i++) {
            sumX += arr[i][0];
            sumY += arr[i][1];
            sumZ += arr[i][2];;
        }
        if (sumX == 0 && sumY == 0 && sumZ == 0) {
            System.out.println("YES");
            return "YES";
        } else {
            System.out.println("NO");
            return "NO";
        }
    }
}
//     for(int i = 0; i < n-1; i++){
//         a[i] = sc.nextInt();
//     }
//     int sumx = 0,sumy = 0,sumz = 0;
//     if(n >= 3){
//         for (int i = n - 1; i >= 2;i-=3){
//             sumz += a[i];
//         }
//         for (int k = n - 2; k >= 1;k-=3){
//             sumy += a[k];
//         }
//         for (int l = n - 3; l >= 0;l-=3){
//             sumx += a[l];
//         }
//     }else if(n == 2) {
//         a[0] = sc.nextInt(); a[1] = sc.nextInt(); a[2] = sc.nextInt();
//         a[3] = sc.nextInt(); a[4] = sc.nextInt(); a[5] = sc.nextInt();
//         sumx = a[0] + a[3]; sumy = a[1] + a[4]; sumz = a[2] + a[5];
//     }else{
//         sumx = sc.nextInt(); sumy = sc.nextInt(); sumz = sc.nextInt();
//     }
//    if (sumx == 0 && sumy == 0 && sumz == 0){
//         System.out.println("YES");
//    }else System.out.println("NO");
//    sc.close();