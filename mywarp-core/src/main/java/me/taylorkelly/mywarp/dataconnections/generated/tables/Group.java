/*
 * Copyright (C) 2011 - 2015, MyWarp team and contributors
 *
 * This file is part of MyWarp.
 *
 * MyWarp is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * MyWarp is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with MyWarp. If not, see <http://www.gnu.org/licenses/>.
 */

/**
 * This class is generated by jOOQ
 */
package me.taylorkelly.mywarp.dataconnections.generated.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value = {"http://www.jooq.org",
                                     "jOOQ version:3.5.1"}, comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Group
    extends org.jooq.impl.TableImpl<me.taylorkelly.mywarp.dataconnections.generated.tables.records.GroupRecord> {

  /**
   * The reference instance of <code>mywarp.group</code>
   */
  public static final me.taylorkelly.mywarp.dataconnections.generated.tables.Group
      GROUP =
      new me.taylorkelly.mywarp.dataconnections.generated.tables.Group();
  private static final long serialVersionUID = -1207703185;
  /**
   * The column <code>mywarp.group.group_id</code>.
   */
  public final org.jooq.TableField<me.taylorkelly.mywarp.dataconnections.generated.tables.records.GroupRecord, org.jooq.types.UInteger>
      GROUP_ID =
      createField("group_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");
  /**
   * The column <code>mywarp.group.name</code>.
   */
  public final org.jooq.TableField<me.taylorkelly.mywarp.dataconnections.generated.tables.records.GroupRecord, java.lang.String>
      NAME =
      createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

  /**
   * Create a <code>mywarp.group</code> table reference
   */
  public Group() {
    this("group", null);
  }

  /**
   * Create an aliased <code>mywarp.group</code> table reference
   */
  public Group(java.lang.String alias) {
    this(alias, me.taylorkelly.mywarp.dataconnections.generated.tables.Group.GROUP);
  }

  private Group(java.lang.String alias,
                org.jooq.Table<me.taylorkelly.mywarp.dataconnections.generated.tables.records.GroupRecord> aliased) {
    this(alias, aliased, null);
  }

  private Group(java.lang.String alias,
                org.jooq.Table<me.taylorkelly.mywarp.dataconnections.generated.tables.records.GroupRecord> aliased,
                org.jooq.Field<?>[] parameters) {
    super(alias, me.taylorkelly.mywarp.dataconnections.generated.Mywarp.MYWARP, aliased, parameters, "");
  }

  /**
   * The class holding records for this type
   */
  @Override
  public java.lang.Class<me.taylorkelly.mywarp.dataconnections.generated.tables.records.GroupRecord> getRecordType() {
    return me.taylorkelly.mywarp.dataconnections.generated.tables.records.GroupRecord.class;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public org.jooq.Identity<me.taylorkelly.mywarp.dataconnections.generated.tables.records.GroupRecord, org.jooq.types.UInteger> getIdentity() {
    return me.taylorkelly.mywarp.dataconnections.generated.Keys.IDENTITY_GROUP;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public org.jooq.UniqueKey<me.taylorkelly.mywarp.dataconnections.generated.tables.records.GroupRecord> getPrimaryKey() {
    return me.taylorkelly.mywarp.dataconnections.generated.Keys.KEY_GROUP_PRIMARY;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public java.util.List<org.jooq.UniqueKey<me.taylorkelly.mywarp.dataconnections.generated.tables.records.GroupRecord>> getKeys() {
    return java.util.Arrays
        .<org.jooq.UniqueKey<me.taylorkelly.mywarp.dataconnections.generated.tables.records.GroupRecord>>asList(
            me.taylorkelly.mywarp.dataconnections.generated.Keys.KEY_GROUP_PRIMARY,
            me.taylorkelly.mywarp.dataconnections.generated.Keys.KEY_GROUP_GROUP_NAME_UQ);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public me.taylorkelly.mywarp.dataconnections.generated.tables.Group as(java.lang.String alias) {
    return new me.taylorkelly.mywarp.dataconnections.generated.tables.Group(alias, this);
  }

  /**
   * Rename this table
   */
  public me.taylorkelly.mywarp.dataconnections.generated.tables.Group rename(java.lang.String name) {
    return new me.taylorkelly.mywarp.dataconnections.generated.tables.Group(name, null);
  }
}
