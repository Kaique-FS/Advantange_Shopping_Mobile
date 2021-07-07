package com.keeggo.avengers.advantage.managers;

import com.keeggo.avengers.advantage.dataProvider.ConfigFileReader;

public class FileReaderManager {

	private static FileReaderManager FileManager = new FileReaderManager();
	private static ConfigFileReader ConfigReader;

	private FileReaderManager() {
	}

	public static FileReaderManager getInstance() {
		return FileManager;
	}
	
	public ConfigFileReader getConfigReader() {
		return (ConfigReader == null) ? new ConfigFileReader() : ConfigReader;
	}
}
