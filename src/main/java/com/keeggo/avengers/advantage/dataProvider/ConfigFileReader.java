package com.keeggo.avengers.advantage.dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

	private Properties properties;
	private final String propertyFilePath = "configs/Configs.properties";

	public ConfigFileReader() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configs.properties nao encontrado em " + propertyFilePath);
		}
	}

	public long getImplicitlyWait() {
		String implicitlyWait = properties.getProperty("implicitlyWait");
		if (implicitlyWait != null) {
			try {
				return Long.parseLong(implicitlyWait);
			} catch (NumberFormatException e) {
				throw new RuntimeException("incapaz de analisar o valor: " + implicitlyWait + " em formato Long.");
			}
		}
		return 15;
	}

	public String getCapability_deviceName() {
		String deviceName = properties.getProperty("deviceName");
		if (deviceName != null)
			return deviceName;
		else
			throw new RuntimeException("deviceName nao especificado no arquivo Configuracoes.properties.");
	}

	public String getCapability_platformVersion() {
		String platformVersion = properties.getProperty("platformVersion");
		if (platformVersion != null)
			return platformVersion;
		else
			throw new RuntimeException("platformVersion nao especificado no arquivo Configuracoes.properties.");
	}

	public String getCapability_platformName() {
		String platformName = properties.getProperty("platformName");
		if (platformName != null)
			return platformName;
		else
			throw new RuntimeException("platformName nao especificado no arquivo Configuracoes.properties.");
	}

	public String getCapability_appPackage() {
		String appPackage = properties.getProperty("appPackage");
		if (appPackage != null)
			return appPackage;
		else
			throw new RuntimeException("appPackage nao especificado no arquivo Configuracoes.properties.");
	}

	public String getCapability_appActivity() {
		String appActivity = properties.getProperty("appActivity");
		if (appActivity != null)
			return appActivity;
		else
			throw new RuntimeException("appActivity nao especificado no arquivo Configuracoes.properties.");
	}

	public String getCapability_capsComandoDeEspera() {
		String capsComandoDeEspera = properties.getProperty("capsComandoDeEspera");
		if (capsComandoDeEspera != null)
			return capsComandoDeEspera;
		else
			throw new RuntimeException("capsComandoDeEspera nao especificado no arquivo Configuracoes.properties.");
	}

	public String getCapability_servidor() {
		String servidor = properties.getProperty("servidor");
		if (servidor != null)
			return servidor;
		else
			throw new RuntimeException("servidor nao especificado no arquivo Configuracoes.properties.");
	}

	public String getreportConfigPath() {
		String reportConfigPath = properties.getProperty("reportConfigPath");
		if (reportConfigPath != null)
			return reportConfigPath;
		else
			throw new RuntimeException(
					"reportConfigPath nao especificado no arquivo Configuracao.properties pela chave: caminhoDaConfigDoReport");
	}
}
