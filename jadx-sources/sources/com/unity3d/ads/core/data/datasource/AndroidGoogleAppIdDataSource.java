package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import defpackage.d46;
import defpackage.q71;
import defpackage.rb3;
import defpackage.y45;
import defpackage.y7;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidGoogleAppIdDataSource implements GoogleAppIdDataSource {
    public static final Companion Companion = new Companion(null);
    public static final String GOOGLE_APP_ID_RESOURCE_NAME = "google_app_id";
    private final Context context;
    private final rb3 googleAppId$delegate;

    public AndroidGoogleAppIdDataSource(Context context) {
        context.getClass();
        this.context = context;
        this.googleAppId$delegate = new d46(new y7(this, (byte) 11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String googleAppId_delegate$lambda$3(AndroidGoogleAppIdDataSource androidGoogleAppIdDataSource) {
        Object y45Var;
        try {
            y45Var = Integer.valueOf(androidGoogleAppIdDataSource.context.getResources().getIdentifier(GOOGLE_APP_ID_RESOURCE_NAME, "string", androidGoogleAppIdDataSource.context.getPackageName()));
        } catch (Throwable th) {
            y45Var = new y45(th);
        }
        if (y45Var instanceof y45) {
            y45Var = null;
        }
        Integer num = (Integer) y45Var;
        if (num == null) {
            return null;
        }
        if (num.intValue() == 0) {
            num = null;
        }
        if (num == null) {
            return null;
        }
        return androidGoogleAppIdDataSource.context.getString(num.intValue());
    }

    @Override // com.unity3d.ads.core.data.datasource.GoogleAppIdDataSource
    public String getGoogleAppId() {
        return (String) this.googleAppId$delegate.getValue();
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        private Companion() {
        }
    }
}
