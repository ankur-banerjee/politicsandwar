/**
 * 
 */
package com.github.src.game.pw.enums;

/**
 * @author Ankur
 *
 */
public enum ResourceType {
	  FOOD("food"),
	  COAL("coal"),
	  OIL("oil"),
	  URANIUM("uranium"),
	  LEAD("lead"),
	  IRON("iron"),
	  BAUXITE("bauxite"),
	  GASONLINE("gasoline"),
	  MUNITIONS("munitions"),
	  STEEL("steel"),
	  ALUMINUM("aluminum");

	  private String name;

	  ResourceType(String name) {
	    this.name = name;
	  }

	  public String getName() {
	    return name;
	  }
}
