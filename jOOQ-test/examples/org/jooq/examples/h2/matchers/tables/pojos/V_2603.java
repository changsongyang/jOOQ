/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.h2.matchers.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class V_2603 implements org.jooq.examples.h2.matchers.tables.interfaces.IV_2603 {

	private static final long serialVersionUID = -970143644;

	private java.lang.Integer col1;
	private java.lang.Integer col4;

	public V_2603() {}

	public V_2603(
		java.lang.Integer col1,
		java.lang.Integer col4
	) {
		this.col1 = col1;
		this.col4 = col4;
	}

	@Override
	public java.lang.Integer getCol1() {
		return this.col1;
	}

	@Override
	public void setCol1(java.lang.Integer col1) {
		this.col1 = col1;
	}

	@Override
	public java.lang.Integer getCol4() {
		return this.col4;
	}

	@Override
	public void setCol4(java.lang.Integer col4) {
		this.col4 = col4;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.examples.h2.matchers.tables.interfaces.IV_2603 from) {
		setCol1(from.getCol1());
		setCol4(from.getCol4());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.examples.h2.matchers.tables.interfaces.IV_2603> E into(E into) {
		into.from(this);
		return into;
	}
}
