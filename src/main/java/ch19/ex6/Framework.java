package ch19.ex6;

public class Framework {
	public static boolean isSupport(ApplicationServer app, Database db) {
		if (app == ApplicationServer.GlassFish) {
			return true;
		}
		
		if (app == ApplicationServer.Tomcat) {
			return db == Database.MySQL;
		}
		
		if (app == ApplicationServer.JBoss) {
			return db == Database.DB2 || db == Database.PostgreSQL;
		}
		
		return false;
	}
}
