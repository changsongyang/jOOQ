/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XTestCase_2025 extends org.jooq.impl.TableImpl<org.jooq.test.h2.generatedclasses.tables.records.XTestCase_2025Record> {

	private static final long serialVersionUID = 943924924;

	/**
	 * The singleton instance of <code>PUBLIC.X_TEST_CASE_2025</code>
	 */
	public static final org.jooq.test.h2.generatedclasses.tables.XTestCase_2025 X_TEST_CASE_2025 = new org.jooq.test.h2.generatedclasses.tables.XTestCase_2025();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.h2.generatedclasses.tables.records.XTestCase_2025Record> getRecordType() {
		return org.jooq.test.h2.generatedclasses.tables.records.XTestCase_2025Record.class;
	}

	/**
	 * The column <code>PUBLIC.X_TEST_CASE_2025.REF_ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.XTestCase_2025Record, java.lang.Integer> REF_ID = createField("REF_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), X_TEST_CASE_2025);

	/**
	 * The column <code>PUBLIC.X_TEST_CASE_2025.REF_NAME</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.XTestCase_2025Record, java.lang.String> REF_NAME = createField("REF_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false), X_TEST_CASE_2025);

	/**
	 * No further instances allowed
	 */
	private XTestCase_2025() {
		super("X_TEST_CASE_2025", org.jooq.test.h2.generatedclasses.Public.PUBLIC);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.h2.generatedclasses.tables.records.XTestCase_2025Record, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.h2.generatedclasses.tables.records.XTestCase_2025Record, ?>>asList(org.jooq.test.h2.generatedclasses.Keys.FK_X_TEST_CASE_2025_1, org.jooq.test.h2.generatedclasses.Keys.FK_X_TEST_CASE_2025_2, org.jooq.test.h2.generatedclasses.Keys.FK_X_TEST_CASE_2025_3);
	}
}
