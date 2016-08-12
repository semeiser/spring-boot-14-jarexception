package com.example;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.util.Collections;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FilesWalkJarExceptionApplication {

	public static void main(String[] args) throws URISyntaxException, IOException {
		Files
			.walk(FileSystems.newFileSystem(FilesWalkJarExceptionApplication.class.getResource("").toURI(), Collections.emptyMap()).getPath("/"))
			.forEach(System.out::println);
	}
}
