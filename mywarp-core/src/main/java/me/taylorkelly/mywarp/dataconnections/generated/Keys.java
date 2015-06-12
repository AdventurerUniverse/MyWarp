/**
 * This class is generated by jOOQ
 */
package me.taylorkelly.mywarp.dataconnections.generated;


import me.taylorkelly.mywarp.dataconnections.generated.tables.Group;
import me.taylorkelly.mywarp.dataconnections.generated.tables.Player;
import me.taylorkelly.mywarp.dataconnections.generated.tables.Warp;
import me.taylorkelly.mywarp.dataconnections.generated.tables.WarpGroupMap;
import me.taylorkelly.mywarp.dataconnections.generated.tables.WarpPlayerMap;
import me.taylorkelly.mywarp.dataconnections.generated.tables.World;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Record;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;
import org.jooq.types.UInteger;

import javax.annotation.Generated;


/**
 * A class modelling foreign key relationships between tables of the <code>mywarp</code>
 * schema
 */
@Generated(
    value = {"http://www.jooq.org", "jOOQ version:3.6.2"},
    comments = "This class is generated by jOOQ")
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Keys {

  // -------------------------------------------------------------------------
  // IDENTITY definitions
  // -------------------------------------------------------------------------

  public static final Identity<Record, UInteger> IDENTITY_GROUP = Identities0.IDENTITY_GROUP;
  public static final Identity<Record, UInteger> IDENTITY_PLAYER = Identities0.IDENTITY_PLAYER;
  public static final Identity<Record, UInteger> IDENTITY_WARP = Identities0.IDENTITY_WARP;
  public static final Identity<Record, UInteger> IDENTITY_WORLD = Identities0.IDENTITY_WORLD;

  // -------------------------------------------------------------------------
  // UNIQUE and PRIMARY KEY definitions
  // -------------------------------------------------------------------------

  public static final UniqueKey<Record> KEY_GROUP_PRIMARY = UniqueKeys0.KEY_GROUP_PRIMARY;
  public static final UniqueKey<Record> KEY_GROUP_GROUP_NAME_UQ = UniqueKeys0.KEY_GROUP_GROUP_NAME_UQ;
  public static final UniqueKey<Record> KEY_PLAYER_PRIMARY = UniqueKeys0.KEY_PLAYER_PRIMARY;
  public static final UniqueKey<Record> KEY_PLAYER_PLAYER_UUID_UQ = UniqueKeys0.KEY_PLAYER_PLAYER_UUID_UQ;
  public static final UniqueKey<Record> KEY_WARP_PRIMARY = UniqueKeys0.KEY_WARP_PRIMARY;
  public static final UniqueKey<Record> KEY_WARP_WARP_NAME_UQ = UniqueKeys0.KEY_WARP_WARP_NAME_UQ;
  public static final UniqueKey<Record> KEY_WARP_GROUP_MAP_PRIMARY = UniqueKeys0.KEY_WARP_GROUP_MAP_PRIMARY;
  public static final UniqueKey<Record> KEY_WARP_PLAYER_MAP_PRIMARY = UniqueKeys0.KEY_WARP_PLAYER_MAP_PRIMARY;
  public static final UniqueKey<Record> KEY_WORLD_PRIMARY = UniqueKeys0.KEY_WORLD_PRIMARY;
  public static final UniqueKey<Record> KEY_WORLD_WORLD_UUID_UQ = UniqueKeys0.KEY_WORLD_WORLD_UUID_UQ;

  // -------------------------------------------------------------------------
  // FOREIGN KEY definitions
  // -------------------------------------------------------------------------

  public static final ForeignKey<Record, Record> WARP_PLAYER_ID_FK = ForeignKeys0.WARP_PLAYER_ID_FK;
  public static final ForeignKey<Record, Record> WARP_WORLD_ID_FK = ForeignKeys0.WARP_WORLD_ID_FK;
  public static final ForeignKey<Record, Record> WARP_GROUP_MAP_WARP_ID_FK = ForeignKeys0.WARP_GROUP_MAP_WARP_ID_FK;
  public static final ForeignKey<Record, Record> WARP_GROUP_MAP_GROUP_ID_FK = ForeignKeys0.WARP_GROUP_MAP_GROUP_ID_FK;
  public static final ForeignKey<Record, Record> WARP_PLAYER_MAP_WARP_ID_FK = ForeignKeys0.WARP_PLAYER_MAP_WARP_ID_FK;
  public static final ForeignKey<Record, Record>
      WARP_PLAYER_MAP_PLAYER_ID_FK =
      ForeignKeys0.WARP_PLAYER_MAP_PLAYER_ID_FK;

  // -------------------------------------------------------------------------
  // [#1459] distribute members to avoid static initialisers > 64kb
  // -------------------------------------------------------------------------

  private static class Identities0 extends AbstractKeys {

    public static Identity<Record, UInteger> IDENTITY_GROUP = createIdentity(Group.GROUP, Group.GROUP.GROUP_ID);
    public static Identity<Record, UInteger> IDENTITY_PLAYER = createIdentity(Player.PLAYER, Player.PLAYER.PLAYER_ID);
    public static Identity<Record, UInteger> IDENTITY_WARP = createIdentity(Warp.WARP, Warp.WARP.WARP_ID);
    public static Identity<Record, UInteger> IDENTITY_WORLD = createIdentity(World.WORLD, World.WORLD.WORLD_ID);
  }

  private static class UniqueKeys0 extends AbstractKeys {

    public static final UniqueKey<Record> KEY_GROUP_PRIMARY = createUniqueKey(Group.GROUP, Group.GROUP.GROUP_ID);
    public static final UniqueKey<Record> KEY_GROUP_GROUP_NAME_UQ = createUniqueKey(Group.GROUP, Group.GROUP.NAME);
    public static final UniqueKey<Record> KEY_PLAYER_PRIMARY = createUniqueKey(Player.PLAYER, Player.PLAYER.PLAYER_ID);
    public static final UniqueKey<Record>
        KEY_PLAYER_PLAYER_UUID_UQ = createUniqueKey(Player.PLAYER, Player.PLAYER.UUID);
    public static final UniqueKey<Record> KEY_WARP_PRIMARY = createUniqueKey(Warp.WARP, Warp.WARP.WARP_ID);
    public static final UniqueKey<Record> KEY_WARP_WARP_NAME_UQ = createUniqueKey(Warp.WARP, Warp.WARP.NAME);
    public static final UniqueKey<Record>
        KEY_WARP_GROUP_MAP_PRIMARY =
        createUniqueKey(WarpGroupMap.WARP_GROUP_MAP, WarpGroupMap.WARP_GROUP_MAP.WARP_ID,
                        WarpGroupMap.WARP_GROUP_MAP.GROUP_ID);
    public static final UniqueKey<Record>
        KEY_WARP_PLAYER_MAP_PRIMARY =
        createUniqueKey(WarpPlayerMap.WARP_PLAYER_MAP, WarpPlayerMap.WARP_PLAYER_MAP.WARP_ID,
                        WarpPlayerMap.WARP_PLAYER_MAP.PLAYER_ID);
    public static final UniqueKey<Record> KEY_WORLD_PRIMARY = createUniqueKey(World.WORLD, World.WORLD.WORLD_ID);
    public static final UniqueKey<Record> KEY_WORLD_WORLD_UUID_UQ = createUniqueKey(World.WORLD, World.WORLD.UUID);
  }

  private static class ForeignKeys0 extends AbstractKeys {

    public static final ForeignKey<Record, Record>
        WARP_PLAYER_ID_FK = createForeignKey(Keys.KEY_PLAYER_PRIMARY, Warp.WARP, Warp.WARP.PLAYER_ID);
    public static final ForeignKey<Record, Record>
        WARP_WORLD_ID_FK =
        createForeignKey(Keys.KEY_WORLD_PRIMARY, Warp.WARP, Warp.WARP.WORLD_ID);
    public static final ForeignKey<Record, Record>
        WARP_GROUP_MAP_WARP_ID_FK =
        createForeignKey(Keys.KEY_WARP_PRIMARY, WarpGroupMap.WARP_GROUP_MAP, WarpGroupMap.WARP_GROUP_MAP.WARP_ID);
    public static final ForeignKey<Record, Record>
        WARP_GROUP_MAP_GROUP_ID_FK =
        createForeignKey(Keys.KEY_GROUP_PRIMARY, WarpGroupMap.WARP_GROUP_MAP, WarpGroupMap.WARP_GROUP_MAP.GROUP_ID);
    public static final ForeignKey<Record, Record>
        WARP_PLAYER_MAP_WARP_ID_FK =
        createForeignKey(Keys.KEY_WARP_PRIMARY, WarpPlayerMap.WARP_PLAYER_MAP, WarpPlayerMap.WARP_PLAYER_MAP.WARP_ID);
    public static final ForeignKey<Record, Record>
        WARP_PLAYER_MAP_PLAYER_ID_FK =
        createForeignKey(Keys.KEY_PLAYER_PRIMARY, WarpPlayerMap.WARP_PLAYER_MAP,
                         WarpPlayerMap.WARP_PLAYER_MAP.PLAYER_ID);
  }
}
