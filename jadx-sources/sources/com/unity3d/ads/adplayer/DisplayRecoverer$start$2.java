package com.unity3d.ads.adplayer;

import android.os.SystemClock;
import com.unity3d.ads.adplayer.DisplayMessage;
import defpackage.ic2;
import defpackage.m37;
import defpackage.pn6;
import defpackage.t36;
import defpackage.vz0;
import defpackage.w51;
import defpackage.ze0;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.adplayer.DisplayRecoverer$start$2", f = "DisplayRecoverer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DisplayRecoverer$start$2 extends t36 implements ic2 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DisplayRecoverer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisplayRecoverer$start$2(DisplayRecoverer displayRecoverer, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = displayRecoverer;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        DisplayRecoverer$start$2 displayRecoverer$start$2 = new DisplayRecoverer$start$2(this.this$0, vz0Var);
        displayRecoverer$start$2.L$0 = obj;
        return displayRecoverer$start$2;
    }

    @Override // defpackage.ic2
    public final Object invoke(DisplayMessage.VisibilityChanged visibilityChanged, vz0 vz0Var) {
        return ((DisplayRecoverer$start$2) create(visibilityChanged, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        AtomicLong atomicLong;
        AtomicLong atomicLong2;
        if (this.label == 0) {
            m37.N(obj);
            boolean isVisible = ((DisplayMessage.VisibilityChanged) this.L$0).isVisible();
            DisplayRecoverer displayRecoverer = this.this$0;
            if (isVisible) {
                atomicLong2 = displayRecoverer.displayHiddenAtMs;
                atomicLong2.set(0L);
            } else {
                atomicLong = displayRecoverer.displayHiddenAtMs;
                atomicLong.compareAndSet(0L, SystemClock.elapsedRealtime());
            }
            return pn6.a;
        }
        ze0.m("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
