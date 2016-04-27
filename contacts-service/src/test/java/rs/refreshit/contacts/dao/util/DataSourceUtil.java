package rs.refreshit.contacts.dao.util;

/**
 * Created by Djordje on 4/27/2016.
 */
public final class DataSourceUtil {

    private static final String DB_URL = "jdbc:h2:mem:test;INIT=CREATE SCHEMA IF NOT EXISTS contacts_db";
    private static final String DB_USER = "sa";
    private static final String DB_PASS = "sa";

    private DataSourceUtil(){}

}
