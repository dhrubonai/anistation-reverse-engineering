package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ts0 implements oc2 {
    @Override // defpackage.oc2
    public final Object f(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, kd2 kd2Var, Integer num) {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        String str = (String) obj;
        boolean booleanValue = bool.booleanValue();
        qz0 qz0Var = (qz0) obj2;
        jc2 jc2Var = (jc2) obj3;
        sb2 sb2Var = (sb2) obj4;
        int intValue = num.intValue();
        int i8 = intValue & 6;
        vz3 vz3Var = vz3.x;
        if (i8 == 0) {
            if (kd2Var.f(vz3Var)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i = i7 | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            if (kd2Var.f(str)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i |= i6;
        }
        if ((intValue & 384) == 0) {
            if (kd2Var.g(booleanValue)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i |= i5;
        }
        if ((intValue & 3072) == 0) {
            if (kd2Var.f(qz0Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i |= i4;
        }
        if ((intValue & 24576) == 0) {
            if (kd2Var.h(jc2Var)) {
                i3 = 16384;
            } else {
                i3 = 8192;
            }
            i |= i3;
        }
        if ((intValue & 196608) == 0) {
            if (kd2Var.h(sb2Var)) {
                i2 = 131072;
            } else {
                i2 = 65536;
            }
            i |= i2;
        }
        if ((599187 & i) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i & 1, z)) {
            uz0.c(str, booleanValue, qz0Var, vz3Var, jc2Var, sb2Var, kd2Var, (i & 458752) | ((i >> 3) & 1022) | ((i << 9) & 7168) | (57344 & i));
        } else {
            kd2Var.Y();
        }
        return pn6.a;
    }
}
