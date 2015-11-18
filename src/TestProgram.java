//import com.estreller.webprj.dao.ManagerDao;
import java.sql.SQLException;
import java.util.List;

import com.estreller.webprj.dao.MemberDao;
import com.estreller.webprj.dao.mybatis.MybatisMemberDao;
//import com.estreller.webprj.vo.Manager;
import com.estreller.webprj.vo.Member;

public class TestProgram {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		MemberDao dao = new MybatisMemberDao();
		List<Member> list=dao.getMembers();
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