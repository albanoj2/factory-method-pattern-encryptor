package com.dzone.albanoj2.patterns.factory;

import com.dzone.albanoj2.patterns.factory.algorithm.EncryptionAlgorithm;
import com.dzone.albanoj2.patterns.factory.algorithm.Sha256CEncryptionAlgorithm;

public class Sha256Encryptor extends Encryptor {

	@Override
	public EncryptionAlgorithm getEncryptionAlgorithm() {
		return new Sha256CEncryptionAlgorithm();
	}
}
