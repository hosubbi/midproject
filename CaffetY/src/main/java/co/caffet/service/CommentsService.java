package co.caffet.service;

<<<<<<< HEAD
public interface CommentsService {
=======
import java.util.List;

import co.caffet.vo.CommentVO;

public interface CommentsService {
	// 댓글 조회
	public List<CommentVO> getComments(int num);

	// 댓글 등록
	public boolean addComments(CommentVO cvo);
	
	//댓글 수정
	
>>>>>>> branch 'main' of https://github.com/hosubbi/midproject.git

}
