package racingcar.view;

import java.util.function.Supplier;

public class InputView {
    private static final String CAR_NAMES_INPUT_MESSAGE = "경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분)";
    private static final String CAR_NAMES_DELIMITER = ",";

    private final Supplier<String> reader;

    public InputView(Supplier<String> reader) {
        this.reader = reader;
    }

    public String readCarNames() {
        System.out.println(CAR_NAMES_INPUT_MESSAGE);
        String carNames = reader.get();

        return carNames;
    }
}