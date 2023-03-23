package co.caffet.service;

<<<<<<< HEAD
import org.apache.ibatis.session.SqlSession;

import co.caffet.common.DataSource;

public class CommentsServiceMybatis implements CommentsService{
	private SqlSession sqlSession = DataSource.getInstance().openSession(true);
=======
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.caffet.common.DataSource;
import co.caffet.mapper.BoardMapper;
import co.caffet.mapper.CommentsMapper;
import co.caffet.vo.CommentVO;

public class CommentsServiceMybatis implements CommentsService {
	private SqlSession sqlSession = DataSource.getInstance().openSession(true);
	private CommentsMapper mapper = sqlSession.getMapper(CommentsMapper.class);

	@Override
	public List<CommentVO> getComments(int num) {
		return mapper.getComments(num);
	}

	@Override
	public boolean addComments(CommentVO cvo) {
		int r = mapper.addComments(cvo);
		return r == 1;
	}
>>>>>>> branch 'main' of https://github.com/hosubbi/midproject.git

}
