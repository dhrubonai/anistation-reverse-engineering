package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import com.unity3d.ads.core.data.model.UniversalRequestStoreSerializer;
import com.unity3d.ads.core.extensions.ContextExtensionsKt;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import com.unity3d.services.core.di.ServiceProvider;
import defpackage.ap1;
import defpackage.d21;
import defpackage.db;
import defpackage.e96;
import defpackage.iv5;
import defpackage.ka6;
import defpackage.n11;
import defpackage.p7;
import defpackage.w41;
import java.io.File;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class UniversalRequestDataStoreProvider {
    private w41 cachedDataStore;
    private final Context context;
    private final n11 dispatcher;

    public UniversalRequestDataStoreProvider(Context context, n11 n11Var) {
        context.getClass();
        n11Var.getClass();
        this.context = context;
        this.dispatcher = n11Var;
    }

    public static /* synthetic */ File a(UniversalRequestDataStoreProvider universalRequestDataStoreProvider) {
        return createDataStore$lambda$3(universalRequestDataStoreProvider);
    }

    public static /* synthetic */ UniversalRequestStoreOuterClass.UniversalRequestStore b(d21 d21Var) {
        return createDataStore$lambda$2(d21Var);
    }

    private final w41 createDataStore() {
        return p7.a(new UniversalRequestStoreSerializer(), new ap1(new ka6((byte) 17)), null, db.b(this.dispatcher.plus(iv5.a())), new e96(this, (byte) 5), 4);
    }

    public static final UniversalRequestStoreOuterClass.UniversalRequestStore createDataStore$lambda$2(d21 d21Var) {
        d21Var.getClass();
        return new UniversalRequestStoreSerializer().getDefaultValue();
    }

    public static final File createDataStore$lambda$3(UniversalRequestDataStoreProvider universalRequestDataStoreProvider) {
        return ContextExtensionsKt.unityAdsDataStoreFile(universalRequestDataStoreProvider.context, ServiceProvider.DATA_STORE_UNIVERSAL_REQUEST);
    }

    public final Context getContext() {
        return this.context;
    }

    public final n11 getDispatcher() {
        return this.dispatcher;
    }

    public final w41 invoke() {
        synchronized (this) {
            w41 w41Var = this.cachedDataStore;
            if (w41Var != null) {
                return w41Var;
            }
            w41 createDataStore = createDataStore();
            this.cachedDataStore = createDataStore;
            return createDataStore;
        }
    }
}
