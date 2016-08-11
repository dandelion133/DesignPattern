package com.qian.factory1;

public abstract class Factory {
	public abstract <T extends Product> T createProduct(Class<T> clz);
}
