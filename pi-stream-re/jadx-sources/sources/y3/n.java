package y3;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.appcompat.widget.a0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class n implements j {

    /* renamed from: d, reason: collision with root package name */
    public static final Bitmap.Config[] f11611d;

    /* renamed from: e, reason: collision with root package name */
    public static final Bitmap.Config[] f11612e;

    /* renamed from: f, reason: collision with root package name */
    public static final Bitmap.Config[] f11613f;

    /* renamed from: x, reason: collision with root package name */
    public static final Bitmap.Config[] f11614x;

    /* renamed from: y, reason: collision with root package name */
    public static final Bitmap.Config[] f11615y;

    /* renamed from: a, reason: collision with root package name */
    public final c f11616a = new c(2);

    /* renamed from: b, reason: collision with root package name */
    public final a0 f11617b = new a0(28);

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f11618c = new HashMap();

    static {
        Bitmap.Config config;
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            int length = configArr.length - 1;
            config = Bitmap.Config.RGBA_F16;
            configArr[length] = config;
        }
        f11611d = configArr;
        f11612e = configArr;
        f11613f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f11614x = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f11615y = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String d(int i10, Bitmap.Config config) {
        return "[" + i10 + "](" + config + ")";
    }

    @Override // y3.j
    public final String C(Bitmap bitmap) {
        return d(p4.m.c(bitmap), bitmap.getConfig());
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap e10 = e(bitmap.getConfig());
        Integer num2 = (Integer) e10.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                e10.remove(num);
                return;
            } else {
                e10.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + C(bitmap) + ", this: " + this);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab A[EDGE_INSN: B:37:0x00ab->B:26:0x00ab BREAK  A[LOOP:0: B:16:0x0068->B:35:0x00a8], SYNTHETIC] */
    @Override // y3.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap b(int r11, int r12, android.graphics.Bitmap.Config r13) {
        /*
            r10 = this;
            char[] r0 = p4.m.f8575a
            int r0 = r11 * r12
            if (r13 != 0) goto L9
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
            goto La
        L9:
            r1 = r13
        La:
            int[] r2 = p4.l.f8574a
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == r5) goto L25
            if (r1 == r4) goto L23
            if (r1 == r3) goto L23
            if (r1 == r2) goto L20
            r1 = r2
            goto L26
        L20:
            r1 = 8
            goto L26
        L23:
            r1 = r4
            goto L26
        L25:
            r1 = r5
        L26:
            int r1 = r1 * r0
            y3.c r0 = r10.f11616a
            y3.k r6 = r0.e()
            y3.m r6 = (y3.m) r6
            r6.f11609b = r1
            r6.f11610c = r13
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 26
            r9 = 0
            if (r7 < r8) goto L47
            android.graphics.Bitmap$Config r7 = h0.f.z()
            boolean r7 = r7.equals(r13)
            if (r7 == 0) goto L47
            android.graphics.Bitmap$Config[] r2 = y3.n.f11612e
            goto L67
        L47:
            int[] r7 = y3.l.f11607a
            int r8 = r13.ordinal()
            r7 = r7[r8]
            if (r7 == r5) goto L65
            if (r7 == r4) goto L62
            if (r7 == r3) goto L5f
            if (r7 == r2) goto L5c
            android.graphics.Bitmap$Config[] r2 = new android.graphics.Bitmap.Config[r5]
            r2[r9] = r13
            goto L67
        L5c:
            android.graphics.Bitmap$Config[] r2 = y3.n.f11615y
            goto L67
        L5f:
            android.graphics.Bitmap$Config[] r2 = y3.n.f11614x
            goto L67
        L62:
            android.graphics.Bitmap$Config[] r2 = y3.n.f11613f
            goto L67
        L65:
            android.graphics.Bitmap$Config[] r2 = y3.n.f11611d
        L67:
            int r3 = r2.length
        L68:
            if (r9 >= r3) goto Lab
            r4 = r2[r9]
            java.util.NavigableMap r5 = r10.e(r4)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            java.lang.Object r5 = r5.ceilingKey(r7)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto La8
            int r7 = r5.intValue()
            int r8 = r1 * 8
            if (r7 > r8) goto La8
            int r2 = r5.intValue()
            if (r2 != r1) goto L95
            if (r4 != 0) goto L8f
            if (r13 == 0) goto Lab
            goto L95
        L8f:
            boolean r1 = r4.equals(r13)
            if (r1 != 0) goto Lab
        L95:
            r0.m(r6)
            int r1 = r5.intValue()
            y3.k r0 = r0.e()
            r6 = r0
            y3.m r6 = (y3.m) r6
            r6.f11609b = r1
            r6.f11610c = r4
            goto Lab
        La8:
            int r9 = r9 + 1
            goto L68
        Lab:
            androidx.appcompat.widget.a0 r0 = r10.f11617b
            java.lang.Object r0 = r0.K(r6)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto Lc1
            int r1 = r6.f11609b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r10.a(r1, r0)
            r0.reconfigure(r11, r12, r13)
        Lc1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.n.b(int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap");
    }

    @Override // y3.j
    public final void c(Bitmap bitmap) {
        int c6 = p4.m.c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        m mVar = (m) this.f11616a.e();
        mVar.f11609b = c6;
        mVar.f11610c = config;
        this.f11617b.U(mVar, bitmap);
        NavigableMap e10 = e(bitmap.getConfig());
        Integer num = (Integer) e10.get(Integer.valueOf(mVar.f11609b));
        Integer valueOf = Integer.valueOf(mVar.f11609b);
        int i10 = 1;
        if (num != null) {
            i10 = 1 + num.intValue();
        }
        e10.put(valueOf, Integer.valueOf(i10));
    }

    public final NavigableMap e(Bitmap.Config config) {
        HashMap hashMap = this.f11618c;
        NavigableMap navigableMap = (NavigableMap) hashMap.get(config);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            hashMap.put(config, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    @Override // y3.j
    public final String m(int i10, int i11, Bitmap.Config config) {
        Bitmap.Config config2;
        char[] cArr = p4.m.f8575a;
        int i12 = i10 * i11;
        if (config == null) {
            config2 = Bitmap.Config.ARGB_8888;
        } else {
            config2 = config;
        }
        int i13 = p4.l.f8574a[config2.ordinal()];
        int i14 = 1;
        if (i13 != 1) {
            i14 = 2;
            if (i13 != 2 && i13 != 3) {
                i14 = 4;
                if (i13 == 4) {
                    i14 = 8;
                }
            }
        }
        return d(i14 * i12, config);
    }

    @Override // y3.j
    public final int t(Bitmap bitmap) {
        return p4.m.c(bitmap);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f11617b);
        sb.append(", sortedSizes=(");
        HashMap hashMap = this.f11618c;
        for (Map.Entry entry : hashMap.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!hashMap.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }

    @Override // y3.j
    public final Bitmap u() {
        Bitmap bitmap = (Bitmap) this.f11617b.W();
        if (bitmap != null) {
            a(Integer.valueOf(p4.m.c(bitmap)), bitmap);
        }
        return bitmap;
    }
}
