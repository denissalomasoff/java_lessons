package org.java_lessons.lesson5.step1.impl;
//Реализовать класс коннектор к БД CassandraDBConnector implements DBConnector;

import org.java_lessons.lesson5.step1.AbstractDBConnector;

public class CassandraDBConnectorImpl extends AbstractDBConnector{
    public CassandraDBConnectorImpl(String username, String password, String host, int port, String database) {
        super(username, password, host, port, database);
}
}
