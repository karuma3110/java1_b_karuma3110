package course57;

import java.util.Random;
import java.util.Scanner;

public class PlayControll {
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		Random rnd = new Random();
		int ransu = rnd.nextInt(5) + 1;
		int r = rnd.nextInt(5) + 1;
		int ra = rnd.nextInt(5) + 1;
		int ran = rnd.nextInt(5) + 1;
		int ransum = rnd.nextInt(11) + 3;
		int m = rnd.nextInt(11) + 3;
		int um = rnd.nextInt(11) + 3;
		int sum = rnd.nextInt(11) + 3;
		int k = rnd.nextInt(4) + 1;

		Player me = new Player();
		me.setKinryoku(ransu);
		me.setGakuryoku(r);
		me.setMiitame(ra);
		me.setOmosiro(ran);

		System.out.println("筋力" + me.getKinryoku());
		System.out.println("学力" + me.getGakuryoku());
		System.out.println("見た目" + me.getMiitame());
		System.out.println("面白さ" + me.getOmosiro());

		Target koku = new Target();
		koku.setHituyouKin(ransum);
		koku.setHituyouGaku(m);
		koku.setHituyouMita(um);
		koku.setHituyouOmo(sum);

		if (k == 1) {
			System.out.println("必要筋力" + koku.getHituyouKin());
		}
		if (k == 2) {
			System.out.println("必要学力" + koku.getHituyouGaku());
		}
		if (k == 3) {
			System.out.println("必要見た目" + koku.getHituyouMita());
		}
		if (k == 4) {
			System.out.println("必要面白さ" + koku.getHituyouOmo());
		}

		for (int i = 1; i <= 7; i++) {
			System.out.println("現在のカウントは" + i);
			System.out.println("１:筋トレします筋力が１上昇");
			System.out.println("２:勉強します学力が１上昇");
			System.out.println("３:整形します見た目が１上昇");
			System.out.println("４:人と喋る面白さが１上昇");
			int a = stdIn.nextInt();
			if (a == 1) {
				me.setKinryoku(me.getKinryoku() + 1);
			}
			if (a == 2) {
				me.setGakuryoku(me.getGakuryoku() + 1);
			}
			if (a == 3) {
				me.setMiitame(me.getMiitame() + 1);
			}
			if (a == 4) {
				me.setOmosiro(me.getOmosiro() + 1);
			}
		}
		System.out.println("告白します！！");
		System.out.println("１:筋力で勝負！");
		System.out.println("２:学力で勝負！");
		System.out.println("３:見た目で勝負！");
		System.out.println("４:面白さで勝負！");
		
		int b = stdIn.nextInt();
		for (int i = 1; i <= 999; i++) {
			if (b == 1) {
				if (me.getKinryoku() >= koku.getHituyouKin()) {
					i = i + 1;
				}
				if (me.getKinryoku() < koku.getHituyouKin()) {
					System.out.println("死亡");
					i = i + 999;
				}
			}
			if (b == 2) {
				if (me.getGakuryoku() >= koku.getHituyouGaku()) {
					i = i + 1;
				}
				if (me.getGakuryoku() < koku.getHituyouGaku()) {
					System.out.println("死亡");
					i = i + 999;
				}
			}
			if (b == 3) {
				if (me.getMiitame() >= koku.getHituyouMita()) {
					i = i + 1;
				}
				if (me.getMiitame() < koku.getHituyouMita()) {
					System.out.println("死亡");
					i = i + 999;
				}
			}
			if (b == 4) {
				if (me.getOmosiro() >= koku.getHituyouOmo()) {
					i = i + 1;
				}
				if (me.getOmosiro() < koku.getHituyouOmo()) {
					System.out.println("死亡");
					i = i + 999;
				}
			}
			if (i == 2) {
				k = b;
			}
			if (i == 3) {
				System.out.println("告白成功！！");
			}
		}
	}
}