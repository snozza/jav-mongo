package com.packtpublishing.tddjava.ch03tictactoe.mongo;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import org.jongo.Jongo;
import org.jongo.MongoCollection;

import java.net.UnknownHostException;

public class TicTacToeCollection {

    private MongoCollection mongoCollection;

    public TicTacToeCollection() throws UnknownHostException {
       DB db = new MongoClient().getDB("tic-tac-toe");
       mongoCollection = new Jongo(db).getCollection("game");
    }

    protected MongoCollection getMongoCollection() {
        return mongoCollection;
    }

    public boolean saveMove(TicTacToeBean bean) {
        try {
            getMongoCollection().save(bean);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean drop() {
        try {
            getMongoCollection().drop();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}