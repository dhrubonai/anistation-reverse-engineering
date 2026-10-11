package b9;

import c9.k;
import c9.l;
import f9.t;
import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import r6.h0;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1552e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1553f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, Object obj, String str) {
        super(str, true);
        this.f1552e = i10;
        this.f1553f = obj;
    }

    @Override // b9.a
    public final long a() {
        int i10 = 0;
        switch (this.f1552e) {
            case 0:
                ((h7.a) this.f1553f).a();
                return -1L;
            case 1:
                l lVar = (l) this.f1553f;
                long nanoTime = System.nanoTime();
                Iterator it = lVar.f2157e.iterator();
                long j4 = Long.MIN_VALUE;
                k kVar = null;
                int i11 = 0;
                while (it.hasNext()) {
                    k kVar2 = (k) it.next();
                    h0.s(kVar2, "connection");
                    synchronized (kVar2) {
                        if (lVar.b(kVar2, nanoTime) > 0) {
                            i11++;
                        } else {
                            i10++;
                            long j10 = nanoTime - kVar2.f2152q;
                            if (j10 > j4) {
                                kVar = kVar2;
                                j4 = j10;
                            }
                        }
                    }
                }
                long j11 = lVar.f2154b;
                if (j4 < j11 && i10 <= lVar.f2153a) {
                    if (i10 > 0) {
                        return j11 - j4;
                    }
                    if (i11 <= 0) {
                        return -1L;
                    }
                    return j11;
                }
                h0.q(kVar);
                synchronized (kVar) {
                    if (!(!kVar.f2151p.isEmpty())) {
                        if (kVar.f2152q + j4 == nanoTime) {
                            kVar.f2146j = true;
                            lVar.f2157e.remove(kVar);
                            Socket socket = kVar.f2140d;
                            h0.q(socket);
                            z8.b.d(socket);
                            if (lVar.f2157e.isEmpty()) {
                                lVar.f2155c.a();
                            }
                        }
                    }
                }
                return 0L;
            default:
                t tVar = (t) this.f1553f;
                tVar.getClass();
                try {
                    tVar.P.v(2, 0, false);
                } catch (IOException e10) {
                    tVar.f(e10);
                }
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l lVar, String str) {
        super(str, true);
        this.f1552e = 1;
        this.f1553f = lVar;
    }
}
