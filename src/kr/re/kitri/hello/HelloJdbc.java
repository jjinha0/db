package kr.re.kitri.hello;

import kr.re.kitri.hello.service.MyBizService;

import java.util.Arrays;
import java.util.List;

/**
 * Created by danawacomputer on 2017-05-08.
 */
public class HelloJdbc {

    public static void main(String[] args){
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int result = MyBizService.sumIntList(intList);
        double resultAverage = 0; //예외처리가 나왔을 때 예외메세지 띄우고 avg는 초기값 0으로 나옴
        try {
            resultAverage = MyBizService.averageIntList(intList);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.printf("합은 %d이고 평균은 %.1f입니다.",result,resultAverage);

    }

}

