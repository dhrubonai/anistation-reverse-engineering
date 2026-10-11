package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qg1 implements Executor {
    public static final qg1 x;
    public static final /* synthetic */ qg1[] y;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, qg1] */
    static {
        ?? r0 = new Enum("INSTANCE", 0);
        x = r0;
        y = new qg1[]{r0};
    }

    public static qg1 valueOf(String str) {
        return (qg1) Enum.valueOf(qg1.class, str);
    }

    public static qg1[] values() {
        return (qg1[]) y.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
