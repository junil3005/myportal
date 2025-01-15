package himedia.myportal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import himedia.myportal.repositories.BoardDao;
import himedia.myportal.repositories.vo.BoardVo;

public class BoardServiceImpl implements BoardService {
	@Autowired 
	BoardDao boardDaoImpl;
	
	@Override
	public List<BoardVo> getList() {
		return boardDaoImpl.selectAll();
	}

	@Override
	public BoardVo getContent(Integer no) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean write(BoardVo boardVo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(BoardVo boardVo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteByNoAndUserNo(Integer no, Long userNo) {
		// TODO Auto-generated method stub
		return false;
	}

}
