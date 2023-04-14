package common;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.apache.commons.lang3.RandomStringUtils;

public class Time {
	public SimpleDateFormat dateFormat;

	public String getCurrentTime() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		return dateFormat.format(new Date());
	}

	public String getCurrentTimeForUniqueMobile() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("MMddHHmmss");
		return dateFormat.format(new Date());
	}

	public String getUniqueAlephabeticString(int stringLength) {
		return RandomStringUtils.randomAlphabetic(stringLength);
	}
}
