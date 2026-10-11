package androidx.work.impl;

import android.content.Context;
import defpackage.a87;
import defpackage.ce1;
import defpackage.d77;
import defpackage.h87;
import defpackage.m46;
import defpackage.os4;
import defpackage.q77;
import defpackage.t77;
import defpackage.tn0;
import defpackage.v65;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class WorkDatabase extends v65 {
    public static final d77 Companion = new Object();

    public static final WorkDatabase create(Context context, Executor executor, tn0 tn0Var, boolean z) {
        Companion.getClass();
        return d77.a(context, executor, tn0Var, z);
    }

    public abstract ce1 dependencyDao();

    public abstract os4 preferenceDao();

    public abstract m46 systemIdInfoDao();

    public abstract q77 workNameDao();

    public abstract t77 workProgressDao();

    public abstract a87 workSpecDao();

    public abstract h87 workTagDao();
}
