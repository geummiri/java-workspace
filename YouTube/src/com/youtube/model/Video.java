package com.youtube.model;

import java.util.Date;

public class Video {

	public String title;
	public String comment;
	public Date uploatdAt;
	public int count;
	public String imgUrl;
	public String fileUrl;

	public boolean login() { //로그인

		return false;
	}	
	public boolean signup() { //회원가입

		return false;
	}
	public User viewProfile() { //프로필 넣기

		return null;
	}
	public User updateProfile() { //프로필 수정

		return null;
	}
	public boolean deleteProfile() { //프로필 삭제

		return false;
	}

	
	/*CRUD
	 *Create : 추가
	 *Read : 읽기(1개, 목록)
	 *Update : 수정
	 *Delete : 삭제
	 */

	public Video upload() {//동영상 업로드
		return null;
	}
	public Video[] videolist() {//동영상 목록
		return null;
	}
	public Video viewVideo() {//영상 1개 보기
		 return null;
	}
	public Video update() {//동영상 수정
		 return null;
	}
	public boolean delete() {//동영상 삭제
		return false;
	}
	
	
}
