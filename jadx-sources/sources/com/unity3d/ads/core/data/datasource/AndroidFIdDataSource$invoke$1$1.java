package com.unity3d.ads.core.data.datasource;

import com.google.android.gms.tasks.Task;
import defpackage.ce4;
import defpackage.ic2;
import defpackage.ke4;
import defpackage.lj2;
import defpackage.m37;
import defpackage.os7;
import defpackage.pn6;
import defpackage.r76;
import defpackage.t36;
import defpackage.t85;
import defpackage.ub2;
import defpackage.v11;
import defpackage.v78;
import defpackage.vz0;
import defpackage.w11;
import defpackage.w51;
import defpackage.wc7;
import defpackage.y45;
import defpackage.ze0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.data.datasource.AndroidFIdDataSource$invoke$1$1", f = "AndroidFIdDataSource.kt", l = {19}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidFIdDataSource$invoke$1$1 extends t36 implements ic2 {
    final /* synthetic */ Task $task;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFIdDataSource$invoke$1$1(Task task, vz0 vz0Var) {
        super(2, vz0Var);
        this.$task = task;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new AndroidFIdDataSource$invoke$1$1(this.$task, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((AndroidFIdDataSource$invoke$1$1) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                m37.N(obj);
                return obj;
            }
            ze0.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        m37.N(obj);
        Task task = this.$task;
        this.L$0 = task;
        this.label = 1;
        final t85 t85Var = new t85(wc7.z(this), w11.y);
        final ub2 ub2Var = new ub2() { // from class: com.unity3d.ads.core.data.datasource.AndroidFIdDataSource$invoke$1$1$1$1
            @Override // defpackage.ub2
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                invoke((String) obj2);
                return pn6.a;
            }

            public final void invoke(String str) {
                vz0.this.resumeWith(str);
            }
        };
        ke4 ke4Var = new ke4(ub2Var) { // from class: com.unity3d.ads.core.data.datasource.AndroidFIdDataSource$sam$com_google_android_gms_tasks_OnSuccessListener$0
            private final /* synthetic */ ub2 function;

            {
                ub2Var.getClass();
                this.function = ub2Var;
            }

            @Override // defpackage.ke4
            public final /* synthetic */ void onSuccess(Object obj2) {
                this.function.invoke(obj2);
            }
        };
        v78 v78Var = (v78) task;
        v78Var.getClass();
        lj2 lj2Var = r76.a;
        v78Var.a(lj2Var, ke4Var);
        v78 v78Var2 = (v78) task;
        v78Var2.b.m(new os7(lj2Var, new ce4() { // from class: com.unity3d.ads.core.data.datasource.AndroidFIdDataSource$invoke$1$1$1$2
            @Override // defpackage.ce4
            public final void onFailure(Exception exc) {
                exc.getClass();
                vz0.this.resumeWith(new y45(exc));
            }
        }));
        v78Var2.j();
        Object b = t85Var.b();
        w11 w11Var = w11.x;
        if (b == w11Var) {
            return w11Var;
        }
        return b;
    }
}
