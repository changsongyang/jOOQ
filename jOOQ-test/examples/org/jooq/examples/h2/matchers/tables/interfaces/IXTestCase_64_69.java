/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.h2.matchers.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IXTestCase_64_69 extends java.io.Serializable {

	/**
	 * Setter for <code>PUBLIC.X_TEST_CASE_64_69.ID</code>. 
	 */
	public void setId(java.lang.Integer value);

	/**
	 * Getter for <code>PUBLIC.X_TEST_CASE_64_69.ID</code>. 
	 */
	public java.lang.Integer getId();

	/**
	 * Setter for <code>PUBLIC.X_TEST_CASE_64_69.UNUSED_ID</code>. 
	 */
	public void setUnusedId(java.lang.Integer value);

	/**
	 * Getter for <code>PUBLIC.X_TEST_CASE_64_69.UNUSED_ID</code>. 
	 */
	public java.lang.Integer getUnusedId();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface IXTestCase_64_69
	 */
	public void from(org.jooq.examples.h2.matchers.tables.interfaces.IXTestCase_64_69 from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface IXTestCase_64_69
	 */
	public <E extends org.jooq.examples.h2.matchers.tables.interfaces.IXTestCase_64_69> E into(E into);
}
