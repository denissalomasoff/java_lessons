package org.java_lessons.lesson5.step1.impl;

import org.java_lessons.lesson5.step1.AbstractDBConnector;

public class PostgresqlConnectorImpl extends AbstractDBConnector {

    public PostgresqlConnectorImpl(String username, String password, String host, int port, String database) {
        super(username, password, host, port, database);
    }
}
