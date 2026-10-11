package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.model.OnDownloadProgressEvent;
import defpackage.db;
import defpackage.jc2;
import defpackage.ki5;
import defpackage.m37;
import defpackage.nj0;
import defpackage.pn6;
import defpackage.t36;
import defpackage.tu4;
import defpackage.vz0;
import defpackage.w51;
import defpackage.ze0;
import java.util.Locale;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1", f = "CommonAdViewerExposedFunctions.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1 extends t36 implements jc2 {
    final /* synthetic */ tu4 $$this$channelFlow;
    final /* synthetic */ String $downloadId;
    /* synthetic */ long J$0;
    /* synthetic */ long J$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1(tu4 tu4Var, String str, vz0 vz0Var) {
        super(3, vz0Var);
        this.$$this$channelFlow = tu4Var;
        this.$downloadId = str;
    }

    @Override // defpackage.jc2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke(((Number) obj).longValue(), ((Number) obj2).longValue(), (vz0) obj3);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        Integer num = null;
        if (this.label == 0) {
            m37.N(obj);
            long j = this.J$0;
            long j2 = this.J$1;
            if (j2 > 0) {
                num = new Integer(db.C((int) ((100 * j) / j2), 0, 100));
            }
            ki5 ki5Var = this.$$this$channelFlow;
            String str = this.$downloadId;
            Long l = new Long(j2);
            String lowerCase = "REMOTE".toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            ((nj0) ki5Var).i(new OnDownloadProgressEvent(str, num, j, l, false, null, lowerCase));
            return pn6.a;
        }
        ze0.m("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    public final Object invoke(long j, long j2, vz0 vz0Var) {
        CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1 commonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1 = new CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1(this.$$this$channelFlow, this.$downloadId, vz0Var);
        commonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1.J$0 = j;
        commonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1.J$1 = j2;
        return commonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1.invokeSuspend(pn6.a);
    }
}
