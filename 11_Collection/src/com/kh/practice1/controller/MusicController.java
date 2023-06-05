package com.kh.practice1.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.kh.practice1.compare.ArtistAscending;
import com.kh.practice1.compare.TitleAscending;
import com.kh.practice1.model.Music;

public class MusicController {
	
	Scanner sc = new Scanner(System.in);
	
	private ArrayList<Music> list = new ArrayList<Music>();
	
	public boolean addList(Music music) {
		return list.add(music);  //list 반환 타입이 boolean 이여서 메서드 반환 타입은 boolean
	}
	
	public boolean addAtZero(Music music) {
		//add(int index, E e) : 인덱스를 지정하여 해당 인덱스에 추가
		try {
			list.add(0, music);
			return true;
			
		} catch(Exception e) {
			return false;
		}
	}
	
	//list반환
	public ArrayList<Music> printAll() {
		return list;
	}
	
	//곡 명으로 객체 검색, 객체가 있으면 객체 정보 리턴, 없으면 null리턴
	public Music searchMusic(String title) {
		
		for(Music music : list) {
		if(music.getTitle().contains(title)) { //이름이 한 글자라도 포함되어있으면 값 리턴
			return music;
			}
		}
		return null;
	}
	
	//사용자에게 삭제할 곡 이름 받고 삭제하기
	public Music removeMusic(String title) {
//		예제 1)
//		for(Music music : list) {
//			if(music.getTitle().equals(title)) {
//				list.remove(music);
//				return music; //리스트에서만 삭제되고 music에는 존재함
//			}
		
//		예제 2)
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				return list.remove(i);
				}
			}
		return null;
	}
	
	//특정 곡 정보 수정
	public Music setMusic(String title, Music music) {
		
		for(Music m : list) {
			if(m.getTitle().equals(title)) {
				return list.set(list.indexOf(m), music);
			}
		}
		return null;
	}
	
	public ArrayList<Music> ascTitle() {
		
		ArrayList<Music> list = (ArrayList<Music>)this.list.clone();
		// 오름차순
		Collections.sort(list, new TitleAscending());
		return list;
	}
	
	public  ArrayList<Music> descArtist() {
		
		ArrayList<Music> list = (ArrayList<Music>) this.list.clone();
		// 내림차순
		Collections.sort(list, new ArtistAscending().reversed());
		return list;
	}
	
}
