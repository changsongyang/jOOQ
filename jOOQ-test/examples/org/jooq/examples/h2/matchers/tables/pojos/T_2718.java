/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.h2.matchers.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_2718 implements org.jooq.examples.h2.matchers.tables.interfaces.IT_2718 {

	private static final long serialVersionUID = 67878380;

	private java.lang.Integer excludeMe;
	private java.lang.Integer xx;

	public T_2718() {}

	public T_2718(
		java.lang.Integer excludeMe,
		java.lang.Integer xx
	) {
		this.excludeMe = excludeMe;
		this.xx = xx;
	}

	@Override
	public java.lang.Integer getExcludeMe() {
		return this.excludeMe;
	}

	@Override
	public void setExcludeMe(java.lang.Integer excludeMe) {
		this.excludeMe = excludeMe;
	}

	@Override
	public java.lang.Integer getXx() {
		return this.xx;
	}

	@Override
	public void setXx(java.lang.Integer xx) {
		this.xx = xx;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.examples.h2.matchers.tables.interfaces.IT_2718 from) {
		setExcludeMe(from.getExcludeMe());
		setXx(from.getXx());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.examples.h2.matchers.tables.interfaces.IT_2718> E into(E into) {
		into.from(this);
		return into;
	}
}
