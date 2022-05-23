package com.pcwk.comn;

import java.util.List;

//	DTO(Date Transfer Object)는 VO(Value Object)로 바꿔 말할 수 있는데
//	계층간 데이터 교환을 위한 자바빈즈를 말한다. 여기서 말하는 계층간의
//	컨트롤러 , 뷰 ,비즈니스 계층 , 퍼시스턴스 계층을 말하며 각 계층간 데이터 교환을
//	위한 객체를 DTO또는VO라고 부른다.

//	DAO(Date Access Object)는 DB를 사용해 데이터를 조회하거나 조작하는 기능을 전담하도록
//	만든 오브젝트를 말한다.

/**
 *<pre>
 * 모든 DAO는 WorkDiv를 implements 받을 것.
 * @author ITSC
 *<pre>
 */
public interface WorkDiv2 {
	
	/**
	 *<pre>
	 * 목록조회
	 * @param dto
	 * @return List<DTO>
	 * <pre>
	 */
	public abstract List<DTO> doRetrieve(DTO dto);
	
	/**
	 * <pre>
	 * 등록
	 * @param dto
	 * @return 1(성공)/0(실패)
	 * <pre>
	 */
	public abstract int doSave(DTO dto);
	
	/**
	 * <pre>
	 * 삭제
	 * @param dto
	 * @return 1(성공)/0(실패)
	 * <pre>
	 */
	public int doDelete(DTO dto);
	
	/**
	 * <pre>
	 * 단건조회
	 * @param dto
	 * @return DTO
	 * <pre>
	 */
	public DTO doSelectOne(DTO dto);
	
	/**
	 * <pre>
	 * 수정 : delete,insert
	 * @param dto
	 * @return 1(성공)/0(실패)
	 * <pre>
	 */
	public int doUpdate(DTO dto);
	
	
	
	
	
	
	
}
