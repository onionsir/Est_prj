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
		
		System.out.println("**ȸ������**");
		for(Member m : list)
		{
			System.out.printf("Email : %s, ���Գ�¥ : %s, �г��� : %s, ��й�ȣ : %s \n",
					m.getEmail(),m.getJoinDate(),m.getNickname(),m.getPwd(),m.getTotalRatings());
		}
		
		System.out.println("");
		System.out.println("");
		
		/*System.out.println("**������**");
		for(Manager m : mlist)
		{
			System.out.printf("�����ھ��̵� : %s, ������ ��й�ȣ : %s \n",
					m.getMid(),m.getPwd());
		}*/
		
	}

}