package com.google.android.gms.common.api.internal;

import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zaq;

/* loaded from: classes.dex */
public final class f extends zaq {
    public final void a(com.google.android.gms.common.api.t tVar, com.google.android.gms.common.api.s sVar) {
        int i10 = BasePendingResult.zad;
        w7.b.s(tVar);
        sendMessage(obtainMessage(1, new Pair(tVar, sVar)));
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            if (i10 != 2) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i10);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
                return;
            }
            ((BasePendingResult) message.obj).forceFailureUnlessReady(Status.f2359z);
            return;
        }
        Pair pair = (Pair) message.obj;
        com.google.android.gms.common.api.t tVar = (com.google.android.gms.common.api.t) pair.first;
        com.google.android.gms.common.api.s sVar = (com.google.android.gms.common.api.s) pair.second;
        try {
            w0 w0Var = (w0) tVar;
            synchronized (w0Var.f2479b) {
                if (sVar.getStatus().d()) {
                } else {
                    w0Var.c(sVar.getStatus());
                }
            }
        } catch (RuntimeException e10) {
            BasePendingResult.zal(sVar);
            throw e10;
        }
    }
}
