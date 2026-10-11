package o1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import java.util.Set;
import r6.m0;
import r6.o0;

/* loaded from: classes.dex */
public final class c extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f8108a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Looper looper) {
        super(looper);
        this.f8108a = dVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i10 = message.what;
        d dVar = this.f8108a;
        if (i10 != 0) {
            if (i10 == 1 && obj == dVar.f8135x && dVar.j()) {
                dVar.f8135x = null;
                if (!(obj2 instanceof Exception) && !(obj2 instanceof NoSuchMethodError)) {
                    try {
                        byte[] bArr = (byte[]) obj2;
                        y yVar = dVar.f8114b;
                        int i11 = dVar.f8117e;
                        if (i11 == 3) {
                            byte[] bArr2 = dVar.f8134w;
                            int i12 = f1.b0.f3799a;
                            yVar.e(bArr2, bArr);
                            dVar.h(new j1.l(5));
                            return;
                        }
                        byte[] e10 = yVar.e(dVar.f8133v, bArr);
                        if ((i11 == 2 || (i11 == 0 && dVar.f8134w != null)) && e10 != null && e10.length != 0) {
                            dVar.f8134w = e10;
                        }
                        dVar.f8127p = 4;
                        dVar.h(new j1.l(6));
                        return;
                    } catch (Exception | NoSuchMethodError e11) {
                        dVar.l(e11, true);
                        return;
                    }
                }
                dVar.l((Throwable) obj2, false);
                return;
            }
            return;
        }
        if (obj == dVar.f8136y) {
            if (dVar.f8127p == 2 || dVar.j()) {
                dVar.f8136y = null;
                boolean z9 = obj2 instanceof Exception;
                f.c cVar = dVar.f8115c;
                if (z9) {
                    cVar.v((Exception) obj2, false);
                    return;
                }
                try {
                    dVar.f8114b.g((byte[]) obj2);
                    cVar.f3636c = null;
                    o0 j4 = o0.j((Set) cVar.f3635b);
                    ((Set) cVar.f3635b).clear();
                    m0 listIterator = j4.listIterator(0);
                    while (listIterator.hasNext()) {
                        d dVar2 = (d) listIterator.next();
                        if (dVar2.m()) {
                            dVar2.i(true);
                        }
                    }
                } catch (Exception e12) {
                    cVar.v(e12, true);
                }
            }
        }
    }
}
