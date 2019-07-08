package com.adapter;
//创建实体类
public class VlcPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing vlc file .name:"+fileName);;
	}

	@Override
	public void playMp4(String fileName) {
		// TODO Auto-generated method stub

	}

}
