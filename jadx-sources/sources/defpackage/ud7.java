package defpackage;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ud7 extends AbstractMap {
    public static final w66 C = new w66(6);
    public Integer A;
    public String B;
    public final Object[] x;
    public final int[] y;
    public final sd7 z;

    /* JADX WARN: Code restructure failed: missing block: B:59:0x016d, code lost:
    
        if (r8 < 0) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, ud7] */
    /* JADX WARN: Type inference failed for: r0v1, types: [ud7] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ud7(defpackage.ud7 r21, defpackage.ud7 r22) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ud7.<init>(ud7, ud7):void");
    }

    public static boolean b(int i, int i2) {
        if (i > 16 && i * 9 > i2 * 10) {
            return true;
        }
        return false;
    }

    public final int a(Map.Entry entry, int i, int i2, Object[] objArr, int[] iArr) {
        sd7 sd7Var = (sd7) entry.getValue();
        int c = sd7Var.c() - sd7Var.b();
        System.arraycopy(sd7Var.y.x, sd7Var.b(), objArr, i2, c);
        objArr[i] = new AbstractMap.SimpleImmutableEntry((String) entry.getKey(), new sd7(this, i));
        int i3 = i2 + c;
        iArr[i + 1] = i3;
        return i3;
    }

    public final Map.Entry c(int i) {
        if (i < this.y[0]) {
            return (Map.Entry) this.x[i];
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return this.z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Integer num = this.A;
        if (num == null) {
            num = Integer.valueOf(super.hashCode());
            this.A = num;
        }
        return num.intValue();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        String str = this.B;
        if (str == null) {
            String abstractMap = super.toString();
            this.B = abstractMap;
            return abstractMap;
        }
        return str;
    }

    public ud7() {
        List list = Collections.EMPTY_LIST;
        this.z = new sd7(this, -1);
        this.A = null;
        this.B = null;
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            int size = list.size();
            Object[] objArr = new Object[size];
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                int[] iArr = {0};
                this.x = b(size, 0) ? Arrays.copyOf(objArr, 0) : objArr;
                this.y = iArr;
                return;
            }
            throw qx1.f(it2);
        }
        throw qx1.f(it);
    }
}
