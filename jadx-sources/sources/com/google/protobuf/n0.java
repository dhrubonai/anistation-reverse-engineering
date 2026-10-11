package com.google.protobuf;

import com.google.protobuf.Internal;
import defpackage.qx1;
import defpackage.ze0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class n0 implements Comparable {
    public final java.lang.reflect.Field A;
    public final int B;
    public final boolean C;
    public final boolean D;
    public final java.lang.reflect.Field E;
    public final Object F;
    public final Internal.EnumVerifier G;
    public final java.lang.reflect.Field x;
    public final FieldType y;
    public final int z;

    public n0(java.lang.reflect.Field field, int i, FieldType fieldType, java.lang.reflect.Field field2, int i2, boolean z, boolean z2, Object obj, Internal.EnumVerifier enumVerifier, java.lang.reflect.Field field3) {
        this.x = field;
        this.y = fieldType;
        this.z = i;
        this.A = field2;
        this.B = i2;
        this.C = z;
        this.D = z2;
        this.F = obj;
        this.G = enumVerifier;
        this.E = field3;
    }

    public static void a(int i) {
        if (i > 0) {
            return;
        }
        ze0.k(qx1.h(i, "fieldNumber must be positive: "));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.z - ((n0) obj).z;
    }
}
