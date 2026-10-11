package z2;

import f1.o;
import f1.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class c extends i {

    /* renamed from: h, reason: collision with root package name */
    public final int f11977h;

    /* renamed from: i, reason: collision with root package name */
    public final int f11978i;

    /* renamed from: j, reason: collision with root package name */
    public final int f11979j;

    /* renamed from: n, reason: collision with root package name */
    public List f11983n;
    public List o;

    /* renamed from: p, reason: collision with root package name */
    public int f11984p;

    /* renamed from: q, reason: collision with root package name */
    public int f11985q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f11986r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f11987s;

    /* renamed from: t, reason: collision with root package name */
    public byte f11988t;

    /* renamed from: u, reason: collision with root package name */
    public byte f11989u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f11991w;

    /* renamed from: x, reason: collision with root package name */
    public long f11992x;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f11974y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f11975z = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] D = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] E = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: g, reason: collision with root package name */
    public final t f11976g = new t();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f11981l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public b f11982m = new b(0, 4);

    /* renamed from: v, reason: collision with root package name */
    public int f11990v = 0;

    /* renamed from: k, reason: collision with root package name */
    public final long f11980k = 16000000;

    public c(String str, int i10) {
        int i11;
        if ("application/x-mp4-cea-608".equals(str)) {
            i11 = 2;
        } else {
            i11 = 3;
        }
        this.f11977h = i11;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        o.f("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                        this.f11979j = 0;
                        this.f11978i = 0;
                    } else {
                        this.f11979j = 1;
                        this.f11978i = 1;
                    }
                } else {
                    this.f11979j = 0;
                    this.f11978i = 1;
                }
            } else {
                this.f11979j = 1;
                this.f11978i = 0;
            }
        } else {
            this.f11979j = 0;
            this.f11978i = 0;
        }
        l(0);
        k();
        this.f11991w = true;
        this.f11992x = -9223372036854775807L;
    }

    @Override // z2.i, i1.e
    public final void a() {
    }

    @Override // z2.i
    public final j f() {
        List list = this.f11983n;
        this.o = list;
        list.getClass();
        return new j(list);
    }

    @Override // z2.i, i1.e
    public final void flush() {
        super.flush();
        this.f11983n = null;
        this.o = null;
        l(0);
        this.f11985q = 4;
        this.f11982m.f11973h = 4;
        k();
        this.f11986r = false;
        this.f11987s = false;
        this.f11988t = (byte) 0;
        this.f11989u = (byte) 0;
        this.f11990v = 0;
        this.f11991w = true;
        this.f11992x = -9223372036854775807L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:150:0x0230. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0087 A[SYNTHETIC] */
    @Override // z2.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(z2.g r15) {
        /*
            Method dump skipped, instructions count: 754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.c.g(z2.g):void");
    }

    @Override // z2.i, i1.e
    /* renamed from: h */
    public final y2.j d() {
        boolean z9;
        y2.j jVar;
        y2.j d10 = super.d();
        if (d10 != null) {
            return d10;
        }
        long j4 = this.f11980k;
        if (j4 != -9223372036854775807L) {
            long j10 = this.f11992x;
            if (j10 != -9223372036854775807L && this.f12035e - j10 >= j4) {
                z9 = true;
                if (!z9 && (jVar = (y2.j) this.f12032b.pollFirst()) != null) {
                    this.f11983n = Collections.emptyList();
                    this.f11992x = -9223372036854775807L;
                    jVar.j(this.f12035e, f(), Long.MAX_VALUE);
                    return jVar;
                }
            }
        }
        z9 = false;
        return !z9 ? null : null;
    }

    @Override // z2.i
    public final boolean i() {
        if (this.f11983n != this.o) {
            return true;
        }
        return false;
    }

    public final List j() {
        ArrayList arrayList = this.f11981l;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i10 = 2;
        for (int i11 = 0; i11 < size; i11++) {
            e1.b c6 = ((b) arrayList.get(i11)).c(Integer.MIN_VALUE);
            arrayList2.add(c6);
            if (c6 != null) {
                i10 = Math.min(i10, c6.f3355i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            e1.b bVar = (e1.b) arrayList2.get(i12);
            if (bVar != null) {
                if (bVar.f3355i != i10) {
                    bVar = ((b) arrayList.get(i12)).c(i10);
                    bVar.getClass();
                }
                arrayList3.add(bVar);
            }
        }
        return arrayList3;
    }

    public final void k() {
        b bVar = this.f11982m;
        bVar.f11972g = this.f11984p;
        bVar.f11966a.clear();
        bVar.f11967b.clear();
        bVar.f11968c.setLength(0);
        bVar.f11969d = 15;
        bVar.f11970e = 0;
        bVar.f11971f = 0;
        ArrayList arrayList = this.f11981l;
        arrayList.clear();
        arrayList.add(this.f11982m);
    }

    public final void l(int i10) {
        int i11 = this.f11984p;
        if (i11 == i10) {
            return;
        }
        this.f11984p = i10;
        if (i10 == 3) {
            int i12 = 0;
            while (true) {
                ArrayList arrayList = this.f11981l;
                if (i12 < arrayList.size()) {
                    ((b) arrayList.get(i12)).f11972g = i10;
                    i12++;
                } else {
                    return;
                }
            }
        } else {
            k();
            if (i11 == 3 || i10 == 1 || i10 == 0) {
                this.f11983n = Collections.emptyList();
            }
        }
    }
}
