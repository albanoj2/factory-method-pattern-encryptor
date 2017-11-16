package com.dzone.albanoj2.patterns.factory;

import com.dzone.albanoj2.patterns.factory.algorithm.EncryptionAlgorithm;
import com.dzone.albanoj2.patterns.factory.algorithm.Sha512EncryptionAlgorithm;

public class Sha512Encryptor extends Encryptor {

	@Override
	public EncryptionAlgorithm getEncryptionAlgorithm() {
		return new Sha512EncryptionAlgorithm();
	}
}
