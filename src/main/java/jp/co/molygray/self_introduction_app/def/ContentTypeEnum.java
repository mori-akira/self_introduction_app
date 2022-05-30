package jp.co.molygray.self_introduction_app.def;

import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ContentTypeEnum {

    BASIC("1"), LIST("2"), SIMPLE_TEXT("3");

    private String value;

    public static ContentTypeEnum of(String value) {
	return Arrays.stream(ContentTypeEnum.values())
		.filter(e -> StringUtils.equals(e.value, value))
		.findFirst()
		.orElse(null);
    }
}
