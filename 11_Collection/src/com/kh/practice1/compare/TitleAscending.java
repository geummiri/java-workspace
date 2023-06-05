package com.kh.practice1.compare;

import java.util.Comparator;

import com.kh.practice1.model.Music;

public class TitleAscending  implements Comparator<Music> {

	@Override
	public int compare(Music o1, Music o2) {
		return o1.getTitle().compareTo(o2.getTitle());
	}
	
}
