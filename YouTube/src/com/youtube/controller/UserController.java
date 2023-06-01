package com.youtube.controller;

import com.youtube.model.User;

	public class UserController implements UserControllerImpl {

		
		/*CRUD
		 *Create : 추가
		 *Read : 읽기(1개, 목록)
		 *Update : 수정
		 *Delete : 삭제
		 */
		
		
		@Override
		public boolean login() {
			return false;
		}

		@Override
		public boolean signup() {
			return false;
		}

		@Override
		public User viewProfile() {
			return null;
		}

		@Override
		public User updateProfile() {
			return null;
		}

		@Override
		public boolean deleteProfile() {
			return false;
		}
	
		
		

}
