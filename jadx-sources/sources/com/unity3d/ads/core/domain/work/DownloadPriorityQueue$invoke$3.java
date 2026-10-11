package com.unity3d.ads.core.domain.work;

import com.unity3d.ads.core.domain.work.DownloadPriorityQueue;
import defpackage.ic2;
import defpackage.m37;
import defpackage.pn6;
import defpackage.t36;
import defpackage.vz0;
import defpackage.w51;
import defpackage.ze0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.domain.work.DownloadPriorityQueue$invoke$3", f = "DownloadPriorityQueue.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DownloadPriorityQueue$invoke$3 extends t36 implements ic2 {
    final /* synthetic */ DownloadPriorityQueue.PriorityItem $priorityItem;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadPriorityQueue$invoke$3(DownloadPriorityQueue.PriorityItem priorityItem, vz0 vz0Var) {
        super(2, vz0Var);
        this.$priorityItem = priorityItem;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        DownloadPriorityQueue$invoke$3 downloadPriorityQueue$invoke$3 = new DownloadPriorityQueue$invoke$3(this.$priorityItem, vz0Var);
        downloadPriorityQueue$invoke$3.L$0 = obj;
        return downloadPriorityQueue$invoke$3;
    }

    @Override // defpackage.ic2
    public final Object invoke(DownloadPriorityQueue.PriorityItem priorityItem, vz0 vz0Var) {
        return ((DownloadPriorityQueue$invoke$3) create(priorityItem, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        boolean z;
        if (this.label == 0) {
            m37.N(obj);
            if (((DownloadPriorityQueue.PriorityItem) this.L$0) == this.$priorityItem) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        ze0.m("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
