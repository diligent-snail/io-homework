package org.diligentsnail.iohomework.iohomework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TempDirSampleTest {
	@Test
	void fileWrittenAndRead(@TempDir Path path) throws IOException {
		// Строка для записи
		String expected = "myString";

		// Параметр path - временная директория, resolve - вернёт Path для файла в этой директории
		Path target = path.resolve("myfile.txt");
		// Пишем expected в value
		Files.writeString(target, expected);
		// А теперь обратно читаем
		String actual = Files.readString(target);


		assertEquals(expected, actual);
	}
}
