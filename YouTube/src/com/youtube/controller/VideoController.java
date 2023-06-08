package com.youtube.controller;

import java.util.ArrayList;

import com.youtube.model.User;
import com.youtube.model.Video;

public class VideoController {
	
		//배열 안쓰고 ArrayList 사용
		ArrayList<Video> videoList = new ArrayList<>();
		
		public void upload(Video video) { //영상 업로드
			videoList.add(video);
		}
		public ArrayList<Video> viewList() { //동영상 목록
			return videoList;
		}
	
		public Video viewVideo(int index) { // 동영상 1개 보기
			return videoList.get(index);
		}
	
		public void updateVideo(int index, Video video) { 
			videoList.set(index, video);
		}
		
		public boolean deleteViedeo(Video video) {
			
			return videoList.remove(video);
		}
		
}