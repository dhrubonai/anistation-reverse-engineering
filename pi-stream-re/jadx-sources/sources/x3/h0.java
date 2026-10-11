package x3;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes.dex */
public final class h0 implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11191a;

    public /* synthetic */ h0(int i10) {
        this.f11191a = i10;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f11191a) {
            case 0:
                if (message.what != 1) {
                    return false;
                }
                ((e0) message.obj).e();
                return true;
            case 1:
                if (message.what != 1) {
                    return false;
                }
                m4.g gVar = (m4.g) message.obj;
                gVar.f7448d.l(gVar);
                return true;
            default:
                int i10 = message.what;
                if (i10 != 0) {
                    if (i10 != 1) {
                        return false;
                    }
                    a3.g.z(message.obj);
                    throw null;
                }
                a3.g.z(message.obj);
                throw null;
        }
    }
}
