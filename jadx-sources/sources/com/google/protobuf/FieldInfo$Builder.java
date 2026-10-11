package com.google.protobuf;

import com.google.protobuf.Internal;
import defpackage.qx1;
import defpackage.re4;
import defpackage.v12;
import defpackage.ze0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class FieldInfo$Builder {
    private java.lang.reflect.Field cachedSizeField;
    private boolean enforceUtf8;
    private Internal.EnumVerifier enumVerifier;
    private java.lang.reflect.Field field;
    private int fieldNumber;
    private Object mapDefaultEntry;
    private re4 oneof;
    private Class<?> oneofStoredType;
    private java.lang.reflect.Field presenceField;
    private int presenceMask;
    private boolean required;
    private FieldType type;

    public /* synthetic */ FieldInfo$Builder(v12 v12Var) {
        this();
    }

    public n0 build() {
        Object obj = this.mapDefaultEntry;
        if (obj != null) {
            java.lang.reflect.Field field = this.field;
            int i = this.fieldNumber;
            Internal.EnumVerifier enumVerifier = this.enumVerifier;
            Internal.checkNotNull(obj, "mapDefaultEntry");
            n0.a(i);
            Internal.checkNotNull(field, "field");
            return new n0(field, i, FieldType.MAP, null, 0, false, true, obj, enumVerifier, null);
        }
        java.lang.reflect.Field field2 = this.presenceField;
        if (field2 != null) {
            boolean z = this.required;
            java.lang.reflect.Field field3 = this.field;
            int i2 = this.fieldNumber;
            if (z) {
                FieldType fieldType = this.type;
                int i3 = this.presenceMask;
                boolean z2 = this.enforceUtf8;
                Internal.EnumVerifier enumVerifier2 = this.enumVerifier;
                n0.a(i2);
                Internal.checkNotNull(field3, "field");
                Internal.checkNotNull(fieldType, "fieldType");
                Internal.checkNotNull(field2, "presenceField");
                if (i3 != 0 && ((i3 - 1) & i3) == 0) {
                    return new n0(field3, i2, fieldType, field2, i3, true, z2, null, enumVerifier2, null);
                }
                ze0.k(qx1.h(i3, "presenceMask must have exactly one bit set: "));
                return null;
            }
            FieldType fieldType2 = this.type;
            int i4 = this.presenceMask;
            boolean z3 = this.enforceUtf8;
            Internal.EnumVerifier enumVerifier3 = this.enumVerifier;
            n0.a(i2);
            Internal.checkNotNull(field3, "field");
            Internal.checkNotNull(fieldType2, "fieldType");
            Internal.checkNotNull(field2, "presenceField");
            if (i4 != 0 && ((i4 - 1) & i4) == 0) {
                return new n0(field3, i2, fieldType2, field2, i4, false, z3, null, enumVerifier3, null);
            }
            ze0.k(qx1.h(i4, "presenceMask must have exactly one bit set: "));
            return null;
        }
        Internal.EnumVerifier enumVerifier4 = this.enumVerifier;
        java.lang.reflect.Field field4 = this.cachedSizeField;
        java.lang.reflect.Field field5 = this.field;
        if (enumVerifier4 != null) {
            int i5 = this.fieldNumber;
            if (field4 == null) {
                FieldType fieldType3 = this.type;
                n0.a(i5);
                Internal.checkNotNull(field5, "field");
                return new n0(field5, i5, fieldType3, null, 0, false, false, null, enumVerifier4, null);
            }
            FieldType fieldType4 = this.type;
            n0.a(i5);
            Internal.checkNotNull(field5, "field");
            return new n0(field5, i5, fieldType4, null, 0, false, false, null, enumVerifier4, field4);
        }
        int i6 = this.fieldNumber;
        if (field4 == null) {
            FieldType fieldType5 = this.type;
            boolean z4 = this.enforceUtf8;
            n0.a(i6);
            Internal.checkNotNull(field5, "field");
            Internal.checkNotNull(fieldType5, "fieldType");
            if (fieldType5 != FieldType.MESSAGE_LIST && fieldType5 != FieldType.GROUP_LIST) {
                return new n0(field5, i6, fieldType5, null, 0, false, z4, null, null, null);
            }
            ze0.m("Shouldn't be called for repeated message fields.");
            return null;
        }
        FieldType fieldType6 = this.type;
        n0.a(i6);
        Internal.checkNotNull(field5, "field");
        Internal.checkNotNull(fieldType6, "fieldType");
        if (fieldType6 != FieldType.MESSAGE_LIST && fieldType6 != FieldType.GROUP_LIST) {
            return new n0(field5, i6, fieldType6, null, 0, false, false, null, null, field4);
        }
        ze0.m("Shouldn't be called for repeated message fields.");
        return null;
    }

    public FieldInfo$Builder withCachedSizeField(java.lang.reflect.Field field) {
        this.cachedSizeField = field;
        return this;
    }

    public FieldInfo$Builder withEnforceUtf8(boolean z) {
        this.enforceUtf8 = z;
        return this;
    }

    public FieldInfo$Builder withEnumVerifier(Internal.EnumVerifier enumVerifier) {
        this.enumVerifier = enumVerifier;
        return this;
    }

    public FieldInfo$Builder withField(java.lang.reflect.Field field) {
        this.field = field;
        return this;
    }

    public FieldInfo$Builder withFieldNumber(int i) {
        this.fieldNumber = i;
        return this;
    }

    public FieldInfo$Builder withMapDefaultEntry(Object obj) {
        this.mapDefaultEntry = obj;
        return this;
    }

    public FieldInfo$Builder withOneof(re4 re4Var, Class<?> cls) {
        if (this.field == null && this.presenceField == null) {
            this.oneofStoredType = cls;
            return this;
        }
        ze0.m("Cannot set oneof when field or presenceField have been provided");
        return null;
    }

    public FieldInfo$Builder withPresence(java.lang.reflect.Field field, int i) {
        this.presenceField = (java.lang.reflect.Field) Internal.checkNotNull(field, "presenceField");
        this.presenceMask = i;
        return this;
    }

    public FieldInfo$Builder withRequired(boolean z) {
        this.required = z;
        return this;
    }

    public FieldInfo$Builder withType(FieldType fieldType) {
        this.type = fieldType;
        return this;
    }

    private FieldInfo$Builder() {
    }
}
