package com.github.src.game.pw.test;

import com.github.src.game.pw.service.IPoliticsAndWar;
import com.github.src.game.pw.serviceimpl.PoliticsAndWarImpl;

public class ClientPWTest {
	
	public static void main(String[] args) {
		IPoliticsAndWar pwimpl = new PoliticsAndWarImpl(null, false, false, 0, 0L);
		System.out.println(pwimpl.getNation(108578).getGovernment());
	}

}
