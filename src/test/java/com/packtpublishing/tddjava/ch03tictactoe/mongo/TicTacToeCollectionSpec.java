package com.packtpublishing.tddjava.ch03tictactoe.mongo;

import org.junit.Test;

public class TicTacToeCollectionSpec {

    @Test
    public void whenInstantiatedThenMongoHasDbNameTicTacToe() {
        TicTacToeCollection collection = new TicTacToeCollection();
        assertEquals(
                "tic-tac-toe",
                collection.getMongoCollection().getDBCollection().getDB().getName();
    }

}