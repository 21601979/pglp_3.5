package fr.uvsq.uvsq21601979._5;

import java.io.PrintStream;
import java.time.LocalDateTime;

public class UneClasseMetier
{
	public void uneMethodeMetier(PrintStream p)
	{
		p.println(LocalDateTime.now() + "début de uneMethodeMetier");
		
		p.println(LocalDateTime.now() + "fin de uneMethodeMetier");
	}
}
