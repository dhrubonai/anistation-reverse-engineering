package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zaq;

/* loaded from: classes.dex */
public final class u0 extends zaq {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w0 f2468a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(w0 w0Var, Looper looper) {
        super(looper);
        this.f2468a = w0Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        String str;
        int i10 = message.what;
        if (i10 != 0) {
            if (i10 != 1) {
                StringBuilder sb = new StringBuilder(70);
                sb.append("TransformationResultHandler received unknown message type: ");
                sb.append(i10);
                Log.e("TransformedResultImpl", sb.toString());
                return;
            }
            RuntimeException runtimeException = (RuntimeException) message.obj;
            String valueOf = String.valueOf(runtimeException.getMessage());
            if (valueOf.length() != 0) {
                str = "Runtime exception on the transformation worker thread: ".concat(valueOf);
            } else {
                str = new String("Runtime exception on the transformation worker thread: ");
            }
            Log.e("TransformedResultImpl", str);
            throw runtimeException;
        }
        com.google.android.gms.common.api.q qVar = (com.google.android.gms.common.api.q) message.obj;
        synchronized (this.f2468a.f2479b) {
            w0 w0Var = this.f2468a.f2478a;
            w7.b.s(w0Var);
            if (qVar == null) {
                w0Var.c(new Status(13, "Transform returned null"));
            } else {
                w0Var.b(qVar);
            }
        }
    }
}
