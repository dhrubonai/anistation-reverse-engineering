package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vr5 {
    public static final be g = new be(20);
    public static final be h = new be(21);
    public int d;
    public int e;
    public int f;
    public final ur5[] b = new ur5[5];
    public final ArrayList a = new ArrayList();
    public int c = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(int i, float f) {
        ur5 ur5Var;
        int i2 = this.c;
        ArrayList arrayList = this.a;
        if (i2 != 1) {
            Collections.sort(arrayList, g);
            this.c = 1;
        }
        int i3 = this.f;
        ur5[] ur5VarArr = this.b;
        if (i3 > 0) {
            int i4 = i3 - 1;
            this.f = i4;
            ur5Var = ur5VarArr[i4];
        } else {
            ur5Var = new Object();
        }
        int i5 = this.d;
        this.d = i5 + 1;
        ur5Var.a = i5;
        ur5Var.b = i;
        ur5Var.c = f;
        arrayList.add(ur5Var);
        this.e += i;
        while (true) {
            int i6 = this.e;
            if (i6 > 2000) {
                int i7 = i6 - 2000;
                ur5 ur5Var2 = (ur5) arrayList.get(0);
                int i8 = ur5Var2.b;
                if (i8 <= i7) {
                    this.e -= i8;
                    arrayList.remove(0);
                    int i9 = this.f;
                    if (i9 < 5) {
                        this.f = i9 + 1;
                        ur5VarArr[i9] = ur5Var2;
                    }
                } else {
                    ur5Var2.b = i8 - i7;
                    this.e -= i7;
                }
            } else {
                return;
            }
        }
    }

    public final float b() {
        int i = this.c;
        ArrayList arrayList = this.a;
        if (i != 0) {
            Collections.sort(arrayList, h);
            this.c = 0;
        }
        float f = 0.5f * this.e;
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ur5 ur5Var = (ur5) arrayList.get(i3);
            i2 += ur5Var.b;
            if (i2 >= f) {
                return ur5Var.c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((ur5) arrayList.get(arrayList.size() - 1)).c;
    }
}
