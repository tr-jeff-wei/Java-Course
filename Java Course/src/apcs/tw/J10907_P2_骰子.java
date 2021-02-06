package apcs.tw;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class J10907_P2_骰子 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		Dice[] dice = new Dice[n + 1];
		for (int i = 1; i < dice.length; i++) {
			dice[i] = Face.createDice();
		}

		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a > 0 && b > 0) {
				// swap
				Dice tmp = dice[a];
				dice[a] = dice[b];
				dice[b] = tmp;
			} else {
				dice[a].turn(b);
			}
		}

		for (int i = 1; i < dice.length; i++) {
			if (i == 1) {
				System.out.print(dice[i].top.p);
			} else {
				System.out.print(" " + dice[i].top.p);
			}
		}
	}

}

class Face {

	int p;

	// 以順時鐘方向紀錄相鄰面
	ArrayList<Face> ckN = new ArrayList<Face>();

	Face(int p) {
		this.p = p;
	}

	static Dice createDice() {

		Face top = new Face(1);
		Face bottom = new Face(6);

		Face f1 = new Face(4);
		Face f2 = new Face(5);
		Face f3 = new Face(3);
		Face f4 = new Face(2);

		// top
		top.ckN.add(f1); // front
		top.ckN.add(f2);
		top.ckN.add(f3);
		top.ckN.add(f4);

		// around faces
		for (int i = 0; i < top.ckN.size(); i++) {
			ArrayList<Face> neighbors = top.ckN.get(i).ckN;

			// 1
			neighbors.add(top);

			// 2
			int pre = (i + 4 - 1) % 4;
			neighbors.add(top.ckN.get(pre));

			// 3
			neighbors.add(bottom);

			// 4
			int next = (i + 1) % 4;
			neighbors.add(top.ckN.get(next));
		}

		// bottom
		bottom.ckN.add(f4);
		bottom.ckN.add(f3);
		bottom.ckN.add(f2);
		bottom.ckN.add(f1);

		Dice d = new Dice();
		d.front = f1;
		d.top = top;

		return d;
	}

}

class Dice {

	Face front = null;
	Face top = null;

	void turn(int code) {

		if (code == -1) {
			Face tmpTop = top;

			int topi = top.ckN.indexOf(front);
			topi = (topi + 2) % 4;

			top = top.ckN.get(topi);
			front = tmpTop;
		} else if (code == -2) {

			int topi = front.ckN.indexOf(top);
			topi = (topi - 1+4) % 4;
			top = front.ckN.get(topi);

		}
	}
}
