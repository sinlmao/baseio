package com.generallycloud.nio.buffer.v2;

import java.nio.ByteBuffer;

@Deprecated
public class DirectMemoryPoolV2 extends MemoryPoolV2{

	public DirectMemoryPoolV2(int capacity) {
		super(capacity);
	}

	protected ByteBuffer allocateMemory(int capacity) {
		return ByteBuffer.allocateDirect(capacity);
	}

	public void freeMemory() {
		
//		sun.nio.ch.DirectBuffer buffer = (sun.nio.ch.DirectBuffer) memory;
//		
//		buffer.cleaner().clean();
	}

}
