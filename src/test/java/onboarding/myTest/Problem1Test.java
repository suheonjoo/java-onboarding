package onboarding.myTest;

import onboarding.Problem1;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Problem1Test {

    @Nested
    class problem1Test {
        @Test
        void case1() {
            List<Integer> pobi = List.of(1, 2);
            List<Integer> crong = List.of(197, 198);
            int result = -1;
            assertThat(Problem1.solution(pobi, crong)).isEqualTo(result);
        }
    }

}
