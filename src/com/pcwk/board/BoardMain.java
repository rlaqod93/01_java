package com.pcwk.board;

import org.apache.log4j.Logger;

import com.pcwk.cmn.SearchVO;

public class BoardMain {

	final Logger LOG = Logger.getLogger(getClass());
	private BoardDao dao;
	private BoardVO board01;
	private SearchVO search01;
	
	public BoardMain() {
		dao = new BoardDao();
		board01 = new BoardVO(900001, "제목_900001", "내용_900001", 0, "", "pcwk", "", "pcwk");
		search01 = new SearchVO("", "", 10, 1);
	}
	
	public void doSave() {
		int flag = dao.doSave(board01);
		if(flag == 1) {
			LOG.debug("==================");
			LOG.debug("======등록 성공======");
			LOG.debug("==================");
		}else {
			LOG.debug("==================");
			LOG.debug("======등록 실패======");
			LOG.debug("==================");
		}
	}
	
	public void doDelete() {
		int flag = dao.doDelete(board01);
		if(flag == 1) {
			LOG.debug("==================");
			LOG.debug("======삭제 성공======");
			LOG.debug("==================");
		}else {
			LOG.debug("==================");
			LOG.debug("======삭제 실패======");
			LOG.debug("==================");
		}
	}
	
	public boolean isSameVO(BoardVO orgVO, BoardVO vsVO) {
		boolean isSame = false;
		if(orgVO.getSeq() == vsVO.getSeq()
				&& orgVO.getTitle().equals(vsVO.getTitle())
				&& orgVO.getContents().equals(vsVO.getContents())
				&& orgVO.getReadCnt() == vsVO.getReadCnt()
				&& orgVO.getRegId().equals(vsVO.getRegId())
				&& orgVO.getModId().equals(vsVO.getModId())) {
			isSame = true;
		}
		return isSame;
	}
	
	public void doSelectOne() {
		BoardVO outVO = dao.doSelectOne(board01);
		if(outVO != null && isSameVO(board01, outVO)) {
			LOG.debug("==================");
			LOG.debug("======조회 성공======");
			LOG.debug("==================");
		}else {
			LOG.debug("==================");
			LOG.debug("======조회 실패======");
			LOG.debug("==================");
		}
	}
	
	public static void main(String[] args) {
		BoardMain main = new BoardMain();
		//삭제
		main.doDelete();
		//등록
		main.doSave();
		//조회
		main.doSelectOne();
	}
}