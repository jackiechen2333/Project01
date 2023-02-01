package com.cx.team.service;

/**
 * @Author cx
 * @Date 2023/01/30/8:37
 */
public class TeamException extends Exception{

    static final long serialVersionUID = -33875169124229948L;

    public TeamException() {
    }

    public TeamException(String message) {
        super(message);
    }
}
