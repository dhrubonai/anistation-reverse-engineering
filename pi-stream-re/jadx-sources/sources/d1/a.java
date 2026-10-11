package d1;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import r6.n1;
import r6.o0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final o0 f3036a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3037b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f3038c = new ByteBuffer[0];

    /* renamed from: d, reason: collision with root package name */
    public boolean f3039d;

    public a(n1 n1Var) {
        this.f3036a = n1Var;
        b bVar = b.f3040e;
        this.f3039d = false;
    }

    public final b a(b bVar) {
        if (!bVar.equals(b.f3040e)) {
            int i10 = 0;
            while (true) {
                o0 o0Var = this.f3036a;
                if (i10 < o0Var.size()) {
                    d dVar = (d) o0Var.get(i10);
                    b j4 = dVar.j(bVar);
                    if (dVar.a()) {
                        w7.b.u(!j4.equals(b.f3040e));
                        bVar = j4;
                    }
                    i10++;
                } else {
                    return bVar;
                }
            }
        } else {
            throw new c(bVar);
        }
    }

    public final void b() {
        ArrayList arrayList = this.f3037b;
        arrayList.clear();
        int i10 = 0;
        this.f3039d = false;
        int i11 = 0;
        while (true) {
            o0 o0Var = this.f3036a;
            if (i11 >= o0Var.size()) {
                break;
            }
            d dVar = (d) o0Var.get(i11);
            dVar.flush();
            if (dVar.a()) {
                arrayList.add(dVar);
            }
            i11++;
        }
        this.f3038c = new ByteBuffer[arrayList.size()];
        while (true) {
            ByteBuffer[] byteBufferArr = this.f3038c;
            if (i10 <= byteBufferArr.length - 1) {
                byteBufferArr[i10] = ((d) arrayList.get(i10)).g();
                i10++;
            } else {
                return;
            }
        }
    }

    public final boolean c() {
        if (this.f3039d && ((d) this.f3037b.get(this.f3038c.length - 1)).b()) {
            if (!this.f3038c[r0.length - 1].hasRemaining()) {
                return true;
            }
        }
        return false;
    }

    public final boolean d() {
        return !this.f3037b.isEmpty();
    }

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final void e(java.nio.ByteBuffer r10) {
        /*
            r9 = this;
            r0 = 1
            r1 = r0
        L2:
            if (r1 == 0) goto L87
            r1 = 0
            r2 = r1
            r3 = r2
        L7:
            java.nio.ByteBuffer[] r4 = r9.f3038c
            int r5 = r4.length
            int r5 = r5 + (-1)
            if (r3 > r5) goto L84
            r4 = r4[r3]
            boolean r4 = r4.hasRemaining()
            if (r4 == 0) goto L18
            goto L81
        L18:
            java.util.ArrayList r4 = r9.f3037b
            java.lang.Object r5 = r4.get(r3)
            d1.d r5 = (d1.d) r5
            boolean r6 = r5.b()
            if (r6 == 0) goto L43
            java.nio.ByteBuffer[] r5 = r9.f3038c
            r5 = r5[r3]
            boolean r5 = r5.hasRemaining()
            if (r5 != 0) goto L81
            java.nio.ByteBuffer[] r5 = r9.f3038c
            int r5 = r5.length
            int r5 = r5 + (-1)
            if (r3 >= r5) goto L81
            int r5 = r3 + 1
            java.lang.Object r4 = r4.get(r5)
            d1.d r4 = (d1.d) r4
            r4.h()
            goto L81
        L43:
            if (r3 <= 0) goto L4c
            java.nio.ByteBuffer[] r4 = r9.f3038c
            int r6 = r3 + (-1)
            r4 = r4[r6]
            goto L56
        L4c:
            boolean r4 = r10.hasRemaining()
            if (r4 == 0) goto L54
            r4 = r10
            goto L56
        L54:
            java.nio.ByteBuffer r4 = d1.d.f3045a
        L56:
            int r6 = r4.remaining()
            long r6 = (long) r6
            r5.i(r4)
            java.nio.ByteBuffer[] r8 = r9.f3038c
            java.nio.ByteBuffer r5 = r5.g()
            r8[r3] = r5
            int r4 = r4.remaining()
            long r4 = (long) r4
            long r6 = r6 - r4
            r4 = 0
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 > 0) goto L7f
            java.nio.ByteBuffer[] r4 = r9.f3038c
            r4 = r4[r3]
            boolean r4 = r4.hasRemaining()
            if (r4 == 0) goto L7d
            goto L7f
        L7d:
            r4 = r1
            goto L80
        L7f:
            r4 = r0
        L80:
            r2 = r2 | r4
        L81:
            int r3 = r3 + 1
            goto L7
        L84:
            r1 = r2
            goto L2
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.a.e(java.nio.ByteBuffer):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        o0 o0Var = this.f3036a;
        if (o0Var.size() != aVar.f3036a.size()) {
            return false;
        }
        for (int i10 = 0; i10 < o0Var.size(); i10++) {
            if (o0Var.get(i10) != aVar.f3036a.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public final void f() {
        int i10 = 0;
        while (true) {
            o0 o0Var = this.f3036a;
            if (i10 < o0Var.size()) {
                d dVar = (d) o0Var.get(i10);
                dVar.flush();
                dVar.f();
                i10++;
            } else {
                this.f3038c = new ByteBuffer[0];
                b bVar = b.f3040e;
                this.f3039d = false;
                return;
            }
        }
    }

    public final int hashCode() {
        return this.f3036a.hashCode();
    }
}
