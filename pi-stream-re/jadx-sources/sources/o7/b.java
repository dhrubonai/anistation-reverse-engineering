package o7;

import java.util.Iterator;
import java.util.NoSuchElementException;
import r6.h0;

/* loaded from: classes.dex */
public final class b implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f8314a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f8315b;

    /* renamed from: c, reason: collision with root package name */
    public int f8316c;

    /* renamed from: d, reason: collision with root package name */
    public l7.f f8317d;

    /* renamed from: e, reason: collision with root package name */
    public int f8318e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f8319f;

    public b(c cVar) {
        this.f8319f = cVar;
        int i10 = cVar.f8321b;
        int length = cVar.f8320a.length();
        if (length >= 0) {
            if (i10 < 0) {
                i10 = 0;
            } else if (i10 > length) {
                i10 = length;
            }
            this.f8315b = i10;
            this.f8316c = i10;
            return;
        }
        throw new IllegalArgumentException(a3.g.o("Cannot coerce value to an empty range: maximum ", length, " is less than minimum 0."));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        if (r6 < r3) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r7 = this;
            int r0 = r7.f8316c
            r1 = 0
            if (r0 >= 0) goto Lb
            r7.f8314a = r1
            r0 = 0
            r7.f8317d = r0
            goto L7b
        Lb:
            o7.c r2 = r7.f8319f
            int r3 = r2.f8322c
            r4 = -1
            r5 = 1
            if (r3 <= 0) goto L1a
            int r6 = r7.f8318e
            int r6 = r6 + r5
            r7.f8318e = r6
            if (r6 >= r3) goto L22
        L1a:
            java.lang.CharSequence r3 = r2.f8320a
            int r3 = r3.length()
            if (r0 <= r3) goto L34
        L22:
            l7.f r0 = new l7.f
            int r1 = r7.f8315b
            java.lang.CharSequence r2 = r2.f8320a
            int r2 = o7.j.m1(r2)
            r0.<init>(r1, r2)
            r7.f8317d = r0
            r7.f8316c = r4
            goto L79
        L34:
            h7.p r0 = r2.f8323d
            java.lang.CharSequence r3 = r2.f8320a
            int r6 = r7.f8316c
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r0 = r0.invoke(r3, r6)
            w6.b r0 = (w6.b) r0
            if (r0 != 0) goto L58
            l7.f r0 = new l7.f
            int r1 = r7.f8315b
            java.lang.CharSequence r2 = r2.f8320a
            int r2 = o7.j.m1(r2)
            r0.<init>(r1, r2)
            r7.f8317d = r0
            r7.f8316c = r4
            goto L79
        L58:
            java.lang.Object r2 = r0.f11012a
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.f11013b
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r3 = r7.f8315b
            l7.f r3 = r6.h0.c1(r3, r2)
            r7.f8317d = r3
            int r2 = r2 + r0
            r7.f8315b = r2
            if (r0 != 0) goto L76
            r1 = r5
        L76:
            int r2 = r2 + r1
            r7.f8316c = r2
        L79:
            r7.f8314a = r5
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.b.a():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f8314a == -1) {
            a();
        }
        if (this.f8314a == 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f8314a == -1) {
            a();
        }
        if (this.f8314a != 0) {
            l7.f fVar = this.f8317d;
            h0.r(fVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f8317d = null;
            this.f8314a = -1;
            return fVar;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
