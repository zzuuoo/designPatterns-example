/**
 * The MIT License
 * Copyright (c) 2014-2016 Ilkka Seppälä
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package create.builder;


/**
 *客户端
 */
public class Client {

	public static void main(String[] args) {

		Hero java =
				new Hero.Builder(Profession.JAVA_ENGINEER, "抓蛙").withHairColor(HairColor.BLACK)
						.withArmor(Armor.PLAID_SHIRT)
						.withWeapon(Weapon.KEYBOARD).build();


		System.out.println(java.toString());
		Hero go =
				new Hero.Builder(Profession.GO_ENGINEER, "小垢").withHairColor(HairColor.BLOND)
						.withHairType(HairType.LONG).withArmor(Armor.VEST).withWeapon(Weapon.MONITOR)
						.build();

		System.out.println(go.toString());

		Hero php =
				new Hero.Builder(Profession.PHP_ENGINEER, "小匹").withHairType(HairType.BALD)
						.withWeapon(Weapon.MONITOR).build();
		System.out.println(php.toString());

	}
}
