package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import checkers.*;

public class TestGameEngine {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testEval() {
		
		int[][]test = {{2,0,0,0,0,0,1,0},{0,2,0,2,0,1,0,1},{2,0,2,0,0,0,1,0},{0,2,0,0,0,1,0,1},{2,0,2,0,0,0,1,0},{0,2,0,0,0,1,0,1},{2,0,2,0,0,0,1,0},{0,2,0,0,0,1,0,1}};
		System.out.println(GameEngine.eval(test));
				assertTrue(-9<=GameEngine.eval(test)&&GameEngine.eval(test)<=1);
	}

	@Test
	public void testCopyBoard() {
		int[][] test = {{2,0,2,0,0,0,1,0},{0,2,0,0,0,1,0,1},{2,0,2,0,0,0,1,0},{0,2,0,0,0,1,0,1},{2,0,2,0,0,0,1,0},{0,2,0,0,0,1,0,1},{2,0,2,0,0,0,1,0},{0,2,0,0,0,1,0,1}};
		
		int[][]returnValue = GameEngine.copyBoard(test);
		assertArrayEquals(test, returnValue);
				
	}

	@Test
	public void testGetOpponent() {
		
		System.out.println("Opp 1 : " + GameEngine.getOpponent(1));
		System.out.println("Opp 2 : " + GameEngine.getOpponent(2));
		System.out.println("Opp 3 : " + GameEngine.getOpponent(3));
		System.out.println("Opp 4 : " + GameEngine.getOpponent(4));
		System.out.println("Opp 0 : " + GameEngine.getOpponent(0));
		
		
		assertEquals(2,GameEngine.getOpponent(1));
		assertEquals(1,GameEngine.getOpponent(2));
	}

	@Test
	public void testGetTurn() {
		System.out.println("Turn 1 : " + GameEngine.getTurn(1));
		System.out.println("Turn 2 : " + GameEngine.getTurn(2));
		System.out.println("Turn 3 : " + GameEngine.getTurn(3));
		System.out.println("Turn 4 : " + GameEngine.getTurn(4));
		System.out.println("Turn 0 : " + GameEngine.getTurn(0));
		
		assertEquals(0x7fffffff, GameEngine.getTurn(1));
		assertEquals(-0x7fffffff, GameEngine.getTurn(2));
		assertEquals(0x7fffffff, GameEngine.getTurn(3));
		assertEquals(-0x7fffffff, GameEngine.getTurn(4));
		
	}

}
