package クラス_総合演習期限9月6日;

public class Battle {
	String winner;

	String doBattle(Pocketon poke1, Pocketon poke2) {
		int poke1Power = 0;
		int poke2Power = 0;
		if (poke1.type.equals("火") && poke2.type.equals("草")) {
			poke1Power = poke1.power * 2;
		} else if (poke1.type.equals("草") && poke2.type.equals("火")) {
			poke2Power = poke2.power * 2;
		} else if (poke1.type.equals("草") && poke2.type.equals("地面")) {
			poke1Power = poke1.power * 2;
		} else if (poke1.type.equals("地面") && poke2.type.equals("草")) {
			poke2Power = poke2.power * 2;
		} else if (poke1.type.equals("地面") && poke2.type.equals("水")) {
			poke1Power = poke1.power * 2;
		} else if (poke1.type.equals("水") && poke2.type.equals("地面")) {
			poke2Power = poke2.power * 2;
		} else if (poke1.type.equals("水") && poke2.type.equals("火")) {
			poke1Power = poke1.power * 2;
		} else {
			poke2Power = poke2.power * 2;
		}

		if (poke1Power > poke2Power) {
			winner = poke1.name;
		} else if (poke1Power < poke2Power) {
			winner = poke2.name;
		} else {
			winner = "draw";
		}
		return winner;
	}

}
