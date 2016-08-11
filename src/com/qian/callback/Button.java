package com.qian.callback;

public class Button {
	private OnClickListener listener;
	public void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	public void click() {
		if(listener != null) {
			listener.onClick();
		}
	}
	
}

interface OnClickListener{
	public void onClick();
}
