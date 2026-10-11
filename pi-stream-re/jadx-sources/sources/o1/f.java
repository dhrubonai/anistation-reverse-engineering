package o1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class f extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f8142a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, Looper looper) {
        super(looper);
        this.f8142a = iVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        byte[] bArr = (byte[]) message.obj;
        if (bArr == null) {
            return;
        }
        Iterator it = this.f8142a.C.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            dVar.p();
            if (Arrays.equals(dVar.f8133v, bArr)) {
                if (message.what == 2 && dVar.f8117e == 0 && dVar.f8127p == 4) {
                    int i10 = f1.b0.f3799a;
                    dVar.i(false);
                    return;
                }
                return;
            }
        }
    }
}
