package org.mongodb.morphia;


public enum MapreduceType {
  REPLACE,
  MERGE,
  REDUCE,
  INLINE;

  public static MapreduceType fromString(final String val) {
    for (int i = 0; i < values().length; i++) {
      final MapreduceType fo = values()[i];
      if (fo.name().equals(val)) {
        return fo;
      }
    }
    return null;
  }

}
