package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Task;
import com.unity3d.ads.core.data.datasource.AndroidAppSetIdDataSource;
import defpackage.h5;
import defpackage.l9;
import defpackage.pn6;
import defpackage.r76;
import defpackage.sx5;
import defpackage.tx5;
import defpackage.ub2;
import defpackage.v78;
import defpackage.x44;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidAppSetIdDataSource {
    private final x44 _appSetIdFlow;
    private final Context applicationContext;
    private final x44 isCollecting;

    public AndroidAppSetIdDataSource(Context context) {
        context.getClass();
        this.applicationContext = context;
        this.isCollecting = tx5.a(Boolean.FALSE);
        this._appSetIdFlow = tx5.a(null);
    }

    public static /* synthetic */ void a(l9 l9Var, Object obj) {
        l9Var.invoke(obj);
    }

    public static final pn6 invoke$lambda$1(AndroidAppSetIdDataSource androidAppSetIdDataSource, AppSetIdInfo appSetIdInfo) {
        String id = appSetIdInfo.getId();
        id.getClass();
        sx5 sx5Var = (sx5) androidAppSetIdDataSource._appSetIdFlow;
        sx5Var.getClass();
        sx5Var.l(null, id);
        return pn6.a;
    }

    public final String getAppSetId() {
        return (String) ((sx5) this._appSetIdFlow).getValue();
    }

    public final void invoke() {
        sx5 sx5Var;
        Object value;
        Boolean bool;
        x44 x44Var = this.isCollecting;
        do {
            sx5Var = (sx5) x44Var;
            value = sx5Var.getValue();
            bool = (Boolean) value;
            bool.getClass();
        } while (!sx5Var.j(value, Boolean.TRUE));
        if (!bool.booleanValue()) {
            try {
                Task appSetIdInfo = AppSet.getClient(this.applicationContext).getAppSetIdInfo();
                h5 h5Var = new h5((Object) new ub2() { // from class: l9
                    @Override // defpackage.ub2
                    public final Object invoke(Object obj) {
                        pn6 invoke$lambda$1;
                        invoke$lambda$1 = AndroidAppSetIdDataSource.invoke$lambda$1(AndroidAppSetIdDataSource.this, (AppSetIdInfo) obj);
                        return invoke$lambda$1;
                    }
                }, (byte) 1);
                v78 v78Var = (v78) appSetIdInfo;
                v78Var.getClass();
                v78Var.a(r76.a, h5Var);
            } catch (Throwable unused) {
            }
        }
    }
}
