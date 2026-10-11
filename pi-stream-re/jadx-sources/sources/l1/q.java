package l1;

import c1.e1;
import java.util.HashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6724a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6725b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f6726c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f6727d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6728e;

    public /* synthetic */ q(Object obj, int i10, long j4, long j10, int i11) {
        this.f6724a = i11;
        this.f6728e = obj;
        this.f6725b = i10;
        this.f6726c = j4;
        this.f6727d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v1.w wVar;
        int i10 = this.f6724a;
        Object obj = this.f6728e;
        switch (i10) {
            case 0:
                final int i11 = this.f6725b;
                final long j4 = this.f6726c;
                final long j10 = this.f6727d;
                s sVar = (s) ((androidx.appcompat.widget.a0) obj).f404c;
                int i12 = f1.b0.f3799a;
                k1.a0 a0Var = (k1.a0) ((j1.z) sVar).f5932a.f5687q;
                final k1.b V = a0Var.V();
                final int i13 = 0;
                a0Var.W(V, 1011, new f1.l(V, i11, j4, j10, i13) { // from class: k1.n

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f6391a;

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ b f6392b;

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ int f6393c;

                    /* renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ long f6394d;

                    {
                        this.f6391a = i13;
                    }

                    @Override // f1.l
                    public final void invoke(Object obj2) {
                        String str;
                        long longValue;
                        switch (this.f6391a) {
                            case 0:
                                ((c) obj2).getClass();
                                return;
                            default:
                                f0 f0Var = (f0) ((c) obj2);
                                f0Var.getClass();
                                b bVar = this.f6392b;
                                v1.w wVar2 = bVar.f6325d;
                                if (wVar2 != null) {
                                    c0 c0Var = f0Var.f6355b;
                                    e1 e1Var = bVar.f6323b;
                                    synchronized (c0Var) {
                                        str = c0Var.c(e1Var.h(wVar2.f10559a, c0Var.f6342b).f1643c, wVar2).f6332a;
                                    }
                                    HashMap hashMap = f0Var.f6361h;
                                    Long l10 = (Long) hashMap.get(str);
                                    HashMap hashMap2 = f0Var.f6360g;
                                    Long l11 = (Long) hashMap2.get(str);
                                    long j11 = 0;
                                    if (l10 == null) {
                                        longValue = 0;
                                    } else {
                                        longValue = l10.longValue();
                                    }
                                    hashMap.put(str, Long.valueOf(longValue + this.f6394d));
                                    if (l11 != null) {
                                        j11 = l11.longValue();
                                    }
                                    hashMap2.put(str, Long.valueOf(j11 + this.f6393c));
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final int i14 = this.f6725b;
                final long j11 = this.f6726c;
                final long j12 = this.f6727d;
                k1.a0 a0Var2 = (k1.a0) ((z1.b) obj).f11891b;
                k1.z zVar = a0Var2.f6316d;
                if (zVar.f6408b.isEmpty()) {
                    wVar = null;
                } else {
                    wVar = (v1.w) r6.h0.X(zVar.f6408b);
                }
                final k1.b T = a0Var2.T(wVar);
                final int i15 = 1;
                a0Var2.W(T, 1006, new f1.l(T, i14, j11, j12, i15) { // from class: k1.n

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f6391a;

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ b f6392b;

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ int f6393c;

                    /* renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ long f6394d;

                    {
                        this.f6391a = i15;
                    }

                    @Override // f1.l
                    public final void invoke(Object obj2) {
                        String str;
                        long longValue;
                        switch (this.f6391a) {
                            case 0:
                                ((c) obj2).getClass();
                                return;
                            default:
                                f0 f0Var = (f0) ((c) obj2);
                                f0Var.getClass();
                                b bVar = this.f6392b;
                                v1.w wVar2 = bVar.f6325d;
                                if (wVar2 != null) {
                                    c0 c0Var = f0Var.f6355b;
                                    e1 e1Var = bVar.f6323b;
                                    synchronized (c0Var) {
                                        str = c0Var.c(e1Var.h(wVar2.f10559a, c0Var.f6342b).f1643c, wVar2).f6332a;
                                    }
                                    HashMap hashMap = f0Var.f6361h;
                                    Long l10 = (Long) hashMap.get(str);
                                    HashMap hashMap2 = f0Var.f6360g;
                                    Long l11 = (Long) hashMap2.get(str);
                                    long j112 = 0;
                                    if (l10 == null) {
                                        longValue = 0;
                                    } else {
                                        longValue = l10.longValue();
                                    }
                                    hashMap.put(str, Long.valueOf(longValue + this.f6394d));
                                    if (l11 != null) {
                                        j112 = l11.longValue();
                                    }
                                    hashMap2.put(str, Long.valueOf(j112 + this.f6393c));
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
        }
    }
}
