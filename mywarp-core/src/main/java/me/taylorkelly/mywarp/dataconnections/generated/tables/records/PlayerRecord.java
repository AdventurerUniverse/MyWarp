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
package me.taylorkelly.mywarp.dataconnections.generated.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value = {"http://www.jooq.org",
                                     "jOOQ version:3.5.1"}, comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({"all", "unchecked", "rawtypes"})
public class PlayerRecord extends
                          org.jooq.impl.UpdatableRecordImpl<me.taylorkelly.mywarp.dataconnections.generated.tables.records.PlayerRecord>
    implements org.jooq.Record2<org.jooq.types.UInteger, me.taylorkelly.mywarp.util.profile.Profile> {

  private static final long serialVersionUID = -288488699;

  /**
   * Create a detached PlayerRecord
   */
  public PlayerRecord() {
    super(me.taylorkelly.mywarp.dataconnections.generated.tables.Player.PLAYER);
  }

  /**
   * Create a detached, initialised PlayerRecord
   */
  public PlayerRecord(org.jooq.types.UInteger playerId, me.taylorkelly.mywarp.util.profile.Profile uuid) {
    super(me.taylorkelly.mywarp.dataconnections.generated.tables.Player.PLAYER);

    setValue(0, playerId);
    setValue(1, uuid);
  }

  /**
   * Getter for <code>mywarp.player.player_id</code>.
   */
  public org.jooq.types.UInteger getPlayerId() {
    return (org.jooq.types.UInteger) getValue(0);
  }

  /**
   * Setter for <code>mywarp.player.player_id</code>.
   */
  public void setPlayerId(org.jooq.types.UInteger value) {
    setValue(0, value);
  }

  // -------------------------------------------------------------------------
  // Primary key information
  // -------------------------------------------------------------------------

  /**
   * Getter for <code>mywarp.player.uuid</code>.
   */
  public me.taylorkelly.mywarp.util.profile.Profile getUuid() {
    return (me.taylorkelly.mywarp.util.profile.Profile) getValue(1);
  }

  // -------------------------------------------------------------------------
  // Record2 type implementation
  // -------------------------------------------------------------------------

  /**
   * Setter for <code>mywarp.player.uuid</code>.
   */
  public void setUuid(me.taylorkelly.mywarp.util.profile.Profile value) {
    setValue(1, value);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public org.jooq.Record1<org.jooq.types.UInteger> key() {
    return (org.jooq.Record1) super.key();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public org.jooq.Row2<org.jooq.types.UInteger, me.taylorkelly.mywarp.util.profile.Profile> fieldsRow() {
    return (org.jooq.Row2) super.fieldsRow();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public org.jooq.Row2<org.jooq.types.UInteger, me.taylorkelly.mywarp.util.profile.Profile> valuesRow() {
    return (org.jooq.Row2) super.valuesRow();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public org.jooq.Field<org.jooq.types.UInteger> field1() {
    return me.taylorkelly.mywarp.dataconnections.generated.tables.Player.PLAYER.PLAYER_ID;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public org.jooq.Field<me.taylorkelly.mywarp.util.profile.Profile> field2() {
    return me.taylorkelly.mywarp.dataconnections.generated.tables.Player.PLAYER.UUID;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public org.jooq.types.UInteger value1() {
    return getPlayerId();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public me.taylorkelly.mywarp.util.profile.Profile value2() {
    return getUuid();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public PlayerRecord value1(org.jooq.types.UInteger value) {
    setPlayerId(value);
    return this;
  }

  // -------------------------------------------------------------------------
  // Constructors
  // -------------------------------------------------------------------------

  /**
   * {@inheritDoc}
   */
  @Override
  public PlayerRecord value2(me.taylorkelly.mywarp.util.profile.Profile value) {
    setUuid(value);
    return this;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public PlayerRecord values(org.jooq.types.UInteger value1, me.taylorkelly.mywarp.util.profile.Profile value2) {
    return this;
  }
}
