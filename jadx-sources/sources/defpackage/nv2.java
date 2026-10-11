package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class nv2 {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final long f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final mv2 j;
    public boolean k;

    public nv2(float f, float f2, float f3, float f4, long j, int i, boolean z, int i2) {
        String str;
        long j2;
        int i3;
        boolean z2;
        if ((i2 & 1) != 0) {
            str = "";
        } else {
            str = "Filled.Close";
        }
        if ((i2 & 32) != 0) {
            j2 = ep0.i;
        } else {
            j2 = j;
        }
        if ((i2 & 64) != 0) {
            i3 = 5;
        } else {
            i3 = i;
        }
        if ((i2 & 128) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = j2;
        this.g = i3;
        this.h = z2;
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        mv2 mv2Var = new mv2(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.j = mv2Var;
        arrayList.add(mv2Var);
    }
}
