package Enum;

import java.util.EnumMap;

public enum Direction {

    NORTH(0),
    SOUTH(1),
    EAST(2),
    WEST(3);

    private int directionCode;

    Direction(int directionCode) {this.directionCode = directionCode;}

    private static final EnumMap<Direction, Integer> LOOKUPBYCODE = new EnumMap<>(Direction.class);

    static {
        for (Direction d : Direction.values()) {
            LOOKUPBYCODE.put(d, d.directionCode);
        }
    }

    public static Direction getDirectionEnum(int directionCode) {
        for (Direction d : Direction.values()) {
            if (d.directionCode == directionCode) {
                return d;
            }
        }
        throw new EnumConstantNotPresentException(Direction.class, "Unsupported Value found " + directionCode);
    }

    public static Integer getDirectionCode(String direction) {
        for (Direction d : Direction.values()) {
            if (d.name().equals(direction)) {
                return d.directionCode;
            }
        }
        return null;
    }

    /**
     * public Direction getDirectionAsEnum() {
     *     return getIfPresentOrNull(Direction.class, Direction.NORTH
     * }
     */

    public static void main(String[] args) {
        System.out.println(Direction.EAST.ordinal());
        System.out.println(Direction.getDirectionEnum(3));
        System.out.println(Direction.getDirectionCode("NORTH"));
        Direction.valueOf(Direction.getDirectionEnum(2).toString());
        System.out.println(Direction.valueOf(Direction.getDirectionEnum(2).toString()));
    }
}
