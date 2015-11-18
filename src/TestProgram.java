//import com.estreller.webprj.dao.ManagerDao;
import java.sql.SQLException;
import java.util.List;

import com.estreller.wbprj.dao.mybatis.MyBatisMemberDao;
import com.estreller.webprj.dao.MemberDao;
import com.estreller.webprj.dao.mybatis.MybatisMemberDao;
//import com.estreller.webprj.vo.Manager;
import com.estreller.webprj.vo.Member;

public class TestProgram {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		MemberDao dao = new MybatisMemberDao();//Mybatis활용
		

		Member member = new Member();
		//업데이트시키기위한 셋팅.
		member.setEmail("rlatkd12");
		member.setNickname("쌍쌍");
		member.setPwd("1234");
		member.getJoinDate();
		dao.update(member);
		//rlatkd 이라는 아이디의 데이터를 삭제
		dao.delete("rlatkd");
		//2페지이에 해당되는 멤버리스트를 담는다
		List<Member> list = dao.getMembers(2);
		//insert ID ,NAME 추가 회원가입개념.
	    member.setEmail("rlatkd");
		member.setEmail("김쌍");
		member.setPwd("1234");
		member.getJoinDate();
		dao.insert(member);
	/*	
		ManagerDao mdao = new ManagerDao();
		List<Manager> mlist=mdao.getManager();*/
		
		System.out.println("**회원정보**");
		for(Member m : list)
		{
			System.out.printf("Email : %s, 가입날짜 : %s, 닉네임 : %s, 비밀번호 : %s \n",
					m.getEmail(),m.getJoinDate(),m.getNickname(),m.getPwd(),m.getTotalRatings());
		}
		
		System.out.println("");
		System.out.println("");
		
		/*System.out.println("**관리자**");
		for(Manager m : mlist)
		{
			System.out.printf("관리자아이디 : %s, 관리자 비밀번호 : %s \n",
					m.getMid(),m.getPwd());
		}*/
		
	}

}