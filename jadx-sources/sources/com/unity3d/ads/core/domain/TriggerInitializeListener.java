package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.exception.InitializationException;
import defpackage.db;
import defpackage.n11;
import defpackage.tl7;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class TriggerInitializeListener {
    private final n11 coroutineDispatcher;

    public TriggerInitializeListener(n11 n11Var) {
        n11Var.getClass();
        this.coroutineDispatcher = n11Var;
    }

    public final void error(InitializationException initializationException) {
        initializationException.getClass();
        tl7.z(db.b(this.coroutineDispatcher), null, null, new TriggerInitializeListener$error$1(initializationException, null), 3);
    }

    public final void success() {
        tl7.z(db.b(this.coroutineDispatcher), null, null, new TriggerInitializeListener$success$1(null), 3);
    }
}
