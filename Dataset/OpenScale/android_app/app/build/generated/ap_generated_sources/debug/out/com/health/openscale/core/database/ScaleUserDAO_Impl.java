package com.health.openscale.core.database;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.health.openscale.core.datatypes.ScaleUser;
import com.health.openscale.core.utils.Converters;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ScaleUserDAO_Impl implements ScaleUserDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ScaleUser> __insertionAdapterOfScaleUser;

  private final EntityDeletionOrUpdateAdapter<ScaleUser> __deletionAdapterOfScaleUser;

  private final EntityDeletionOrUpdateAdapter<ScaleUser> __updateAdapterOfScaleUser;

  public ScaleUserDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfScaleUser = new EntityInsertionAdapter<ScaleUser>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `scaleUsers` (`id`,`username`,`birthday`,`bodyHeight`,`scaleUnit`,`gender`,`initialWeight`,`goalWeight`,`goalDate`,`measureUnit`,`activityLevel`,`assistedWeighing`,`leftAmputationLevel`,`rightAmputationLevel`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ScaleUser value) {
        stmt.bindLong(1, value.getId());
        if (value.getUserName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUserName());
        }
        final Long _tmp;
        _tmp = Converters.dateToTimestamp(value.getBirthday());
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, _tmp);
        }
        stmt.bindDouble(4, value.getBodyHeight());
        final int _tmp_1;
        _tmp_1 = Converters.toWeightUnitInt(value.getScaleUnit());
        stmt.bindLong(5, _tmp_1);
        final int _tmp_2;
        _tmp_2 = Converters.toGenderInt(value.getGender());
        stmt.bindLong(6, _tmp_2);
        stmt.bindDouble(7, value.getInitialWeight());
        stmt.bindDouble(8, value.getGoalWeight());
        final Long _tmp_3;
        _tmp_3 = Converters.dateToTimestamp(value.getGoalDate());
        if (_tmp_3 == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindLong(9, _tmp_3);
        }
        final int _tmp_4;
        _tmp_4 = Converters.toMeasureUnitInt(value.getMeasureUnit());
        stmt.bindLong(10, _tmp_4);
        final int _tmp_5;
        _tmp_5 = Converters.toActivityLevelInt(value.getActivityLevel());
        stmt.bindLong(11, _tmp_5);
        final int _tmp_6;
        _tmp_6 = value.isAssistedWeighing() ? 1 : 0;
        stmt.bindLong(12, _tmp_6);
        final int _tmp_7;
        _tmp_7 = Converters.toAmputationLevelInt(value.getLeftAmputationLevel());
        stmt.bindLong(13, _tmp_7);
        final int _tmp_8;
        _tmp_8 = Converters.toAmputationLevelInt(value.getRightAmputationLevel());
        stmt.bindLong(14, _tmp_8);
      }
    };
    this.__deletionAdapterOfScaleUser = new EntityDeletionOrUpdateAdapter<ScaleUser>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `scaleUsers` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ScaleUser value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfScaleUser = new EntityDeletionOrUpdateAdapter<ScaleUser>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `scaleUsers` SET `id` = ?,`username` = ?,`birthday` = ?,`bodyHeight` = ?,`scaleUnit` = ?,`gender` = ?,`initialWeight` = ?,`goalWeight` = ?,`goalDate` = ?,`measureUnit` = ?,`activityLevel` = ?,`assistedWeighing` = ?,`leftAmputationLevel` = ?,`rightAmputationLevel` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ScaleUser value) {
        stmt.bindLong(1, value.getId());
        if (value.getUserName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUserName());
        }
        final Long _tmp;
        _tmp = Converters.dateToTimestamp(value.getBirthday());
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, _tmp);
        }
        stmt.bindDouble(4, value.getBodyHeight());
        final int _tmp_1;
        _tmp_1 = Converters.toWeightUnitInt(value.getScaleUnit());
        stmt.bindLong(5, _tmp_1);
        final int _tmp_2;
        _tmp_2 = Converters.toGenderInt(value.getGender());
        stmt.bindLong(6, _tmp_2);
        stmt.bindDouble(7, value.getInitialWeight());
        stmt.bindDouble(8, value.getGoalWeight());
        final Long _tmp_3;
        _tmp_3 = Converters.dateToTimestamp(value.getGoalDate());
        if (_tmp_3 == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindLong(9, _tmp_3);
        }
        final int _tmp_4;
        _tmp_4 = Converters.toMeasureUnitInt(value.getMeasureUnit());
        stmt.bindLong(10, _tmp_4);
        final int _tmp_5;
        _tmp_5 = Converters.toActivityLevelInt(value.getActivityLevel());
        stmt.bindLong(11, _tmp_5);
        final int _tmp_6;
        _tmp_6 = value.isAssistedWeighing() ? 1 : 0;
        stmt.bindLong(12, _tmp_6);
        final int _tmp_7;
        _tmp_7 = Converters.toAmputationLevelInt(value.getLeftAmputationLevel());
        stmt.bindLong(13, _tmp_7);
        final int _tmp_8;
        _tmp_8 = Converters.toAmputationLevelInt(value.getRightAmputationLevel());
        stmt.bindLong(14, _tmp_8);
        stmt.bindLong(15, value.getId());
      }
    };
  }

  @Override
  public long insert(final ScaleUser user) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfScaleUser.insertAndReturnId(user);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAll(final List<ScaleUser> userList) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfScaleUser.insert(userList);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final ScaleUser user) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfScaleUser.handle(user);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final ScaleUser user) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfScaleUser.handle(user);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<ScaleUser> getAll() {
    final String _sql = "SELECT * FROM scaleUsers";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfUserName = CursorUtil.getColumnIndexOrThrow(_cursor, "username");
      final int _cursorIndexOfBirthday = CursorUtil.getColumnIndexOrThrow(_cursor, "birthday");
      final int _cursorIndexOfBodyHeight = CursorUtil.getColumnIndexOrThrow(_cursor, "bodyHeight");
      final int _cursorIndexOfScaleUnit = CursorUtil.getColumnIndexOrThrow(_cursor, "scaleUnit");
      final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
      final int _cursorIndexOfInitialWeight = CursorUtil.getColumnIndexOrThrow(_cursor, "initialWeight");
      final int _cursorIndexOfGoalWeight = CursorUtil.getColumnIndexOrThrow(_cursor, "goalWeight");
      final int _cursorIndexOfGoalDate = CursorUtil.getColumnIndexOrThrow(_cursor, "goalDate");
      final int _cursorIndexOfMeasureUnit = CursorUtil.getColumnIndexOrThrow(_cursor, "measureUnit");
      final int _cursorIndexOfActivityLevel = CursorUtil.getColumnIndexOrThrow(_cursor, "activityLevel");
      final int _cursorIndexOfAssistedWeighing = CursorUtil.getColumnIndexOrThrow(_cursor, "assistedWeighing");
      final int _cursorIndexOfLeftAmputationLevel = CursorUtil.getColumnIndexOrThrow(_cursor, "leftAmputationLevel");
      final int _cursorIndexOfRightAmputationLevel = CursorUtil.getColumnIndexOrThrow(_cursor, "rightAmputationLevel");
      final List<ScaleUser> _result = new ArrayList<ScaleUser>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final ScaleUser _item;
        _item = new ScaleUser();
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        final String _tmpUserName;
        _tmpUserName = _cursor.getString(_cursorIndexOfUserName);
        _item.setUserName(_tmpUserName);
        final Date _tmpBirthday;
        final Long _tmp;
        if (_cursor.isNull(_cursorIndexOfBirthday)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getLong(_cursorIndexOfBirthday);
        }
        _tmpBirthday = Converters.fromTimestamp(_tmp);
        _item.setBirthday(_tmpBirthday);
        final float _tmpBodyHeight;
        _tmpBodyHeight = _cursor.getFloat(_cursorIndexOfBodyHeight);
        _item.setBodyHeight(_tmpBodyHeight);
        final Converters.WeightUnit _tmpScaleUnit;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfScaleUnit);
        _tmpScaleUnit = Converters.fromWeightUnitInt(_tmp_1);
        _item.setScaleUnit(_tmpScaleUnit);
        final Converters.Gender _tmpGender;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfGender);
        _tmpGender = Converters.fromGenderInt(_tmp_2);
        _item.setGender(_tmpGender);
        final float _tmpInitialWeight;
        _tmpInitialWeight = _cursor.getFloat(_cursorIndexOfInitialWeight);
        _item.setInitialWeight(_tmpInitialWeight);
        final float _tmpGoalWeight;
        _tmpGoalWeight = _cursor.getFloat(_cursorIndexOfGoalWeight);
        _item.setGoalWeight(_tmpGoalWeight);
        final Date _tmpGoalDate;
        final Long _tmp_3;
        if (_cursor.isNull(_cursorIndexOfGoalDate)) {
          _tmp_3 = null;
        } else {
          _tmp_3 = _cursor.getLong(_cursorIndexOfGoalDate);
        }
        _tmpGoalDate = Converters.fromTimestamp(_tmp_3);
        _item.setGoalDate(_tmpGoalDate);
        final Converters.MeasureUnit _tmpMeasureUnit;
        final int _tmp_4;
        _tmp_4 = _cursor.getInt(_cursorIndexOfMeasureUnit);
        _tmpMeasureUnit = Converters.fromMeasureUnitInt(_tmp_4);
        _item.setMeasureUnit(_tmpMeasureUnit);
        final Converters.ActivityLevel _tmpActivityLevel;
        final int _tmp_5;
        _tmp_5 = _cursor.getInt(_cursorIndexOfActivityLevel);
        _tmpActivityLevel = Converters.fromActivityLevelInt(_tmp_5);
        _item.setActivityLevel(_tmpActivityLevel);
        final boolean _tmpAssistedWeighing;
        final int _tmp_6;
        _tmp_6 = _cursor.getInt(_cursorIndexOfAssistedWeighing);
        _tmpAssistedWeighing = _tmp_6 != 0;
        _item.setAssistedWeighing(_tmpAssistedWeighing);
        final Converters.AmputationLevel _tmpLeftAmputationLevel;
        final int _tmp_7;
        _tmp_7 = _cursor.getInt(_cursorIndexOfLeftAmputationLevel);
        _tmpLeftAmputationLevel = Converters.fromAmputationLevelInt(_tmp_7);
        _item.setLeftAmputationLevel(_tmpLeftAmputationLevel);
        final Converters.AmputationLevel _tmpRightAmputationLevel;
        final int _tmp_8;
        _tmp_8 = _cursor.getInt(_cursorIndexOfRightAmputationLevel);
        _tmpRightAmputationLevel = Converters.fromAmputationLevelInt(_tmp_8);
        _item.setRightAmputationLevel(_tmpRightAmputationLevel);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public ScaleUser get(final int id) {
    final String _sql = "SELECT * FROM scaleUsers WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfUserName = CursorUtil.getColumnIndexOrThrow(_cursor, "username");
      final int _cursorIndexOfBirthday = CursorUtil.getColumnIndexOrThrow(_cursor, "birthday");
      final int _cursorIndexOfBodyHeight = CursorUtil.getColumnIndexOrThrow(_cursor, "bodyHeight");
      final int _cursorIndexOfScaleUnit = CursorUtil.getColumnIndexOrThrow(_cursor, "scaleUnit");
      final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
      final int _cursorIndexOfInitialWeight = CursorUtil.getColumnIndexOrThrow(_cursor, "initialWeight");
      final int _cursorIndexOfGoalWeight = CursorUtil.getColumnIndexOrThrow(_cursor, "goalWeight");
      final int _cursorIndexOfGoalDate = CursorUtil.getColumnIndexOrThrow(_cursor, "goalDate");
      final int _cursorIndexOfMeasureUnit = CursorUtil.getColumnIndexOrThrow(_cursor, "measureUnit");
      final int _cursorIndexOfActivityLevel = CursorUtil.getColumnIndexOrThrow(_cursor, "activityLevel");
      final int _cursorIndexOfAssistedWeighing = CursorUtil.getColumnIndexOrThrow(_cursor, "assistedWeighing");
      final int _cursorIndexOfLeftAmputationLevel = CursorUtil.getColumnIndexOrThrow(_cursor, "leftAmputationLevel");
      final int _cursorIndexOfRightAmputationLevel = CursorUtil.getColumnIndexOrThrow(_cursor, "rightAmputationLevel");
      final ScaleUser _result;
      if(_cursor.moveToFirst()) {
        _result = new ScaleUser();
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _result.setId(_tmpId);
        final String _tmpUserName;
        _tmpUserName = _cursor.getString(_cursorIndexOfUserName);
        _result.setUserName(_tmpUserName);
        final Date _tmpBirthday;
        final Long _tmp;
        if (_cursor.isNull(_cursorIndexOfBirthday)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getLong(_cursorIndexOfBirthday);
        }
        _tmpBirthday = Converters.fromTimestamp(_tmp);
        _result.setBirthday(_tmpBirthday);
        final float _tmpBodyHeight;
        _tmpBodyHeight = _cursor.getFloat(_cursorIndexOfBodyHeight);
        _result.setBodyHeight(_tmpBodyHeight);
        final Converters.WeightUnit _tmpScaleUnit;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfScaleUnit);
        _tmpScaleUnit = Converters.fromWeightUnitInt(_tmp_1);
        _result.setScaleUnit(_tmpScaleUnit);
        final Converters.Gender _tmpGender;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfGender);
        _tmpGender = Converters.fromGenderInt(_tmp_2);
        _result.setGender(_tmpGender);
        final float _tmpInitialWeight;
        _tmpInitialWeight = _cursor.getFloat(_cursorIndexOfInitialWeight);
        _result.setInitialWeight(_tmpInitialWeight);
        final float _tmpGoalWeight;
        _tmpGoalWeight = _cursor.getFloat(_cursorIndexOfGoalWeight);
        _result.setGoalWeight(_tmpGoalWeight);
        final Date _tmpGoalDate;
        final Long _tmp_3;
        if (_cursor.isNull(_cursorIndexOfGoalDate)) {
          _tmp_3 = null;
        } else {
          _tmp_3 = _cursor.getLong(_cursorIndexOfGoalDate);
        }
        _tmpGoalDate = Converters.fromTimestamp(_tmp_3);
        _result.setGoalDate(_tmpGoalDate);
        final Converters.MeasureUnit _tmpMeasureUnit;
        final int _tmp_4;
        _tmp_4 = _cursor.getInt(_cursorIndexOfMeasureUnit);
        _tmpMeasureUnit = Converters.fromMeasureUnitInt(_tmp_4);
        _result.setMeasureUnit(_tmpMeasureUnit);
        final Converters.ActivityLevel _tmpActivityLevel;
        final int _tmp_5;
        _tmp_5 = _cursor.getInt(_cursorIndexOfActivityLevel);
        _tmpActivityLevel = Converters.fromActivityLevelInt(_tmp_5);
        _result.setActivityLevel(_tmpActivityLevel);
        final boolean _tmpAssistedWeighing;
        final int _tmp_6;
        _tmp_6 = _cursor.getInt(_cursorIndexOfAssistedWeighing);
        _tmpAssistedWeighing = _tmp_6 != 0;
        _result.setAssistedWeighing(_tmpAssistedWeighing);
        final Converters.AmputationLevel _tmpLeftAmputationLevel;
        final int _tmp_7;
        _tmp_7 = _cursor.getInt(_cursorIndexOfLeftAmputationLevel);
        _tmpLeftAmputationLevel = Converters.fromAmputationLevelInt(_tmp_7);
        _result.setLeftAmputationLevel(_tmpLeftAmputationLevel);
        final Converters.AmputationLevel _tmpRightAmputationLevel;
        final int _tmp_8;
        _tmp_8 = _cursor.getInt(_cursorIndexOfRightAmputationLevel);
        _tmpRightAmputationLevel = Converters.fromAmputationLevelInt(_tmp_8);
        _result.setRightAmputationLevel(_tmpRightAmputationLevel);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Cursor selectAll() {
    final String _sql = "SELECT id as _ID, username, birthday, bodyHeight, gender, activityLevel FROM scaleUsers";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _tmpResult = __db.query(_statement);
    return _tmpResult;
  }
}
