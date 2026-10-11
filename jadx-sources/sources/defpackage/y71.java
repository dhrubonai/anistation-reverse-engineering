package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class y71 {
    public final List a;
    public final float[] b;
    public final int c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [nt1] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    public y71(List list, float[] fArr) {
        Object obj;
        this.a = list;
        this.b = fArr;
        if (list.size() != fArr.length) {
            int length = fArr.length;
            if (length != 0) {
                if (length != 1) {
                    obj = new ArrayList(fArr.length);
                    for (float f : fArr) {
                        obj.add(Float.valueOf(f));
                    }
                } else {
                    obj = te4.H(Float.valueOf(fArr[0]));
                }
            } else {
                obj = nt1.x;
            }
            hz2.a("DraggableAnchors were constructed with inconsistent key-value sizes. Keys: " + list + " | Anchors: " + obj);
        }
        this.c = this.b.length;
    }

    public final Object a(float f) {
        float[] fArr = this.b;
        int length = fArr.length;
        float f2 = Float.POSITIVE_INFINITY;
        int i = 0;
        int i2 = -1;
        int i3 = 0;
        while (i < length) {
            int i4 = i3 + 1;
            float abs = Math.abs(f - fArr[i]);
            if (abs <= f2) {
                i2 = i3;
                f2 = abs;
            }
            i++;
            i3 = i4;
        }
        if (i2 == -1) {
            return null;
        }
        return this.a.get(i2);
    }

    public final Object b(float f, boolean z) {
        float f2;
        float[] fArr = this.b;
        int length = fArr.length;
        int i = 0;
        int i2 = -1;
        float f3 = Float.POSITIVE_INFINITY;
        int i3 = 0;
        while (i < length) {
            float f4 = fArr[i];
            int i4 = i3 + 1;
            if (z) {
                f2 = f4 - f;
            } else {
                f2 = f - f4;
            }
            if (f2 < 0.0f) {
                f2 = Float.POSITIVE_INFINITY;
            }
            if (f2 <= f3) {
                i2 = i3;
                f3 = f2;
            }
            i++;
            i3 = i4;
        }
        if (i2 == -1) {
            return null;
        }
        return this.a.get(i2);
    }

    public final float c(Object obj) {
        int indexOf = this.a.indexOf(obj);
        if (indexOf >= 0) {
            float[] fArr = this.b;
            if (indexOf < fArr.length) {
                return fArr[indexOf];
            }
            return Float.NaN;
        }
        return Float.NaN;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof y71) {
                y71 y71Var = (y71) obj;
                if (!this.a.equals(y71Var.a) || !Arrays.equals(this.b, y71Var.b) || this.c != y71Var.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.b) + (this.a.hashCode() * 31)) * 31) + this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DraggableAnchors(anchors={"
            r0.<init>(r1)
            r1 = 0
        L8:
            int r2 = r6.c
            if (r1 >= r2) goto L41
            java.util.List r3 = r6.a
            java.lang.Object r3 = defpackage.yo0.n0(r1, r3)
            if (r1 < 0) goto L1c
            float[] r4 = r6.b
            int r5 = r4.length
            if (r1 >= r5) goto L1c
            r4 = r4[r1]
            goto L1e
        L1c:
            r4 = 2143289344(0x7fc00000, float:NaN)
        L1e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r3 = "="
            r5.append(r3)
            r5.append(r4)
            java.lang.String r3 = r5.toString()
            r0.append(r3)
            int r2 = r2 + (-1)
            if (r1 >= r2) goto L3e
            java.lang.String r2 = ", "
            r0.append(r2)
        L3e:
            int r1 = r1 + 1
            goto L8
        L41:
            java.lang.String r6 = "})"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y71.toString():java.lang.String");
    }
}
