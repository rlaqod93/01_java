package com.pcwk.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;

import com.pcwk.cmn.DTO;
import com.pcwk.cmn.JDBCUtil;
import com.pcwk.cmn.PConnection;
import com.pcwk.cmn.WorkDiv;

public class BoardDao implements WorkDiv<BoardVO> {
	final Logger LOG = Logger.getLogger(getClass());
	
	private PConnection pConnection;
	
	public BoardDao() {
		pConnection = new PConnection();
	}
	
	
	@Override
	public List<BoardVO> doRetrieve(DTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int doSave(BoardVO dto) {
		int flag = 0;
		Connection conn = null; // DB연결 정보
		PreparedStatement pstmt = null; // SQL+DATA
		StringBuilder sb = new StringBuilder(100);
		
		// 1. DB연결
		conn = pConnection.connect();
		
		// 2. SQL작성
		sb.append(" INSERT INTO board ( \n");
		sb.append("     seq,            \n");
		sb.append("     title,          \n");
		sb.append("     contents,       \n");
		sb.append("     read_cnt,       \n");
		sb.append("     reg_id,         \n");
		sb.append("     mod_id          \n");
		sb.append(" ) VALUES (          \n");
		sb.append("     ?,              \n");
		sb.append("     ?,              \n");
		sb.append("     ?,              \n");
		sb.append("     ?,              \n");
		sb.append("     ?,              \n");
		sb.append("     ?               \n");
		sb.append(" )                   \n");
		
		LOG.debug("query : \n" + sb.toString());
		LOG.debug("param : " + dto.toString());
		
		// 3. param전달
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, dto.getSeq());
			pstmt.setString(2, dto.getTitle());
			pstmt.setString(3, dto.getContents());
			pstmt.setInt(4, 0);
			pstmt.setString(5, dto.getRegId());
			pstmt.setString(6, dto.getModId());
			
			// 4. SQL 실행
			flag = pstmt.executeUpdate();
			
			// 5. SQL 실행결과
			LOG.debug("flag : " + flag);
			
		}catch(SQLException e) {
			LOG.debug("SQLException : " + e.getMessage());
			e.printStackTrace();
		}finally {
			// 6. 자원반납
			JDBCUtil.close(pstmt);
			JDBCUtil.close(conn);
		}
		return flag;
	}

	@Override
	public int doDelete(BoardVO dto) {
		int flag = 0;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		StringBuilder sb = new StringBuilder(200);
		
		// 1. DB연결
		conn = pConnection.connect();
		
		// 2. SQL작성
		sb.append(" DELETE FROM BOARD \n");
		sb.append(" WHERE SEQ = ?     \n");
		
		LOG.debug("query : \n" + sb.toString());
		LOG.debug("param : " + dto.toString());
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, dto.getSeq());
			
			// 4. SQL 실행
			flag = pstmt.executeUpdate();
			
			LOG.debug("flag : " + flag);
			
		}catch(SQLException e) {
			LOG.debug("SQLException : " + e.getMessage());
			e.printStackTrace();
		}finally {
			// 자원반납
			JDBCUtil.close(pstmt);
			JDBCUtil.close(conn);
		}
		
		
		return flag;
	}

	@Override
	public BoardVO doSelectOne(BoardVO dto) {
		BoardVO outVO = null;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		StringBuilder sb = new StringBuilder(50);
		
		conn = pConnection.connect();
		
		sb.append(" SELECT  seq,                                                \n");
		sb.append("         title,                                              \n");
		sb.append("         contents,                                           \n");
		sb.append("         read_cnt,                                           \n");
		sb.append("         TO_CHAR(reg_dt, 'YYYY/MM/DD HH24:MI:SS') AS REG_DT, \n");
		sb.append("         reg_id,                                             \n");
		sb.append("         TO_CHAR(mod_dt, 'YYYY/MM/DD HH24:MI:SS') AS MOD_DT, \n");
		sb.append("         mod_id                                              \n");
		sb.append(" FROM board                                                  \n");
		sb.append(" WHERE seq = ?                                               \n");
		
		LOG.debug("query : \n" + sb.toString());
		LOG.debug("param : " + dto.toString());
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, dto.getSeq());
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				outVO = new BoardVO();
				outVO.setSeq(rs.getInt("seq"));
				outVO.setTitle(rs.getString("title"));
				outVO.setContents(rs.getString("contents"));
				outVO.setReadCnt(rs.getInt("read_cnt"));
				outVO.setRegDt(rs.getString("REG_DT"));
				outVO.setRegId(rs.getString("reg_id"));
				outVO.setModDt(rs.getString("MOD_DT"));
				outVO.setModId(rs.getString("mod_id"));
			}
			
			LOG.debug("outVO : " + outVO);
			
		}catch(SQLException e) {
			LOG.debug("SQLException : " + e.getMessage());
			e.printStackTrace();
		}finally {
			JDBCUtil.close(conn);
			JDBCUtil.close(pstmt);
			JDBCUtil.close(rs);
		}
		
		return outVO;
	}

	@Override
	public int doUpdate(BoardVO dto) {
		int flag = 0;
		
		Connection conn = null; // DB연결 정보
		PreparedStatement pstmt = null; // SQL + 데이터
		StringBuilder sb = new StringBuilder(100);
		
		// 1. DB연결
		conn = pConnection.connect();
		
		sb.append(" UPDATE BOARD          \n");
		sb.append(" SET title = ?         \n");
		sb.append("     ,contents = ?     \n");
		sb.append("     ,mod_dt = SYSDATE \n");
		sb.append("     ,mod_id = ?       \n");
		sb.append(" WHERE SEQ = ?;        \n");
		
		LOG.debug("query : \n" + sb.toString());
		LOG.debug("param : " + dto.toString());
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, dto.getTitle());
			pstmt.setString(2, dto.getContents());
			pstmt.setString(3, dto.getModId());
			pstmt.setInt(4, dto.getSeq());
			
			// 4. SQL실행
			flag = pstmt.executeUpdate();
			
			// 5. SQL 실행결과
			LOG.debug("flag : " + flag);
			
		}catch(SQLException e) {
			LOG.debug("SQLException : " + e.getMessage());
			e.printStackTrace();
		}finally {
			// pstmt 자원반납
			JDBCUtil.close(pstmt);
			// conn 자원반납
			JDBCUtil.close(conn);
		}
		
		return flag;
	}

}
