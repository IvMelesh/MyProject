import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.*;


class Solution {
    public static void main(String[] args) {
        duplicateZeros(new int[]{1,0,2,3,0,4,5,0});

    }

        public static  void duplicateZeros(int[] arr) {
            for (int i = 0, len = arr.length; i < len; i++) {
                if (arr[i] == 0) {
                    // Перемещение метода
                    move(arr, i, len);
                    // Перемещение остальных элементов вправо продолжит генерировать 0 после текущей позиции 0, поэтому вам нужно продолжать добавлять его, иначе это будет 0
                    i++;
                }
            }
            System.out.println(Arrays.toString(arr));
        }

        private static void move(int[] arr, int i, int len) {

            // Нет необходимости двигаться в конце
            if (i >= len)
                return;

            // Начинаем движение с последней цифры
            for (int j = len - 1; j > i; j--)
                arr[j] = arr[j - 1];
        }
    }






