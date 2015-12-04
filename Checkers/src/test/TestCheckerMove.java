package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import checkers.CheckerMove;

public class TestCheckerMove {
	private int[][] startingBoard = {	{2,0,2,0,0,0,1,0},
										{0,2,0,0,0,1,0,1},
										{2,0,2,0,0,0,1,0},
										{0,2,0,0,0,1,0,1},
										{2,0,2,0,0,0,1,0},
										{0,2,0,0,0,1,0,1},
										{2,0,2,0,0,0,1,0},
										{0,2,0,0,0,1,0,1}};
	private int[][] startingBoard2 = {	{2,0,0,0,0,0,0,0},
										{0,3,0,0,0,0,0,0},
										{0,0,3,0,0,0,0,0},
										{0,0,0,0,0,0,0,0},
										{0,0,0,0,0,0,0,0},
										{0,0,0,0,0,0,0,0},
										{0,0,0,0,0,0,0,0},
										{0,0,0,0,0,0,0,0}};
	private int[][] startingBoard3 = {	{2,0,0,0,0,0,1,0},
										{0,2,0,2,0,1,0,1},
										{2,0,2,0,1,0,1,0},
										{0,2,0,0,0,0,0,1},
										{2,0,2,0,0,0,1,0},
										{0,2,0,0,0,1,0,1},
										{2,0,2,0,0,0,1,0},
										{0,2,0,0,0,1,0,1}};
	private int[][] startingBoard4 = {	{2,0,2,0,0,0,1,0},
										{0,0,0,2,0,1,0,1},
										{1,0,0,0,2,0,0,0},
										{0,2,0,0,0,1,0,1},
										{0,2,0,0,0,0,0,0},
										{0,2,0,0,0,1,0,1},
										{2,0,2,0,0,0,1,0},
										{0,2,0,0,0,1,0,1}};
	private int[][] startingBoard5 = {	{2,0,0,0,0,0,1,0},
										{0,2,0,2,0,1,0,1},	
										{2,0,2,0,1,0,1,0},
										{0,2,0,0,0,0,0,1},
										{2,0,2,0,0,0,1,0},
										{0,2,0,0,0,1,0,1},
										{2,0,2,0,0,0,1,0},
										{0,2,0,0,0,1,0,1}};
	private int[][] startingBoard6 = {	{2,0,2,0,0,0,1,0},
										{0,0,0,2,0,1,0,1},
										{1,0,0,0,2,0,0,0},
										{0,2,0,0,0,1,0,1},
										{0,2,0,0,0,0,0,0},
										{0,2,0,0,0,1,0,1},
										{2,0,2,0,0,0,1,0},
										{0,2,0,0,0,1,0,1}};
	private int toMove2 = 2;
	private int toMove1 = 1;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testNoMovesLeft() {
		boolean input = CheckerMove.noMovesLeft(startingBoard, toMove2);
		boolean input2 = CheckerMove.noMovesLeft(startingBoard2, toMove1);
		assertFalse(input);
		assertTrue(input2);
		
	}

	@Test
	public void testApplyMove() {
		int expectedOutput = 1;
		int input = CheckerMove.ApplyMove(startingBoard, 0, 2, 1, 3);
		assertEquals(input, expectedOutput);
	}

	@Test
	public void testIsMoveLegal() {
		int expectedOuput = 2;
		int input = CheckerMove.isMoveLegal(startingBoard, 1, 1, 3, 1,1);
		assertEquals(input, expectedOuput);
	}

	@Test
	public void testIsWalkLegal() {
		int expectedOutput = 1;
		int expectedOutput2 = 2;
		int input = CheckerMove.isWalkLegal(startingBoard,0,2,1,3);
		int input2 = CheckerMove.isWalkLegal(startingBoard, 1,1,3,1);
		assertEquals(input, expectedOutput);
		assertEquals(input2, expectedOutput2);
	}

	@Test
	public void testCanCapture() {
		boolean input = CheckerMove.canCapture(startingBoard3, toMove2);
		boolean input2 = CheckerMove.canCapture(startingBoard4, toMove2);
		assertTrue(input);
		assertFalse(input2);
	}

	@Test
	public void testCanWalk() {
		
	}

	@Test
	public void testIsEmpty() {
		boolean input = CheckerMove.isEmpty(startingBoard, 3,2);
		boolean input2 = CheckerMove.isEmpty(startingBoard, 0,0);
		assertTrue(input);
		assertFalse(input2);
	}

	@Test
	public void testInRange() {
		boolean input = CheckerMove.inRange(3,4);
		boolean input2 = CheckerMove.inRange(8,7);
		boolean input3 = CheckerMove.inRange(6,-1);
		
		assertTrue(input);
		assertFalse(input2);
		assertFalse(input3);
	}

	@Test
	public void testGenerateMoves() {
		
	}

}
