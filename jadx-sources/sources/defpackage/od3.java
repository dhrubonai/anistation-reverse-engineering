package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class od3 {
    public final p44 a;
    public eb2 b;
    public int c;
    public final q44 d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    public final ArrayList i;
    public yh1 j;

    public od3() {
        long[] jArr = cb5.a;
        this.a = new p44();
        q44 q44Var = db5.a;
        this.d = new q44();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
    }

    public static void c(vd3 vd3Var, int i, md3 md3Var, boolean z) {
        long a;
        int i2 = 0;
        long g = vd3Var.g(0);
        if (z) {
            a = c13.a(0, i, 1, g);
        } else {
            a = c13.a(i, 0, 2, g);
        }
        kd3[] kd3VarArr = md3Var.a;
        int length = kd3VarArr.length;
        int i3 = 0;
        while (i2 < length) {
            kd3 kd3Var = kd3VarArr[i2];
            int i4 = i3 + 1;
            if (kd3Var != null) {
                kd3Var.j = c13.d(a, c13.c(vd3Var.g(i3), g));
            }
            i2++;
            i3 = i4;
        }
    }

    public static int h(int[] iArr, vd3 vd3Var, boolean z) {
        int h = vd3Var.h();
        int b = vd3Var.b() + h;
        int i = 0;
        while (h < b) {
            int e0 = db.e0(vd3Var, z) + iArr[h];
            iArr[h] = e0;
            i = Math.max(i, e0);
            h++;
        }
        return i;
    }

    public final kd3 a(int i, Object obj) {
        md3 md3Var = (md3) this.a.g(obj);
        if (md3Var != null) {
            return md3Var.a[i];
        }
        return null;
    }

    public final long b() {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            kd3 kd3Var = (kd3) arrayList.get(i);
            di2 di2Var = kd3Var.m;
            if (di2Var != null) {
                j = (Math.max((int) (j & 4294967295L), ((int) (kd3Var.j & 4294967295L)) + ((int) (di2Var.u & 4294967295L))) & 4294967295L) | (Math.max((int) (j >> 32), ((int) (kd3Var.j >> 32)) + ((int) (di2Var.u >> 32))) << 32);
            }
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01f4, code lost:
    
        r9 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f5, code lost:
    
        if (r31 == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01f7, code lost:
    
        r3 = r2.a;
        r4 = r3.length;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01fb, code lost:
    
        if (r5 >= r4) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01fd, code lost:
    
        r6 = r3[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01ff, code lost:
    
        if (r6 == null) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0205, code lost:
    
        if (r6.b() == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0207, code lost:
    
        r15.remove(r6);
        r7 = r47.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x020c, code lost:
    
        if (r7 == null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x020e, code lost:
    
        defpackage.v94.y(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0211, code lost:
    
        r6.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0214, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0217, code lost:
    
        g(r11, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0138, code lost:
    
        r31 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x012f, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0115, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x023f, code lost:
    
        r32 = r2;
        r33 = r3;
        r2 = r8;
        r9 = r29;
        r30 = r15;
        f(r11.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0261, code lost:
    
        r15 = r6;
        r2 = r8;
        r3 = r10;
        r4 = 2;
        r5 = new int[r13];
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x026a, code lost:
    
        if (r20 == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x026c, code lost:
    
        if (r14 == null) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0272, code lost:
    
        if (r3.isEmpty() != false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0054, code lost:
    
        r15 = r47.c;
        r6 = (defpackage.vd3) defpackage.yo0.m0(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0279, code lost:
    
        if (r3.size() <= 1) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x027b, code lost:
    
        defpackage.cp0.X(r3, new defpackage.nd3(r14, r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0283, code lost:
    
        r7 = r3.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0288, code lost:
    
        if (r9 >= r7) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x028a, code lost:
    
        r10 = (defpackage.vd3) r3.get(r9);
        r11 = r58 - h(r5, r10, r54);
        r12 = r2.g(r10.getKey());
        r12.getClass();
        c(r10, r11, (defpackage.md3) r12, r54);
        g(r10, false);
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02ad, code lost:
    
        r11 = 0;
        java.util.Arrays.fill(r5, 0, r13, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02b7, code lost:
    
        if (r9.isEmpty() != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005c, code lost:
    
        if (r6 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02be, code lost:
    
        if (r9.size() <= 1) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02c0, code lost:
    
        defpackage.cp0.X(r9, new defpackage.nd3(r14, r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02c8, code lost:
    
        r7 = r9.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02cd, code lost:
    
        if (r9 >= r7) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02cf, code lost:
    
        r10 = (defpackage.vd3) r9.get(r9);
        r11 = (h(r5, r10, r54) + r59) - defpackage.db.e0(r10, r54);
        r12 = r2.g(r10.getKey());
        r12.getClass();
        c(r10, r11, (defpackage.md3) r12, r54);
        g(r10, false);
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02f7, code lost:
    
        java.util.Arrays.fill(r5, 0, r13, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02b2, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02fb, code lost:
    
        r7 = r1.b;
        r9 = r1.a;
        r4 = r9.length - 2;
        r10 = r47.h;
        r11 = r47.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
    
        r6 = r6.getIndex();
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0306, code lost:
    
        if (r4 < 0) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0308, code lost:
    
        r34 = r9;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x030d, code lost:
    
        r6 = r9[r12];
        r31 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0319, code lost:
    
        if (((((~r6) << 7) & r6) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x031b, code lost:
    
        r8 = 8 - ((~(r12 - r4)) >>> 31);
        r32 = r6;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0327, code lost:
    
        if (r6 >= r8) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x032d, code lost:
    
        if ((r32 & 255) >= 128) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x032f, code lost:
    
        r7 = r7[(r12 << 3) + r6];
        r9 = (defpackage.md3) r2.g(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x033a, code lost:
    
        if (r9 != null) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0064, code lost:
    
        r47.c = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x033e, code lost:
    
        r35 = r1;
        r57 = r3;
        r3 = r52.l(r7);
        r42 = r6;
        r6 = java.lang.Math.min(r13, r9.e);
        r9.e = r6;
        r43 = r8;
        r9.d = java.lang.Math.min(r13 - r6, r9.d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x035f, code lost:
    
        if (r3 != (-1)) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0361, code lost:
    
        r3 = r9.a;
        r8 = r3.length;
        r6 = 0;
        r36 = false;
        r37 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0369, code lost:
    
        if (r6 >= r8) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x036b, code lost:
    
        r38 = r3;
        r3 = r38[r6];
        r39 = r37 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0371, code lost:
    
        if (r3 == null) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0377, code lost:
    
        if (r3.b() == false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0379, code lost:
    
        r40 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x03b5, code lost:
    
        r36 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
    
        if (r54 == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x03c2, code lost:
    
        r6 = r40 + 1;
        r3 = r38;
        r37 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x037c, code lost:
    
        r40 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x038a, code lost:
    
        if (((java.lang.Boolean) r3.i.getValue()).booleanValue() == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x038c, code lost:
    
        r3.c();
        r9.a[r37] = null;
        r15.remove(r3);
        r3 = r47.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0398, code lost:
    
        if (r3 == null) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x039a, code lost:
    
        defpackage.v94.y(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
    
        r6 = r48 & 4294967295L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x03a0, code lost:
    
        if (r3.m == null) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x03a2, code lost:
    
        r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x03a9, code lost:
    
        if (r3.b() == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x03ab, code lost:
    
        r15.add(r3);
        r3 = r47.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x03b0, code lost:
    
        if (r3 == null) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x03b2, code lost:
    
        defpackage.v94.y(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x03b8, code lost:
    
        r3.c();
        r9.a[r37] = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x03c0, code lost:
    
        r40 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
    
        if (r55 != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x03c9, code lost:
    
        if (r36 != false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x03cb, code lost:
    
        f(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x03ce, code lost:
    
        r38 = r5;
        r3 = r10;
        r5 = r11;
        r29 = r14;
        r37 = r34;
        r14 = r12;
        r34 = r15;
        r15 = r43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x048e, code lost:
    
        r32 = r32 >> 8;
        r13 = r56;
        r10 = r3;
        r11 = r5;
        r6 = r42 + 1;
        r12 = r14;
        r8 = r15;
        r14 = r29;
        r15 = r34;
        r1 = r35;
        r34 = r37;
        r5 = r38;
        r3 = r57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x03df, code lost:
    
        r6 = r9.b;
        r6.getClass();
        r8 = r10;
        r44 = r11;
        r3 = r53.t(r3, r9.d, r9.e, r6.a);
        r3.j();
        r10 = r9.a;
        r11 = r10.length;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0406, code lost:
    
        if (r3 >= r11) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0408, code lost:
    
        r37 = r3;
        r3 = r10[r37];
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0078, code lost:
    
        if (r57 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x040c, code lost:
    
        if (r3 == null) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x040e, code lost:
    
        r38 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x041d, code lost:
    
        if (((java.lang.Boolean) r3.f.getValue()).booleanValue() != true) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0447, code lost:
    
        r29 = r14;
        r37 = r34;
        r14 = r12;
        r34 = r15;
        r3 = r38;
        r15 = r43;
        r38 = r5;
        r5 = r44;
        r9.a(r3, r60, r61, r58, r59, r9.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x046b, code lost:
    
        if (r3 >= r47.c) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x046d, code lost:
    
        r5.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0471, code lost:
    
        r3.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007b, code lost:
    
        r20 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0423, code lost:
    
        r3 = r37 + 1;
        r8 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0421, code lost:
    
        r38 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0428, code lost:
    
        r38 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x042a, code lost:
    
        if (r14 == null) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0430, code lost:
    
        if (r3 != r14.l(r7)) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0432, code lost:
    
        f(r7);
        r29 = r14;
        r37 = r34;
        r3 = r38;
        r38 = r5;
        r14 = r12;
        r34 = r15;
        r15 = r43;
        r5 = r44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0477, code lost:
    
        r35 = r1;
        r57 = r3;
        r38 = r5;
        r42 = r6;
        r3 = r10;
        r5 = r11;
        r29 = r14;
        r37 = r34;
        r14 = r12;
        r34 = r15;
        r15 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
    
        r9 = r8.b;
        r10 = r8.a;
        r11 = r10.length - 2;
        r1 = r47.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x04a7, code lost:
    
        r35 = r1;
        r57 = r3;
        r38 = r5;
        r3 = r10;
        r5 = r11;
        r29 = r14;
        r37 = r34;
        r1 = r52;
        r14 = r12;
        r34 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x04bd, code lost:
    
        if (r8 != 8) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x04d5, code lost:
    
        if (r14 == r4) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x04d7, code lost:
    
        r12 = r14 + 1;
        r13 = r56;
        r10 = r3;
        r11 = r5;
        r14 = r29;
        r9 = r31;
        r15 = r34;
        r1 = r35;
        r34 = r37;
        r5 = r38;
        r3 = r57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x04ff, code lost:
    
        if (r5.isEmpty() != false) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0506, code lost:
    
        if (r5.size() <= 1) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0094, code lost:
    
        if (r11 < 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0508, code lost:
    
        defpackage.cp0.X(r5, new defpackage.nd3(r1, 3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0511, code lost:
    
        r4 = r5.size();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0516, code lost:
    
        if (r6 >= r4) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0518, code lost:
    
        r7 = (defpackage.vd3) r5.get(r6);
        r8 = r2.g(r7.getKey());
        r8.getClass();
        r8 = (defpackage.md3) r8;
        r9 = r38;
        r10 = h(r9, r7, r54);
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0533, code lost:
    
        if (r55 == false) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0535, code lost:
    
        r14 = ((defpackage.vd3) defpackage.yo0.k0(r51)).g(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0540, code lost:
    
        if (r54 == false) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0542, code lost:
    
        r13 = r14 & 4294967295L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0544, code lost:
    
        r11 = (int) r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x054b, code lost:
    
        r7.k(r11 - r10, r8.c, r49, r50);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0096, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0555, code lost:
    
        if (r20 == false) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0557, code lost:
    
        g(r7, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x055b, code lost:
    
        r6 = r6 + 1;
        r38 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0546, code lost:
    
        r13 = r14 >> 32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0549, code lost:
    
        r11 = r8.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0560, code lost:
    
        r10 = r49;
        r13 = r50;
        r12 = r54;
        r9 = r38;
        java.util.Arrays.fill(r9, 0, r56, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0097, code lost:
    
        r2 = r10[r12];
        r29 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x057b, code lost:
    
        if (r3.isEmpty() != false) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x057d, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0582, code lost:
    
        if (r3.size() <= 1) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0584, code lost:
    
        defpackage.cp0.X(r3, new defpackage.nd3(r1, r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x058c, code lost:
    
        r1 = r3.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0591, code lost:
    
        if (r4 >= r1) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0593, code lost:
    
        r6 = (defpackage.vd3) r3.get(r4);
        r7 = r2.g(r6.getKey());
        r7.getClass();
        r7 = (defpackage.md3) r7;
        r6.k((r7.g - defpackage.db.e0(r6, r12)) + h(r9, r6, r12), r7.c, r10, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x05b8, code lost:
    
        if (r20 == false) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x05ba, code lost:
    
        g(r6, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a5, code lost:
    
        if (((((~r2) << 7) & r2) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x05bd, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x05c0, code lost:
    
        java.util.Collections.reverse(r5);
        r51.addAll(0, r5);
        r51.addAll(r3);
        r57.clear();
        r37.clear();
        r5.clear();
        r3.clear();
        r35.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x05db, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x056f, code lost:
    
        r10 = r49;
        r13 = r50;
        r12 = r54;
        r9 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x04c0, code lost:
    
        r35 = r1;
        r57 = r3;
        r38 = r5;
        r3 = r10;
        r5 = r11;
        r29 = r14;
        r37 = r34;
        r1 = r52;
        r14 = r12;
        r34 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x04ef, code lost:
    
        r35 = r1;
        r57 = r3;
        r38 = r5;
        r37 = r9;
        r3 = r10;
        r5 = r11;
        r1 = r52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a7, code lost:
    
        r6 = 8 - ((~(r12 - r11)) >>> 31);
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x00ce, code lost:
    
        if (r12 == r11) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x00d0, code lost:
    
        r12 = r12 + 1;
        r6 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x00d5, code lost:
    
        r29 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x007e, code lost:
    
        r20 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0073, code lost:
    
        r6 = r48 << 32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0063, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00af, code lost:
    
        if (r7 >= r6) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b5, code lost:
    
        if ((r2 & 255) >= 128) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b7, code lost:
    
        r32 = r2;
        r1.a(r9[(r12 << 3) + r7]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c5, code lost:
    
        r2 = r32 >> 8;
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c3, code lost:
    
        r32 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cc, code lost:
    
        if (r6 != 8) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d7, code lost:
    
        r2 = r4.size();
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00dc, code lost:
    
        r6 = r47.i;
        r9 = r47.f;
        r10 = r47.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e2, code lost:
    
        if (r3 >= r2) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e4, code lost:
    
        r11 = (defpackage.vd3) r4.get(r3);
        r1.l(r11.getKey());
        r12 = r11.e().size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fa, code lost:
    
        if (r7 >= r12) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fc, code lost:
    
        r32 = r2;
        r2 = ((defpackage.em4) r11.e().get(r7)).w();
        r33 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0110, code lost:
    
        if ((r2 instanceof defpackage.bd3) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0112, code lost:
    
        r2 = (defpackage.bd3) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0117, code lost:
    
        if (r2 == null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x021d, code lost:
    
        r45 = r15;
        r7 = r7 + 1;
        r9 = r9;
        r6 = r6;
        r15 = r45;
        r29 = r29;
        r8 = r8;
        r10 = r10;
        r2 = r32;
        r3 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0119, code lost:
    
        r2 = (defpackage.md3) r8.g(r11.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0123, code lost:
    
        if (r14 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0125, code lost:
    
        r3 = r14.l(r11.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0131, code lost:
    
        if (r3 != (-1)) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0133, code lost:
    
        if (r14 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0135, code lost:
    
        r31 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x013a, code lost:
    
        if (r2 != null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x013c, code lost:
    
        r6 = new defpackage.md3(r47);
        r12 = r54;
        r2 = r8;
        r34 = r9;
        r35 = r10;
        r4 = r29;
        defpackage.md3.b(r6, r11, r60, r61, r58, r59, r12);
        r2.n(r11.getKey(), r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0161, code lost:
    
        if (r11.getIndex() == r3) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0164, code lost:
    
        if (r3 == (-1)) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0166, code lost:
    
        if (r3 >= r15) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0168, code lost:
    
        r35.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0173, code lost:
    
        r9 = r4;
        r30 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0252, code lost:
    
        r3 = r33 + 1;
        r4 = r51;
        r8 = r2;
        r15 = r30;
        r2 = r32;
        r29 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016e, code lost:
    
        r34.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017a, code lost:
    
        r8 = r11.g(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x017f, code lost:
    
        if (r12 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0181, code lost:
    
        r8 = r8 & 4294967295L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0188, code lost:
    
        c(r11, (int) r8, r6, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x018b, code lost:
    
        if (r31 == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x018d, code lost:
    
        r3 = r6.a;
        r6 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0191, code lost:
    
        if (r7 >= r6) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0193, code lost:
    
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0195, code lost:
    
        if (r8 == null) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0197, code lost:
    
        r8.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x019a, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0185, code lost:
    
        r8 = r8 >> 32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x019d, code lost:
    
        r12 = r54;
        r2 = r8;
        r4 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01a5, code lost:
    
        if (r20 == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a7, code lost:
    
        r30 = r15;
        r15 = r6;
        defpackage.md3.b(r2, r11, r60, r61, r58, r59, r12);
        r7 = r2.a;
        r9 = r7.length;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01bd, code lost:
    
        if (r10 >= r9) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01bf, code lost:
    
        r12 = r7[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01c1, code lost:
    
        if (r12 == null) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c3, code lost:
    
        r34 = r4;
        r5 = r9;
        r29 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01d3, code lost:
    
        if (defpackage.c13.b(r12.j, 9223372034707292159L) != false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d5, code lost:
    
        r9 = r34;
        r12.j = defpackage.c13.d(r12.j, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01ea, code lost:
    
        r45 = r9;
        r9 = r5;
        r4 = r45;
        r10 = r29 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01e0, code lost:
    
        r9 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e3, code lost:
    
        r29 = r10;
        r5 = r9;
        r9 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(int r48, int r49, int r50, java.util.ArrayList r51, defpackage.eb2 r52, defpackage.qt0 r53, boolean r54, boolean r55, int r56, boolean r57, int r58, int r59, defpackage.v11 r60, defpackage.ci2 r61) {
        /*
            Method dump skipped, instructions count: 1500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od3.d(int, int, int, java.util.ArrayList, eb2, qt0, boolean, boolean, int, boolean, int, int, v11, ci2):void");
    }

    public final void e() {
        p44 p44Var = this.a;
        if (p44Var.j()) {
            Object[] objArr = p44Var.c;
            long[] jArr = p44Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                for (kd3 kd3Var : ((md3) objArr[(i << 3) + i3]).a) {
                                    if (kd3Var != null) {
                                        kd3Var.c();
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            p44Var.a();
        }
    }

    public final void f(Object obj) {
        md3 md3Var = (md3) this.a.l(obj);
        if (md3Var != null) {
            for (kd3 kd3Var : md3Var.a) {
                if (kd3Var != null) {
                    kd3Var.c();
                }
            }
        }
    }

    public final void g(vd3 vd3Var, boolean z) {
        Object g = this.a.g(vd3Var.getKey());
        g.getClass();
        kd3[] kd3VarArr = ((md3) g).a;
        int length = kd3VarArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            kd3 kd3Var = kd3VarArr[i];
            int i3 = i2 + 1;
            if (kd3Var != null) {
                long g2 = vd3Var.g(i2);
                long j = kd3Var.j;
                if (!c13.b(j, 9223372034707292159L) && !c13.b(j, g2)) {
                    long c = c13.c(g2, j);
                    j32 j32Var = kd3Var.d;
                    if (j32Var != null) {
                        long c2 = c13.c(((c13) kd3Var.p.getValue()).a, c);
                        kd3Var.d(c2);
                        kd3Var.f.setValue(Boolean.TRUE);
                        kd3Var.e = z;
                        tl7.z(kd3Var.a, null, null, new f0(kd3Var, j32Var, c2, null), 3);
                    }
                }
                kd3Var.j = g2;
            }
            i++;
            i2 = i3;
        }
    }
}
