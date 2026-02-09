package org.java_lessons.lesson5.step1;

import org.java_lessons.lesson5.step1.impl.MongoDBConnectorImpl;
import org.java_lessons.lesson5.step1.impl.MySQLConnectorImpl;
import org.java_lessons.lesson5.step1.impl.PostgresqlConnectorImpl;

public class DBRunner {
    public static void main(String[] args) {
        DBConnector porstgresql = new PostgresqlConnectorImpl("user",
                "123",
                "localhost",
                5432,
                "db1");

        DBConnector mysql = new MySQLConnectorImpl("user1",
                "12322",
                "localhost",
                8000,
                "db2");

        DBConnector mongo = new MongoDBConnectorImpl("user3",
                "123222",
                "localhost",
                9000,
                "db212");

        DBConnector connector;

        System.out.println("Connecting to database Postgresql");
        connector = porstgresql;
        connector.connect();
        connector.disconnect();

        System.out.println("Connecting to database MySQL");
        connector = mysql;
        connector.connect();
        connector.disconnect();

        System.out.println("Connecting to database MongoDB");
        connector = mongo;
        connector.connect();
        connector.disconnect();

    }
}
