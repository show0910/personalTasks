package thirdtask;

import java.util.ArrayList;
import java.util.Collections;

public class CommonFunction {

	public ArrayList deckShuffle(int num, ArrayList deck) {

		// num
		// 1 : human Deck Shuffle
		// 2 : demon Deck Shuffle

		if (num == 1) {

			// Human Card...!!!
			Unit footMan1 = new Unit("footMan");
			Unit footMan2 = new Unit("footMan");
			Unit footMan3 = new Unit("footMan");
			Unit knight1 = new Unit("knight");
			Unit knight2 = new Unit("knight");
			Unit sniper1 = new Unit("sniper");
			Unit sniper2 = new Unit("sniper");
			Unit magician = new Unit("magician");
			Unit gryphon = new Unit("gryphon");
			Unit swordMaster = new Unit("swordMaster");
			Spell fireBall1 = new Spell("fireBall");
			Spell fireBall2 = new Spell("fireBall");
			Spell frozen = new Spell("frozen");
			Spell fireSpear = new Spell("fireSpear");
			Spell blizzard = new Spell("blizzard");

			deck.add(footMan1);
			deck.add(footMan2);
			deck.add(footMan3);
			deck.add(knight1);
			deck.add(knight2);
			deck.add(sniper1);
			deck.add(sniper2);
			deck.add(magician);
			deck.add(gryphon);
			deck.add(swordMaster);
			deck.add(fireBall1);
			deck.add(fireBall2);
			deck.add(frozen);
			deck.add(fireSpear);
			deck.add(blizzard);

		} else if (num == 2) {

			// Demon Card...!!!
			Unit skeleton1 = new Unit("skeleton");
			Unit skeleton2 = new Unit("skeleton");
			Unit skeleton3 = new Unit("skeleton");
			Unit zombie1 = new Unit("zombie");
			Unit zombie2 = new Unit("zombie");
			Unit shadow1 = new Unit("shadow");
			Unit shadow2 = new Unit("shadow");
			Unit vampire = new Unit("vampire");
			Unit warewolf = new Unit("warewolf");
			Unit doomLord = new Unit("doomLord");
			Spell spoil1 = new Spell("spoil");
			Spell spoil2 = new Spell("spoil");
			Spell ringofDeath = new Spell("ringOfDeath");
			Spell hellFire = new Spell("hellFire");
			Spell earthquake = new Spell("earthquake");
			
			deck.add(skeleton1);
			deck.add(skeleton2);
			deck.add(skeleton3);
			deck.add(zombie1);
			deck.add(zombie2);
			deck.add(shadow1);
			deck.add(shadow2);
			deck.add(vampire);
			deck.add(warewolf);
			deck.add(doomLord);
			deck.add(spoil1);
			deck.add(spoil2);
			deck.add(ringofDeath);
			deck.add(hellFire);
			deck.add(earthquake);

		}

		Collections.shuffle(deck);

		return deck;
	}

	public ArrayList deckDraw(int num, ArrayList handCard, ArrayList deck) {

			for (int i = num; i > 0; i--) {

				handCard.add(deck.get(0));
				deck.remove(0);

			}
			
		return handCard;
	}

}
