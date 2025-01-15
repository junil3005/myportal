package himedia.myportal.exceptions;

import himedia.myportal.repositories.vo.UserVo;

public class UserDaoException extends RuntimeException {		//	 에러 발생시 해결 객체
	private UserVo userVo = null;
	
	public UserDaoException() {
		
	}
	
	public UserDaoException(String message) {
		super(message);
	}

	public UserDaoException(String message, UserVo userVo) {
		super(message);
		this.userVo = userVo;
	}
}
