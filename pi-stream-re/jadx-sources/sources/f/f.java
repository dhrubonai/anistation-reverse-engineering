package f;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class f extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3661a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3662b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, Looper looper, int i10) {
        super(looper);
        this.f3661a = i10;
        this.f3662b = obj;
    }

    private void a(Message message) {
        s1.e eVar = (s1.e) this.f3662b;
        ArrayDeque arrayDeque = s1.e.f9770x;
        eVar.getClass();
        int i10 = message.what;
        s1.d dVar = null;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        AtomicReference atomicReference = eVar.f9775d;
                        IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
                        while (!atomicReference.compareAndSet(null, illegalStateException) && atomicReference.get() == null) {
                        }
                    } else {
                        try {
                            eVar.f9772a.setParameters((Bundle) message.obj);
                        } catch (RuntimeException e10) {
                            AtomicReference atomicReference2 = eVar.f9775d;
                            while (!atomicReference2.compareAndSet(null, e10) && atomicReference2.get() == null) {
                            }
                        }
                    }
                } else {
                    eVar.f9776e.e();
                }
            } else {
                s1.d dVar2 = (s1.d) message.obj;
                int i11 = dVar2.f9764a;
                int i12 = dVar2.f9765b;
                MediaCodec.CryptoInfo cryptoInfo = dVar2.f9767d;
                long j4 = dVar2.f9768e;
                int i13 = dVar2.f9769f;
                try {
                    synchronized (s1.e.f9771y) {
                        eVar.f9772a.queueSecureInputBuffer(i11, i12, cryptoInfo, j4, i13);
                    }
                } catch (RuntimeException e11) {
                    AtomicReference atomicReference3 = eVar.f9775d;
                    while (!atomicReference3.compareAndSet(null, e11) && atomicReference3.get() == null) {
                    }
                }
                dVar = dVar2;
            }
        } else {
            s1.d dVar3 = (s1.d) message.obj;
            try {
                eVar.f9772a.queueInputBuffer(dVar3.f9764a, dVar3.f9765b, dVar3.f9766c, dVar3.f9768e, dVar3.f9769f);
            } catch (RuntimeException e12) {
                AtomicReference atomicReference4 = eVar.f9775d;
                while (!atomicReference4.compareAndSet(null, e12) && atomicReference4.get() == null) {
                }
            }
            dVar = dVar3;
        }
        if (dVar != null) {
            s1.e.a(dVar);
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int size;
        androidx.appcompat.widget.a0[] a0VarArr;
        switch (this.f3661a) {
            case 0:
                int i10 = message.what;
                if (i10 != -3 && i10 != -2 && i10 != -1) {
                    if (i10 == 1) {
                        ((DialogInterface) message.obj).dismiss();
                        return;
                    }
                    return;
                }
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.f3662b).get(), message.what);
                return;
            case 1:
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                b1.b bVar = (b1.b) this.f3662b;
                while (true) {
                    synchronized (bVar.f1284b) {
                        size = bVar.f1286d.size();
                        if (size <= 0) {
                            return;
                        }
                        a0VarArr = new androidx.appcompat.widget.a0[size];
                        bVar.f1286d.toArray(a0VarArr);
                        bVar.f1286d.clear();
                    }
                    for (int i11 = 0; i11 < size; i11++) {
                        androidx.appcompat.widget.a0 a0Var = a0VarArr[i11];
                        int size2 = ((ArrayList) a0Var.f404c).size();
                        for (int i12 = 0; i12 < size2; i12++) {
                            b1.a aVar = (b1.a) ((ArrayList) a0Var.f404c).get(i12);
                            if (!aVar.f1280d) {
                                aVar.f1278b.onReceive(bVar.f1283a, (Intent) a0Var.f403b);
                            }
                        }
                    }
                }
            default:
                a(message);
                return;
        }
    }

    public f(DialogInterface dialogInterface) {
        this.f3661a = 0;
        this.f3662b = new WeakReference(dialogInterface);
    }
}
