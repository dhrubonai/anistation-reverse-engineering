package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.common.zzi;

/* loaded from: classes.dex */
public final class h0 extends zzi {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f2529a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(f fVar, Looper looper) {
        super(looper);
        this.f2529a = fVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj;
        b bVar;
        b bVar2;
        b5.a aVar;
        b5.a aVar2;
        b5.a aVar3;
        b5.a aVar4;
        boolean z9;
        boolean z10 = false;
        if (this.f2529a.zzd.get() != message.arg1) {
            int i10 = message.what;
            if (i10 == 2 || i10 == 1 || i10 == 7) {
                z10 = true;
            }
            if (z10) {
                d0 d0Var = (d0) message.obj;
                d0Var.getClass();
                d0Var.e();
                return;
            }
            return;
        }
        int i11 = message.what;
        if ((i11 != 1 && i11 != 7 && ((i11 != 4 || this.f2529a.enableLocalFallback()) && message.what != 5)) || this.f2529a.isConnecting()) {
            int i12 = message.what;
            PendingIntent pendingIntent = null;
            if (i12 == 4) {
                this.f2529a.zzB = new b5.a(message.arg2);
                if (f.zzo(this.f2529a)) {
                    f fVar = this.f2529a;
                    z9 = fVar.zzC;
                    if (!z9) {
                        fVar.c(3, null);
                        return;
                    }
                }
                f fVar2 = this.f2529a;
                aVar3 = fVar2.zzB;
                if (aVar3 != null) {
                    aVar4 = fVar2.zzB;
                } else {
                    aVar4 = new b5.a(8);
                }
                this.f2529a.zzc.b(aVar4);
                this.f2529a.onConnectionFailed(aVar4);
                return;
            }
            if (i12 == 5) {
                f fVar3 = this.f2529a;
                aVar = fVar3.zzB;
                if (aVar != null) {
                    aVar2 = fVar3.zzB;
                } else {
                    aVar2 = new b5.a(8);
                }
                this.f2529a.zzc.b(aVar2);
                this.f2529a.onConnectionFailed(aVar2);
                return;
            }
            if (i12 == 3) {
                Object obj2 = message.obj;
                if (obj2 instanceof PendingIntent) {
                    pendingIntent = (PendingIntent) obj2;
                }
                b5.a aVar5 = new b5.a(message.arg2, pendingIntent);
                this.f2529a.zzc.b(aVar5);
                this.f2529a.onConnectionFailed(aVar5);
                return;
            }
            if (i12 == 6) {
                this.f2529a.c(5, null);
                f fVar4 = this.f2529a;
                bVar = fVar4.zzw;
                if (bVar != null) {
                    bVar2 = fVar4.zzw;
                    ((com.google.android.gms.common.api.internal.g) ((k3.d) bVar2).f6453b).a(message.arg2);
                }
                this.f2529a.onConnectionSuspended(message.arg2);
                f.zzn(this.f2529a, 5, 1, null);
                return;
            }
            if (i12 == 2 && !this.f2529a.isConnected()) {
                d0 d0Var2 = (d0) message.obj;
                d0Var2.getClass();
                d0Var2.e();
                return;
            }
            int i13 = message.what;
            if (i13 == 2 || i13 == 1 || i13 == 7) {
                z10 = true;
            }
            if (z10) {
                d0 d0Var3 = (d0) message.obj;
                synchronized (d0Var3) {
                    obj = d0Var3.f2507a;
                    if (d0Var3.f2508b) {
                        Log.w("GmsClient", "Callback proxy " + d0Var3.toString() + " being reused. This is not safe.");
                    }
                }
                if (obj != null) {
                    d0Var3.a();
                }
                synchronized (d0Var3) {
                    d0Var3.f2508b = true;
                }
                d0Var3.e();
                return;
            }
            Log.wtf("GmsClient", a3.g.n("Don't know how to handle message: ", i13), new Exception());
            return;
        }
        d0 d0Var4 = (d0) message.obj;
        d0Var4.getClass();
        d0Var4.e();
    }
}
