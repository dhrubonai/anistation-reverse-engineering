package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class cp2 extends m76 {
    public final /* synthetic */ byte e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cp2(String str, Object obj, byte b) {
        super(str, true);
        this.e = b;
        this.f = obj;
    }

    @Override // defpackage.m76
    public final long a() {
        int i = 0;
        switch (this.e) {
            case 0:
                ep2 ep2Var = (ep2) this.f;
                ep2Var.getClass();
                try {
                    ep2Var.T.A(2, 0, false);
                } catch (IOException e) {
                    ep2Var.a(2, 2, e);
                }
                return -1L;
            case 1:
                cs1 cs1Var = (cs1) this.f;
                long nanoTime = System.nanoTime();
                Iterator it = ((ConcurrentLinkedQueue) cs1Var.d).iterator();
                long j = Long.MIN_VALUE;
                ez4 ez4Var = null;
                int i2 = 0;
                while (it.hasNext()) {
                    ez4 ez4Var2 = (ez4) it.next();
                    ez4Var2.getClass();
                    synchronized (ez4Var2) {
                        if (cs1Var.b(ez4Var2, nanoTime) > 0) {
                            i2++;
                        } else {
                            i++;
                            long j2 = nanoTime - ez4Var2.q;
                            if (j2 > j) {
                                ez4Var = ez4Var2;
                                j = j2;
                            }
                        }
                    }
                }
                long j3 = cs1Var.a;
                if (j < j3 && i <= 5) {
                    if (i > 0) {
                        return j3 - j;
                    }
                    if (i2 <= 0) {
                        return -1L;
                    }
                    return j3;
                }
                ez4Var.getClass();
                synchronized (ez4Var) {
                    if (!ez4Var.p.isEmpty()) {
                        return 0L;
                    }
                    if (ez4Var.q + j != nanoTime) {
                        return 0L;
                    }
                    ez4Var.j = true;
                    ((ConcurrentLinkedQueue) cs1Var.d).remove(ez4Var);
                    Socket socket = ez4Var.d;
                    socket.getClass();
                    dq6.e(socket);
                    if (!((ConcurrentLinkedQueue) cs1Var.d).isEmpty()) {
                        return 0L;
                    }
                    ((t76) cs1Var.b).a();
                    return 0L;
                }
            default:
                ((sb2) this.f).invoke();
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cp2(cs1 cs1Var, String str) {
        super(str, true);
        this.e = (byte) 1;
        this.f = cs1Var;
    }
}
