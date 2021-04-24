package ingjulianvega.ximic.msscasuintensity.exception;

import lombok.Getter;

@Getter
public class IntensityException extends RuntimeException {

    private final String code;

    public IntensityException(final String code, final String message) {
        super(message);
        this.code = code;
    }
}

