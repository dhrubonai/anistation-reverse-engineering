package com.anistation.local.dao;

import defpackage.m37;
import defpackage.pn6;
import defpackage.t36;
import defpackage.ub2;
import defpackage.vz0;
import defpackage.w11;
import defpackage.w51;
import defpackage.ze0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.anistation.local.dao.WatchProgressDao_Impl$promoteLegacyIdentity$2", f = "WatchProgressDao_Impl.kt", l = {136}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class WatchProgressDao_Impl$promoteLegacyIdentity$2 extends t36 implements ub2 {
    final /* synthetic */ int $anilistId;
    final /* synthetic */ String $animeId;
    int label;
    final /* synthetic */ WatchProgressDao_Impl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchProgressDao_Impl$promoteLegacyIdentity$2(WatchProgressDao_Impl watchProgressDao_Impl, String str, int i, vz0 vz0Var) {
        super(1, vz0Var);
        this.this$0 = watchProgressDao_Impl;
        this.$animeId = str;
        this.$anilistId = i;
    }

    @Override // defpackage.h30
    public final vz0 create(vz0 vz0Var) {
        return new WatchProgressDao_Impl$promoteLegacyIdentity$2(this.this$0, this.$animeId, this.$anilistId, vz0Var);
    }

    @Override // defpackage.ub2
    public final Object invoke(vz0 vz0Var) {
        return ((WatchProgressDao_Impl$promoteLegacyIdentity$2) create(vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                m37.N(obj);
            } else {
                ze0.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            m37.N(obj);
            WatchProgressDao_Impl watchProgressDao_Impl = this.this$0;
            String str = this.$animeId;
            int i2 = this.$anilistId;
            this.label = 1;
            Object access$promoteLegacyIdentity$s283565558 = WatchProgressDao_Impl.access$promoteLegacyIdentity$s283565558(watchProgressDao_Impl, str, i2, this);
            w11 w11Var = w11.x;
            if (access$promoteLegacyIdentity$s283565558 == w11Var) {
                return w11Var;
            }
        }
        return pn6.a;
    }
}
