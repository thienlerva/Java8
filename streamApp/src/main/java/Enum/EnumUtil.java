package Enum;

import com.google.common.base.Enums;
import lombok.extern.slf4j.Slf4j;

import com.google.common.base.Optional;

@Slf4j
public final class EnumUtil {

//    private EnumUtil() {}
//
//    /**
//     * Retrieve Enum value if matches, Null otherwise
//     */
//    public static <T extends EnumUtil<T>> T getIfPresentOrNull(Class<T> enumClass, String value) {
//
//        if (value == null) {
//            return null;
//        }
//
//        Optional<T> enumOpt = Enums.getIfPresent(enumClass, value);
//
//        if (enumOpt.isPresent()) {
//            return enumOpt.get();
//        }
//
//        log.warn("failed to resolve value [{}] of Enum [{}]", value, enumClass);
//        return null;
//    }
}
