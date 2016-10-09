package thirdTask;

import java.util.ArrayList;
import java.util.Collections;

public class commonFunction {

	public ArrayList deckShuffle(int num, ArrayList deck) {

		// num
		// 1 : human Deck Shuffle
		// 2 : demon Deck Shuffle

		if (num == 1) {

			// Human Card...!!!
			unit footMan1 = new unit("footMan");
			unit footMan2 = new unit("footMan");
			unit footMan3 = new unit("footMan");
			unit knight1 = new unit("knight");
			unit knight2 = new unit("knight");
			unit sniper1 = new unit("sniper");
			unit sniper2 = new unit("sniper");
			unit magician = new unit("magician");
			unit gryphon = new unit("gryphon");
			unit swordMaster = new unit("swordMaster");
			spell fireBall1 = new spell("fireBall");
			spell fireBall2 = new spell("fireBall");
			spell frozen = new spell("frozen");
			spell fireSpear = new spell("fireSpear");
			spell blizzard = new spell("blizzard");

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
			unit skeleton1 = new unit("skeleton");
			unit skeleton2 = new unit("skeleton");
			unit skeleton3 = new unit("skeleton");
			unit zombie1 = new unit("zombie");
			unit zombie2 = new unit("zombie");
			unit shadow1 = new unit("shadow");
			unit shadow2 = new unit("shadow");
			unit vampire = new unit("vampire");
			unit warewolf = new unit("warewolf");
			unit doomLord = new unit("doomLord");
			spell spoil1 = new spell("spoil");
			spell spoil2 = new spell("spoil");
			spell ringofDeath = new spell("ringOfDeath");
			spell hellFire = new spell("hellFire");
			spell earthquake = new spell("earthquake");
			
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
