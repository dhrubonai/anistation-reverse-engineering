package com.unity3d.ads.core.domain;

import android.app.Application;
import android.content.Context;
import com.unity3d.ads.core.log.Logger;
import defpackage.it1;
import defpackage.pj0;
import defpackage.ta0;
import defpackage.w42;
import defpackage.ze0;
import defpackage.zz;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidGetLifecycleFlow {
    private final Context applicationContext;
    private final Logger logger;

    public AndroidGetLifecycleFlow(Context context, Logger logger) {
        context.getClass();
        logger.getClass();
        this.applicationContext = context;
        this.logger = logger;
    }

    public final w42 invoke() {
        if (this.applicationContext instanceof Application) {
            return zz.l(new pj0(new AndroidGetLifecycleFlow$invoke$2(this, null), it1.x, -2, ta0.x, (byte) 0), Integer.MAX_VALUE);
        }
        ze0.k("Application context is required");
        return null;
    }
}
