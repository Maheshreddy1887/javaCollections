package com.mahesh.game;

import com.mahesh.game.dto.GameDTO;
import com.mahesh.game.service.GameService;
import com.mahesh.game.service.GameServiceImpl;


public class GameTester {

	public static void main(String[] args) {
		
GameDTO dto = new GameDTO("LudoKing","6.2","Gametronix",6,50.25d,true);
		
		GameService service = new GameServiceImpl();
		String save = service.validateAndSave(dto);
		System.out.println(save);
		

	}

}
