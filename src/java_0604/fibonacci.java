package java_0604;
/* 퀴즈(피보나치 이론)
  피보나치 수열의 첫 10개 항을 출력하는 프로그램을 작성하세요.
  설명:
  피보나치 수열은 다음과 같이 정의됩니다:
    첫 번째 항과 두 번째 항은 1입니다.
    세 번째 항부터는 이전 두 항의 합으로 정의됩니다.
  피보나치 수열의 첫 10개 항은 다음과 같습니다:
  1, 1, 2, 3, 5, 8, 13, 21, 34, 55
  이 문제에서는 for문을 사용하여 피보나치 수열의 첫 10개 항을 차례로 출력해야 합니다.
  힌트:
  첫 번째 항과 두 번째 항을 변수에 초기화합니다.
  for문을 사용하여 10번 반복합니다.
  각 반복에서 이전 두 항의 합을 계산하여 다음 항을 구합니다.
  현재 항을 출력합니다. */

public class fibonacci {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < 10; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}