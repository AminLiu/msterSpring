package main.baobaotao.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import main.baobaotao.domain.LoginLog;

@Repository
public class LoginLogDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void insertLoginLog(LoginLog loginLog) {
		String sql = "insert into t_login_log(user_id,ip,login_datetime) values(?,?,?)";
		Object[] args = { loginLog.getUserId(), loginLog.getIp(), loginLog.getLoginDateTime() };
		jdbcTemplate.update(sql, args);
	}
}
