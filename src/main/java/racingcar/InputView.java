package racingcar;

import java.util.Scanner;

public class InputView {
    public static RacingGameInfoDTO inputDataAndView() {
        Scanner sc = new Scanner(System.in);

        System.out.println("자동차 대수는 몇 대 인가요?");
        int countOfCar = sc.nextInt();
        System.out.println("시도할 회수는 몇 회 인가요?");
        int testCase = sc.nextInt();

        return new RacingGameInfoDTO().setCountOfCar(countOfCar)
                                      .setTestCase(testCase);
    }
}