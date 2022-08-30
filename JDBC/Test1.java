package JDBC;

import java.sql.*;
import java.util.Properties;
import com.jcraft.jsch.JSch;

import com.jcraft.jsch.Session;

public class Test1 {
	static int lport;
	static String rhost;
	static int rport;

	public static void go() {
		String user = "riednyko";
		String password = "ntcnjdfz,fpf";
		String host = "104.248.36.241";
		int port = 22;
		try {
			JSch jsch = new JSch();
			Session session = jsch.getSession(user, host, port);
			lport = 5432;
			rhost = "127.0.0.1";
			rport = 5432;
			session.setPassword(password);
			session.setConfig("StrictHostKeyChecking", "no");
			System.out.println("Establishing Connection...");
			session.connect();
			int assinged_port = session.setPortForwardingL(lport, rhost, rport);
			System.out.println("localhost:" + assinged_port + " -> " + rhost + ":" + rport);
		} catch (Exception e) {
			System.err.print(e);
		}
	}

	public static void main(String[] args) {
		try {
			go();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("An example for updating a Row from Mysql Database!");
		Connection con = null;
		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql://" + rhost + ":" + lport + "/";
		String db = "pagila";
		String dbUser = "postgres";
		String dbPasswd = "postgres";
		try {
			Properties paramConnection = new Properties();
			paramConnection.setProperty("user", "postgres");
			paramConnection.setProperty("password", "postgres");
			paramConnection.setProperty("encoding", "WIN1251");
			Class.forName(driver);
			con = DriverManager.getConnection(
					"jdbc:postgresql:5432//localhost/pagila?user=postgres&password=postgres&encoding=WIN1251&amp;useUnicode=true&amp;characterEncoding=utf8");
			try {
				Statement st = con.createStatement();
				String sql = "SELECT title FROM film WHERE rating = 'PG'";
				int update = st.executeUpdate(sql);
				if (update >= 1) {
					System.out.println("Row is updated.");
				} else {
					System.out.println("Row is not updated.");
				}
			} catch (SQLException s) {
				System.out.println("SQL statement is not executed!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
